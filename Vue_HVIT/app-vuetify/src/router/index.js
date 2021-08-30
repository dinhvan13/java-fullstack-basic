import Vue from "vue";
import VueRouter from "vue-router";
import CardFirst from "../components/CardFirst"
import CardSecond from "../components/CardSecond"
import FormDangKy from "../components/FormDangKy"
import DataTable from "../components/DataTable"

Vue.use(VueRouter);

const routes = [
  {
    path: "/cardfirst",
    name: "CardFirst",
    component: CardFirst,
  },
  {
    path: "/dangky",
    name: "FormDangKy",
    component: FormDangKy,
  },
  {
    path: "/cardsecond",
    name: "CardSecond",
    component: CardSecond,
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
