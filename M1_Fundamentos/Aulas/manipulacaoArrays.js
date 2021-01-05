var carros = ['Gol', 'Palio', 'Uno', 'Sandero'];

//pop - Remove o ultimo elemento do array
// - Retorna o elemento removido
var carro = carros.pop();
// console.log(carro);
// console.log(carros);

//push - Insere um elemento no array
// - Retorna o tamanho do array
var x = carros.push('Ford Ka');
// console.log(x);
// console.log(carros);

//shift - Remove o primeiro elemento do array e atualiza os outros indices
// - Retorna o elemento removido
var carro = carros.shift();
// console.log(carro);
// console.log(carros);

//unshift - Insere elemento no inicio do array e atualiza o restante
// - Retorna o novo tamanho do array
var x = carros.unshift('Kwid');
// console.log(x);
// console.log(carros);

//Atualiza elemento do indice informado
carros[2] = 'Novo Uno';
// console.log(carros);

//delete - Remove elemento do indice informado,
// deixando undefined no lugar
// delete carros[2];
// console.log(carros);

/*
  primeiro parametro: posicao inicial
  segundo parametro: quantos elementos serao removidos 
          a partir da posicao inicial
  demais parametros: elementos a serem inseridos a partir 
        da posicao inicial
*/
carros.splice(2, 0, 'HRV', 'Creta');
// console.log(carros);

// concat - Concatena um array em outro e retorna o array criado
// eh possivel passar mais de um array para concatenar
var carrosAntigos = ['Brasilia', 'Monza', 'Fusca'];
var todosCarros = carros.concat(carrosAntigos);
// console.log(todosCarros);

//slice - Cria um novo array sem alterar o array original
// primeiro parametro: posicao inicial
// segundo parametro (opcional): posicao final (nao incluso)
var novoArray = todosCarros.slice(1);
console.log(todosCarros);
console.log(novoArray);

var novoArray2 = todosCarros.slice(2, 5);
// console.log(todosCarros);
// console.log(novoArray2);
