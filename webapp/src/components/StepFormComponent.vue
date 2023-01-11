<template>
    <div id="progress-bar">
<!--      <div :style="{ width: progress + '%' }" id="progress"></div>-->
      <ul class="progress-bar">
<!--        <li class="active"></li>-->
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
      </ul>
    </div>
    <!-- <br><br>
    <p>Progress: {{ progress }}%</p> -->
  <form @submit.prevent="submit" class="vragenForm">
    <section v-if="step === 1">
      <h3 for="sectorr">1. In welke sector werkt u?
        <div class="tooltip">
          <img class="info-icon" alt="Open link" src="../assets/info_icon.png">
          <span class="tooltiptext">Robin moet dit nog vullen maar hij is te druk bezig met spdir modellen maken DanOfJudgement</span>
        </div>
      </h3>
      <select v-model="sector" id="sectorr" class="select" multiple>
        <option disabled value="">Kies een sector</option>
        <option>Arbeid en arbeidsmarkt</option>
        <option>Bouw en ruimtelijke ordening</option>
        <option>Cultuur</option>
        <option>Energie</option>
        <option>Export, internationalisering en ontwikkelingsamenwerking</option>
        <option>Gezondheidszorg en welzijn</option>
        <option>Informatie en communicatietechnologie</option>
        <option>Landbouw en Visserij</option>
        <option>Milieu</option>
        <option>Natuurbeheer</option>
        <option>Onderwijs</option>
        <option>Onderzoek, ontwikkeling en innovatie</option>
        <option>Overheid</option>
        <option>Industrie</option>
        <option>Sport, recreatie en toerisme</option>
        <option>Transport</option>
        <option>Veiligheid</option>
      </select>
      <div class="buttons">
        <button class="button btn-next" v-if="step !== totalsteps" @click.prevent="nextStep(1)">Volgende Stap</button>
      </div>
    </section>

    <section v-if="step === 2">
      <h3>2. Onder welke thema valt uw project?
        <div class="tooltip">
          <img class="info-icon" alt="Open link" src="../assets/info_icon.png">
          <span class="tooltiptext">Robin moet dit nog vullen maar hij is te druk bezig met spdir modellen maken DanOfJudgement</span>
        </div>
      </h3>
      <select v-model="thema" class="select" multiple>
        <option disabled value="">Kies een thema</option>
        <option>Duurzaamheid en circulariteit</option>
        <option>Digitalisering</option>
        <option>Economische gevolgen coronavirus</option>
        <option>Energie besparen</option>
        <option>Energie produceren</option>
        <option>Gebouwen renoveren en bouwen</option>
        <option>Infrastructuur verbeteren</option>
        <option>Recycling</option>
        <option>Landbouw interventies</option>
        <option>Maatschappelijke vraagstukken </option>
        <option>Milieu en natuur beschermen of beheren</option>
        <option>Onderzoek en ontwikkeling</option>
        <option>Overnemen van een bedrijf</option>
        <option>Mobiliteit</option>
        <option>Voedsel en voedselveiligheid</option>
        <option>Personeel opleiden</option>
      </select>
      <div class="buttons">
        <button class="button btn-prev" v-if="step !== 1" @click.prevent="prevStep">Vorige Stap</button>
        <button class="button btn-next" v-if="step !== totalsteps" @click.prevent="nextStep(2)">Volgende Stap</button>
      </div>
    </section>

    <section v-if="step === 3">
      <h3>3. Wat is het uw subsidiale activiteit? <img class="info-icon" alt="Open link" src="../assets/info_icon.png">
      </h3>
      <select v-model="subsidialeActiviteit" class="select" multiple>
        <option disabled value="">subsidiale activiteit</option>
        <option>Onderzoek en ontwikkeling</option>
        <option>Demonstratie en pilots</option>
        <option>Investeren en uitrollen</option>
        <option>Netwerkactiviteiten</option>
        <option>Onderwijs</option>
      </select>
      <div class="buttons">
        <button class="button btn-prev" v-if="step !== 1" @click.prevent="prevStep">Vorige Stap</button>
        <button class="button btn-skip" v-if="step !== totalsteps" @click.prevent="skipStep(3)">Overslaan</button>
        <button class="button btn-next" v-if="step !== totalsteps" @click.prevent="nextStep(3)">Volgende Stap</button>
      </div>
    </section>

    <section v-if="step === 4">
      <h3>4. Wat is het minimaal benodigd subsidiebedrag? <img class="info-icon" alt="Open link"
                                                               src="../assets/info_icon.png"></h3>
      
      <input v-model="minimaleBedrag" class="select" placeholder="€0"/>
      <div class="buttons">
        <button class="button btn-prev" v-if="step !== 1" @click.prevent="prevStep">Vorige Stap</button>
        <button class="button btn-next" v-if="step !== totalsteps" @click.prevent="nextStep(4)">Volgende Stap</button>
      </div>
    </section>

    <section v-if="step === 5">
      <h3>5. Wat voor type organistatie bent u? <img class="info-icon" alt="Open link" src="../assets/info_icon.png"></h3>
      <select v-model="typeOrganisatie" class="select">
        <option disabled value="">Type Organisatie</option>
        <option>Overheid</option>
        <option>Onderwijs</option>
        <option>mkb</option>
        <option>Groot bedrijf</option>
        <option>Kennisinstellingen</option>
        <option>Stichting</option>
      </select>
      <div class="buttons">
        <button class="button btn-prev" v-if="step !== 1" @click.prevent="prevStep">Vorige Stap</button>
        <button class="button btn-next" v-if="step !== totalsteps" @click.prevent="nextStep(5)">Volgende Stap</button>
      </div>
    </section>

    <section v-if="step === 6">
      <h3>6. Wat is de projectlocatie? <img class="info-icon" alt="Open link" src="../assets/info_icon.png"></h3>
      <select v-model="projectlocatie" class="select">
        <option disabled value="">Projectlocatie</option>
        <option>Provinciaal</option>
        <option>Nationaal</option>
        <option>Europees</option>
      </select>
      <div class="buttons">
        <button class="button btn-prev" v-if="step !== 1" @click.prevent="prevStep">Vorige Stap</button>
        <button class="button btn-next" v-if="step !== totalsteps" @click.prevent="nextStep(6)">Volgende Stap</button>
      </div>
    </section>

    <section v-if="step === 7">
      <h3>7. Kunt u cofinancieren? <img class="info-icon" alt="Open link" src="../assets/info_icon.png"></h3>
      <input type="checkbox" class="select" id="checkbox" v-model="cofinancieren"/>
      <!-- <label for="checkbox">{{ cofinancieren }}</label> -->
      <div class="buttons">
        <button class="button btn-prev" v-if="step !== 1" @click.prevent="prevStep">Vorige Stap</button>
        <button class="button btn-skip" v-if="step !== totalsteps" @click.prevent="skipStep(7)">Overslaan</button>
        <button class="button btn-next" v-if="step !== totalsteps" @click.prevent="nextStep(7)">Volgende Stap</button>
      </div>
    </section>

    <section v-if="step === 8">
      <h3>8. Wat is het type samenwerking? <img class="info-icon" alt="Open link" src="../assets/info_icon.png"></h3>
      <select v-model="samenwerking" class="select">
        <option disabled value="">Type samenwerking</option>
        <option>Niet van toepassing</option>
        <option>Privaat/Privaat</option>
        <option>Publiek/Publiek</option>
        <option>Publiek/Privaat</option>
      </select>

      <div class="buttons">
        <button class="button btn-prev" v-if="step !== 1" @click.prevent="prevStep">Vorige Stap</button>
        <button class="button btn-skip" v-if="step !== totalsteps" @click.prevent="skipStep(8)">Overslaan</button>
        <button class="button btn-next" v-if="step !== totalsteps" @click.prevent="nextStep(8)">Volgende Stap</button>
      </div>
    </section>


    <section v-if="step === 9">
      <h3>Wij hebben uw vookeuren meegenomen, bekijk uw beste matches! </h3>

      <button class="button btn-prev" v-if="step !== 1" @click.prevent="prevStep">Vorige Stap</button>
      <button class="button btn-next" type="submit">Bekijk subsidies</button>

    </section>
    <br/>


  </form>
</template>

<script>
export default {
  name: "stepFormComponent",
  data() {
    return {
      step: 1,
      totalsteps: 9,
      sector: '',
      thema: '',
      subsidialeActiviteit: '',
      minimaleBedrag: '',
      typeOrganisatie: '',
      projectlocatie: '',
      cofinancieren: null,
      samenwerking: '',
      progress: 0,
    }
  },
  methods: {
    setstorage() {
      const tempSector = this.sector.toString();
      sessionStorage.setItem('sector', JSON.stringify(tempSector))
      const tempThema = this.thema.toString();
      sessionStorage.setItem('thema', JSON.stringify(tempThema))
      const tempsubAct = this.subsidialeActiviteit.toString();
      sessionStorage.setItem('subsidialeActiviteit', JSON.stringify(tempsubAct))
      sessionStorage.setItem('minimaleBedrag', JSON.stringify(this.minimaleBedrag))
      sessionStorage.setItem('typeOrganisatie', JSON.stringify(this.typeOrganisatie))
      sessionStorage.setItem('projectlocatie', JSON.stringify(this.projectlocatie))
      sessionStorage.setItem('cofinancieren', JSON.stringify(this.cofinancieren))
      sessionStorage.setItem('samenwerking', JSON.stringify(this.samenwerking))
    },
    updateProgress(vraagnummer){
      const number = vraagnummer -1 ;
      const list = document.querySelectorAll(".progress-bar li")
      for(let i = 0; i < 10; i++){
        list[number].classList.remove('notactive')
        list[number].classList.add('active')
      }
      for(let i = 0; i < number; i++){
        list[number].classList.remove('notactive')
      }
    },
    skipStep(vraagnummer) {
      // zet vraag van sessionstorage op null
      if (vraagnummer === 3) {
        this.subsidialeActiviteit = "null";
        console.log(this.subsidialeActiviteit)
      } else if (vraagnummer === 7) {
        this.cofinancieren = null;
        console.log(this.cofinancieren)
      } else if (vraagnummer === 8) {
        this.samenwerking = "null";
        console.log(this.samenwerking)
      }
      console.log(vraagnummer)
      this.step++;
    },
    nextStep(vraagnummer) {
      // checkt of vraag is ingevuld
      if (vraagnummer === 1) {
        if (this.sector === '') {
          //mexx- hier css class added, voor input voorbeeld: line 223
          alert("Vul aub deze vraag in")
        }else {
          this.updateProgress(vraagnummer);
          this.step++
        }
      } else if (vraagnummer === 2) {
        if (this.thema === ''){
          alert("Vul aub deze vraag in")
        }else {
          this.updateProgress(vraagnummer);
          this.step++
        }
      } else if (vraagnummer === 3) {
        if (this.subsidialeActiviteit === '') {
          alert("Vul aub deze vraag in");
        } else {
          this.updateProgress(vraagnummer);
          this.step++
        }
      } else if (vraagnummer === 4) {
        if (this.minimaleBedrag === '') {
          alert("Vul aub deze vraag in")
        } else {
          this.updateProgress(vraagnummer);
          this.step++
        }
      } else if (vraagnummer === 5) {
        if (this.typeOrganisatie === '') {
          alert("Vul aub deze vraag in")
        } else {
          this.updateProgress(vraagnummer);
          this.step++
        }
      } else if (vraagnummer === 6) {
        if (this.projectlocatie === '') {
          alert("Vul aub deze vraag in")
        } else {
          this.updateProgress(vraagnummer);
          this.step++
        }
      } else if (vraagnummer === 7) {
        if (this.cofinancieren === null) {
          alert("Vul aub deze vraag in")
        } else {
          this.updateProgress(vraagnummer);
          this.step++
        }
      }
      else if (vraagnummer === 8) {
        if (this.samenwerking === '') {
          alert("Vul aub deze vraag in")
        } else {
          this.updateProgress(vraagnummer);
          this.step++
        }
      }
    },
    prevStep: function () {
      this.step--;
    },
    submit() {
      this.setstorage()
      this.$router.push(`/resultaten`)
          .then(response => response.status)
          .catch(err => console.warn(err));
    }
  }
}
</script>
<style scoped>
.tooltip {
  display: inline;
}
/* Tooltip text */
.tooltip .tooltiptext {
  visibility: hidden;
  width: 380px;
  background-color: white;
  color: black;
  text-align: left;
  padding: 20px;
  font-size: 2vh;

  box-shadow: 1px 2px 9px darkgrey;
  margin-left: 1%;

  background: rgba(255, 255, 255, 0.47);
  border-radius: 16px;
  box-shadow: 0 4px 30px rgba(0, 0, 0, 0.1);
  backdrop-filter: blur(11.2px);
  -webkit-backdrop-filter: blur(11.2px);
  border: 1px solid rgba(255, 255, 255, 1);
  /* Position the tooltip text - see examples below! */
  position: absolute;
  z-index: 1;
}
/* Show the tooltip text when you mouse over the tooltip container */
.tooltip:hover .tooltiptext {
  visibility: visible;
}
h3 {
  font-size: 4vh;
  font-weight: 400;
  color: #102932;
}
p {
  color: #102932;
}
form {
  padding-top: 50px;
}
.select {
  width: 374px;
  height: 66px;
  border-radius: 10px;
  margin-top: 100px;
  font-size: 2vh;
  text-align: center;
}
.select[multiple]{
  margin-top: 50px;
  height: 300px !important;
  width: 800px !important;
}
.button {
  margin-top: 80px;
}
.buttons {
  text-align: center;
  padding-top: 100px;
}
.vragenForm {
  padding-top: 5%;
  width: 100%;
}
.info-icon {
  width: 2%;
  margin-left: 1%;
  cursor: pointer;
}
h3 {
  text-align: center;
  font-size: 25px;
}
section {
  text-align: center;
}
.button {
  border: none;
  border-radius: 14px;
  padding: 11px 25px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 20px;
}
.btn-prev {
  width: 243px;
  height: 47px;
  left: 688px;
  top: 696px;
  background: #463c95;
  box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  border-radius: 10px;
  color: white;
}
.btn-prev:hover {
  cursor: pointer;
  background-color: #6c9fc4;
}
.btn-next {
  width: 243px;
  height: 47px;
  left: 688px;
  top: 696px;
  background: #463c95;
  color: white;
  box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  border-radius: 10px;
}
.btn-next:hover {
  cursor: pointer;
  background-color: #6c9fc4;
}
.progress-bar{
  display:flex;
  list-style:none;
  counter-reset:container 0;
  width: 673px;
  height: 20px;
  background-color: #D9D9D9;
  border-radius: 30px;
}
.progress-bar li{
  display:flex;
  list-style:none;
  counter-increment:container 1;
  position:relative;
  margin-right:133px;
  margin-top:20px;
}
/*before is het bolletje, after is de lijn die de bolletjes verbind*/
.progress-bar{
}

.progress-bar li::before{
  content:counter(container);
  position:absolute;
  height:25px;
  width:25px;
  border-radius:50%;
  border:1px solid #eef1f7;
  text-align:center;
  line-height:26px;
  z-index:10;
  background-color:#fff;
}
.progress-bar li::after{
  content:'';
  position:absolute;
  height:2px;
  width:140px;
  background-color:#f5f7fa;
  top:12px;
  right:-10px;
}
.progress-bar li:active{
  background-color:green;
  border:none;
  color:green;
}
progress-bar li:before{
  background-color:grey ;
}
.progress-bar li.active:after{
  background-color:green !important;
}
.progress-bar li.active::before{
  background-color: green;
  border:none;
  color:#fff;
}
.progress-bar li:first-child:after{
  display:none;
}
#progress {
  height: 100%;
  background-color: #86C2EE;
  border-radius: 30px;
}
.btn-prev:hover {
  cursor: pointer;
  background-color: #3b2f94;
}
.btn-next:hover {
  cursor: pointer;
  background-color: #3b2f94;
}
.btn-skip {
  background-color: white;
  /*margin-top: 50px;*/
  border-radius: 10px;
  width: 243px;
  height: 47px;
}
.btn-skip:hover {
  cursor: pointer;
  background-color: #eeeeee;
}
</style>