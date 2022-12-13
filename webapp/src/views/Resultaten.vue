<template>
<main>
        <div class="progress">   
            <div class="progress-item">
                <p>Sector</p>
            </div>
            <div class="progress-item">
                <p>Thema</p>
            </div>
            <div class="progress-item">
                <p>Activiteit</p>
            </div>
            <div class="progress-item">
                <p>Subsidiebedrag</p>
            </div>
            <div class="progress-item">
                <p>Datums</p>
            </div>
            <div class="progress-item">
                <p>Locatie</p>
            </div>
            <div class="progress-item">
                <p>Cofinancering</p>
            </div>
            <div class="progress-item">
                <p>Samenwerking</p>
            </div>
        </div>

        
        <div class="resultaten_box">

          <div class="filters">
              <div class="status">
                <p id="title"><b>Status</b></p>
                <div class="checkboxes">


                  <input type="checkbox" class="checkmark" id="Open" name="Open" value="Open">
                  <label for="Open"> Open</label><br>

                  <input type="checkbox" id="Aangekondigd" name="Aangekondigd" value="Aangekondigd">
                  <label for="Aangekondigd"> Aangekondigd</label><br>

                  <input type="checkbox" id="Gesloten" name="Gesloten" value="Gesloten">
                  <label for="Gesloten"> Gesloten</label><br><br>
                </div>
              </div>

              <div class="status">
                <p id="title"><b>Match</b></p>
                <div class="checkboxes">
                  <input type="checkbox" class="checkmark" id="Groen" name="Groen" value="Groen">
                  <label for="Groen"> Groen</label><br>

                  <input type="checkbox" id="Oranje" name="Oranje" value="Oranje">
                  <label for="Oranje"> Oranje</label><br>

                  <input type="checkbox" id="Rood" name="Rood" value="Rood">
                  <label for="Rood"> Rood</label><br><br>
                </div>
              </div>
          </div>

    
              
 
          
          <div class="header">
            <h1 class="text-center">Uw resultaten</h1>
            <div id="wrapper">
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
          </div>
        </div>
    </main>
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
.resultaten_box{
  height: auto;
  width: 100%;
  background: green;
  margin-left: auto;
  margin-right: auto;
  display: flex;
  flex-direction: row;
}

main {
  background: white;
  border-radius: var(--default-border-radius);
  width: 90%;
  padding-bottom: 50px;
  margin-top: 13vh; /* nav min-height = 10vh, dus altijd 3vh afstand van nav nu */
  margin-left: auto;
  margin-right: auto;
}

main .progress {
  padding: 20px;
  width: 100%;
  background: red;
  margin-left: auto;
  margin-right: auto;
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: row;
  text-align: center;
  gap: 20px;
}

.progress-item {
  box-sizing: border-box;
  width: 216px;
  height: 43px;
  background: #86C2EE;
  border: 2px solid #86C2EE;
  box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  border-radius: 30px;
  padding: 10px;
}

main .header {
  width: 90%;
  margin-left: auto;
  margin-right: auto;
  display: flex;
  align-items: center;
  flex-direction: column;
  text-align: center;
}


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
  display: flex;
  flex-direction: column;
  width: 20%;
  background-color: yellow;
}

#breed {
  display: inline-block;
}

.info {
  margin-left: 2%;
}

#subsidieNaam {
  text-align: center;
}

.subsidie {
  height: 150px;
  background: linear-gradient(112.52deg, rgba(118, 194, 249, 0.9) 5.83%, rgba(209, 236, 249, 0.9) 87.44%);
  box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  border-radius: 36px;
  padding: 15px;
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
  width: 180px;
  height: 38px;
  background: #97CAEF;
  box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  border-radius: 10px;
  text-align: center;
  padding: 10px;
}

.checkboxes {
  background-color: aqua;
  margin: auto;
  width: 150px;
  margin-top: 10px;
  margin-bottom: 20px;
}

input[type=checkbox] {
      position: absolute;
      visibility: hidden;
    }

    label {
      display: inline-block;
      position: relative;
      padding-left: 25px;
      margin-right: 15px;
      font-size: 18px;
    }

    input[type=checkbox] + label:before {
      content: "";
      background-color: #ffffff;
      border: 1.5px solid black;
      border-radius: 20%;
      width: 18px;
      height: 18px;
      position: absolute;
      left: 0;
      top: 0;
    }

    input[type=checkbox]:checked + label:before {
      background-color: black;
    }

.text-center {
  text-align: center;
}



</style>