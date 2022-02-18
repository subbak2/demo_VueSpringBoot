import { createApp } from 'vue'
import App from './App.vue'

import axios from 'axios'

const app = createApp(App);

axios.defaults.baseURL = 'http://subbak2.com';
app.config.globalProperties.axios = axios;

app.mount('#app');