<template>
  <div >
      <h1 style="text-align:center; color: blue;">Danh sach nhung hoc sinh gioi tinh nam:</h1>
    <div class="d-flex justity-center" style="padding:10px;"  v-for="hs in hocSinh" :key="hs.name" >
        <div v-if="hs.gen == true">
              <v-icon size="50" color="green">mdi-home</v-icon>
             {{ hs.name}} có tuổi là {{hs.age}} gen la nam :{{hs.gen}}.
        </div>
  
    </div>
  </div>
</template>
<script>
export default {
  data: () => ({
   hocSinh: [
{ name: "Nguyen Van A", age: 18, gen: true },
{ name: "Nguyen Van B", age: 20, gen: true },
{ name: "Nguyen Van C", age: 22, gen: true },
{ name: "Nguyen Van D", age: 18, gen: true },
{ name: "Nguyen Van E", age: 26, gen: false } ]
  }),
};
</script>
