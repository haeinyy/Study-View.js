<template>
  <div class="regist">
    <h1 class="underline">SSAFY 글 정보</h1>
    <div class="regist_form">
      <label for="isbn">글번호</label>
      <div class="view">{{ article.no }}</div>
      <label for="title">제목</label>
      <div class="view">{{ article.title }}</div>
      <label for="author">작성자</label>
      <div class="view">{{ article.writer }}</div>
      <label for="price">작성일</label>
      <div class="view">{{ article.regtime }}</div>
      <label for="content">내용</label>
      <div class="view" v-html="article.content"></div>
      <div style="padding-top: 15px">
        <router-link :to="{ name: 'BoardModify' }" class="btn">수정</router-link>
        <router-link :to="{ name: 'BoardDelete' }" class="btn">삭제</router-link>
        <router-link to="/list" class="btn">목록</router-link>
      </div>
    </div>
  </div>
</template>

<script>
import http from "@/util/http-common.js";

export default {
  data: function () {
    return {
      article: {},
    };
  },
  created() {
    http.get(`/api/board/${this.$route.params.no}`).then(({ data }) => {
      this.article = data;
      console.log("글보기 완료!!!");
    });
  },
  methods: {},
};
</script>

<style></style>
