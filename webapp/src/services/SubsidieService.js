import axios from "axios";

class SubsidieService {
    getSubsidies() {
        return axios.get('http://localhost:8081/subsidie');
    }

    getSubsidie(subsidie) {
        return axios.get(`http://localhost:8081/subsidie/${subsidie}`);
    }

    // matchSubsidies(sector, thema, typeActiviteit, budget, startDatum, eindDatum, projectlocatie, bijdrage, samenwerking) {
    //     return axios.post(`http://localhost:8081/match`, {
    //         data: {
    //             sector: sector,
    //             thema: thema,
    //             typeActiviteit: typeActiviteit,
    //             budget: budget,
    //             startDatum: startDatum,
    //             eindDatum: eindDatum,
    //             projectlocatie: projectlocatie,
    //             bijdrage: bijdrage,
    //             samenwerking: samenwerking
    //         }
    //     }
    //     );
    // }

    matchSubsidies(sector){
        return axios.post(`http://localhost:8081/match?sector=${sector}`)
    }
}

export default new SubsidieService()