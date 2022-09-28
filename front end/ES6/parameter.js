function show(...args){
    let sum=0;
    for(let i of args){
        sum=sum+i;
    }
    console.log("sum="+sum);


}
show(10,20,30);