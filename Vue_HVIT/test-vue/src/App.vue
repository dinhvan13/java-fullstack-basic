<template>
  <v-app style="margin-top: 15px">
    <v-main>
      <first-component></first-component>
      <form-login></form-login>
      <bai-8></bai-8>
    </v-main>
  </v-app>
</template>

<script>
import Bai8 from './components/bai8.vue';
import FirstComponent from "./components/FirstComponent";
import FormLogin from './components/FormLogin.vue';
export default {
  name: "App",
  components: { FirstComponent ,FormLogin, Bai8},

  data: () => ({
    //
  }),
};
</script>
