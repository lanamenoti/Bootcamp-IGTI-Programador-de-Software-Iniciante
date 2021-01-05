//Achar a soma dos multiplos de 3 ou 5 menores que 1000
var multiplos = [];
for (var i = 3; i < 1000; i++) {
  if (i % 3 === 0 || i % 5 === 0) {
    multiplos.push(i);
  }
}

var sum = 0;
for (var i = 0; i < multiplos.length; i++) {
  sum += multiplos[i];
}
console.log(sum);
