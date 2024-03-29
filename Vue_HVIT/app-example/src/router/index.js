import Vue from "vue";
import VueRouter from "vue-router";
import Home from "../views/Home.vue";
import CardFirst from "@/components/CardFirst"
import CardSecond from "@/components/CardSecond"
import Form from "@/components/Form"
import DataTable from "@/components/DataTable"

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "Home",
    component: Home,
  },
  {
    path: "/cardfirst",
    name: "CardFirst",
    component: CardFirst,
  },
  {
    path: "/cardsecond",
    name: "CardSecond",
    component: CardSecond,
  },
  {
    path: "/form",
    name: "Form",
    component: Form,
  },
  {
    path: "/table",
    name: "DataTable",
    component: DataTable,
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
