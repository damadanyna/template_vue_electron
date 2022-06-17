<template>
  <div class=" h-full bg-color">
    <heading class=" absolute top-0 w-full " />
    <bodyer  />
  </div>
</template>

<script setup>
import heading from './components/menu.vue'
  import bodyer from './views/corps.vue'
</script>

<style>
.bg-color{
  background: #212121;
}
.base-bg{
  background: #44ce6b;
}
.base-color{
  color: #44ce6b;
}
</style>
