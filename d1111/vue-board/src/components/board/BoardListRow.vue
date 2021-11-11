<template>
  <tr>
    <td>{{ no }}</td>
    <td>
      <router-link :to="{ name: 'BoardView', params: { no: no } }">{{ title }}</router-link>
    </td>
    <td>{{ writer }}</td>
    <td>{{ regtime }}</td>
  </tr>
</template>

<script>
export default {
  name: "BoardListRow",
  props: {
    no: Number,
    title: String,
    wrtier: String,
    regtiem: String,
  },
};
</script>

<style></style>
