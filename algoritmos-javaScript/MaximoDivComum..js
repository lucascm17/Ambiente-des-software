
var a = Math.trunc(Math.random() * 10);
var b = Math.trunc(Math.random() * 10);

console.log("valor de A = " + a)
console.log("valor de B = " + b)

var resto;

while (b != 0) {
    resto = a % b
    a = b
    b = resto
}

console.log("O MDC é: " + a)
