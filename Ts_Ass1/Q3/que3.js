var order = { id: 1, title: "ABC", price: 2000 };
function printOrder() {
    var order = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        order[_i] = arguments[_i];
    }
    return order;
}
function getPrice() { }
var val = Object.assign(printOrder, order);
var price1 = Object.assign(getPrice, order);
console.log(val);
console.log(price1);
