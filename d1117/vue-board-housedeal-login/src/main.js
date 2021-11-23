import Vue from "vue";
import App from "./App.vue";
import router from "./router";
import { BootstrapVue, IconsPlugin } from "bootstrap-vue";

// Import Bootstrap an BootstrapVue CSS files (order is important)
import "bootstrap/dist/css/bootstrap.css";
import "bootstrap-vue/dist/bootstrap-vue.css";
import store from "./store";
import memberStore from "./store/modules/memberStore";

// Make BootstrapVue available throughout your project
Vue.use(BootstrapVue);
// Optionally install the BootstrapVue icon components plugin
Vue.use(IconsPlugin);

Vue.config.productionTip = false;

new Vue({
  router,
  store,
  async beforeCreate() {
    // 메인페이지 열기전에
    let token = sessionStorage.getItem("access-token"); // 현재 session storage의 토큰 얻어오기
    if (memberStore.state.userInfo == null && token) {
      // 이미 로그인 한 유저랑 얘기 (토큰은 있지만 userinfor만 없기 때문!)
      await memberStore.dispatch("getUserInfo", token); // 그러면 해당 유저가 올바른 유저인지 확인하기 위해 서버로 넘기기
    }
  },
  render: (h) => h(App),
}).$mount("#app");
