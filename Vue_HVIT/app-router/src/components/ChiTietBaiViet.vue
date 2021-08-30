<template>
  <div>
    <Go-Back />
    <div class="details" style="margin: auto; width: 600px">
      <div class="container d-flex justify-center">
        <div class="row" style="margin-top: 20px">
          <div class="col-md-12" v-for="(item, index) in baiViets" :key="index">
            <div v-if="proId == item.id">
              <img :src="item.linkAnh" class="img-fluid" width="600px" height="500px" />
              <h1>{{ item.nguoiTao }}</h1>
              <p>{{ item.noiDung }}</p>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
import GoBack from "./GoBack.vue";
export default {
  components: { GoBack },
  name: "ChiTietBaiViet",
  data() {
    return {
      proId: this.$route.params.id,
      title: "chitietbaiviet",
      baiViets: [
        {
          id: 1,
          linkAnh: "https://up.enterdesk.com/edpic_360_360/eb/1a/a6/eb1aa6553f780f694f7c4f151829dff5.jpg",
          noiDung:
            "Đài truyền hình quốc gia Iran đưa tin, tàu Kharg, tàu phụ trợ lớn nhất của hải quân nước này, bắt đầu bốc cháy khoảng 2h25 sáng nay 2/6 gần cảng Jask của Iran trên vịnh Oman khi đang làm nhiệm vụ diễn tập.",
          nguoiTao: "Quoc",
        },
        {
          id: 2,
          linkAnh: "https://up.enterdesk.com/edpic_360_360/eb/1a/a6/eb1aa6553f780f694f7c4f151829dff5.jpg",
          noiDung:
            "Mọi nỗ lực cứu con tàu đều thất bại, nó đã bị đắm, hãng tin FARS của Iran đưa tin và cho hay toàn bộ thủy thủ đoàn đã được sơ tán an toàn. Truyền thông Iran không nêu rõ nguyên nhân khiến con tàu bốc cháy, mà chỉ nói rằng lửa bùng lên ở một trong những hệ thống của con tàu.",
          nguoiTao: "Van",
        },
        {
          id: 3,
          linkAnh: "https://up.enterdesk.com/edpic_360_360/eb/1a/a6/eb1aa6553f780f694f7c4f151829dff5.jpg",
          noiDung:
            "Hồi tháng 4, Iran cho biết một trong những con tàu của nước này đã bị tấn công trên Biển Đỏ. Vụ việc diễn ra trong bối cảnh Israel và Iran đổ lỗi cho nhau về hàng loạt vụ tấn công nhằm vào các tàu chở hàng trong khu vực kể từ cuối tháng 2.",
          nguoiTao: "Trung",
        },
        {
          id: 4,
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
    };
  },
};
</script>
