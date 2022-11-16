<template>
  <form @submit.prevent="submit">

    <!--    sector-->
    <div>In welke sector werkt u?: {{ sector }}</div>
    <select v-model="sector">
      <option disabled value="">sector</option>
      <option>A</option>
      <option>B</option>
      <option>C</option>
    </select>

    <!--    themas-->
    <div>onder welke thema valt uw project?: {{ thema }}</div>
    <select v-model="thema">
      <option disabled value="">thema</option>
      <option>A</option>
      <option>B</option>
      <option>C</option>
    </select>

    <!--    type activiteit-->
    <div>wat is het type van uw activiteit?: {{ typeActiviteit }}</div>
    <select v-model="typeActiviteit">
      <option disabled value="">type activiteit</option>
      <option>A</option>
      <option>B</option>
      <option>C</option>
    </select>

    <!--    minimale budget bedrag-->
    <p>wat is het minimaal benodigd subsidiebedrag?: €{{ budget }}</p>
    €<input v-model="budget" placeholder="0"/>

    <!--    startdatum-->
    <p>wat is uw beoogde startdatum?: {{ startDatum }}</p>
    <input v-model="startDatum" placeholder="01-01-2000"/>

    <!--    einddatum-->
    <p>wat is uw beoogde einddatum?: {{ eindDatum }}</p>
    <input v-model="eindDatum" placeholder="01-01-2000"/>

    <!-- projectlocatie -->
    <div>wat is de projectlocatie?: {{ projectlocatie }}</div>
    <select v-model="projectlocatie">
      <option disabled value="">projectlocatie</option>
      <option>A</option>
      <option>B</option>
      <option>C</option>
    </select>

    <!--    bijdrage-->
    <p>kunt u cofinancieren? : €{{ bijdrage }}</p>
    <input type="checkbox" id="checkbox" v-model="bijdrage" />
    <label for="checkbox">{{ bijdrage }}</label>

    <!--    type samenwerking-->
    <div>wat is het type samenwerking?: {{ samenwerking }}</div>
    <select v-model="samenwerking">
      <option disabled value="">type samenwerking</option>
      <option>A</option>
      <option>B</option>
      <option>C</option>
    </select>

    <br/>
    <br/>
    <button type="submit">
      Bekijk matchend subsidies
    </button>
  </form>
</template>

<script>


// import axios from "axios";

export default {
  name: "Form-component",
  data() {
    return {
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
  }
  ,
  methods: {
    submit() {
      // axios.post('http://localhost:8081/subsidie', null, { params: {
      //     budget : this.budget
      //   }})
      this.$router.push(`/subsidie?budget=${this.budget}`)
          .then(response => response.status)
          .catch(err => console.warn(err));
    }
  }

}
</script>