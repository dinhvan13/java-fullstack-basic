import Vue from "vue";
import VueRouter from "vue-router";
import Home from "../views/Home.vue";
import bai1 from "../components/bai1.vue"
import bai2 from "../components/bai2.vue"
import bai4 from "../components/bai4.vue"
import bai5 from "../components/bai5.vue"
import bai6 from "../components/bai6.vue"
import bai7 from "../components/bai7.vue"
import bai8 from "../components/bai8.vue"
import FirstComponent from '../components/FirstComponent'
import FormLogin from '../components/FormLogin'

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "Home",
    component: Home,
  },
  {
    path: "/",
    name: "FirstComponent",
    component: FirstComponent,
  },
  {
    path: "/bai1",
    name: "bai1",
    component: bai1,
  },
  {
    path: "/bai2",
    name: "bai2",
    component: bai2,
  },
  {
    path: "/bai4",
    name: "bai4",
    component: bai4,
  },
  {
    path: "/bai8",
    name: "bai8",
    component: bai8,
  },
  {
    path: "/bai6",
    name: "bai6",
    component: bai6,
  },
  {
    path: "/bai7",
    name: "bai7",
    component: bai7,
  },
  {
    path: "/bai5",
    name: "bai5",
    component: bai5,
  },
  {
    path: "/FormLogin",
    name: "FormLogin",
    component: FormLogin,
  },
  {
    path: "/about",
    name: "About",
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () =>
      import(/* webpackChunkName: "about" */ "../views/About.vue"),
  },
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;
