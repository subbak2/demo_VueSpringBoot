<template>
  <img class="logo" alt="Lotto logo" src="./assets/logo.jpg">
  <div class="menu">
    <a href="#">Home</a>
    <a href="https://subbak2.tistory.com/" target="_blank">About</a>
  </div>
  <div>
    <h3>로또 회차별 번호</h3>
    <input v-model="drwNo" class="drwNo"> 회 <button class="search" @click="search">조회</button>
    <div class="s-menu"> {{drwNoDate}}</div>
    <p>1등 당첨금액 : {{winprize}}</p>
  </div>
  <div  v-for="(order, i) in orders" :key="order">
    <div class="s-menu">{{order}} 행운번호 : </div><div class="lucky">{{numbers[i]}}</div>
  </div>
  <div><p>보너스 번호 : {{bonusNumber}}</p></div>
</template>

<script>

export default {
  name: 'App',
  data(){
    return {
        orders : ['첫번째', '두번째', '세번째', '네번째', '다섯번째', '여섯번째'],
        numbers : [1,2,3,4,5,6],
        bonusNumber : 7,
        drwNo :1,
        winprize : 10000,
        drwNoDate : '0000-00-00'
    }
  },
  methods : {
    search(){
      this.axios.get("/lotto/"+this.drwNo)
      .then((res)=>{
        console.log(res.status);
        console.log(res.data);

      this.drwNo = res.data.drwNo;
      this.winprize = res.data.firstWinamnt;
      if(this.winprize == 0){
        this.winprize = "당첨자 없음";
      }
      else{
        this.winprize += " 원";
      }
      this.numbers[0] = res.data.drwtNo1;
      this.numbers[1] = res.data.drwtNo2;
      this.numbers[2] = res.data.drwtNo3;
      this.numbers[3] = res.data.drwtNo4;
      this.numbers[4] = res.data.drwtNo5;
      this.numbers[5] = res.data.drwtNo6;
      this.bonusNumber = res.data.bnusNo;
      this.drwNoDate = res.data.drwNoDate;
      })
      .catch((error)=>{
        console.log(error);
        }
      )
    }
  },
  components: {
  },
  mounted(){
    this.drwNo = 1000;
    this.search();
  }
}

</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 0.5em;
}
.logo{
  width:30%;
}
.menu {
  background: darkslateblue;
  padding: 0.8em;
  border-radius: 1em;
}
.menu a {
  color:white;
  padding: 1em;
}
.lucky{
  display:inline;
  background: orange;
  padding : 1em;
  border-radius: 1.5em;
}
.s-menu{
  padding:1em;
  display:inline-block;
}
.drwNo{
  width:5em;
  margin-right: 0.5em;
}
.search{
  margin-left:2em;
}
</style>
