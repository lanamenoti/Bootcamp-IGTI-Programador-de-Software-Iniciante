var numero = parseInt(process.argv[2]);
var ehPrimo = true;

for (var i = 2; i < numero; i++) {
  if (numero % i === 0) {
    ehPrimo = false;
    break;
  }
  ehPrimo = true;
}

if (ehPrimo === true) {
  console.log('O número ' + numero + ' é primo');
} else {
  console.log('O número ' + numero + ' não é primo');
}
