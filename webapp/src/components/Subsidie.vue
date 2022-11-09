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

        <td>{{subsidie.naam}}</td>
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

export default{
  name:'Subsidie-items',
  data() {
    return {
      subsidies:[],
    };
  },
  methods:{
    getSubsidies(){
      SubsidieService.getSubsidies().then(
          response => {
            this.subsidies = response.data;
          }
      );
    },
    selectAll(){
      this.subsidieId =[];
      if(this.allSelected){
        this.selected = this.subsidies.map((subsidie) => subsidie.id);
      }else{
        this.selected=[];
      }
    }
  },
  created(){
    this.getSubsidies()
  }
}
</script>

<style scoped>

</style>