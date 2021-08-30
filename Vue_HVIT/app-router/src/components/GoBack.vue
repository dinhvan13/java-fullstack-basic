<template>
  <span class="go-back">
    <button @click="goBack" class="btn">Return</button>
  </span>
</template>
<script>
export default {
  data() {
    return {};
  },
  methods: {
    goBack() {
      return this.$router.go(-1);
    },
  },
};
</script>
<style scoped>
.go-back {
  display: flex;
}
button {
  border: 0;
}
.btn {
  margin-top: 10px;
  width: 100px;
  height: 40px;
  background-color: aquamarine;
  color: brown;
  border: 1px solid #fff;
  border-radius: 10%;
}
.btn:hover {
  cursor: pointer;
}
</style>
