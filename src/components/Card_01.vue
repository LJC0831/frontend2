<template>
<div class="card shadow-sm">
    <img :src="item.imgPath"/>
    
    <div class="card-body">
        <p class="card-text">{{ item.name }}</p>
        <div class="d-flex justify-content-between align-items-center">
        <div class="btn-group">
            <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
            <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
        </div>
        <small class="text-body-secondary">9 mins</small>
        </div>
    </div>
    </div>
</template>

<script>
export default {
  name: 'Card_01', // eslint-disable-next-line
  props: {
    item: Object
  }
}
</script>

<style scoped>
</style>