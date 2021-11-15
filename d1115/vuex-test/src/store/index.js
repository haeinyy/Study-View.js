import Vue from "vue";
import Vuex from "vuex";

Vue.use(Vuex);

// step01;
// export default new Vuex.Store({
//   state: {
//     count: 0,
//   },
// });

//step02
// export default new Vuex.Store({
//   state: {
//     count: 0,
//   },
//   getters: {
//     // 복잡한 계산식을 처리 : computed
//     countMsg(state) {
//       // getters의 첫번쨰 인자값은 항상 state로
//       // return state.count + '번 호출됨';
//       let msg = "10번보다 ";
//       if (state.count > 10) {
//         msg += "많이 ";
//       } else {
//         msg += "적게 ";
//       }
//       return msg + " 호출됨(" + state.count + ")";
//     },
//   },
// });

//step03
// export default new Vuex.Store({
//   state: {
//     count: 0,
//   },
//   getters: {
//     // 복잡한 계산식을 처리 : computed
//     countMsg(state) {
//       // return state.count + '번 호출됨';
//       let msg = "10번보다 ";
//       if (state.count > 10) {
//         msg += "많이 ";
//       } else {
//         msg += "적게 ";
//       }
//       return msg + " 호출됨(" + state.count + ")";
//     },
//     msg1(state) {
//       return "msg1 : " + state.count;
//     },
//     msg2(state) {
//       return "msg2 : " + state.count;
//     },
//     msg3(state) {
//       return "msg3 : " + state.count;
//     },
//   },
// });

//step04
// export default new Vuex.Store({
//   state: {
//     count: 0,
//   },
//   mutations: { // mutations는 보통 대문자로 선언
//     ADD_ONE(state) {
//       state.count += 1;
//     },
//     ADD_COUNT(state, payload) {
//       // payload : 10
//       state.count += payload;
//     },
//     ADD_OBJ_COUNT(state, payload) {
//       // payload : num
//       state.count += payload.num; // 객체가 넘어옴
//     },
//   },
//   getters: {
//     // 복잡한 계산식을 처리 : computed
//     countMsg(state) {
//       // return state.count + '번 호출됨';
//       let msg = "10번보다 ";
//       if (state.count > 10) {
//         msg += "많이 ";
//       } else {
//         msg += "적게 ";
//       }
//       return msg + " 호출됨(" + state.count + ")";
//     },
//   },
// });

//step05
// export default new Vuex.Store({
//   state: {
//     count: 0,
//   },
//   actions: {
//     asyncAddOne(context) {
//       setTimeout(() => {
//         context.commit("addOne");
//       }, 2000);
//     },
//   },
//   mutations: {
//     ADD_ONE(state) {
//       state.count += 1;
//     },
//     ADD_TEN_COUNT(state, payload) {
//       state.count += payload;
//     },
//     ADD_OBJ_COUNT(state, payload) {
//       state.count += payload.num;
//     },
//   },
//   getters: {
//     // 복잡한 계산식을 처리 : computed
//     countMsg(state) {
//       // return state.count + '번 호출됨';
//       let msg = "10번보다 ";
//       if (state.count > 10) {
//         msg += "많이 ";
//       } else {
//         msg += "적게 ";
//       }
//       return msg + " 호출됨(" + state.count + ")";
//     },
//   },
// });

//step06
// export default new Vuex.Store({
//   state: {
//     count: 0,
//   },
//   actions: {
//     // 비동기로 서버에서 데이터 가져오기
//     asyncAddOne(context) {
//       // mutations을 참조할수있는 context를 받음
//       setTimeout(() => {
//         context.commit("ADD_ONE"); // context = this.$store
//       }, 2000); // 2초기다리기
//     },
//   },
//   mutations: {
//     // 역할 : state값의 변경
//     ADD_ONE(state) {
//       state.count += 1;
//     },
//     ADD_TEN_COUNT(state, payload) {
//       state.count += payload;
//     },
//     ADD_OBJ_COUNT(state, payload) {
//       state.count += payload.num;
//     },
//   },
//   getters: {
//     // 복잡한 계산식을 처리 : computed
//     countMsg(state) {
//       // return state.count + '번 호출됨';
//       let msg = "10번보다 ";
//       if (state.count > 10) {
//         msg += "많이 ";
//       } else {
//         msg += "적게 ";
//       }
//       return msg + " 호출됨(" + state.count + ")";
//     },
//   },
// });

//step07
export default new Vuex.Store({
  state: {
    count: 0,
  },
  actions: {
    asyncAddOne(context) {
      setTimeout(() => {
        context.commit("addOne");
      }, 2000);
    },
  },
  mutations: {
    ADD_ONE(state) {
      state.count += 1;
    },
    ADD_TEN_COUNT(state, payload) {
      state.count += payload;
    },
    ADD_OBJ_COUNT(state, payload) {
      state.count += payload.num;
    },
  },
  getters: {
    // 복잡한 계산식을 처리 : computed
    countMsg(state) {
      // return state.count + '번 호출됨';
      let msg = "10번보다 ";
      if (state.count > 10) {
        msg += "많이 ";
      } else {
        msg += "적게 ";
      }
      return msg + " 호출됨(" + state.count + ")";
    },
  },
});
