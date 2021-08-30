import Vue from "vue";
import Vuex from "vuex";

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    videos: [
      // {
      //   id: 1,
      //   name: "ES2015 Arrow Functions",
      //   description: `<p>ES2015 (aka ES6) has some great ways to make your code easier to write and understand. In this episode, we cover two different ways that you can make your code clearer by removing the 'function' keyword.</p>`,
      //   thumbnail:
      //     "https://vue-screencasts.s3.us-east-2.amazonaws.com/images/video-thumbnails/Thumbnail+-+Arrow+Function.png",
      //   videoUrl:
      //     "https://vue-screencasts.s3.us-east-2.amazonaws.com/video-files/38-+es2015-+functions+minus+'function'.mp4",
      // },
      // {
      //   id: 2,
      //   name: "ES2015 Template Strings",
      //   description: `<p>Template strings are an incredibly useful new feature in ES2015... and you can use them in your Ember apps today!</p>
      //                 <p>Here are 3 cool things that template strings enable.</p>`,
      //   thumbnail:
      //     "https://vue-screencasts.s3.us-east-2.amazonaws.com/images/video-thumbnails/Thumbnail+-+Template+Strings.png",
      //   videoUrl:
      //     "https://vue-screencasts.s3.us-east-2.amazonaws.com/video-files/42-+ES2015+template+strings.mp4",
      // },
      // {
      //   id: 3,
      //   name: "ES2015 Modules",
      //   description: `<p>Before modules, javascript code loading was a mess. Now it's pretty amazing.</p>
      //                 <p>Learn about ES2015 modules and how they work together with ember-cli.</p>`,
      //   thumbnail:
      //     "https://vue-screencasts.s3.us-east-2.amazonaws.com/images/video-thumbnails/Thumbnail+-+ES2015+Modules.png",
      //     videoUrl: "https://vue-screencasts.s3.us-east-2.amazonaws.com/video-files/EmberScreencast+62+-+ES2015+Modules+-+Import%2C+Export.mp4",
      // },
      // {
      //   id: 4,
      //   name: "Promise Basics",
      //   description: `<p>Promises are a tool for handling asynchronous communication, and they are commonly used in Ember applications. They’re even built in to Ember Data, route handling, and other parts of the Ember source.</p>
      //                 <p>This episode introduces the then, catch, and finally blocks, how to chain them together, and how to use them with either named or anonymous functions.</p>`,
      //   thumbnail:
      //     "https://vue-screencasts.s3.us-east-2.amazonaws.com/images/video-thumbnails/Thumbnail+-+Promise+Basics.png",
      //     videoUrl: "https://vue-screencasts.s3.us-east-2.amazonaws.com/video-files/EmberScreencast+92+-+Promises+Basics.mp4",
      // },
      // {
      //   id: 5,
      //   name: "Creating New Promises",
      //   description: `<p>Sometimes you want to start a new promise chain or have greater control over the timing of events. By manually creating a promise, you can do that.</p>
      //                 <p>In this video we cover creating a new promise and resolving or rejecting the promise. We use two examples- a custom AJAX login and an Ember Data findAll request.</p>`,
      //   thumbnail:
      //     "https://vue-screencasts.s3.us-east-2.amazonaws.com/images/video-thumbnails/Thumbnail+-+Creating+New+Promises.png",
      //     videoUrl: "https://vue-screencasts.s3.us-east-2.amazonaws.com/video-files/EmberScreencast+93+-+Creating+New+Promises.mp4",
      // },
      // {
      //   id: 6,
      //   name: "Multiple Concurrent Promises",
      //   description: `<p>Sometimes promises have to happen in an exact order, but often there will be several calls that can be made concurrently. RSVP’s Promise implementation allows that.</p>
      //                 <p>In this video we show how to use the hash method, one of several methods available to do concurrent promises.</p>`,
      //   thumbnail:
      //     "https://vue-screencasts.s3.us-east-2.amazonaws.com/images/video-thumbnails/Thumbnail+-+Multiple+Concurrent+Promises.png",
      //     videoUrl: "https://vue-screencasts.s3.us-east-2.amazonaws.com/video-files/EmberScreencast+95+-+Multiple+Concurrent+Promises.mp4",

      // },
      // {
      //   id: 7,
      //   name: "Chim Quy Trong Long",
      //   description: `Nguyễn Bảo Khánh nổi tiếng trên mạng xã hội với khả năng chơi đàn và biệt danh "Khánh nện". Năm 2017, anh gia nhập công ty INCUOMMOS và lấy nghệ danh là K-ICM. Giữa năm 2017, K-ICM hợp tác cùng Đạt G và Masew ra`,
      //   thumbnail:
      //     "https://photo-resize-zmp3.zadn.vn/w600_r300x169_jpeg/thumb_video/b/9/b/e/b9be23e6556b904c10a2c2491df98e5c.jpg",
      //     videoUrl: "https://vue-screencasts.s3.us-east-2.amazonaws.com/video-files/EmberScreencast+95+-+Multiple+Concurrent+Promises.mp4",
      // },
      // {
      //   id: 8,
      //   name: "ES2016 Decorators",
      //   description: `<p>Decorators let you easily and repeatedly add functionality to existing functions.</p>
      //                 <p>In this episode we go over how to use and create decorators, creating two useful decorators that demonstrate different parts of the API.</p>`,
      //   thumbnail:
      //     "https://vue-screencasts.s3.us-east-2.amazonaws.com/images/video-thumbnails/Thumbnail+-+Decorators.png",
      //     videoUrl: "https://vue-screencasts.s3.us-east-2.amazonaws.com/video-files/EmberScreencast+95+-+Multiple+Concurrent+Promises.mp4",
      // },
    ],
  },
  mutations: {},
  actions: {},
  modules: {},
});
