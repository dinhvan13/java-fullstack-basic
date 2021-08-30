<template>
  <div >
    <div class="d-flex justity-center" style="padding:10px;"  v-for="hs in hocSinh" :key="hs.name">
      <v-icon size="50" color="green">mdi-home</v-icon>
  {{ hs.name}} có tuổi là {{hs.age}} đến từ {{hs.address}}.
    </div>
  </div>
</template>
<script>
export default {
  data: () => ({
    hocSinh: [
{ name: "Nguyen Van A", age: 18, address: "Ha Noi", },
{ name: "Nguyen Van B", age: 20, address: "TPHCM", },
{ name: "Nguyen Van C", age: 22, address: "Hai Phong", },
{ name: "Nguyen Van D", age: 18, address: "Ha Noi", },
{ name: "Nguyen Van E", age: 26, address: "Da Nang", }
]
  }),
};
</script>
