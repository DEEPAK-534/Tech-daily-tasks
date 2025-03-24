const x = document.getElementById('N');
const y = document.getElementById('M');
const result = document.getElementById('result');

document.getElementById('addbtn').addEventListener('click',()=>{
    document.getElementById('result').textContent = ("the result is: " + (parseInt(x.value) + parseInt(y.value)));
});
document.getElementById('subbtn').addEventListener('click',()=>
{
    document.getElementById('result').textContent = ("the result is:" + (x.value-y.value));
});
document.getElementById('mulbtn').addEventListener('click',()=>{
    document.getElementById('result').textContent = ("the result is: " + (x.value*y.value));
})
document.getElementById('divbtn').addEventListener('click',()=>{
    if(y.value == 0){
        document.getElementById('result').textContent="Error";
    }
    else{
    document.getElementById('result').textContent = (" The result is:" + (parseInt(x.value)/parseInt(y.value)));
    }
})
document.getElementById('modbtn').addEventListener('click',()=>{
    document.getElementById('result').textContent = ("the result is:" + (x.value%y.value));
})
document.getElementById('result').style.color="blue";
document.getElementById('result').style.border="2px solid black";
document.getElementById('result').style.padding="10px";
document.getElementById('result').style.margin="10px";
document.getElementById('result').style.width="250px";
document.getElementById('result').addEventListener('mouseover',() => {
    document.getElementById('result').style.background="linear-gradient(blue,black)"
    document.getElementById('result').style.color="white";
});
document.getElementById('result').addEventListener('mouseout',() => {
    document.getElementById('result').style.background="white";
    document.getElementById('result').style.color="blue";
});
document.getElementById('result').addEventListener('click',() => {
    document.getElementById('result').style.background="red";
    document.getElementById('result').style.color="white";
});
document.getElementById('result').addEventListener('dblclick',() => {
    document.getElementById('result').style.background="green";
    document.getElementById('result').style.color="white";
});
document.getElementById('result').addEventListener('contextmenu',() => {
    document.getElementById('result').style.background="yellow";
    document.getElementById('result').style.color="black";
});
document.getElementById('result').style.borderRadius="10px";
document.getElementById('result').style.fontSize="20px";
document.getElementById('result').style.textAlign="center";