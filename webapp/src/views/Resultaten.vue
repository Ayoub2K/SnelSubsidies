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
        <div class="subsidie" v-for="subsidie in subsidies" :key="subsidie.id">
          <h3 id="subsidieNaam">{{subsidie.naam}}</h3>
          <p class="info">
            Afkorting: {{subsidie.afkortingen}}<br>
            Niveau: {{subsidie.niveau}}
            <img id="open-icon" alt="Open link" src="../assets/open_icon.png" @click="subsidiePagina(subsidie)">
          </p>
        </div>
      </div>
    </div>
  </div>


</template>

<script>
import SubsidieService from "@/services/SubsidieService";

export default{
  name:'form-resultaten',
  data() {
    return {
      subsidies:[],
      sector: [],
      thema: [],
      typeActiviteit: [],
      budget: '',
      startDatum: '',
      eindDatum: '',
      projectlocatie: [],
      bijdrage: false,
      samenwerking: []
    };
  },
  methods:{
    getStorageData(){
      this.sector = sessionStorage.getItem('sector')
      this.thema = sessionStorage.getItem('thema')
      this.typeActiviteit = sessionStorage.getItem('typeActiviteit')
      this.budget = sessionStorage.getItem('budget')
      this.startDatum = sessionStorage.getItem('startDatum')
      this.eindDatum = sessionStorage.getItem('eindDatum')
      this.projectlocatie = sessionStorage.getItem('projectlocatie')
      this.bijdrage = sessionStorage.getItem('bijdrage')
      this.samenwerking = sessionStorage.getItem('samenwerking')
    },
    getSubsidies(){
      SubsidieService.getSubsidies()
          .then(response => {
            //TODO: met deze data call maken met Axios
            console.log(this.sector)
            console.log(this.budget)
            console.log(this.startDatum)
            console.log(this.bijdrage)
            console.log(this.samenwerking)
            this.subsidies = response.data;
          });
    },
    subsidiePagina(sub){
      this.$router.push(`/subsidie/${sub.naam}`)
    }
  },
  created(){
    this.getStorageData();
    this.getSubsidies();
  },
}
</script>

<style scoped>

#open-icon {
  width: 4%;
  float: right;
  margin: 2%;
  cursor: pointer;
}
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
  border-color: #6cbb71;
  border-width: 2px;
  border-radius: 15px;
  box-shadow: rgb(0 0 0 / 25%) 0 10px 20px, rgb(0 0 0 / 25%) 0 6px 6px;
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