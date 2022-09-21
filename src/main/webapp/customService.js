async function getData() {
    const fetchoptions = {
        method: "GET"
    };

    let response = await fetch("subsidie", fetchoptions)
    if (response.status === 200){
        let myJson = await response.json();
        console.log(myJson.subsidieNaam);
    } else {
        return false;
    }
}