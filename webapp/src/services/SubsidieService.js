import axios from "axios";

const SUBSIDIE_API_BASE_URL = 'http://localhost:8081/subsidie'

class SubsidieService{
    getSubsidie(){
        return axios.get(SUBSIDIE_API_BASE_URL);
    }
}

export default new SubsidieService()