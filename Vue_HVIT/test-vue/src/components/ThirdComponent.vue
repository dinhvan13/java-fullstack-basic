<template>
  <div>
    <div class="box-1">
      <h2>Third Component</h2>
      <div>User Age:{{ userAge }}</div>
      <div>
        <v-btn outlined color="blue" @click="changeAge">Change Age</v-btn>
      </div>
    </div>
  </div>
</template>
<script>
import { EventBus } from "../main";
export default {
  props: {
    userAge: {
      type: Number,
    },
  },
  methods: {
    changeAge() {
      (this.userAge = 40), 
      EventBus.$emit("ageMasChanged", this.userAge);
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
