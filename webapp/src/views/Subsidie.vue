<template>
  <h1 class="paginatitel">{{subsidie.naam}}</h1>
  <hr><br>
  <div class="wrapper">
    <div id="info">
      <h2>Informatie</h2>
      <div id="links">
        <p class="ppLeft">
          Afkorting<br>
          Niveau<br>
          Subsidieverstrekker
        </p>
      </div>
      <div id="rechts">
        <p>
          {{subsidie.afkortingen}}<br>
          {{subsidie.niveau}}<br>
          {{subsidie.subsidieverstrekker}}
        </p>
      </div>
      <br><button id="aanvraag">Vraag nu aan</button>
    </div>

    <div id="omschrijving">
      <h2>Omschrijving</h2>
      <p>What is Lorem Ipsum?
        Lorem Ipsum is simply dummy text of the printing and typesetting industry.
        Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,
        when an unknown printer took a galley of type and scrambled it to make a type specimen book.
        It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.
        It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,
        and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
    </div>
  </div>
</template>

<script>
import SubsidieService from "@/services/SubsidieService";

export default {
  name: 'Subsidie-info',
  data() {
    return {
      subsidie:[],
    };
  },
  methods: {
    init(){
      const subsidieNaam = this.$route.params.id;
      SubsidieService.getSubsidie(subsidieNaam).then(
          response => {
            this.subsidie = response.data;
            console.log(this.subsidie);
          }
      );
    }
  },
  created() {
    this.init();
  }
}
</script>

<style scoped>
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