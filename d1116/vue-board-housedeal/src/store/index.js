import Vue from "vue";
import Vuex from "vuex";
import http from "@/util/http-common.js";
import createPersistedState from "vuex-persistedstate";

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    sidos: [{ value: null, text: "선택하세요" }],
    guguns: [{ value: null, text: "선택하세요" }],
    houses: [],
    house: null,
  },
  mutations: {
    SET_SIDO_LIST(state, sidos) {
      sidos.forEach((sido) => {
        state.sidos.push({ value: sido.sidoCode, text: sido.sidoName });
      });
    },
    SET_GUGUN_LIST(state, guguns) {
      guguns.forEach((gugun) => {
        state.guguns.push({ value: gugun.gugunCode, text: gugun.gugunName });
      });
    },
    SET_HOUSE_LIST(state, houses) {
      state.houses = houses;
    },
    SET_DATAIL_HOSUE(state, house) {
      state.house = house;
    },
    CLEAR_SIDO_LIST(state) {
      state.sidos = [{ value: null, text: "선택하세요" }]; // 초기값으로 다시 세팅
    },
    CLEAR_GUGUN_LIST(state) {
      state.guguns = [{ value: null, text: "선택하세요" }]; // 초기값으로 다시 세팅
    },
    CLEAR_HOUSE_LIST(state) {
      state.houses = []; // 초기값으로 다시 세팅
      state.house = null; // 초기값으로 다시 세팅
    },
  },
  actions: {
    getSidoList({ commit }) {
      http
        .get("/map/sido")
        .then((response) => {
          console.log(response.data);
          commit("SET_SIDO_LIST", response.data);
        })
        .catch((error) => {
          console.log(error);
        });
    },
    getGugunList({ commit }, sidoCode) {
      const params = { sido: sidoCode }; // 파라미터로 sidocode 보내주기
      http
        .get("/map/gugun", { params })
        .then((response) => {
          console.log(response.data);
          commit("SET_GUGUN_LIST", response.data);
        })
        .catch((error) => {
          console.log(error);
        });
    },
    getHouseList({ commit }, gugunCode) {
      const API_KEY = process.env.VUE_APP_APT_DEAL_API_KEY;
      // const API_KEY =
      //   "eQyQjNSh4o2UaLd0ismfwglGI2Ii36%2FRbmCjVhDZJdp%2BylSM8TO5HFtVMRIn%2FrgHAxwfcc1MeDECGfdkdqOroA%3D%3D";
      const SERVICE_URL =
        "http://openapi.molit.go.kr/OpenAPI_ToolInstallPackage/service/rest/RTMSOBJSvc/getRTMSDataSvcAptTradeDev";
      const params = {
        LAWD_CD: gugunCode,
        DEAL_YMD: "202110",
        serviceKey: decodeURIComponent(API_KEY),
      };
      http
        .get(SERVICE_URL, { params })
        .then((response) => {
          console.log(commit, response);
          commit("SET_HOUSE_LIST", response.data.response.body.items.item);
        })
        .catch((error) => {
          console.log(error);
        });
    },
    detailHosue({ commit }, house) {
      // 나중에 house 일련번호 이용하여 API 호출
      commit("SET_DATAIL_HOSUE", house);
    },
  },

  modules: {},
  plugins: [createPersistedState()],
});
