<template>
<div class="home">
  <section class="py-5 text-center container">
    <div class="row py-lg-5">
      <div class="col-lg-6 col-md-8 mx-auto">
        <h1 class="fw-light">VUE3 연습</h1>
        <p class="lead text-body-secondary">vue3 - 스트링부트로 만든 페이지</p>
        <p>
          <a href="#" class="btn btn-primary my-2">메뉴1</a>
          <a href="#" class="btn btn-secondary my-2">메뉴2</a>
        </p>
      </div>
    </div>
  </section>

  <div class="album py-5 bg-body-tertiary">
    <div class="container">

      <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
        <div class="col" v-for="(item, idx) in state.items" :key="idx">
          <!-- <Card_01 :item="item"/> -->
          <strong>{{ idx + 1 }}</strong>
          <Card_01 :item="item"/>
        </div>
      </div>

    </div>
  </div>
</div>
</template>
<script>

import Card_01 from '@/components/Card_01.vue';
import axios from 'axios';
import { reactive } from 'vue';


export default{
    name: "Home_01" // eslint-disable-next-line
    ,
    components: { Card_01 }
    ,setup(){
      const state = reactive({
        items:[]
      });

      axios.get("/api/items").then(({data})=>{
        state.items = data;
        console.log(data);
      });

      return {state};
    }
}
</script>


<style scoped>

</style>