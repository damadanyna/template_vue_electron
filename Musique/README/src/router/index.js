import { createRouter, createWebHistory } from 'vue-router'
import Accueil from '@/views/accueil.vue'
import Evenement from '@/views/evenement.vue'
import Photos from '@/views/photos.vue'
import historique from '@/views/historique.vue'
const routes = [
  {
    path: '/',
    name: 'Accueil',
    component: Accueil
  },
  {
    path: '/evenement',
    name: 'Evenement',
    component: Evenement
  },
  {
    path: '/photos',
    name: 'Photos',
    component: Photos
  },
  {
    path: '/historique',
    name: 'Historique',
    component: historique
  },
]
const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})
export default router