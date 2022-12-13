<template>
  <div>
    <div id="progress-bar">
      <div :style="{ width: progress + '%' }" id="progress"></div>
    </div>
    <!-- <br><br>
    <p>Progress: {{ progress }}%</p> -->
  </div>
  <form @submit.prevent="submit">
    <section v-if="step === 1">
      <h3>In welke sector werkt u?: {{ sector }}</h3>
      <p>Sla deze vraag over indien niet van toepassing </p>
      <select v-model="sector" class="select">
        <option disabled value="">Uw sector</option>
        <option value="1">One</option>
        <option value="2">Two</option>
        <option value="3">Three</option>
        <option value="4">Four</option>
        <option value="5">Five</option>
        <option value="6">Six</option>
        <option value="7">Seven</option>
        <option value="8">Eight</option>
      </select>
    </section>

    <section v-if="step === 2">
      <h3>Onder welke thema valt uw project?: {{ thema }}</h3>
      <select v-model="thema" class="select">
        <option disabled value="">thema</option>
        <option>A</option>
        <option>B</option>
        <option>C</option>
      </select>
    </section>

    <section v-if="step === 3">
      <h3>Wat is het type van uw activiteit?: {{ typeActiviteit }}</h3>
      <select v-model="typeActiviteit" class="select">
        <option disabled value="">type activiteit</option>
        <option>A</option>
        <option>B</option>
        <option>C</option>
      </select>
    </section>

    <section v-if="step === 4">
      <h3>Wat is het minimaal benodigd subsidiebedrag?: €{{ budget }}</h3>
      €<input v-model="budget" class="select" placeholder="0"/>
    </section>

    <section v-if="step === 5">
      <h3>Wat is uw beoogde startdatum?: {{ startDatum }}</h3>
      <input type="date" v-model="startDatum" class="select" min="2022-01-01">
    </section>

    <section v-if="step === 6">
      <h3>Wat is uw beoogde einddatum?: {{ eindDatum }}</h3>
      <input type="date" v-model="eindDatum" class="select" min="2022-01-01">
    </section>

    <section v-if="step === 7">
      <h3>Wat is de projectlocatie?: {{ projectlocatie }}</h3>
      <select v-model="projectlocatie" class="select">
        <option disabled value="">projectlocatie</option>
        <option>A</option>
        <option>B</option>
        <option>C</option>
      </select>
    </section>

    <section v-if="step === 8">
      <h3>Kunt u cofinancieren? : {{ bijdrage }}</h3>
      <input type="checkbox" id="checkbox" v-model="bijdrage"/>
      <label for="checkbox">{{ bijdrage }}</label>
    </section>

    <section v-if="step === 9">
      <h3>Wat is het type samenwerking?: {{ samenwerking }}</h3>
      <select v-model="samenwerking" class="select">
        <option disabled value="">type samenwerking</option>
        <option>A</option>
        <option>B</option>
        <option>C</option>
      </select>

      <br>
      <br>
      <button class="button btn-next" type="submit">Bekijk matchend subsidies</button>
      <br>
    </section>
    <br/>

    <button @click="deadvanceProgress" class="button btn-prev" v-if="step !== 1" @click.prevent="prevStep">Vorige Stap</button>
    <button @click="advanceProgress" class="button btn-next"  v-if="step !== totalsteps" @click.prevent="nextStep">Volgende Stap</button>

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
      samenwerking: [],
      progress: 0,
    }
  },
  methods:{
    advanceProgress() {
        this.progress = Math.min(this.progress + 12.5, 100);
      },
      deadvanceProgress() {
        this.progress = Math.min(this.progress - 12.5, 100);
      },
    setstorage(){
      sessionStorage.setItem('sector',JSON.stringify(this.sector))
      sessionStorage.setItem('thema',JSON.stringify(this.thema))
      sessionStorage.setItem('typeActiviteit',JSON.stringify(this.typeActiviteit))
      sessionStorage.setItem('budget',JSON.stringify(this.budget))
      sessionStorage.setItem('startDatum',JSON.stringify(this.startDatum))
      sessionStorage.setItem('eindDatum',JSON.stringify(this.eindDatum))
      sessionStorage.setItem('projectlocatie',JSON.stringify(this.projectlocatie))
      sessionStorage.setItem('bijdrage',JSON.stringify(this.bijdrage))
      sessionStorage.setItem('samenwerking',JSON.stringify(this.samenwerking))
    },
    nextStep:function (){
      this.step++;
    },
    prevStep:function (){
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

h3{
  font-size: 4vh;
  font-weight: 400;
  color: #102932;
}

p {
  color: #102932;
}

form {
  padding-top: 50px;
  background-color: ;
}

.select {
  width: 374px;
  height: 66px;
  border: 2px solid #282B2F;
  box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  margin-top: 100px;
}

.button {
  margin-top: 80px;
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
  background: #86C2EE;
  box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  border-radius: 36px;
}

.btn-prev:hover {
  cursor:pointer;
  background-color: #6c9fc4;
}

.btn-next {
  width: 243px;
  height: 47px;
  left: 688px;
  top: 696px;
  background: #86C2EE;
  box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  border-radius: 36px;
}

.btn-next:hover {
  cursor:pointer;
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
</style>