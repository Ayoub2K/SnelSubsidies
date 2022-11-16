<template>

  <h1 class="text-center">Uw resultaten</h1>

  <div class="container">
    <div class="status">
      <p id="title">Status</p>
      <input type="checkbox" id="Open" name="Open" value="Open">
      <label for="Open"> Open</label><br>
      <input type="checkbox" id="Aangekondigd" name="Aangekondigd" value="Aangekondigd">
      <label for="Aangekondigd"> Aangekondigd</label><br>
      <input type="checkbox" id="Gesloten" name="Gesloten" value="Gesloten">
      <label for="Gesloten"> Gesloten</label><br><br>
    </div>
  </div>

  <div class="container">
    <table class="table table-striped">
      <thead>
      <th>Subsidie naam</th>
      <th>afkorting</th>
      <th>niveau</th>
      </thead>
      <tbody>
      <tr v-for="subsidie in subsidies" :key="subsidie.id">
        <td>{{subsidie.naam}}</td>
        <td>{{subsidie.afkortingen}}</td>
        <td>{{subsidie.niveau}}</td>
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
            console.log(this.$route.query.budget);
            this.subsidies = response.data;
          }
      );
    },
  },
  created(){
    this.getSubsidies()
  }
}
</script>

<style scoped>
#title {
  margin: auto;
}

.container {
  display: block;
}

table {
  border-collapse: collapse;
}
tr {
  border-style: solid;
}

.text-center {
  text-align: center;
}

</style>