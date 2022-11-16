<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <p>
      Zoek begeleid en snel naar de subsidie die het beste bij uw project past!
    </p>
    <button class="button" @click="buttonClicked">Begin met zoeken</button>
  </div>
</template>

<script>

export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  methods:{
    buttonClicked(){
      this.$router.push('/form');
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
.button {
  background-color: #6cbb71;
  border: none;
  border-radius: 14px;
  color: white;
  padding: 11px 25px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
}

.button:hover {
  cursor:pointer;
  background-color: #89db8e;
}
</style>
