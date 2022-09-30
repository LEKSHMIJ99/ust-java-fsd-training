var global_num=12
class numbers{
    num_val=13;
    static sval=10;
    storeNum():void{
        var local_num=14;

    }
}
console.log("glob"+ global_num);
console.log(numbers.sval)
var obj=new numbers();
console.log("global num:"+ obj.num_val);