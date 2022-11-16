import { createRouter, createWebHistory } from 'vue-router';
import Home from '../views/Home.vue';
import Form from '../views/Form.vue';
import Resultaten from "@/views/Resultaten";
import Subsidie from "@/views/Subsidie";

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
        component: Resultaten
    },
    {
        path: '/subsidie/:id',
        name: 'Subsidie',
        component: Subsidie
    }
]

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes
})

export default router