<template>
  <div class="container d-flex justify-center" style="margin-top: 20px">
    <div class="card" style="width: 400px" v-for="item in baiViets" :key="item.id">
      <img class="card-img-top" :src="item.linkAnh" alt="Card image" style="width: 100%" />
      <div class="card-body">
        <h3 style="cursor: pointer" @click="goTodetail(item.id)">{{ item.nguoiTao }}</h3>
        <p class="card-text">{{ item.noiDung }}</p>
        <a><router-link active-class="active" :to="item.link">Details</router-link></a>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  data: () => ({
    baiViets: [
      {
        id: 1,
        link: "baiviet/1",
        linkAnh: "https://up.enterdesk.com/edpic_360_360/eb/1a/a6/eb1aa6553f780f694f7c4f151829dff5.jpg",
        noiDung:
          "Đài truyền hình quốc gia Iran đưa tin, tàu Kharg, tàu phụ trợ lớn nhất của hải quân nước này, bắt đầu bốc cháy khoảng 2h25 sáng nay 2/6 gần cảng Jask của Iran trên vịnh Oman khi đang làm nhiệm vụ diễn tập.",
        nguoiTao: "Quoc",
      },
      {
        id: 2,
        link: "baiviet/2",
        linkAnh: "https://up.enterdesk.com/edpic_360_360/eb/1a/a6/eb1aa6553f780f694f7c4f151829dff5.jpg",
        noiDung:
          "Mọi nỗ lực cứu con tàu đều thất bại, nó đã bị đắm, hãng tin FARS của Iran đưa tin và cho hay toàn bộ thủy thủ đoàn đã được sơ tán an toàn. Truyền thông Iran không nêu rõ nguyên nhân khiến con tàu bốc cháy, mà chỉ nói rằng lửa bùng lên ở một trong những hệ thống của con tàu.",
        nguoiTao: "Van",
      },
      {
        id: 3,
        link: "baiviet/3",
        linkAnh: "https://up.enterdesk.com/edpic_360_360/eb/1a/a6/eb1aa6553f780f694f7c4f151829dff5.jpg",
        noiDung:
          "Hồi tháng 4, Iran cho biết một trong những con tàu của nước này đã bị tấn công trên Biển Đỏ. Vụ việc diễn ra trong bối cảnh Israel và Iran đổ lỗi cho nhau về hàng loạt vụ tấn công nhằm vào các tàu chở hàng trong khu vực kể từ cuối tháng 2.",
        nguoiTao: "Trung",
      },
      {
        id: 4,
        link: "baiviet/4",
        linkAnh: "https://up.enterdesk.com/edpic_360_360/eb/1a/a6/eb1aa6553f780f694f7c4f151829dff5.jpg",
        noiDung:
          "Hồi tháng 4, Iran cho biết một trong những con tàu của nước này đã bị tấn công trên Biển Đỏ. Vụ việc diễn ra trong bối cảnh Israel và Iran đổ lỗi cho nhau về hàng loạt vụ tấn công nhằm vào các tàu chở hàng trong khu vực kể từ cuối tháng 2.",
        nguoiTao: "Thanh",
      },
      {
        id: 5,
        linkAnh: "https://www.takadada.com/wp-content/uploads/2019/11/hinh-nen-gai-xinh-44.jpg",
        noiDung:
          "Hồi tháng 4, Iran cho biết một trong những con tàu của nước này đã bị tấn công trên Biển Đỏ. Vụ việc diễn ra trong bối cảnh Israel và Iran đổ lỗi cho nhau về hàng loạt vụ tấn công nhằm vào các tàu chở hàng trong khu vực kể từ cuối tháng 2.",
        nguoiTao: "Dat",
      },
    ],
  }),
  methods: {
    goTodetail(proId) {
      this.$router.push({ name: "ChiTietBaiViet", params: { id: proId } });
    },
  },
};
</script>
<style>
.card {
  margin: auto;
  border-bottom: 1px solid grey;
  border-width: 50%;
  padding-top: 20px;
}
</style>
