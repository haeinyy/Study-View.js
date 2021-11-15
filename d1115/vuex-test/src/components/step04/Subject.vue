<template>
  <div>
    <button v-on:click="addCount">{{ title }} - {{ count }}</button>
    <button v-on:click="addTenCount">{{ title }} - {{ count }}</button>
    <button v-on:click="addObjCount">{{ title }} - {{ count }}</button>
  </div>
</template>

<script>
export default {
  name: "Subject",
  props: ["title"],
  data() {
    return {
      count: 0,
    };
  },
  methods: {
    addCount: function() {
      this.count += 1;
      //                  mutations  이름 (보통 대문자로)
      this.$store.commit("ADD_ONE");
      // this.$store.state.count++;
    },
    addTenCount: function() {
      this.count += 10;
      this.$store.commit("ADD_COUNT", 10);
    },
    addObjCount: function() {
      let num = Math.round(Math.random() * 100);
      console.log(num);
      this.count += num;
      this.$store.commit("ADD_OBJ_COUNT", { num }); // {num:num} 객체로 보낼수 있다!
    },
  },
};
</script>

<style></style>
