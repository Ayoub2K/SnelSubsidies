<template>
  <div id="nav">
    <ul>
      <li><a><router-link to="/">Home</router-link></a></li>
      <li><a><router-link to="/form">Form</router-link></a></li>
      <li><a><router-link to="/resultaten">Subsidie</router-link></a></li>
    </ul>
  </div>
  <router-view/>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  border: 1px solid #e7e7e7;
  background-color: #6cbb71;
}

li {
  float: left;
}

li a {
  display: block;
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 20px;
}

/* Change the link color to #111 (black) on hover */
li a:hover {
  background-color: #89db8e;
}
</style>