import axios from "axios";

class SubsidieService {
    getSubsidies() {
        return axios.get('http://localhost:8081/subsidie');
    }

    getSubsidie(subsidie) {
        return axios.get(`http://localhost:8081/subsidie/${subsidie}`);
    }

    matchSubsidies(sector, thema, typeActiviteit, budget, typeAanvrager, projectlocatie, bijdrage, samenwerking){
        return axios.post(
            `http://localhost:8081/match?sector=${sector}&thema=${thema}&typeActiviteit=${typeActiviteit}&budget=${budget}&typeAanvrager=${typeAanvrager}&projectlocatie=${projectlocatie}&bijdrage=${bijdrage}&samenwerking=${samenwerking}`
        )
    }
}

export default new SubsidieService()