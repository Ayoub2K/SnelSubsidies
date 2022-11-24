<template>
  <h1 class="paginatitel">{{naam}}</h1>
  <hr><br>
  <div class="wrapper">
    <div id="info">
      <h2>Informatie</h2>
      <div id="links">
        <p class="ppLeft">
          Afkorting<br>
          Niveau<br>
          Subsidieverstrekker<br>
          Open datum<br>
          Sluitings datum<br>
        </p>
      </div>
      <div id="rechts">
        <p>
          {{afkortingen}}<br>
          {{niveau}}<br>
          {{subsidieverstrekker}}<br>
          {{datum_open}}<br>
          N.v.t.
        </p>
      </div>
      <br><button id="aanvraag">Vraag nu aan</button>
    </div>

    <div id="omschrijving">      <button id="terugbutton" @click="gaTerug">Terug</button>
      <h2>Omschrijving</h2>

      <h3>Doel</h3>
      <p>{{doel}}</p>
      <h3>Activiteiten</h3>
      <p>{{subsidiabele_activiteiten}}</p>
    </div>
  </div>
</template>

<script>
import SubsidieService from "@/services/SubsidieService";

export default {
  name: 'Subsidie-info',
  data() {
    return {
      afkortingen:"",
      beoordeling_tender:"",
      bijzonderheid:"",
      datum_open:"",
      datum_sluit:"",
      doel:"",
      locatie:"",
      looptijdProject_jaren:"",
      naam:"",
      niveau:"",
      samenwerking:"",
      soort_organisatie:"",
      subsidiabele_activiteiten:"",
      subsidiebedrag_max:"",
      subsidiebedrag_min:"",
      subsidiepercentage_max:"",
      subsidiepercentage_min:"",
      subsidieverstrekker:"",
      themas:"",
      totaal_budget:"",
      type_samenwerking:""
    };
  },
  methods: {
    init() {
      const subsidieNaam = this.$route.params.id;
      SubsidieService.getSubsidie(subsidieNaam).then(
          response => {
            this.afkortingen = response.data.afkortingen;
            this.beoordeling_tender = response.data.beoordeling_tender;
            this.bijzonderheid= response.data.bijzonderheid,
            this.datum_open= response.data.datum_open,
            this.datum_sluit= response.data.datum_sluit,
            this.doel= response.data.doel,
            this.locatie= response.data.locatie,
            this.looptijdProject_jaren= response.data.looptijdProject_jaren,
            this.naam = response.data.naam,
            this.niveau= response.data.niveau,
            this.samenwerking= response.data.samenwerking,
            this.soort_organisatie= response.data.soort_organisatie,
            this.subsidiabele_activiteiten= response.data.subsidiabele_activiteiten,
            this.subsidiebedrag_max= response.data.subsidiebedrag_max,
            this.subsidiebedrag_min= response.data.subsidiebedrag_min,
            this.subsidiepercentage_max= response.data.subsidiepercentage_max,
            this.subsidiepercentage_min= response.data.dosubsidiepercentage_min,
            this.subsidieverstrekker= response.data.subsidieverstrekker,
            this.themas= response.data.themas,
            this.totaal_budget= response.data.totaal_budget,
            this.type_samenwerking= response.data.type_samenwerking
            console.log(response.data);
          }
      );
    },
    gaTerug(){
      this.$router.push('/resultaten');
    }
  },
  created() {
    this.init();
  }
}
</script>

<style scoped>
#terugbutton {
  background-color: #6cbb71;
  border: none;
  border-radius: 1px;
  color: white;
  padding: 11px 25px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  float: right;
  margin-top: 1%;
}
#terugbutton:hover {
  cursor: pointer;
}

#aanvraag {
  background-color: #6cbb71;
  border: none;
  border-radius: 14px;
  color: white;
  padding: 11px 25px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin-top: 5%;
}
#aanvraag:hover {
  cursor: pointer;
}

.ppLeft {
  font-weight: bold;
}
#links {
  display: inline-block;
}

#rechts {
  display: inline-block;
  margin-left: 2%;
}

h2 {
  font-size: 21px;
}

hr {
  width: 90%;
  border: 1px solid #6cbb71;
}

h1 {
  margin-left: 5%;
  margin-top: 1%;
}

#info {
  width: 27%;
  float: left;
  margin-left: 5%;
}

#omschrijving {
  width: 60%;
  overflow: hidden;
}

.wrapper {
  overflow: hidden;
}

</style>