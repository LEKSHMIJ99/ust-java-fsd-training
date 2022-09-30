var Car = /** @class */ (function () {
    function Car(engine) {
        this.engine = engine;
    }
    Car.prototype.disp = function () {
        console.log("function displays engine is: " + this.engine);
    };
    return Car;
}());
var obje = new Car("XXSY1");
console.log("reading attribute value Engine as:" + obje.engine);
