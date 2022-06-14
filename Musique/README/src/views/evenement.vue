<template>
  <div class=" ">
      <div class=" ">  
        <!-- EVENEMENT 1-->
        <div class=" flex  w-full px-4">
            <div class=" w-full  flex flex-col">
                <div class=" py-4">
                    <span class=" text-xl md:text-2xl text-gray-400 font-bold flex justify-end">Evenement 2</span>
                </div>
                <div class="flex w-full flex-col md:flex-row-reverse">
                    <div class=" bg-gray-300 flex justify-center rounded-lg w-full md:w-2/3 h-96 items-center">
                        <span class=" text-gray-50 text-xl md:text-3xl">Image 2</span>
                    </div>
                    <div class=" flex flex-col w-2/5 px-3">
                        <span class=" md:flex md:justify-end font-bold text-blue-600 text-xl">titre</span>
                        <span class="md:flex md:justify-end ">bla bla bla ...</span>
                    </div>
                </div>
            </div>
        </div>
        <!-- EVENEMENT 1-->
        <div class=" flex  w-full px-4">
            <div class=" w-full  flex flex-col">
                <div class=" pb-4">
                    <span class=" text-xl md:text-2xl text-gray-400 font-bold">Evenement 1</span>
                </div>
                <div class="flex w-full flex-col md:flex-row">
                    <div class=" bg-gray-300 flex justify-center rounded-lg w-full md:w-2/3 h-96 items-center">
                        <span class=" text-gray-50 text-xl md:text-3xl">Image 1</span>
                    </div>
                    <div class=" flex flex-col w-2/5 px-3">
                        <span class=" font-bold text-blue-600 text-xl">titre</span>
                        <span>bla bla bla ...</span>
                    </div>
                </div>
            </div>
        </div>
      </div>
      <pieds></pieds>
  </div>

</template>

<script>
import pieds from "../components/pieds.vue"
export default {
  components:{
      pieds
  },
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
</style>
