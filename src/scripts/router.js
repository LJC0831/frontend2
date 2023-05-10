import Home_01 from "@/pages/Home_01";
import Login_01 from "@/pages/Login_01";
import {createRouter, createWebHistory} from 'vue-router'
/* eslint-disable */
const routes = [
    {path:'/', component: Home_01} ,
    {path:'/login', component: Login_01}
]

const router = createRouter({
    history : createWebHistory(),
    routes
})

export default router;