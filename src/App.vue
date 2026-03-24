<script setup>
import TrangChu from './components/TrangChu.vue'
// import { ref } from 'vue';
// // ref này là công cụ của vue dùng f=để binding  {lưu dữ liệu đó hiển thị ở màn hình }
// // muốn thay đổi giá trị của ref phải dùng value
// // binding tức là khi biến ở srcipt (controller) thy đổi -> ở view (màn hình) thay đổi theo
// // cú pháp khai báo :ref(giá trị mặc định của biến cần lưu)
// const bien1 = ref('trang xinh gái') //String
// const bien2 = ref(true) // boolean
// const bien3 = ref(4) // number
// const ten = ref('')
// const anh = ref('')
// const phankhuc = ref('')
// const bien4 = ref([
//   {
//     id: 1,
//     ten: 'CBR650RR',
//     image: 'https://racing.vn/thumbs/700x700x1/upload/product/z6471385555286042c54620642d80b5b0e470d190cfec2-3469.jpg',
//     phankhuc: '650cc'
//   },
//   {
//     id: 2,
//     ten: 'CBR650RR',
//     image: 'https://racing.vn/thumbs/700x700x1/upload/product/87b5ab8b-c315-45ab-bd1d-94ffd100d446-4241.jpeg',
//     phankhuc: '650cc'

//   },
//   {
//     id: 3,
//     ten: 'CBR650RR',
//     image: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR-vRYRQdXmDWwmrgKJtHuw-2FYhyh2-WqGQQ&s',
//     phankhuc: '650cc'

//   }
// ])
// const bien5 = ref('')

// const dangky = () => {
//   const momoi = {
//     ten: ten.value,
//     image: anh.value,
//     phankhuc: phankhuc.value
//   }
//   if (confirm("mày có chắc chắn muốn thêm xe " + momoi.ten + " không ? ")) {
//     bien4.value.unshift({ ...momoi })
//     ten.value = '',
//     anh.value = '',
//     phankhuc.value = ''
//   }
// }
</script>


<template>
    <TrangChu />
</template>