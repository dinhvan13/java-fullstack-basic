<template>
  <div class="d-flex justify-center" style="hight: 500px">
    <div class="box-1">
      <h2>First Component</h2>
      <div>User name: {{ name }}</div>
      <div>User Age: {{ age }}</div>
    </div>
    <second-component :myUserName="name" :userAge="age"></second-component>
    <third-component :userAge="age"></third-component>
  </div>
</template>
<script>
import SecondComponent from "./SecondComponent";
import ThirdComponent from "./ThirdComponent";
export default {
  components: {
    SecondComponent,
    ThirdComponent,
  },
  data: () => ({
    name: "Allie",
    age: 30,
  }),
  watch: {
    "user.name": (newVal) => {
      alert("Name was change to " + newVal + " by second componet");
    },
  },
};
</script>
<style scoped>
.box-1 {
  width: 300px;
  height: 200px;
  border: 1px solid green;
  padding: 30px;
}
</style>
