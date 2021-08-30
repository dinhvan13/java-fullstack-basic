<template>
  <v-container>
   <div>
     <v-icon class ="d-flex justify-center" size ="150"
     :style="`color: ${turnOn ? '#42b983': 'grey' }`"
     >
       mdi-lightbulb
     </v-icon>
     <div class="d-flex justify-center">
       <v-btn  outlined color = "red" @click="clickOnButton()">
         Turn{{turnOn ? "Off" : "On"}}
       </v-btn>
     </div>
   </div>
  </v-container>
</template>

<script>
export default {
  name: "HelloWorld",

  data: () => ({
     turnOn :false
  }) ,
  methods: {
    clickOnButton(){
      this.turnOn = !this.turnOn;
    }
  },
};
</script>
