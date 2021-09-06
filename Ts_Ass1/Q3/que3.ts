const order={id:1,title:"ABC",price:2000};
function printOrder(...order){
    return order;
}
function getPrice(){}
const val=Object.assign(printOrder,order);
const price1=Object.assign(getPrice,order);
console.log(val);
console.log(price1);