var carros = ['Gol', 'Kwid', 'Uno', 'Captur'];

for (var i = 0; i < carros.length; i++) {
  // console.log(carros[i]);
}

// var i = carros.length -1 - carros.length retorna 4 (bota o -1 pq o primeiro indice do array eh 0)
for (var i = carros.length - 1; i >= 0; i--) {
  // console.log(carros[i]);
}

var i = 0;
while (i < carros.length) {
  console.log(carros[i]);
  i++;
}

var i = 0;
while (i < carros.length) {
  if (carros[i] === 'Kwid') {
    console.log('Encontrei o Kwid');
    break; // A iteracao para
  }
  i++;
}

var numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
var i = 0;
while (i < numeros.length) {
  var num = numeros[i];
  i++;

  if (num % 2 === 0) {
    console.log(num + ' eh par');
    continue; // A iteracao volta la pra cima
  }

  console.log(num + ' eh impar');
}

//Utilizado quando se quer executar pelo menos uma vez as instrucoes
var j = 0;
do {
  j++;
  console.log(j);
} while (j < 10);

for (var carro of carros) {
  console.log(carro);
}
