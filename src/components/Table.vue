<!-- chúng ta sẻ chuyẻen table từ component helloword vào trong này -->
<script setup>
 //defineProps là 1 tính năng của vue, nó giống như 1 cái túi, và thằng component mẹ sẻ chuyền dữ liệu tới thằng component con thông qua cái túi
 // tại đây đã khai báo 1 biến hứng có tên là bien4, và nó có kiểu là Array, tương tự anh em có thể biến hứng có kieuer là String, boolean, Number
    const props = defineProps({
        bien4: {
            type: Array
        },
        bien5: {
            type: String
        }
    })
</script>
<template>
  <!-- mt là viết tắt của margin top -->
  <!-- kiến thức form, khi đi thi khuyến khích viết các classs như cấu trúc bên dưới, nếu không nhớ thì chỉ cần có input fied lad đc -->



  <!-- thay thế table cũ, chúng ta gọi component table.vue ở đây -->


  <!-- Kiến thức về Table (đi thi hiển thị được table có dữ liệu fake là auto 5đ) -->
  <!-- table bordered: tạo border (đường viền) cho cả table -->
  <!-- table-hover: khi di chuột vào từng ô -> ô sẽ được highlight -->
  <!-- table-striped: hightlight bằng cách ô này màu trắng thì ô dưới màu bạc -> 
      cho dễ nhìn với những table dài khoảng 100 dòng -->
  <div class="mt-4 table-responsive shadow rounded">
    <table class="table table-bordered table-hover table-striped">

      <thead class="table-primary text-center">
        <tr>
          <th class="fs-4" style="width: 80px;">Stt</th>
          <th class="fs-4">Tên xe</th>
          <th class="fs-4" style="width: 200px;">Ảnh xe</th>
          <th class="fs-4" style="width: 200px;">Phân khúc</th>
        </tr>
      </thead>

      <tbody class="text-center align-middle">

        <!-- Bắt đầu sử dụng vòng lặp (v-for), sử dụng vòng lặp để hiển thị ra các tr (hàng) -->
        <!-- vòng for ở dưới chính là viết tắt giống như là for (int i =0; i< bien4.length; i++) -->
        <tr v-for="(trang, huyentrang) in bien4">
          <!-- Dòng dưới là chọc vào thuộc tính id của từng phần tử -->
          <td class="fw-bold">{{ trang.id }} số thứ tự {{ huyentrang }}</td>
          <td>{{ trang.ten }}</td>
          <td>
            <!-- :src tức là chúng ta thực binding dữ liệu giữa thuộc tính src 
               với thuộc tính image của phần tử -->
            <img :src=trang.image class="img-fluid rounded shadow-sm food-img">
          </td>
          <td>{{ trang.phankhuc }}</td>
        </tr>

        <tr>
          <td colspan="3" class="fw-bold text-danger fs-2"> {{ bien1 }}</td>
        </tr>

        <tr>
          <td>Mu của tôi đã có {{ bien3 }} chức vô địch</td>
        </tr>

      </tbody>

    </table>
  </div>
  công việc của anh em, là truyền biến này vào đây
  <h2 class="text-danger text-center">{{ bien5 }}</h2>
</template>