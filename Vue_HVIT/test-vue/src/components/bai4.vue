<template>
  <div class="d-flex justity-center">
    <div  v-for="str in lstString" :key="str">
      <v-icon size="50" color="green">mdi-star</v-icon>
  {{ str }}
    </div>
  </div>
</template>
<script>
export default {
  data: () => ({
    lstString: ["qua cam", "qua du du", "toan", "van"],
  }),
};
</script>
