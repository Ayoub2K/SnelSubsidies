<template>
  <div class="container">
    <h1 class="text-center"> Subsidie Lijst</h1>
    <table class="table table-striped">
      <thead>
      <th>
        <input type="checkbox" v-model="allSelected" @change="selectAll"></th>
      <th>Subsidie naam</th>
      <th>beoordelingssystematiek</th>
      <th>Deadline</th>
      <th>budget</th>
      </thead>
      <tbody>
      <tr v-for="subsidie in subsidies" :key="subsidie.id">
        <td><input type="checkbox" v-model="selected" :value="subsidie.id"></td>

        <td>{{subsidie.Naam}}</td>
        <td>{{subsidie.beoordelingssystematiek}}</td>
        <td>{{subsidie.deadline}}</td>
        <td>{{subsidie.subsidieBudget}}</td>
      </tr>
      </tbody>

    </table>
  </div>
</template>

<script>
import SubsidieService from "@/services/SubsidieService";

export default {
  name: "subsidie-item",
  data(){
    return{
      subsidies : []
    }
  },
  methods:{
    getSubsidie(){
      SubsidieService.getSubsidie().then((response) => {
        SubsidieService.getSubsidie().then(
            response => {
              this.employees = response.data;
            }
        );
  },
  created(){
    this.getSubsidie()
  }
}
}
</script>

<style scoped>

</style>