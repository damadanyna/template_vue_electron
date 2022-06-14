<template>
  <div class="">
      <div class=" px-3 flex flex-col justify-center w-full place-items-center mt-14"> 
        <span class="base_color text-2xl md:text-6xl">Historique</span>
        <span>n'est pas disponible pour le moment</span>
      </div>
      <pieds class=" fixed bottom-0" />
  </div>

</template>

<script>
import pieds from "../components/pieds.vue"
export default {
  components:{
      pieds
  },
  props: {
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
#nav_bar{
  background: #002998;
}
#logo{
  font-family: 'Times New Roman', Times, serif;
  color: white;
}
#config_img{
  max-height: 70vh;
  overflow-y: auto;
  padding-bottom: 10px;
}
</style>
