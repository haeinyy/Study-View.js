<template>
  <b-row
    class="m-2"
    @mouseover="colorChange(true)"
    @mouseout="colorChange(false)"
    :class="{ 'mouse-over-bgcolor': isColor }"
  >
    <b-col cols="2" class="text-center align-self-center">
      <!-- <b-img thumbnail src="https://picsum.photos/250/250/?image=58" alt="Image 1"></b-img> -->
      <b-img thumbnail :src="require('@/assets/apt.png')"></b-img>
    </b-col>
    <b-col cols="10" class="align-self-center"> [일련번호] 아파트이름 </b-col>
  </b-row>
</template>

<script>
export default {
  name: "HouseListRow",
  data() {
    return {
      isColor: false,
    };
  },
  methods: {
    colorChange(flag) {
      this.isColor = flag;
    },
  },
};
</script>

<style scoped>
.apt {
  width: 50px;
}
.mouse-over-bgcolor {
  background-color: lightblue;
}
</style>
