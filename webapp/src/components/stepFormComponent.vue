<template>
  <form @submit.prevent="submit">
    <section v-if="step === 1">
      <h3>1. In welke sector werkt u?: {{ sector }}</h3>
      <select v-model="sector" class="select" multiple>
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
      <h3>2. onder welke thema valt uw project?: {{ thema }}</h3>
      <select v-model="thema">
        <option disabled value="">thema</option>
        <option>A</option>
        <option>B</option>
        <option>C</option>
      </select>
    </section>

    <section v-if="step === 3">
      <h3>3. wat is het type van uw activiteit?: {{ typeActiviteit }}</h3>
      <select v-model="typeActiviteit">
        <option disabled value="">type activiteit</option>
        <option>A</option>
        <option>B</option>
        <option>C</option>
      </select>
    </section>

    <section v-if="step === 4">
      <h3>4. wat is het minimaal benodigd subsidiebedrag?: €{{ budget }}</h3>
      €<input v-model="budget" placeholder="0"/>
    </section>

    <section v-if="step === 5">
      <h3>5. wat is uw beoogde startdatum?: {{ startDatum }}</h3>
      <input type="date" v-model="startDatum" min="2022-01-01">
    </section>

    <section v-if="step === 6">
      <h3>6. wat is uw beoogde einddatum?: {{ eindDatum }}</h3>
      <input type="date" v-model="eindDatum" min="2022-01-01">
    </section>

    <section v-if="step === 7">
      <h3>7. wat is de projectlocatie?: {{ projectlocatie }}</h3>
      <select v-model="projectlocatie">
        <option disabled value="">projectlocatie</option>
        <option>A</option>
        <option>B</option>
        <option>C</option>
      </select>
    </section>

    <section v-if="step === 8">
      <h3>8. kunt u cofinancieren? : €{{ bijdrage }}</h3>
      <input type="checkbox" id="checkbox" v-model="bijdrage"/>
      <label for="checkbox">{{ bijdrage }}</label>
    </section>

    <section v-if="step === 9">
      <h3>9. wat is het type samenwerking?: {{ samenwerking }}</h3>
      <select v-model="samenwerking">
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

    <button class="button btn-prev" v-if="step !== 1" @click.prevent="prevStep">Vorige Stap</button>
    <button class="button btn-next"  v-if="step !== totalsteps" @click.prevent="nextStep">Volgende Stap</button>

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
  methods:{
    nextStep:function (){
      this.step++;
    },
    prevStep:function (){
      this.step--;
    },
    submit() {
      this.$router.push(`/resultaten?budget=${this.budget}`)
          .then(response => response.status)
          .catch(err => console.warn(err));
    }
  }
}
</script>
<style scoped>

.button {
  border: none;
  border-radius: 14px;
  padding: 11px 25px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
}

.btn-prev {
  background-color: #ababab;
}

.btn-prev:hover {
  cursor:pointer;
  background-color: #cecece;
}

.btn-next {
  background-color: #6cbb71;
}

.btn-next:hover {
  cursor:pointer;
  background-color: #89db8e;
}

</style>