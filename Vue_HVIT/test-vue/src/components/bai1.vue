<template>
  <div class="d-flex justify-center" style="margin: 10px 0px 0px 10px">
    <div class="conditional-rendering">
      <div class="block-1" v-if="isActive == true">This is block 1</div>
      <div class="block-2" v-if="isActive == false">This is block 2</div>
    </div>
    <v-btn outlined color="green" @click="changedBLock()"> Click Here! </v-btn>

    <h3>{{ a }}</h3>
    <v-btn outlined color="green" @click="changedBLock1()"> Click Here! </v-btn>

    <div id="example">
      {{ message.split("").reverse().join("") }}
    </div>
    <div id="demo">{{ fullName }}</div>
  </div>
</template>
<script>
/*var vue1 = new Vue({
  el: "#example",
  data: () => ({
    isActive: true,
    a: 1,
    message: "chao mung ban den voi lap trinh vue!",
  }),
  created: function () {
    // `this` points to the vm instance
    console.log("a is: " + this.a);
    alert("created!");
  },
  mounted: function () {
    // `this` points to the vm instance
    console.log("a is: " + this.a);
  },
  updated: function () {
    // `this` points to the vm instance
    console.log("a is: " + this.a);
  },
  destroyed: function () {
    // `this` points to the vm instance
    console.log("a is: " + this.a);
  },
  computed: {},
  methods: {
    changedBLock() {
      this.isActive = !this.isActive;
    },
    changedBLock1() {
      this.a += 2;
    },
  },
});*/


     // });
</script>

