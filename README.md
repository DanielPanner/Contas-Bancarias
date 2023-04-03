## Contas-Bancarias

> Este é um projeto em Java que simula o funcionamento de contas bancárias. O código inclui uma classe abstrata Conta, que serve como modelo para as classes ContaCorrente e ContaPoupanca. A classe SeguroVida é implementada para mostrar como outras classes podem ser integradas com o sistema de contas bancárias.

### Funcionalidades

> O código inclui as seguintes funcionalidades:

- Criar uma conta bancária com agência e número.
- Depositar um valor na conta.
- Sacar um valor da conta, considerando uma taxa de 5 reais para a ContaCorrente.
- Transferir um valor de uma conta para outra.
- Calcular o saldo da conta.
- Calcular o valor de imposto de cada conta ou classe Tributável.
- Registrar uma conta ou classe Tributável para cálculo de imposto.

### Classes

- Conta: Classe abstrata que representa uma conta bancária. Contém métodos para depositar, sacar, transferir e obter informações da conta.
- ContaCorrente: Classe que herda de Conta e adiciona a taxa de 5 reais ao sacar dinheiro.
- ContaPoupanca: Classe que herda de Conta e não adiciona nenhuma funcionalidade extra.
- SeguroVida: Classe que implementa a interface Tributável para exemplificar a possibilidade de cálculo de imposto para outras classes.
- Tributável: Interface que define o método para cálculo do valor de imposto de uma classe.
- CalculadorImposto: Classe que calcula o total de imposto a ser pago com base nas classes Tributáveis registradas.

### Como utilizar

>Clone o repositório para o seu computador.
Importe o projeto no seu ambiente de desenvolvimento Java preferido.
Crie instâncias das classes ContaCorrente e ContaPoupanca com os métodos de construtor.
Utilize os métodos das classes para depositar, sacar, transferir e calcular o saldo.
Para calcular o valor de imposto, crie instâncias das classes que implementam a interface Tributável e registre-as no objeto CalculadorImposto. Em seguida, utilize o método getTotalImposto() para obter o total de imposto a ser pago.

### Exemplo
> Aqui está um exemplo de código para utilizar o sistema de contas bancárias:

```sh
ContaCorrente cc = new ContaCorrente(0002, 0013532-2);		
cc.deposita(1000);

ContaPoupanca cp = new ContaPoupanca(0001, 00052347-8);
cp.deposita(1000);

cc.transfere(900, cp);

System.out.println("CC Tem: " + cp.getSaldo());
System.out.println("CP Tem: " + cc.getSaldo());

CalculadorImposto calc = new CalculadorImposto();
calc.registra(cc);
calc.registra(new SeguroVida());

System.out.println(calc.getTotalImposto());
```
#### Este projeto foi desenvolvido por Daniel Souza como parte de um estudo em Java.
