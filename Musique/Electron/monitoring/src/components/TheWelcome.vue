<script setup>
import WelcomeItem from './WelcomeItem.vue'
import DocumentationIcon from './icons/IconDocumentation.vue'
import ToolingIcon from './icons/IconTooling.vue'
import EcosystemIcon from './icons/IconEcosystem.vue'
import CommunityIcon from './icons/IconCommunity.vue'
import SupportIcon from './icons/IconSupport.vue'
</script>

<template>
  <WelcomeItem>
    <template #icon>
      <DocumentationIcon />
    </template>
    <template #heading>Home page</template> 
  </WelcomeItem>

  <WelcomeItem>
    <template #icon>
      <ToolingIcon />
    </template>
      <span>Ity template ity dia natao hoan'ny plateforme </span> 
      <span class=" text-yellow-600 font-bold"> Web, linux(.deb , .rpm), macOS ary koa hoan'ny Windows</span>
  </WelcomeItem>

  <WelcomeItem>
    <template #icon>
      <EcosystemIcon />
    </template> 
  </WelcomeItem>

  <WelcomeItem>
    <template #icon>
      <CommunityIcon />
    </template> 
  </WelcomeItem>

  <WelcomeItem>
    <template #icon>
      <SupportIcon />
    </template> 
  </WelcomeItem>
</template>
