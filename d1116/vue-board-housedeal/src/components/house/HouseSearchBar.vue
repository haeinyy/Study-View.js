<template>
  <b-row class="mt-4 mb-4 text-center">
    <b-col class="sm-3">
      <b-form-select
        v-model="sidocode"
        :options="sidos"
        @change="gugunList"
      ></b-form-select>
    </b-col>
    <b-col class="sm-3">
      <b-form-select
        v-model="guguncode"
        :options="guguns"
        @change="searchApt"
      ></b-form-select>
    </b-col>

    <!-- 입력하는 검색창 -->
    <!-- <b-col class="sm-3">
      <b-form-input
        v-model.trim="dongCode"
        placeholder="동코드 입력...(예 : 11110)"
        @keypress.enter="sendKeyword"
      ></b-form-input>
    </b-col>
    <b-col class="sm-3" align="left">
      <b-button variant="outline-primary" @click="sendKeyword">검색</b-button>
    </b-col> -->
  </b-row>
</template>

<script>
import { mapActions, mapMutations, mapState } from "vuex";
export default {
  name: "HouseSearchBar",
  data() {
    return {
      sidocode: null,
      guguncode: null,
    };
  },
  computed: {
    ...mapState(["sidos", "guguns", "houses"]),
    // sidos() {
    //   return this.$store.state.sidos;
    // },
  },
  created() {
    // this.$store.dispatch("getSidoList"); // actions 호출
    // this.sidoList();
    this.CLEAR_SIDO_LIST();
    this.getSidoList(); // 바로 actions 불러와도댐
  },
  methods: {
    // mapActions , mapMutations는 method에 설정!
    ...mapActions(["getSidoList", "getGugunList", "getHouseList"]),
    ...mapMutations([
      "CLEAR_SIDO_LIST",
      "CLEAR_GUGUN_LIST",
      "CLEAR_HOUSE_LIST",
    ]),
    // sidoList() {
    //   this.getSidoList(); //위에 actions 함수 실행
    // },
    gugunList() {
      console.log(this.sidocode);
      this.CLEAR_GUGUN_LIST();
      // this.CLEAR_HOUSE_LIST();
      this.guguncode = null;
      if (this.sidocode) this.getGugunList(this.sidocode);
    },
    searchApt() {
      console.log(this.guguncode);
      if (this.guguncode) this.getHouseList(this.guguncode);
    },
  },
};
</script>

<style></style>
