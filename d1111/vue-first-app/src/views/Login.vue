<template>
  <div>
    <h2>Login 페이지입니다.</h2>
    <div>이부분 로그인 디자인 할꺼에요! {{ no }}</div>
  </div>
</template>

<script>
export default {
  name: "Login",
  data() {
    return {
      no: 0,
    };
  },
  created() {
    this.no = this.$route.query.no;
  },
};
</script>

<style></style>
