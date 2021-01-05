function calcularIMC() {
  var altura = parseFloat(document.getElementById('altura').value);
  var peso = parseFloat(document.getElementById('peso').value);

  var imc = peso / (altura * altura);
  var imcArredondado = Math.round(imc);
  var imcResultado = '';

  if (imc < 18.5) {
    imcResultado = 'Você está abaixo do peso';
  } else if (imc >= 18.5 && imc < 25) {
    imcResultado = 'Você está com o peso normal';
  } else if (imc >= 25 && imc < 30) {
    imcResultado = 'Você está com sobrepeso';
  } else if (imc >= 30 && imc < 40) {
    imcResultado = 'Você está com obsidade';
  } else {
    imcResultado = 'Você está com obesidade grave';
  }

  document.getElementById('resultado').innerHTML =
    'Seu IMC é: ' + imcArredondado;
  document.getElementById('descricaoResultado').innerHTML = imcResultado;
}

function limpar() {
  document.getElementById('altura').value = 0;
  document.getElementById('peso').value = 0;

  document.getElementById('resultado').innerHTML = '';
  document.getElementById('descricaoResultado').innerHTML = '';
}
