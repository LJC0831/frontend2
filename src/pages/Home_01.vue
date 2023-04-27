<template>
<div class="home">

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