import { createRouter, createWebHistory } from 'vue-router';
import Subsidie from "@/views/Subsidie";
import Home from '../views/Home.vue';
// import Employee from '../views/Employee.vue'
// import EmployeeForm from '../views/EmployeeForm.vue'

const routes = [
    {
        path: '/',
        name: 'Home',
        component: Home
    },
    {
        path: '/subsidie',
        name: 'Subsidie',
        component: Subsidie
    }


]

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes
})

export default router