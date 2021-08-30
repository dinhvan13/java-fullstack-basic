<template>
  <div>
      
    <div class="d-flex justify-center" style="margin: 10px 0px 0px 10px">
        <div style="padding-right :10px;">So diem random {{xucXac}}</div>
        <div v-if="xucXac > 5">  Bạn quay được trên 5 điểm</div>
        <div v-else-if="xucXac < 5">Bạn quay được duoi 5 điểm</div>
        <div v-else>Bạn quay được 5 điểm</div>
    </div>
    <div class="d-flex justify-center mt-10">
      <v-btn   outlined color="green" @click="tungXucSac()"> Click Here! </v-btn>
    </div>
  </div>
</template>
<script>
export default {
  data: () => ({
    xucXac: 0,
  }),
  methods: {
    tungXucSac() {
      var rd = Math.random()*10;
      console.log(rd);
      this.xucXac = Math.round(rd);
    },
  },
};
</script>
