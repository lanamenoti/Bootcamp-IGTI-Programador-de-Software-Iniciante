var pessoa = {
  nome: 'Alana',
  idade: 23,
  telefone: '(051) 99155-2389',
  temCarro: true,
  animaisDeEstimacao: ['Tita', 'Mana'],
  pai: {
    nome: 'Bira',
    idade: 56,
  },
};

console.log(pessoa.pai.nome);
pessoa.animaisDeEstimacao.push('Guri');
console.log(pessoa.animaisDeEstimacao);
pessoa.mae = {
  nome: 'Maria',
  idade: 54,
};
console.log(pessoa);

printarDados(pessoa);

function printarDados(pessoa) {
  console.log(pessoa.nome);
  console.log(pessoa.idade);
  console.log(pessoa.temCarro);
  console.log(pessoa.telefone);
}

console.log(JSON.stringify(pessoa));
