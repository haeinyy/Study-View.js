export default {
  template: `<div>
    자유 게시판
    <ul>
      <li v-for="i in 5">
        <router-link :to="'/board/' + i +'?name=ssafy'">{{i}}번 게시글</router-link>
      </li>
    </ul>
  </div>`,
};

// 주소에 넘어가는것 : params
// ? 뒤에 넘어가는 파라미터 : query