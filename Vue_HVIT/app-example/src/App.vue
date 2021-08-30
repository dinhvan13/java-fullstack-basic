<template>
  <v-app>
    <app-bar></app-bar>
    <nav-bar></nav-bar>
    <v-main>
      <router-view />
    </v-main>
  </v-app>
</template>

<script>
import NavBar from '../../app-vuetify/src/components/NavBar.vue';
import AppBar from '../../app-web/src/views/AppBar.vue';
export default {
  components: { AppBar, NavBar },
  name: "App",

  data: () => ({
    //
  }),
};
</script>
