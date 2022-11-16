<template>
  <form @submit.prevent="submit">
    <section v-if="step === 1">
      <h3>1. In welke sector werkt u?: {{ sector }}</h3>
      <select v-model="sector">
        <option disabled value="">sector</option>
        <option>A</option>
        <option>B</option>
        <option>C</option>
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
      <input v-model="startDatum" placeholder="01-01-2000"/>
    </section>

    <section v-if="step === 6">
      <h3>6. wat is uw beoogde einddatum?: {{ eindDatum }}</h3>
      <input v-model="eindDatum" placeholder="01-01-2000"/>
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

      <button type="submit">Bekijk matchend subsidies</button>
      <br>
    </section>

    <button v-if="step !== 1" @click.prevent="prevStep">Vorige Stap</button>
    <button v-if="step !== totalsteps" @click.prevent="nextStep">Volgende Stap</button>

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

</style>