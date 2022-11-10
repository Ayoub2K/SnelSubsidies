<template>
  <form @submit.prevent="submit">
    <div>In welke sector werkt u?: {{ sector }}</div>

    <select v-model="sector">
      <option disabled value="">sector</option>
      <option>A</option>
      <option>B</option>
      <option>C</option>
    </select>

    <p>wat is het minimaal benodigd subsidiebedrag?: €{{ bedrag }}</p>
    €<input v-model="bedrag" placeholder="0"/>

    <div>wat is de projectlocatie?: {{ projectlocatie }}</div>

    <select v-model="projectlocatie">
      <option disabled value="">projectlocatie</option>
      <option>A</option>
      <option>B</option>
      <option>C</option>
    </select>

    <p>datum is: {{ datum }}</p>
    <input v-model="datum" placeholder="01-01-2000"/>

    <div>Selecteer de meest relevant onderwerpen?: {{ onderwerpen }}</div>

    <select v-model="onderwerpen" multiple>
      <option>A</option>
      <option>B</option>
      <option>C</option>
      <option>D</option>
    </select>

    <p>wat is uw maximale bijdrage?: €{{ bijdrage }}</p>
    €<input v-model="bijdrage" placeholder="0"/>

    <br/>
    <br/>
    <button type="submit">
      Bekijk matchend subsidies
    </button>
  </form>
</template>

<script>


//import axios from "axios";

export default {
  name: "Form-component",
  data() {
    return {
      sector: [],
      bedrag: '',
      projectlocatie: [],
      datum: '',
      onderwerpen: [],
      bijdrage: ''
    }
  }
  // ,
  // methods: {
  //   submit() {
  //     axios.post('/your-url', {name: this.name})
  //         .then(res => {
  //           //TODO: https://stackoverflow.com/questions/45398114/vue-submit-button-data
  //           // do something with res
  //         })
  //         .catch(err => {
  //           // catch error
  //         });
  //   }
  // }

}
</script>