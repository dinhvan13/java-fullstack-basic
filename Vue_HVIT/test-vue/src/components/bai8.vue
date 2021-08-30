<template>
  <div>
    <h1 style="text-align: center; color: blue">Danh sach nhung hoc sinh gioi tinh nu:</h1>
    <div class="d-flex justity-center" style="padding: 10px" v-for="hs in hocSinh" :key="hs">
      <div>
        <v-icon size="50" color="green">mdi-home</v-icon>
        {{ hs.name }} có tuổi là {{ hs.age }} va diachi o {{ hs.address }} 
        da hoc mon :
        <strong v-for="mh in hs.subject" v-bind:key="mh">{{mh+" "}}</strong>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  data: () => ({
    hocSinh: [
      {
        name: "Nguyen Van A",
        age: 18,
        address: "Ha Noi",
        subject: ["Toan", "Ly", "Hoa"],
      },
      {
        name: "Nguyen Van B",
        age: 20,
        address: "TPHCM",
        subject: ["Toan", "Ly"],
      },
      {
        name: "Nguyen Van C",
        age: 22,
        address: "Hai Phong",
        subject: ["Toan", "Hoa"],
      },
      {
        name: "Nguyen Van D",
        age: 18,
        address: "Ha Noi",
        subject: ["Toan"],
      },
      {
        name: "Nguyen Van E",
        age: 26,
        address: "Da Nang",
        subject: ["Ly", "Hoa"],
      },
    ],
  }),
  computed: {
    lstHocsinhnu() {
      return this.hocSinh.filter((x) => x.gen == false);
    },
  },
};
</script>
