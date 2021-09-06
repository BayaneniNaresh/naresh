let names=['tom','Ivan','Jerry']
let name1;
let length1;
var a=[]
for(let i of names){
    let arr=[];
    arr.push(i,i.length);
    a.push(arr);
}
console.log(a);