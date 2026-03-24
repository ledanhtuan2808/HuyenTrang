<script setup>
import { ref } from 'vue';
import Table from './Table.vue';

const bien1 = ref('trang xinh gái') //String
const bien2 = ref(true) // boolean
const bien3 = ref(4) // number
const ten = ref('')
const anh = ref('')
const phankhuc = ref('')
const bien4 = ref([
  {
    id: 1,
    ten: 'CBR650RR',
    image: 'https://racing.vn/thumbs/700x700x1/upload/product/z6471385555286042c54620642d80b5b0e470d190cfec2-3469.jpg',
    phankhuc: '650cc'
  },
  {
    id: 2,
    ten: 'CBR650RR',
    image: 'https://racing.vn/thumbs/700x700x1/upload/product/87b5ab8b-c315-45ab-bd1d-94ffd100d446-4241.jpeg',
    phankhuc: '650cc'

  },
  {
    id: 3,
    ten: 'CBR650RR',
    image: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR-vRYRQdXmDWwmrgKJtHuw-2FYhyh2-WqGQQ&s',
    phankhuc: '650cc'

  }
])
const bien5 = ref('')

const dangky = () => {
  const momoi = {
    ten: ten.value,
    image: anh.value,
    phankhuc: phankhuc.value
  }
  if (confirm("mày có chắc chắn muốn thêm xe " + momoi.ten + " không ? ")) {
    bien4.value.unshift({ ...momoi })
    ten.value = '',
    anh.value = '',
    phankhuc.value = ''
  }
}
</script>

<template>
  <div class="mt-5">
    <h3 class="text-center text-success">đơn đăng ký xe</h3>
    <form action="" class="form">
      <div>
        <label for="" class="form-label fw-bold">Tên xe</label>
        <input type="text" name="" id="" class="w-25 form-control" v-model="ten">
      </div>

      <div>
        <label for="" class="form-label fw-bold">ảnh xe</label>
        <input type="text" name="" id="" class="w-25 form-control" v-model="anh">
        <!-- v-model là 1 tính năng của vue dùng để biding(rang buộc) 2 chiều -->
        <!-- tức là ở màn hình sửa gì thì controller nhận đươc và ngược lại-->
      </div>

      <div>
        <label for="" class="form-label fw-bold">phân khúc</label>
        <input type="text" name="" id="" class="w-25 form-control" v-model="phankhuc">
      </div>

      <div>
        <label for="" class="form-label fw-bold">số lượng</label>
        <input type="text" name="" id="" class="w-25 form-control">
      </div>

      <div>
        <label for="" class="form-label fw-bold">có bao nhiêu tệp đính kèm</label>
        <select name="" id="" class="form-select">
          <option value=""></option>
          <option value="1" class="">một mình chấp hết</option>
          <option value="2" class="">có thnagwf bạn</option>
          <option value="3" class="">có tổ đội</option>
        </select>
      </div>

      <div class="form-cehck fw-bold">
        <p class="form-label">đi bằng phương tiện gì</p>
        <div>
          <input type="checkbox" name="" id="" class="form-check-input">
          <label for="" class="form-check-label">2 cẳng</label>
        </div>

        <div>
          <input type="checkbox" name="" id="" class="form-check-input">
          <label for="" class="form-check-label">phân khối lớn</label>
        </div>

        <div>
          <input type="checkbox" name="" id="" class="form-check-input">
          <label for="" class="form-check-label">bốn bánh</label>
        </div>
      </div>
    </form>
    <div class="form-check">
      <p class="form-label">Giới tính</p>
    </div>
    <div>
      <input type="radio" name="sex" id="" class="form-check-input">
      <label for="" class="form-check-label">nam</label>
    </div>

    <div>
      <input type="radio" name="sex" id="" class="form-check-input">
      <label for="" class="form-check-label">nữ</label>
    </div>
    <!-- tiếp thoe là button -->

    <div class="pt-5 d-flex flex-column gap-4 w-25">
      <button type="submit" class="btn btn-danger" @click.prevent="dangky">đăng ký món</button>
      <button type="reset" class="btn btn-warning">cho bố mày nghĩ lại</button>
      <button type="buttom" class="btn btn-success">ăn xong đi đâu cũng được</button>
    </div>

    <Table :bien4="bien4" :bien5="bien1"></Table>
  </div>

  <!-- thay thế table cũ, chúng ta gọi component table.vue ở đây -->
  <!-- thay thế table cũ, chúng ta gọi component table.vue ở đây -->
   <!-- chúng ta sẻ chuyền 1 cái mãng từ trang chủ (mẹ) tới table (con) -->
   
   </template>

<style scoped>
.read-the-docs {
  color: #888;
}
</style>
