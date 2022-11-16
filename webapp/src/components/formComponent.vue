<template>
  <form @submit.prevent="submit">
    <div class="step step-1 active">
      <!--    sector-->
      <div>In welke sector werkt u?: {{ sector }}</div>
      <select v-model="sector">
        <option disabled value="">sector</option>
        <option>A</option>
        <option>B</option>
        <option>C</option>
      </select>
      <button type="button" class="next-btn" @click="nextstep">next</button>
    </div>

    <div class="step step-2">
      <!--    themas-->
      <div>onder welke thema valt uw project?: {{ thema }}</div>
      <select v-model="thema">
        <option disabled value="">thema</option>
        <option>A</option>
        <option>B</option>
        <option>C</option>
      </select>
      <button type="button" class="previous-btn">prev</button>
      <button type="button" class="next-btn">next</button>
    </div>

    <div class="step step-3">
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
      <input type="checkbox" id="checkbox" v-model="bijdrage"/>
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

      <button type="button" class="previous-btn">prev</button>
      <button type="submit">
        Bekijk matchend subsidies
      </button>
    </div>
  </form>
</template>

<script>
//
// nextBtn.forEach(button => {
//   button.addEventListener('click', (e) =>{
//     console.log('adsfadfskj')
//     console.log(e);
//     changeStep('next');
//   })
// })
//
// prevBtn.forEach(button => {
//   button.addEventListener('click', (e) =>{
//     console.log(e);
//     changeStep('prev');
//   })
// })
//
// function changeStep(btn){
//   let index = 0;
//   const active = document.querySelectorAll('form .step.active');
//   index = steps.indexOf(active);
//   steps[index].classList.remove('active');
//   if(btn === 'next'){
//     index ++;
//   }
//   else if(btn === 'prev'){
//     index --;
//   }
//   steps[index].classList.add('active');
// }


// import axios from "axios";

const steps = Array.from(document.querySelectorAll('form .step'));
console.log(steps)
// const nextBtn = document.querySelectorAll('form .next-btn');
// const prevBtn = document.querySelectorAll('form .previous-btn');

export default {
  name: "formComponent",
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
    nextstep() {
      console.log(steps)
      let index = 0;
      const active = document.querySelectorAll('form .step.active');
      index = steps.indexOf(active);
      steps[index].classList.remove('active');
      index++;
      steps[index].classList.add('active');
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
.step {
  display: none;
}

.step.active {
  display: block;
}
</style>
