<template>
    <main>
        <div class="progress">   
            <div class="progress-item">
                <p>Sector</p>
            </div>
            <div class="progress-item">
                <p>Thema</p>
            </div>
            <div class="progress-item">
                <p>Activiteit</p>
            </div>
            <div class="progress-item">
                <p>Subsidiebedrag</p>
            </div>
            <div class="progress-item">
                <p>Datums</p>
            </div>
            <div class="progress-item">
                <p>Locatie</p>
            </div>
            <div class="progress-item">
                <p>Cofinancering</p>
            </div>
            <div class="progress-item">
                <p>Samenwerking</p>
            </div>
        </div>
      
        <div class="header">
          <!-- <div>
            <button @click="advanceProgress">Advance Progress</button>
            <div id="progress-bar">
              <div :style="{ width: progress + '%' }" id="progress"></div>
            </div>
            <br><br>
            <p>Progress: {{ progress }}%</p>
          </div> -->
              <step-form-component></step-form-component>
        </div>
        
        <a class="button" href="/form">
            Overslaan
        </a>
    </main>
  
</template>

<script>
import StepFormComponent from '@/components/stepFormComponent'
export default {
  name: 'form-page',
  components: {
    StepFormComponent
  }
};


</script>


<style scoped>
main {
  background: white;
  border-radius: var(--default-border-radius);
  width: 90%;
  padding-bottom: 50px;
  margin-top: 13vh; /* nav min-height = 10vh, dus altijd 3vh afstand van nav nu */
  margin-left: auto;
  margin-right: auto;
}

main .progress {
  padding: 20px;
  width: 100%;
  background: ;
  margin-left: auto;
  margin-right: auto;
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: row;
  text-align: center;
  gap: 20px;
}

.progress-item {
  box-sizing: border-box;
  width: 216px;
  height: 43px;
  background: #86C2EE;
  border: 2px solid #86C2EE;
  box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  border-radius: 30px;
  padding: 10px;
}

main .header {
  padding: 50px;
  width: 90%;
  background: ;
  margin-left: auto;
  margin-right: auto;
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
  text-align: center;
}

main .button {
  display: flex;
  align-items: center;
  justify-content: center;
  background-color: var(--main-bg-color);
  max-width: 30%;
  border-radius: var(--default-border-radius);
  margin-left: auto;
  margin-right: auto;
  text-decoration: none;
  color: var(--main-text-color);
  font-size: 1.2rem;
  text-align: center;
  white-space: nowrap; /* zodat button text altijd op 1 regel blijft met kleinere schermen */
}
.button {
  width: 192px;
  height: 43px;
  left: 715px;
  top: 776px;
  background: #FFFFFF;
  border: 2px solid #282B2F;
  box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  border-radius: 30px;
}

.button:hover {
  cursor:pointer;
  background-color: #e0e0e0;
}


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


#progress-bar {
  width: 673px;
  height: 20px;
  background-color: #D9D9D9;
  border-radius: 30px;
  }

#progress {
  height: 100%;
  background-color: #86C2EE;
  border-radius: 30px;
  
  }
</style>
