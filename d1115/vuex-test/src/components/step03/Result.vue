<template>
  <div>
    <h2>{{ total }}</h2>
    <h2>{{ countMsg }}</h2>
    <!-- mapGetter() 
    <h2>{{ $store.getters.msg1 }}</h2>
    <h2>{{ $store.getters.msg2 }}</h2>
    <h2>{{ $store.getters.msg3 }}</h2>
    -->
    <h2>{{ msg1 }}</h2>
    <h2>{{ msg2 }}</h2>
    <h2>{{ msg3 }}</h2>
  </div>
</template>

<script>
// 반드시 import!!
import { mapGetters } from "vuex";

export default {
  computed: {
    // ...mapGetters({
    //   // 여기서의 이름 : index.js의 getters의 이름
    //   countMsg: "countMsg",
    //   msg1: "msg1",
    //   msg2: "msg2",
    //   msg3: "msg3",
    // }),
    // ES6문법 : 이름 같을때, 하나만 쓰기
    ...mapGetters(["countMsg", "msg1", "msg2", "msg3"]),
    total() {
      return this.$store.state.count;
    },
    /*
    countMsg() {
      return this.$store.getters.countMsg;
    },
    */
  },
};
</script>

<style></style>
