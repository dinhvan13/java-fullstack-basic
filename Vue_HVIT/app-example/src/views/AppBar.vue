<template>
  <div>
    <v-app-bar color="deep-purple accent-4" dense dark>
      <v-app-bar-nav-icon @click="NavBarOpen"></v-app-bar-nav-icon>

      <router-link to="/" style="color: white; text-decoration: none">
        <v-toolbar-title>Page title</v-toolbar-title>
      </router-link>

      <v-spacer></v-spacer>

      <v-btn icon>
        <v-icon>mdi-search</v-icon>
      </v-btn>


    </v-app-bar>
  </div>
</template>
<script>
import { EventBus } from "../main";
export default {
  methods: {
    NavBarOpen() {
      EventBus.$emit("NavBarOpen");
      // console.log("kkk");
    },
  },
};
</script>
