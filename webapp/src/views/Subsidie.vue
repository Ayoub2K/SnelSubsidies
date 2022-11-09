<template>
  <div class="container">
    <h1>SubsidieLijst</h1>
    <table>
      <thead>
        <th>Subsidie naam</th>
      </thead>
      <tbody>
          <td>{{subsidieNaam}}</td>
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
        //TODO: gaat iets mis met deze return items zijn leeg
        console.log(this.subsidies)
        this.subsidies = response.data
      })
    }
  },
  created(){
    this.getSubsidie()
  }
}
</script>

<style scoped>

</style>