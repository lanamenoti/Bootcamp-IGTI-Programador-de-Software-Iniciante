// Each new term in the Fibonacci sequence is generated by adding the previous two terms.
// By starting with 1 and 2, the first 10 terms will be:
// 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
// By considering the terms in the Fibonacci sequence whose values do not exceed four million,
// find the sum of the even-valued terms.

// 1 - Encontrar a sequência de Fibonacci até 4000000
// 2 - Percorrer a sequência encontrada e encontrar os pares
// 3 - Somar os pares

var sequencia = [1, 2];
var valor = 3;
var i = 3;

//Parte 1
while (valor <= 4000000) {
  sequencia.push(valor);

  valor = sequencia[i - 1] + sequencia[i - 2];
  i++;
}

//Parte 2 e 3
// var pares = [];
var soma = 0;
for (var j = 0; j < sequencia.length; j++) {
  if (sequencia[j] % 2 === 0) {
    // pares.push(sequencia[j]);
    soma = soma + sequencia[j];
  }
}
console.log(soma);
