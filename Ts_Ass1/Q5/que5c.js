var printCapitalNames = function () {
    var c = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        c[_i] = arguments[_i];
    }
    for (var i in c) {
        console.log(c[i].toUpperCase());
    }
};
var c = ['Naresh', 'chowdary', 'Bayaneni', 'Edururu', 'Pamidi'];
printCapitalNames.apply(void 0, c);
