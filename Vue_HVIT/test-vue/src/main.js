import Vue from "vue";
import App from "./App.vue";
import router from "./router";
import store from "./store";
import vuetify from "./plugins/vuetify";
import FirstComponent from './components/FirstComponent'
import FormLogin from './components/FormLogin'
import bai8 from './components/bai8'
Vue.config.productionTip = false;
Vue.component("first-component",FirstComponent);
Vue.component("form-login",FormLogin);
Vue.component("bai-8",bai8);
export const EventBus = new Vue();
new Vue({
  router,
  store,
  vuetify,
  render: (h) => h(App),
}).$mount("#app");
