import axios from 'axios';

function get() {
    axios.get('/test')
    .then((res) => {
        console.log(res);
    })
}