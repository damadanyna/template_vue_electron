<template>
  <tete ></tete>
  <router-view  class="" ></router-view>
</template>

<script>

import tete from "./components/tete.vue"
export default {
  name:'App',
  components:{
      tete,
  },
}
</script>

<style>

.base_color{
  color:#2c2ed4;
}
</style>
