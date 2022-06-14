<template>
  <div class="   mt-12">
    <div class="  flex md:justify-end md:relative ">
      <div class=" md:-mt-36 md:mr-11 flex justify-center">
        <img src="../assets/images/those1.jpg" class=" rounded-lg w-4/5 transform hover:scale-125 "  alt="image_diplome">
      </div>
    </div>

    <div class=" flex relative px-2 md:px-11 ">
      <div class=" md:w-3/5 mt-10 md:-mt-32 flex flex-col"  id="texte-1">
        <div class=" pb-4 md:pb-10">
          <span class=" text-xl md:text-3xl base_color font-bold">Qui nous sommes?</span>
        </div>
        <div class=" ">
          <span class=" flex text-justify ">
            L’Université privée de Madagascar, connue sous le nom de Institut de Formation Technique, est une université dont le siège social se situe à Antananarivo Madagascar.
            Créée en 2003, elle fait partie des grandes universités reconnues à Madagascar.
            Fondée par VALISAONA Andriambolananirina, elle dispose de 6 sites annexes reparties dans la province de la grande île, notamment à Majunga, Tamatave, Antsirabe, Fianarantsoa, Toliara.
            IFT offre à ces étudiants une éducation et une formation de haute qualité leur permettant d’acquérir, non seulement, de solides compétences professionnelles, mais surtout des aptitudes importantes dans leurs développements personnels, comme la créativité, le dynamisme, la débrouillardise, l'autodidacte et l’ouverture d’esprit.
          </span>
        </div>
      </div>
    </div>
  </div>


  <div :class="!menu_show==false? 'round_':'round_2'" class=" flex justify-center items-center"> 
    <div class=" flex flex-col absolute top-40" >
        <router-link  to="/"   class=" text-white my-2 mx-2 px-2 cursor-pointer"  @click="show_menu('body')" >Accueils</router-link>
        <router-link  to="/evenement"   class=" text-white my-2 mx-2 px-2 cursor-pointer"  @click="show_menu('body')" >Evenements</router-link> 
        <router-link  to="/photos"   class=" text-white my-2 mx-2 px-2 cursor-pointer"  @click="show_menu('body')" >Photos</router-link>
    </div>
  </div> 
  <div class=" px-2 md:px-11">
    <div class="parallax2 "></div>
  </div>
  
  <div class=" w-full  mt-4 px-2 md:px-11 pb-20">
  
    <div class=" my-8 text-3xl">
      <span class=" font-bold">Les sens </span>
      <span class=" text-blue-600">(ceci est une modèle de texte  recupérer pour le designe)</span>
    </div>
      
    <span class=" flex text-justify  ">
      Le sens de la vue est le plus utilisé lorsqu’il s’agit de s’orienter. Nous regardons si le soleil brille et où la clé de la maison peut bien se trouver. Nous remarquons que ce monde voyant a des qualités uniquement lorsque nous faisons une pause, en toute conscience: de la lumière, de l’obscurité et des couleurs.
      Amer ou salé, sucré ou acide? Concernant le sens gustatif, notre langue distingue quatre qualités. Toutefois, le goût est quelque chose de multiple et complexe, notamment parce que l’expérience gustative se mêle facilement à d’autres qualités sensorielles, comme les odeurs et la perception tactile sur la langue.
      Les réactions aux odeurs et aux parfums sont très individuelles et émotionnelles. C’est tout à fait normal, car le sens olfactif est d’une grande sensibilité.
      Par une froide journée d’hiver, sans gants, nous choisirons la pelle à neige avec le manche en bois plutôt que celle avec le manche en fer. La raison à cela est notre sens de la chaleur, avec lequel nous pénétrons la matière, ainsi que les espaces où nous séjournons.
    </span>
  </div>

  <div class=" px-2 md:px-11">
    <div class="parallax "></div>
  </div>
  <div class=" w-full  mt-4 px-2 md:px-11 flex flex-col">
  
    <div class=" my-8 text-3xl">
      <span class=" font-bold">L'intelligence </span>
      <span class=" text-blue-600">(ceci est une modèle de texte  recupérer pour le designe)</span>
    </div>
      
    <span class=" flex text-justify text-blue-800 "> Il n’existe pas une forme d’intelligence, mais plusieurs. Le système scolaire valorise certaines d’entre elles plus que d’autres. Dans l’environnement professionnel, c’est différent : certaines aptitudes peu utiles à l’école peuvent se révéler très précieuses dans un travail.</span>
    <span class=" flex text-justify">      
      Howard Gardner a ainsi répertorié 8 formes d’intelligence. Chaque individu dispose de ces 8 formes d’intelligence, en quantité variable, et s’appuie généralement sur 3 ou 4 formes préférentielles. Il est toujours possible de développer celles qui sont moins mobilisées au départ.
      Parvenir à identifier les intelligences dominantes de votre enfant peut être un indicateur quant à son choix d’orientation scolaire ou professionnelle.
    </span>
  <span class=" base_color text-2xl my-3 mt-6"> 1. L’intelligence logico-mathématique</span>
  <span class=" flex text-justify">
      Ces personnes possèdent la capacité de calculer, de quantifier, de faire preuve de logique et de résoudre des problèmes mathématiques et scientifiques. Elles aiment les chiffres, l’analyse et le raisonnement. Profils : aime le calcul mental, les sciences ou les jeux de stratégie, explique par analogies, veut des raisons à tout, travaille de façon ordonnée et rigoureuse.
  </span>
  <span class=" base_color text-2xl my-3 mt-6"> 2. L’intelligence verbo-linguistique</span>
  <span class=" flex text-justify">
    Ces personnes possèdent la capacité d’utiliser des mots et le langage pour exprimer ou saisir des idées complexes. Profils : aime entendre, lire et écrire, s’exprime avec facilité, aime raconter et mimer des histoires, apprécie les jeux avec des mots (mots croisés, scrabble…).
    L’évaluation des apprentissages qui a généralement cours dans les établissements scolaires privilégie les formes d’intelligence logico-mathématique et verbo-linguistique, ce qui fait qu’un élève qui n’a pas ces formes comme dominantes se retrouve défavorisé.
  </span>
  <span class=" base_color text-2xl my-3 mt-6"> 3. L’intelligence musicale-rythmique</span>
  <span class=" flex text-justify">
    Ces personnes sont sensibles aux sons, aux structures rythmiques et musicales, aux timbres sonores, aux émotions générées par la musique. Elles ont une aptitude à reconnaître des modèles musicaux, à les interpréter et à en créer. Profils : fredonne en travaillant ou en marchant, bat du pied, tape du crayon ou des doigts en travaillant, aime inventer des airs et mélodies, saisit facilement les accents d’une langue étrangère, chante juste, garde un tempo… Il s’agit de l’intelligence multiple la moins utilisée dans l’enseignement classique.
  </span>
  <span class=" base_color text-2xl my-3 mt-6">4. L’intelligence corporelle-kinesthésique</span>
  <span class=" flex text-justify">    
    Ces personnes utilisent leur corps de manière fine et élaborée, ont la capacité de s’exprimer à travers le mouvement pour exprimer une idée ou un sentiment ou réaliser une activité physique donnée.
    Profils : a une bonne coordination, est habile en travaux manuels, aime le sport, préfère communiquer une information en montrant ou construisant un modèle, aime jouer la comédie…
  </span>
  <span class=" base_color text-2xl my-3 mt-6">5. L’intelligence visuelle-spatiale</span>
  <span class=" flex text-justify">    
    Ces personnes ont une capacité à représenter mentalement des idées et à les visualiser.
    Profils : explique en faisant un dessin ou un croquis, aime les puzzles et les arts visuels, a un bon sens de l’orientation, lit facilement les cartes…
  </span>
  <span class=" base_color text-2xl my-3 mt-6"> 6. L’intelligence interpersonnelle</span>
  <span class=" flex text-justify">    
    L’intelligence interpersonnelle (ou sociale) permet à l’individu d’agir et de réagir avec les autres de façon correcte et adaptée : ces personnes sont sensibles, elles comprennent les autres, perçoivent leurs humeurs, leurs intentions, leurs motivations et leurs émotions.
    Profils : ouvert aux autres, aime interagir avec autrui, s’intègre facilement, est très créatif pour résoudre les problèmes des autres, prend volontiers la place de leader, a une grande facilité à s’exprimer.
  </span>
  <span class=" base_color text-2xl my-3 mt-6"> 7. L’intelligence intrapersonnelle</span>
  <span class=" flex text-justify">
    L’intelligence intrapersonnelle permet d’avoir une bonne conscience de ses forces et ses faiblesses, de se former une représentation de soi précise et fidèle et de l’utiliser efficacement dans la vie.
    Profils : connaît ses talents et capacités, se fixe des buts réalistes, mène à bien une tâche qu’il s’est fixée, ne cède pas à l’impulsivité, est difficile à influencer.
  </span>
  <span class=" base_color text-2xl my-3 mt-6">8. L’intelligence naturaliste-écologiste</span>
  <span class=" flex text-justify">
    Il s’agit de l’intelligence qui permet d’être sensible à ce qui est vivant ou de comprendre l’environnement dans lequel l’homme évolue. C’est la capacité d’apprécier, de reconnaître, de classer, de hiérarchiser tout ce qui est en rapport avec le vivant et la matière.
    Profils : cherche à améliorer et défend son environnement, fasciné par les animaux, sensible au monde des plantes et à toutes les formes de la nature (géographie, objets naturels, nuages, étoiles…), sait reconnaître les structures et les anomalies dans la nature, observe, organise des données, catégorise…
  </span>
</div>


  <pieds></pieds>
</template>

<script>

import pieds from '../components/pieds.vue'
export default {
  data(){
    return{
      menu_show:false,
    }
  },
  components:{
    pieds
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
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
img{
  src:  url("../assets/images/those1.jpg");
}
.parallax {  
  background-image: url("../assets/images/success.jpeg");
  min-height: 500px;
  background-attachment: fixed;
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}

.parallax2 {  
  background-image: url("../assets/images/success2.jpg");
  min-height: 200px;
  background-attachment: fixed;
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}

#nav_bar{
  background: #002998;
  /*
  position: absolute;
  width: 100%;
  height: 100vh;
  z-index: 10;
  */
}
#logo{
  font-family: 'Times New Roman', Times, serif;
  color: white;
}
#texte-1:hover{
  border: solid 4px #002998;
  padding: 20px;
  border-radius: 10px;
}

.round_{
  display: flex;
  z-index: 100;
  background: #002998;
  animation: anime_bule 500ms forwards;
  position: absolute;
  top: -100px;
  right: -100px;
  border-radius: 100%;
}

.round_2{
  display: flex;
  z-index: 100;
  background: #002998;
  animation: anime_bule2 500ms forwards;
  position: absolute;
  top: -100px;
  right: -100px;
  border-radius: 100%;
}

@keyframes anime_bule {
  from{
    width: 0px;
    height: 0px;
    opacity:0;
  }
  to{
    width: 200vw;
    height: 150vh;
    opacity:1;
  }
}
@keyframes anime_bule2 {
  from{
    width: 200vw;
    height: 150vh;
    opacity:1;
  }
  to{
    width: 0px;
    height: 0px;
    opacity:0;
  }
}

</style>
