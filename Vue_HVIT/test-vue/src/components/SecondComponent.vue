<template>
  <div>
    <div class="box-1">
      <h2>Second Component</h2>
      <div>User name:{{ myUserName }}</div>
      <div>User Age:{{ userAge }}</div>
    </div>
  </div>
</template>
<script>
import { EventBus } from "../main";
export default {
  props: {
    myUserName: {
      type: String,
    },
    userAge: {
      type: Number,
    },
  },
  created() {
    EventBus.$on("ageMasChanged", (age) => {
      this.userAge = age;
    });
  },
  methods: {
    changeName() {
      (this.user.name = "James"), this.$emit("nameMasChange", this.user.name);
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
