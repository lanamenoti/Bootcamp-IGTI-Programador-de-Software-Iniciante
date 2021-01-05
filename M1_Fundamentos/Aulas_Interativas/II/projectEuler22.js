/* 
Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, 
begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, 
multiply this value by its alphabetical position in the list to obtain a name score.
For example, when the list is sorted into alphabetical order, COLIN, which is worth 
3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.
What is the total of all the name scores in the file?

1 - Realizar a leitura do arquivo e armazenar em memória
2 - Ordenar em ordem alfabética
3 - Para cada nome, calcular seu score
4 - Somar todos os scores
*/

var nomes = [];
var fs = require('fs');

fs.readFile('names.txt', 'utf-8', (err, data) => {
  if (err) {
    console.log(err);
  } else {
    nomes = data.split(',');
    nomes.sort();

    var alfabeto = [
      'A',
      'B',
      'C',
      'D',
      'E',
      'F',
      'G',
      'H',
      'I',
      'J',
      'K',
      'L',
      'M',
      'N',
      'O',
      'P',
      'Q',
      'R',
      'S',
      'T',
      'U',
      'V',
      'W',
      'X',
      'Y',
      'Z',
    ];
    var somaTotalScores = 0;

    for (var i = 0; i < nomes.length; i++) {
      var nome = nomes[i];
      var soma = 0;

      for (var j = 0; j < nome.length; j++) {
        var letra = nome[j];

        //retorna a posição da letra
        var valor = alfabeto.indexOf(letra);

        //indexOf retorna -1 se nao acha a posição
        //Quando tiver as aspas duplas, nao vai encontrar no alfabeto e vai retornar -1
        if (valor !== -1) {
          soma += valor + 1;
        }
      }

      var score = soma * (i + 1);
      somaTotalScores += score;
    }
    console.log(somaTotalScores);
  }
});
