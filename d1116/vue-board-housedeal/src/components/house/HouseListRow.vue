<template>
  <b-row
    class="m-2"
    @click="selectHouse"
    @mouseover="colorChange(true)"
    @mouseout="colorChange(false)"
    :class="{ 'mouse-over-bgcolor': isColor }"
  >
    <b-col cols="2" class="text-center align-self-center">
      <b-img
        thumbnail
        src="https://picsum.photos/250/250/?image=58"
        alt="Image 1"
      ></b-img>
    </b-col>
    <b-col cols="10" class="align-self-center">
      [{{ house.일련번호 }}일련번호] {{ house.아파트 }}
    </b-col>
  </b-row>
</template>

<script>
import { mapActions } from "vuex";
export default {
  name: "HouseListRow",
  props: {
    house: Object,
  },
  data() {
    return {
      isColor: false,
    };
  },
  methods: {
    ...mapActions(["detailHosue"]),
    colorChange(flag) {
      this.isColor = flag;
    },
    selectHouse() {
      this.detailHosue(this.house); // 현재 선택한 house 보내주기
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
