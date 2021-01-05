var readline = require('readline');
var rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

//Gerando numero aleatorio entre 1 e 100
var numeroAleatorio = Math.round(Math.random() * 100);
if (numeroAleatorio === 0) {
  numeroAleatorio = 1;
}

//Inicializar o numero de tentativas com 10
var numeroTentativas = 10;

pergunta();

function pergunta() {
  //Pedir ao jogaor para tentar adivinhar um numero
  rl.question('Adivinhe um numero:', (numero) => {
    //Decrementando o numero de tentativas
    numeroTentativas--;
    numero = parseFloat(numero);
    if (numero === numeroAleatorio) {
      console.log('Parabens, voce acertou o numero!');
      rl.close();
    } else if (numeroTentativas === 0) {
      console.log('Que pena, voce nao descobriu o numero em 10 tentativas');
      rl.close();
    } else if (numero > numeroAleatorio) {
      console.log(
        'Numero errado, voce ainda tem ' +
          numeroTentativas +
          ' tentativas.' +
          'O numero informado eh maior do que o sorteado'
      );
      pergunta();
    } else {
      console.log(
        'Numero errado, voce ainda tem ' +
          numeroTentativas +
          ' tentativas.' +
          'O numero informado eh menor do que o sorteado'
      );
      pergunta();
    }
  });
}
