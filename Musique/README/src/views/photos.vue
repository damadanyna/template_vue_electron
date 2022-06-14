<template>
  <div class="">
      <div class=" px-3 flex flex-col">  
        <!-- photo de l'etabilsement -->
        <div class=" flex justify-end ">
            <span class=" text-gray-600">Potos de l'Institut de Formation Technique <span class="  font-bold text-blue-700">Fianarantsoa </span> </span>
            
        </div>
        <div class=" grid grid-cols-1 md:grid-cols-6 mt-3 " id="config_img">
          <div v-for="i in 24" :key="i" class=" transform hover:border-blue-800 border-2 hover:scale-110 hover:shadow-lg rounded-xl font-bold items-center flex justify-center mt-4 bg-gray-200 w-52 h-32">         
            <span class=" text-white">image {{i}}</span>
          </div>
        </div>
      </div>
      <pieds/>
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
