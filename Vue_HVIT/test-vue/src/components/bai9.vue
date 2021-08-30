<template>
  <div class="d-flex justify-center" style="padding-top: 10px">
    <div>Count - {{ count }}</div>
    <div>
      <v-btn outlined color="teal" @click="increase">Increase</v-btn>
    </div>
  </div>
</template>
<script>
export default {
  data: () => ({
    count: 0,
  }),
  watch: {
    count: (newVal) => {
      if (newVal > 100) {
        alert("Bam it thoi khong hong chuot bay gio!");
      }
    },
  },
  methods: {
    increase() {
      this.count += Math.max(Math.floor(Math.random() * 10), 5);
      //console.log(this.count);
      //console.log(Math.max(Math.floor(Math.random()*10),5));
    },
  },
};
</script>
