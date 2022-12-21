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
          <h1 class="text-center">Uw resultaten</h1>

          <div class="resultaten_box">

          <div id="wrapper">
            <div class="filters">
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

            <div class="filters">
              <div class="status">
                <p id="title"><b>Placeholder</b></p>
                <div class="checkboxes">
                  <input type="checkbox" class="checkmark" id="Groen" name="Groen" value="Groen">
                  <label for="Groen"> Placeholder</label><br>

                  <input type="checkbox" id="Oranje" name="Oranje" value="Oranje">
                  <label for="Oranje"> Placeholder</label><br>

                  <input type="checkbox" id="Rood" name="Rood" value="Rood">
                  <label for="Rood"> Placeholder</label><br><br>
                </div>
              </div>
            </div>
        </div>
        

        
    <div id="breed">
      <div class="resultaten">
        <div class="subsidie" v-for="subsidie in subsidies" :key="subsidie.id">
          <h3 id="subsidieNaam">{{subsidie.naam}}</h3>
          <p class="info">
            Afkorting: {{subsidie.afkortingen}}<br>
            Niveau: {{subsidie.niveau}}<br></p>
            
            <div class="matchingpercentage">
              <p>
                Matchingpercentage: {{subsidie.matchingPercentage}}%
              </p>
              <svg viewBox="0 0 80 80" width="80" height="80">
              <circle class="circle" @click="subsidiePagina(subsidie)" :class="{
                circleLightGreen: subsidie.matchingPercentage > 87.5 && subsidieMatchingPercentage < 100,
                circleGreen: subsidie.matchingPercentage >75 && subsidie.matchingPercentage < 87.5,
                circleLightYellow: subsidie.matchingPercentage > 62.5 && subsidie.matchingPercentage < 75,
                circleYellow: subsidie.matchingPercentage > 50 && subsidie.matchingPercentage < 62.5,
                circleLightOrange: subsidie.matchingPercentage > 37.5 && subsidie.matchingPercentage < 50,
                circleOrange: subsidie.matchingPercentage > 25 && subsidie.matchingPercentage < 37.5,
                circleLightRed: subsidie.matchingPercentage > 12.5 && subsidie.matchingPercentage < 25,
                circleRed: subsidie.matchingPercentage > 0 && subsidie.matchingPercentage < 12.5,
              }" cx="40" cy="40" r="38"/> {{subsidie.matchingPercentage}}
              </svg>
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
      typeAanvrager: '',
      projectlocatie: [],
      bijdrage: false,
      samenwerking: []
    };
  },
  methods:{
    getStorageData(){
      this.sector = sessionStorage.getItem('sector')
      this.thema = sessionStorage.getItem('thema')
      this.subsidialeActiviteit = sessionStorage.getItem('subsidialeActiviteit')
      this.minimaleBedrag = sessionStorage.getItem('minimaleBedrag')
      this.typeOrganisatie = sessionStorage.getItem('typeOrganisatie')
      this.projectlocatie = sessionStorage.getItem('projectlocatie')
      this.cofinancieren = sessionStorage.getItem('cofinancieren')
      this.samenwerking = sessionStorage.getItem('samenwerking')
    },
    getSubsidies(){
      SubsidieService.matchSubsidies(this.sector, this.thema, this.subsidialeActiviteit, this.minimaleBedrag, this.typeOrganisatie, this.projectlocatie, this.cofinancieren, this.samenwerking)
          .then(response => {
            console.log(response)
            this.subsidies = response.data.subsidieList;
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


hr {
  width: 50%;
  float: left;
  border: 1px solid #6cbb71;
}

.resultaten_box{
  height: auto;
  width: 100%;
  margin-top: 20px;
  margin-left: auto;
  margin-right: auto;
  display: flex;
  flex-direction: row;
  padding: 0px 0px 0px 20px;
}

main {
  border-radius: var(--default-border-radius);
  width: 90%;
  height: 80vh;
  padding-bottom: 50px;
  margin-top: 13vh; /* nav min-height = 10vh, dus altijd 3vh afstand van nav nu */
  margin-left: auto;
  margin-right: auto;
  background: rgba(70, 60, 149, 0.15);
  box-shadow: 0 4px 30px rgba(0, 0, 0, 0.1);
  backdrop-filter: blur(1px);
  -webkit-backdrop-filter: blur(6.8px);
}

main .progress {
  padding: 20px;
  width: 100%;
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
  background: #463c95;
  border: 2px solid #463c95;
  color: white;
  border-radius: 10px;
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


.circle {
  box-shadow:  27px 27px 77px #bababa,
              -27px -27px 77px #ffffff;
  cursor: pointer;
}
.circleLightGreen{
  fill: #60e760;
}
.circleGreen{
  fill: #488a4b;
}
.circleOrange{  
  fill: #ffb100;
}
.circleLightOrange{
  fill: #f6cd83;
}
.circleYellow{
  fill: #ffe200;
}
.circleLightYellow{
 fill: #eee371;
}
.circleLightRed{
  fill: #ef9291;
}
.circleRed{
  fill: #cc0605;
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

#breed {
  display: inline-block;
  width: 100%;
}

.info {
  margin-left: 2%;
}

#subsidieNaam {
  text-align: left;
  background: rgba(175, 169, 223, 0.52);
  border-radius: 5px;
  box-shadow: 0 4px 30px rgba(0, 0, 0, 0.1);
  backdrop-filter: blur(13.9px);
  -webkit-backdrop-filter: blur(13.9px);
  padding: 5px;
  margin-bottom: 10px;
  font-weight: 500;
}

.subsidie {
  background: #463c95;
  color: white;
  box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  border-radius: 10px;
  padding: 15px;
  display: flex;
  flex-direction: column;
  justify-content: space-between;
}

.resultaten {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  grid-row-gap: 30px;
  grid-column-gap: 30px;
  padding: 0px 50px 0px 50px;
}

.matchingpercentage {
  margin-top: 20px;
  display: grid;
  grid-template-columns: repeat(2, 1fr);
  justify-items: end;
}

thead {
  text-align: left;
}
#title {
  margin: auto;
  width: 195px;
  height: 38px;
  background: #463c95;
  color: white;
  box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  border-radius: 10px;
  text-align: center;
  padding: 10px;
}
.filters {
  display: flex;
  flex-direction: column;
}
.checkboxes {
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
  padding: 15px;
  color: black;
  font-weight: 500;
}



</style>