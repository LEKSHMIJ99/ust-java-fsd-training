var global_num = 12;
var numbers = /** @class */ (function () {
    function numbers() {
        this.num_val = 13;
    }
    numbers.prototype.storeNum = function () {
        var local_num = 14;
    };
    numbers.sval = 10;
    return numbers;
}());
console.log("glob" + global_num);
console.log(numbers.sval);
var obj = new numbers();
console.log("global num:" + obj.num_val);
