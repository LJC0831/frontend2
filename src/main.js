import { createApp } from 'vue'
import App from './App.vue'
import {createRouter, createWebHistory} from 'vue-router'
import Home_01 from "@/pages/Home_01";

/* eslint-disable */
const routes = [
    {path:'/', component: Home_01} 
]

const router = createRouter({
    history : createWebHistory(),
    routes
})
createApp(App).use(router).mount('#app')
 