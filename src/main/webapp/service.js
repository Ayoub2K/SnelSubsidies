export default class service {
    static fetch() {
        return fetch('/subsidie/')
            .then((response) => response.json())
            .then(console.log(response.json()));
    }
}