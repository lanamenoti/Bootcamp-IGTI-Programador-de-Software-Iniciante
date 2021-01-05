var numero = parseInt(process.argv[2]);
var primos = [];

for (var i = 2; i <= numero; i++) {
  if (i % 2 === 0 || i % 3 === 0) {
    if (i === 2 || i == 3) {
      primos.push(i);
    }
  } else {
    primos.push(i);
  }
}
console.log('Os números primos até o número digitado são: ');
console.log(primos);
