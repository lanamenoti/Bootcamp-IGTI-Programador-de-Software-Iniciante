//arara
//arara - Palindromo

//ana
//ana - Palindromo

//carro
//orrac - Não palindromo

//Criação das variáveis
var palavra = 'arara';
var palavraInvertida = '';

//for de forma descrescente
for (var i = palavra.length - 1; i >= 0; i--) {
  palavraInvertida = palavraInvertida + palavra[i];
}

if (palavraInvertida === palavra) {
  console.log(palavra + ' é palindromo!');
} else {
  console.log(palavra + ' não é palindromo!');
}
