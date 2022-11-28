import axios from "axios";

class SubsidieService {
    getSubsidies() {
        return axios.get('http://localhost:8081/subsidie');
    }

    getSubsidie(subsidie) {
        return axios.get(`http://localhost:8081/subsidie/${subsidie}`);
    }

    matchSubsidies(bijdrage) {
        return axios.get(`http://localhost:8081/subsidie/match?bijdragen=${bijdrage}`);
    }
}

export default new SubsidieService()