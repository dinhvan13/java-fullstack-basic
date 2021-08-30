
<template>
  <div>
    <v-icon :size="80"
    :style="`color: ${turnOn ? '#42b983' : 'grey'}`">mdi-lightbulb</v-icon>
    <div>
      <v-btn outlined color ="green" @click="clickOnButton()">
        Turn {{turnOn ?"Off": "On"}}
      </v-btn>
    </div>
  </div>
</template>
<script>
export default {
  name: "HelloWorld",
  data:() =>({
    turnOn:false
  }),
  methods: {
     clickOnButton(){
       this.turnOn = !this.turnOn;
     }
  }
 
  };

</script>
