<template>
  <p>{{subsidie.naam}}</p>
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

</style>