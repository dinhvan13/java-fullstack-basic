<template>
<v-app>
  <div class="container">
    <nav-bar></nav-bar>
    <router-view></router-view>
    </div>
 </v-app>   

  
</template>

<script>
import NavBar from './components/NavBar.vue';
export default {
  components: { NavBar },
  name: "App",

  data: () => ({
    //
  }),
};
</script>
