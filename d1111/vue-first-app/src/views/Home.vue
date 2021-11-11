<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/logo.png" />
    <HelloWorld :msg="sendMsg" /> <!-- javascript가 가지고있는 변수는 반드시 바인딩 처리!-->
    <!-- <hello-world :msg="sendMsg" /> javascript가 가지고있는 변수는 반드시 바인딩 처리! -->
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from "@/components/HelloWorld.vue"; // @는 src까지 이동 

export default {
  name: "Home",
  components: {
    HelloWorld,
  },
  data() {
    return {
      sendMsg :"안녕하세요 vueCLI입니다."
    }
  },
};
</script>
