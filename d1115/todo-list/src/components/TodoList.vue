<template>
  <div>
    <todo-list-item v-for="(todo, index) in todos" :key="index" :todo="todo" />
  </div>
</template>

<script>
import { mapState } from "vuex";
import TodoListItem from "./TodoListItem";

export default {
  name: "TodoList",
  components: {
    TodoListItem,
  },
  computed: {
    // 값이 안바뀌면 캐싱에서 가져오고, 바뀌면 로직돌고 넘어옴
    //  1.
    // todos() {
    //   return this.$store.state.todos;
    // },
    // 2.
    // ...mapState({
    //   todos: 'todos',
    // }),
    // 3.
    ...mapState(["todos"]),
  },
};
</script>

<style></style>
