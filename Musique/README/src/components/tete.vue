<template>   
    <div @click="get_scroll" class=" bg-blue-800 top-0 z-50 flex fixed opacity justify-between px-3 py-2 w-full items-center">
      <div class="flex ">
        <div class=" px-1 md:p-0 md:px-1 border md:border-2 border-white " >
          <span class=" bg-white  border md:border-1 border-blue-800 px-2 md:px-4 text-lg md:text-2xl font-bold" id="logo">IFT</span>
        </div>
        <span class=" text-xs md:text-sm text-white ml-1 md:ml-4 font-bold" > Fianarantsoa</span>
      </div>
      <div @click="show_menu('body')" class="text-white absoulte md:hidden flex flex-col cursor-pointer" style=" z-index:1000;">
        <span class=" z-50" :class="menu_show==false?'rounded-lg block w-8 h-1 duration-500  bg-white':' duration-500 transform rotate-45  rounded-lg block w-8 h-1  bg-white'"></span>
        <span  v-if="menu_show==false"  class=" z-50 duration-500 rounded-lg block w-8 h-1 mt-1  bg-white"></span> 
        <span class=" z-50" :class="menu_show==false?'rounded-lg block w-8 h-1 duration-500  mt-1 bg-white':' duration-500 transform -rotate-45  rounded-lg block w-8 h-1  -mt-1 bg-white'"></span>
      </div>
      <div class=" text-white absoulte hidden md:flex ">
        <router-link to="/"  class=" transform hover:scale-125 hover:font-bold text-white mx-2 px-2 cursor-pointer">Accueils</router-link>
        <router-link to="/evenement"  class=" transform hover:scale-125 hover:font-bold text-white mx-2 px-2 cursor-pointer">Evenements</router-link>
        <router-link to="/photos"  class=" transform hover:scale-125 hover:font-bold text-white mx-2 px-2 cursor-pointer">Photos</router-link>
        <router-link to="/Historique"  class=" transform hover:scale-125 hover:font-bold text-white mx-2 px-2 cursor-pointer">Historique</router-link>

      </div>
    </div>
     <svg  class=" configure" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1440 208"><path fill="#2c2ed4" fill-opacity="1" d="M0,128L80,149.3C160,171,320,213,480,197.3C640,181,800,107,960,69.3C1120,32,1280,32,1360,32L1440,32L1440,0L1360,0C1280,0,1120,0,960,0C800,0,640,0,480,0C320,0,160,0,80,0L0,0Z"></path></svg>
    
  <div :class="!menu_show==false? 'round_':'round_2'" class=" flex justify-center md:hidden items-center"> 
    <div class=" flex flex-col absolute top-64" >
        <router-link  to="/"   class=" text-white my-2 mx-2 px-2 cursor-pointer"  @click="show_menu('body')" >Accueil</router-link>
        <router-link  to="/evenement"   class=" text-white my-2 mx-2 px-2 cursor-pointer"  @click="show_menu('body')" >Evenement</router-link> 
        <router-link  to="/photos"   class=" text-white my-2 mx-2 px-2 cursor-pointer"  @click="show_menu('body')" >Photos</router-link>
        <router-link  to="/historique"   class=" text-white my-2 mx-2 px-2 cursor-pointer"  @click="show_menu('body')" >Historique</router-link>
    </div>
  </div>
</template>

<script>
export default {
  data(){
    return{
      menu_show:false,
    }
  },
  methods:{
    show_menu(dom){
      var elt=document.querySelector(dom);
      if(this.menu_show==true){
        this.menu_show=false
        elt.classList.remove("overflow-y-hidden")
      }
      else{
        this.menu_show=true;
        elt.classList.add("overflow-y-hidden")
      }
      //console.log();
    },
    get_scroll(){
      console.log(document.querySelector('#app').scrollTop)
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
#logo{
  font-family: 'Times New Roman', Times, serif;
  color: #002998;
}
.opacity{
  /*background: rgba(255, 255, 255, 0.8);*/
  background: #2c2ed4;

}

.round_{
  z-index: 10;
  background: #2c2ed4;
  animation: anime_bule 500ms forwards;
  position: absolute;
  top: -100px;
  right: -120px;
  border-radius: 100%;
}

.round_2{
  z-index: 10;
  background: #002998;
  animation: anime_bule2 500ms forwards;
  position: absolute;
  top: -100px;
  right: -120px;
  border-radius: 100%;
}

@keyframes anime_bule {
  from{
    width: 0px;
    height: 0px;
    opacity:0;
  }
  to{
    width: 200%;
    height: 150%;
    opacity:1;
  }
}
@keyframes anime_bule2 {
  from{
    width: 200%;
    height: 150%;
    opacity:1;
  }
  to{
    width: 0px;
    height: 0px;
    opacity:0;
  }
}
.configure{
  margin-top: 7.3vh;
}
</style>
