import Vue from "vue";
import VueRouter from "vue-router";
import New from '../components/New'
import Contact from '../components/Contact'
import BaiViet from '../components/BaiViet'
import ChiTietBaiViet from '../components/ChiTietBaiViet'

Vue.use(VueRouter);

const routes = [
  {
    path: "/new",
    name: "New",
    component: New,
  },
  {
    path: "/contact",
    name: "Contact",
    component: Contact,
  },
  {
    path: "/baiviet",
    name: "BaiViet",
    component: BaiViet,
  },
  {
    path: "/baiviet/:id",
    name: "ChiTietBaiViet",
    component: ChiTietBaiViet,
  },

  {
    path: "/user/:id/:name",
    name: "About",
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ "../views/About.vue"),
  },
];

const router = new VueRouter({
  mode: "history",
  routes,
});

export default router;
