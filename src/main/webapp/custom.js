// import Service from './service';
//
// function addHtml(key, values){
//     const template = document.querySelector('#firstLog')
//     const myTemplateClone = template.content.cloneNode(true);
//
//     myTemplateClone.querySelector(".logName").textContent = values.logName;
// }
//
// function updateHtml() {
//     Service.fetch()
//         .then(data => {
//             const keys = Object.keys(data);
//             addHtml(keys[i], data[keys[i]])
//         })
//         .catch( error => {
//             console.log("er is een fout opgetreden")
//         });
// }
//
// updateHtml()