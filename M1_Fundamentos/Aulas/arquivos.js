var fs = require('fs');
var nomeArquivo = 'meuarquivo.txt';

fs.writeFile(nomeArquivo, 'um texto qualquer', function (err) {
  if (err !== null) {
    console.log(err);
  } else {
    console.log('Arquivo escrito com sucesso');
    fs.appendFile(nomeArquivo, '\nnova linha no texto', (err) => {
      if (err) {
        console.log(err);
      } else {
        fs.readFile(nomeArquivo, 'utf-8', (err, data) => {
          if (err !== null) {
            console.log(err);
          } else {
            console.log(data);
          }
        });
      }
    });
  }
});
