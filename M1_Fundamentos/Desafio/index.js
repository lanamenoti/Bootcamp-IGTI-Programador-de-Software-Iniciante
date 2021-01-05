var fs = require('fs');
var arquivo = 'funcionarios.json';

fs.readFile(arquivo, (err, data) => {
  if (err) {
    console.log(err);
  } else {
    var dados = JSON.parse(data);
    maiorSalario(dados);
    menorSalario(dados);
    mediaSalarialEmpresa(dados);
    maiorSalarioSetor(dados, 'Comercial');
    menorSalarioSetor(dados, 'Comercial');
    mediaSalarialSetor(dados, 'Comercial');
  }
});

function maiorSalario(dados) {
  var nome = '';
  var salario = 0;
  for (var i = 0; i < dados.funcionarios.length; i++) {
    if (dados.funcionarios[i].salario > salario) {
      salario = dados.funcionarios[i].salario;
      nome = dados.funcionarios[i].nome;
    }
  }
  console.log(
    'O funcionário(a) de maior salário é: ' +
      nome +
      ' e ele(a) recebe ' +
      salario
  );
}

function menorSalario(dados) {
  var nome = '';
  var salario = dados.funcionarios[0].salario;
  for (var i = 0; i < dados.funcionarios.length; i++) {
    if (dados.funcionarios[i].salario < salario) {
      salario = dados.funcionarios[i].salario;
      nome = dados.funcionarios[i].nome;
    }
  }
  console.log(
    'O funcionário(a) de menor salário é: ' +
      nome +
      ' e ele(a) recebe ' +
      salario
  );
}

function mediaSalarialEmpresa(dados) {
  var soma = 0;
  var media = 0;
  for (var i = 0; i < dados.funcionarios.length; i++) {
    soma = soma + dados.funcionarios[i].salario;
  }
  media = soma / dados.funcionarios.length;
  console.log('A média salarial da empresa é: ' + Math.round(media));
}

function maiorSalarioSetor(dados, setor) {
  var nome = '';
  var salario = 0;
  for (var i = 0; i < dados.funcionarios.length; i++) {
    if (setor === dados.funcionarios[i].setor) {
      if (dados.funcionarios[i].salario > salario) {
        salario = dados.funcionarios[i].salario;
        nome = dados.funcionarios[i].nome;
      }
    }
  }
  console.log(
    'O funcionário(a) de maior salário do setor ' +
      setor +
      ' é: ' +
      nome +
      ' e ele(a) recebe ' +
      salario
  );
}

function menorSalarioSetor(dados, setor) {
  var nome = '';
  var salario = dados.funcionarios[0].salario;
  for (var i = 0; i < dados.funcionarios.length; i++) {
    if (setor === dados.funcionarios[i].setor) {
      if (dados.funcionarios[i].salario < salario) {
        salario = dados.funcionarios[i].salario;
        nome = dados.funcionarios[i].nome;
      }
    }
  }
  console.log(
    'O funcionário(a) de menor salário do setor ' +
      setor +
      ' é: ' +
      nome +
      ' e ele(a) recebe ' +
      salario
  );
}

function mediaSalarialSetor(dados, setor) {
  var soma = 0;
  var media = 0;
  var cont = 0;
  for (var i = 0; i < dados.funcionarios.length; i++) {
    if (setor === dados.funcionarios[i].setor) {
      cont++;
      soma += dados.funcionarios[i].salario;
    }
  }
  media = soma / cont;
  console.log(
    'A média salarial do setor ' + setor + ' é: ' + Math.round(media)
  );
}
