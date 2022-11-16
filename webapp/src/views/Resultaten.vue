<template>

  <h1 class="text-center">Uw resultaten</h1>

  <div id="wrapper">
    <div class="filters">
      <div class="status">
        <p id="title"><b>Status</b></p>
        <hr><br>
        <input type="checkbox" id="Open" name="Open" value="Open">
        <label for="Open"> Open</label><br>
        <input type="checkbox" id="Aangekondigd" name="Aangekondigd" value="Aangekondigd">
        <label for="Aangekondigd"> Aangekondigd</label><br>
        <input type="checkbox" id="Gesloten" name="Gesloten" value="Gesloten">
        <label for="Gesloten"> Gesloten</label><br><br>
      </div>
    </div>

    <div id="breed">
      <div class="resultaten">
        <div class="subsidie" v-for="subsidie in subsidies" :key="subsidie.id" @click="subsidieInfo($event)">
          <h3 id="subsidieNaam">{{subsidie.naam}}</h3>
          <p class="info">
            Afkorting: {{subsidie.afkortingen}}<br>
            Niveau: {{subsidie.niveau}}
          </p>
        </div>
      </div>
    </div>
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
            console.log(response)
            this.subsidies = response.data;
          }
      );
    },
    subsidieInfo(e){
      const targetId = e.currentTarget.id;
      console.log(targetId)
    }
  },
  created(){
    this.getSubsidies()
  },
}
</script>

<style scoped>
hr {
  width: 50%;
  float: left;
  border: 1px solid #6cbb71;
}

.filters {
  margin-left: 1%;
  display: inline-block;
  width: 13%;
}

#breed {
  display: inline-block;
  width: 80%;
  right: 5%;
  position: absolute;
}

.info {
  margin-left: 2%;
}

#subsidieNaam {
  text-align: center;
}

.subsidie {
  border-style: solid;
  border-radius: 15px;
}
.subsidie:hover {
  cursor: pointer;
}

.resultaten {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  grid-row-gap: 10px;
  grid-column-gap: 5px;
}

thead {
  text-align: left;
}
#title {
  margin: auto;
}

.text-center {
  text-align: center;
}

</style>