<template>

    <div  class=" blure z-50 fixed flex justify-between px-5 w-full py-7 items-center blur-md">
        <div class="">
        <span class=" base-color text-3xl ml-14">D.</span>
        <span class=" text-white text-3xl ">Dany</span>
        </div>
        <div>
        <span class=" font-bold text-white text-sm mx-3">THEME</span>
        <span class=" font-bold text-white text-sm mx-3">ACCUEIL</span>
        <span class=" font-bold text-white text-sm mx-3">A PROPOS DE MOI</span>
        <span class=" font-bold text-white text-sm mx-3">ACTIVITÉ</span>
        <span class=" font-bold text-white text-sm mx-3">CONTACTE</span>
        <span class=" font-bold text-white text-sm mx-10 px-16 base-bg py-2 rounded-2xl">CV</span>
        </div>
    </div>
    
    <div class=" h-full justify-between items-center flex flex-row">
        <div class=" flex flex-col ml-20">
            <span class=" text-white mb-4"> Salut!<span class=" text-white mb-4 ml-1">  je suis,</span> </span> 
            <span class=" text-white text-6xl font-bold"> Dama Dany</span> 
            <span class=" base-color font-bold mt-3 text-2xl"> Développeur full stack</span> 
            <span class=" text-white"> Je suis un technicien en informatique spécialisé dans le développement Web avec JavaScript.</span> 
            <span class=" w-44 font-bold text-white text-sm mt-8 base-bg py-3 rounded-2xl text-center ">Contacte</span>
        </div>
        <div class=" w-80">
            <span class=" opacity-30 text-white text-6xl font-bold">
                image
            </span>
        </div>
    </div>

    <div class=" h-full">

    </div>
</template>

<script setup>
import { ref } from 'vue'

defineProps({
  msg: String
})

const count = ref(0)
</script>


<style scoped>
.blure{
  -webkit-backdrop-filter: blur(5px);
  backdrop-filter: blur(5px);
}
</style>
