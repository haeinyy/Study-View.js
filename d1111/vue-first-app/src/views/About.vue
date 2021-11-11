<template>
  <div class="about">
    <h1>This is an about page {{ id }}</h1>
  </div>
</template>

<script>
export default {
  name: "About",
  data() {
    return {
      id: null,
    };
  },
  created() {
    this.id = this.$route.params.id;
  },
};
</script>
