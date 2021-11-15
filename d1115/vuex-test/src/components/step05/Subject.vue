<template>
  <div>
    <button v-on:click="addCount">{{ title }} - {{ count }}</button>
    <button v-on:click="addTenCount">{{ title }} - {{ count }}</button>
    <button v-on:click="addObjCount">{{ title }} - {{ count }}</button>
  </div>
</template>

<script>
import { mapMutations } from "vuex";
export default {
  name: "Subject",
  props: ["title"],
  data() {
    return {
      count: 0,
    };
  },
  methods: {
    ...mapMutations({
      // 함수 호출하듯이 할 수 있음
      addMOne: "ADD_ONE",
      addMTenCount: "ADD_TEN_COUNT",
      addMObjCount: "ADD_OBJ_COUNT",
    }),
    // ...mapMutations(["ADD_ONE", "ADD_TEN_COUNT", "ADD_OBJ_COUNT"]), // 오류남...
    // 왜?? => 속석과 이름이 같을 때만 ES6문법 적용 가능
    addCount: function() {
      this.count += 1;
      // this.$store.commit('addOne');
      this.addMOne();
    },
    addTenCount: function() {
      this.count += 10;
      // this.$store.commit('addCount', 10);
      this.addMTenCount(10);
    },
    addObjCount: function() {
      let num = Math.round(Math.random() * 100);
      this.count += num;
      // this.$store.commit('addObjCount', { num });
      this.addMObjCount({ num });
    },
  },
};
</script>

<style></style>
