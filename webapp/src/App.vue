<template>

   <nav>
        <ul>
            <li class="logo">
                <a href="../"><img src="https://cdn.discordapp.com/attachments/230010488082268160/1044981108086943755/image.png" alt="logo" /></a>
            </li>
            <li><a><router-link to="/form"><i class="fa-regular fa-bookmark"></i>Zoekopdrachten</router-link></a></li>
            <li><a><router-link to="/resultaten"><i class="fa-solid fa-star"></i>Subsidie</router-link></a></li>
            <li><a href=""><i class="fa-regular fa-bell"></i>Meldingen</a></li>
            <li class="user">
                <a href="">Inloggen/aanmelden <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/A_black_image.jpg/640px-A_black_image.jpg" /></a>
            </li>
        </ul>
    </nav>
  <router-view/>
</template>

<style>
html {
  box-sizing: border-box;
  font-size: 16px;
}*,
*:before,
*:after {
  box-sizing: inherit;
}

body,
h1,
h2,
h3,
h4,
h5,
h6,
p,
ol,
ul {
  margin: 0;
  padding: 0;
  font-weight: normal;
}

ol,
ul {
  list-style: none;
}

img {
  max-width: 50%;
  height: auto;
}

/* Custom */
:root {
  background: linear-gradient(110.6deg, rgba(137, 188, 248, 0.9) 5.78%, rgba(221, 238, 248, 0.9) 92.19%);
  --secondary-bg-color: #222;
  --main-text-color: #222;
  --default-border-radius: 20px;
}

body {
  background-color: var(--main-bg-color);
  font-family: sans-serif;
}

nav {
  position: absolute;
  top: 0;
  left: 0;
  width: 100vw;
  padding: 20px;
  min-height: 10vh;
}

nav ul {
  display: flex;
  align-items: center;
  justify-content: space-between;
}

nav ul li {
  margin-left: 20px;
  margin-right: 20px;
}

nav ul li a {
  text-decoration: none;
  color: var(--main-text-color);
  display: flex;
  align-items: center;
  justify-content: center;
}

nav ul li a i {
  margin-right: 10px;
  font-size: 1.3rem;
}

nav ul li.logo {
  margin-right: auto;
}

nav ul li.logo a img {
  height: 50px;
  width: 220px;
}

nav ul li.user {
  margin-left: auto;
}

nav ul li.user a img {
  margin-left: 10px;
  width: 50px;
  height: 50px;
  border-radius: 50px;
  background-color: var(--secondary-bg-color);
  box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
}


#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  /*text-align: center;*/
  color: #2c3e50;
}


</style>