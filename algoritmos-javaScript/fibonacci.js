
var n = Math.trunc(Math.random() * 10);

var valor1 = 0;
var valor2 = 1;
var valor3;

console.log(valor1)
console.log(valor2)

for (i = 3; i <= n; i++) {
    valor3 = valor1 + valor2;
    console.log(valor3);
    valor1 = valor2;
    valor2 = valor3;
}