<template>
  <h1>{{subsidie.naam}}</h1>
  <hr><br>
  <div class="wrapper">
    <div id="info">
      <p><b>Informatie</b></p>
      <p>
        Afkorting: {{subsidie.afkortingen}}<br>
        Niveau: {{subsidie.niveau}}<br>
        Subsidieverstrekker: {{subsidie.subsidieverstrekker}}<br>
      </p>
    </div>
    <div id="omschrijving">
      <p><b>Omschrijving</b></p>
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
hr {
  width: 90%;
  border: 1px solid #6cbb71;
}

h1 {
  margin-left: 5%;
  margin-top: 1%;
}

#info {
  width: 30%;
  margin-left: 5%;
}

#omschrijving {
  width: 60%;
}

#info, #omschrijving {
  display: inline-block;
}
</style>