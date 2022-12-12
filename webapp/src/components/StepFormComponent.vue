<template>
  <form @submit.prevent="submit" class="vragenForm">
    <section v-if="step === 1">
      <h3>1. In welke sector werkt u? <img id="info-icon" alt="Open link" src="../assets/info_icon.png"> </h3>
      <select v-model="sector" class="select">
        <option value="1">data-leeg</option>
        <option value="2">data-leeg</option>
        <option value="3">data-leeg</option>
      </select>
    </section>

    <section v-if="step === 2">
      <h3>2. Onder welke thema valt uw project?</h3>
      <select v-model="thema">
        <option disabled value="">tThema</option>
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
    </section>

    <section v-if="step === 3">
      <h3>3. Wat is het type van uw activiteit?</h3>
      <select v-model="typeActiviteit">
        <option disabled value="">Type activiteit</option>
        <option>A</option>
        <option>B</option>
        <option>C</option>
      </select>
    </section>

    <section v-if="step === 4">
      <h3>4. Wat is het minimaal benodigd subsidiebedrag?</h3>
      €<input v-model="budget" placeholder="0"/>
    </section>

    <section v-if="step === 5">
      <h3>5. Wat is uw beoogde startdatum?</h3>
      <input type="date" v-model="startDatum" min="2022-01-01">
    </section>

    <section v-if="step === 6">
      <h3>6. Wat is uw beoogde einddatum?</h3>
      <input type="date" v-model="eindDatum" min="2022-01-01">
    </section>

    <section v-if="step === 7">
      <h3>7. Wat is de projectlocatie?</h3>
      <select v-model="projectlocatie">
        <option disabled value="">projectlocatie</option>
        <option>Gelderland</option>
        <option>Nederland</option>
        <option>Europa</option>
      </select>
    </section>

    <section v-if="step === 8">
      <h3>8. Kunt u cofinancieren?</h3>
      <input type="checkbox" id="checkbox" v-model="bijdrage"/>
      <label for="checkbox">{{ bijdrage }}</label>
    </section>

    <section v-if="step === 9">
      <h3>9. Wat is het type samenwerking?</h3>
      <select v-model="samenwerking">
        <option disabled value="">type samenwerking</option>
        <option>Nee</option>
        <option>Samenwerkingsverbanden</option>
        <option>3-6 ondernemers</option>
      </select>

      <br>
      <br>
      <button class="button btn-next" type="submit">Bekijk matchend subsidies</button>
      <br>
    </section>
    <br/>

    <div class="buttons">
      <button class="button btn-prev" v-if="step !== 1" @click.prevent="prevStep">Vorige Stap</button>
      <button class="button btn-skip" v-if="step !== totalsteps" @click.prevent="nextStep">Overslaan</button>
      <button class="button btn-next" v-if="step !== totalsteps" @click.prevent="nextStep">Volgende Stap</button>
    </div>

  </form>
</template>

<script>
export default {
  name: "stepFormComponent",
  data() {
    return {
      step: 1,
      totalsteps: 9,
      sector: [],
      thema: [],
      typeActiviteit: [],
      budget: '',
      startDatum: '',
      eindDatum: '',
      projectlocatie: [],
      bijdrage: false,
      samenwerking: []
    }
  },
  methods: {
    setstorage() {
      sessionStorage.setItem('sector', JSON.stringify(this.sector))
      sessionStorage.setItem('thema', JSON.stringify(this.thema))
      sessionStorage.setItem('typeActiviteit', JSON.stringify(this.typeActiviteit))
      sessionStorage.setItem('budget', JSON.stringify(this.budget))
      sessionStorage.setItem('startDatum', JSON.stringify(this.startDatum))
      sessionStorage.setItem('eindDatum', JSON.stringify(this.eindDatum))
      sessionStorage.setItem('projectlocatie', JSON.stringify(this.projectlocatie))
      sessionStorage.setItem('bijdrage', JSON.stringify(this.bijdrage))
      sessionStorage.setItem('samenwerking', JSON.stringify(this.samenwerking))
    },
    nextStep: function () {
      this.step++;
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
.buttons{
  text-align: center;
}
.vragenForm {
  padding-top: 5%;
  width: 100%;
}

#info-icon {
  width: 1%;
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
  margin: 0 10px;
}

.btn-prev {
  background-color: #e0933a;
}

.btn-prev:hover {
  cursor: pointer;
  background-color: #9d6e39;
}

.btn-next {
  background-color: #6cbb71;
}

.btn-next:hover {
  cursor: pointer;
  background-color: #89db8e;
}

.btn-skip {
  background-color: #ababab;
}

.btn-skip:hover {
  cursor: pointer;
  background-color: #cecece;
}

</style>