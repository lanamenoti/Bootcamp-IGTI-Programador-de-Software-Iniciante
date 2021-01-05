var fs = require('fs');
var nomeArquivo = 'carros.json';
var carros = ['Gol', 'Palio', 'Uno', 'Celta'];
var concessionaria = {
  nome: 'Concessionaria XYZ',
  carros,
};

fs.writeFile(nomeArquivo, JSON.stringify(concessionaria), (err) => {
  if (err) {
    console.log(err);
  } else {
    fs.readFile(nomeArquivo, 'utf-8', (err, data) => {
      if (err) {
        console.log(err);
      } else {
        var obj = JSON.parse(data);
        obj.carros.push('HRV');
        fs.writeFile(nomeArquivo, JSON.stringify(obj), (err) => {
          if (err) {
            console.log(err);
          }
        });
      }
    });
  }
});
