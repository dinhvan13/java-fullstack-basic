import axios from 'axios';

export default () => {
    return axios.create(
        {
            baseURL:"http://localhost:3000/api",
            withCredentials:true,
            headers:{
                Accept: "application/json",
                'Access-Control-Allow-Origin': '*',
                "Content-Type": "application/json",
                'Access-Control-Allow-Methods': 'OPTIONS, GET, POST, PUT, PATCH, DELETE'
            }
        }
    );
}