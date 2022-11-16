import axios from "axios";

class SubsidieService{
    getSubsidies(){
        return axios.get('http://localhost:8081/subsidie');
    }
}

export default new SubsidieService()