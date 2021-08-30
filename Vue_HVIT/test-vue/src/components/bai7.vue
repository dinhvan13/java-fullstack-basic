<template>
  <div>
    <h1 style="text-align: center; color: blue">Danh sach nhung hoc sinh gioi tinh nu:</h1>
    <div class="d-flex justity-center" style="padding: 10px" v-for="hs in lstHocsinhnu" :key="hs.name">
      <div>
        <v-icon size="50" color="green">mdi-home</v-icon>
        {{ hs.name }} có tuổi là {{ hs.age }}.
      </div>
    </div>
  </div>
</template>
<script>
export default {
  data: () => ({
    hocSinh: [
      { name: "Nguyen Van A", age: 18, gen: false },
      { name: "Nguyen Van B", age: 20, gen: false },
      { name: "Nguyen Van C", age: 22, gen: true },
      { name: "Nguyen Van D", age: 18, gen: true },
      { name: "Nguyen Van E", age: 26, gen: false },
    ],
  }),
  computed: {
    lstHocsinhnu() {
      return this.hocSinh.filter((x) => x.gen == false);
    },
  },
};
</script>
