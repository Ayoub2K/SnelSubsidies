import { createRouter, createWebHistory } from 'vue-router';
import Subsidie from "@/views/Resultaten";
import Home from '../views/Home.vue';
import Form from '../views/Form.vue';

const routes = [
    {
        path: '/',
        name: 'Home',
        component: Home
    },
    {
        path: '/form',
        name: 'Form',
        component: Form
    },
    {
        path: '/resultaten',
        name: 'Resultaten',
        component: Subsidie
    }


]

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes
})

export default router