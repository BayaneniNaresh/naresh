let printCapitalNames=function(...c){
    for(let i in c){
        console.log(c[i].toUpperCase());
    }
}
let c=['Naresh','chowdary','Bayaneni','Edururu','Pamidi'];
printCapitalNames(...c);