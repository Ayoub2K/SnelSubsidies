<template>
  <div>
    <div id="progress-bar">
      <div :style="{ width: progress + '%' }" id="progress"></div>
    </div>
    <!-- <br><br>
    <p>Progress: {{ progress }}%</p> -->
  </div>
  <form @submit.prevent="submit" class="vragenForm">
    <section v-if="step === 1">
      <h3 for="sectorr">1. In welke sector werkt u?
        <div class="tooltip">
          <img class="info-icon" alt="Open link" src="../assets/info_icon.png">
          <span class="tooltiptext">Robin moet dit nog vullen maar hij is te druk bezig met spdir modellen maken DanOfJudgement</span>
        </div>
      </h3>
      <select v-model="sector" id="sectorr" class="select">
        <option disabled value="">Kies een sector</option>
        <option value="1">data-leeg</option>
        <option value="2">data-leeg</option>
        <option value="3">data-leeg</option>
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
      <select v-model="thema" class="select">
        <option disabled value="">Kies een thema</option>
        <option>Circulair bouwen</option>
        <option>Prefab bouwen</option>
        <option>Industrieel bouwen</option>
        <option>Recycling</option>
        <option>Biobased grondstoffen</option>
        <option>Circulair bouwen</option>
        <option>circulair renoveren</option>
        <option>CO2 reductie</option>
        <option>New European Bauhaus</option>
        <option>Efficient bronnengebruik</option>
        <option>Circulair ontwerp</option>
        <option>Hergebruik afval</option>
      </select>
      <div class="buttons">
        <button class="button btn-prev" v-if="step !== 1" @click.prevent="prevStep">Vorige Stap</button>
        <button class="button btn-next" v-if="step !== totalsteps" @click.prevent="nextStep(2)">Volgende Stap</button>
      </div>
    </section>

    <section v-if="step === 3">
      <h3>3. Wat is het type van uw activiteit? <img class="info-icon" alt="Open link" src="../assets/info_icon.png">
      </h3>
      <select v-model="typeActiviteit" class="select">
        <option disabled value="">Type activiteit</option>
        <option>A</option>
        <option>B</option>
        <option>C</option>
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
      
      €<input v-model="budget" class="select" placeholder="0"/>
      <div class="buttons">
        <button class="button btn-prev" v-if="step !== 1" @click.prevent="prevStep">Vorige Stap</button>
        <button class="button btn-next" v-if="step !== totalsteps" @click.prevent="nextStep(4)">Volgende Stap</button>
      </div>
    </section>

    <section v-if="step === 5">
      <h3>5. Watvoor type aanvragen bent u? <img class="info-icon" alt="Open link" src="../assets/info_icon.png"></h3>
      <select v-model="typeAanvrager" class="select">
        <option disabled value="">Type aanvrager</option>
        <option>MKB</option>
        <option>Gemeente</option>
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
        <option>Gelderland</option>
        <option>Nederland</option>
        <option>Europa</option>
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
        <option>Nee</option>
        <option>Samenwerkingsverbanden</option>
        <option>3-6 ondernemers</option>
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
      typeActiviteit: '',
      budget: '',
      typeAanvrager: '',
      projectlocatie: '',
      cofinancieren: null,
      samenwerking: '',
      progress: 0,
    }
  },
  methods: {
    setstorage() {
      sessionStorage.setItem('sector', JSON.stringify(this.sector))
      sessionStorage.setItem('thema', JSON.stringify(this.thema))
      sessionStorage.setItem('typeActiviteit', JSON.stringify(this.typeActiviteit))
      sessionStorage.setItem('budget', JSON.stringify(this.budget))
      sessionStorage.setItem('typeAanvrager', JSON.stringify(this.typeAanvrager))
      sessionStorage.setItem('projectlocatie', JSON.stringify(this.projectlocatie))
      sessionStorage.setItem('cofinancieren', JSON.stringify(this.cofinancieren))
      sessionStorage.setItem('samenwerking', JSON.stringify(this.samenwerking))
    },
    skipStep(vraagnummer) {
      // zet vraag van sessionstorage op null
      if (vraagnummer === 3) {
        this.typeActiviteit = "null";
        console.log(this.typeActiviteit)
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
          alert("Vul aub deze vraag in")
        } else {
          this.step++
        }
      } else if (vraagnummer === 2) {
        if (this.thema === '') {
          alert("Vul aub deze vraag in")
        } else {
          this.step++
        }
      } else if (vraagnummer === 3) {
        if (this.typeActiviteit === '') {
          alert("Vul aub deze vraag in")
        } else {
          this.step++
        }
      } else if (vraagnummer === 4) {
        if (this.budget === '') {
          alert("Vul aub deze vraag in")
        } else {
          this.step++
        }
      } else if (vraagnummer === 5) {
        if (this.typeAanvrager === '') {
          alert("Vul aub deze vraag in")
        } else {
          this.step++
        }
      } else if (vraagnummer === 6) {
        if (this.projectlocatie === '') {
          alert("Vul aub deze vraag in")
        } else {
          this.step++
        }
      } else if (vraagnummer === 7) {
        if (this.cofinancieren === null) {
          alert("Vul aub deze vraag in")
        } else {
          this.step++
        }
      }
      else if (vraagnummer === 8) {
        if (this.samenwerking === '') {
          alert("Vul aub deze vraag in")
        } else {
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
  border-radius: var(--default-border-radius);
  margin-top: 100px;
  font-size: 2vh;
  text-align: center;
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
  border-radius: 36px;
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
  border-radius: 36px;
}

.btn-next:hover {
  cursor: pointer;
  background-color: #6c9fc4;
}

#progress-bar {
  width: 673px;
  height: 20px;
  background-color: #D9D9D9;
  border-radius: 30px;
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
  margin-top: 50px;
}

.btn-skip:hover {
  cursor: pointer;
  background-color: #eeeeee;
}
</style>