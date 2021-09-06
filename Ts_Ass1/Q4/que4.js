var names = ['tom', 'Ivan', 'Jerry'];
var name1;
var length1;
var a = [];
for (var _i = 0, names_1 = names; _i < names_1.length; _i++) {
    var i = names_1[_i];
    var arr = [];
    arr.push(i, i.length);
    a.push(arr);
}
console.log(a);
