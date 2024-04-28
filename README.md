
# Documentação do programa ContaTerminal

Este programa em Java, `ContaTerminal`, permite a criação de uma conta bancária básica através da entrada de dados pelo terminal. Ele solicita ao usuário informações como número da agência, número da conta, nome do cliente e saldo inicial.

## Funcionamento

1. **Inicialização e entrada de dados**
   * O programa inicia importando a classe `Scanner` do pacote `java.util` para possibilitar a entrada de dados pelo terminal.
   * São declaradas variáveis para armazenar o número da conta, nome da agência, nome do cliente e saldo.
   * O programa solicita ao usuário que digite o número da agência e da conta, respectivamente.
   * Em seguida, solicita o nome do cliente.
   * Por fim, solicita o saldo inicial.
2. **Tratamento de entrada**
   * Para garantir que o saldo seja um valor válido, o programa utiliza um loop `while` que verifica se o próximo token é um número double. Se não for, o programa solicita ao usuário que insira um número válido.
3. **Saída de dados**
   * Após a entrada de todos os dados, o programa exibe uma mensagem de boas-vindas ao cliente, contendo seu nome, número da agência, número da conta e saldo inicial.
4. **Fechamento**
   * O programa fecha o objeto `Scanner` para evitar vazamento de recursos.

## Utilização

Para compilar e executar o programa, siga os passos abaixo:


1. **Compilação**

   * Abra o terminal e navegue até o diretório onde o arquivo `ContaTerminal.java` está localizado.
   * Execute o seguinte comando para compilar o programa:

   ```java
   javac ContaTerminal.java
   ```
2. **Execução**

   * Após a compilação bem-sucedida, execute o programa com o seguinte comando:

   ```java
   java ContaTerminal
   ```
3. **Instruções**

   * Siga as instruções exibidas no terminal para inserir os dados da conta.

## Exemplo de Saída

A seguir está um exemplo de saída após a execução do programa:


```java
Por favor, digite o número da Agência!
1234
Por favor, digite o número de Usuário!
56789
Por favor, digite o Nome de Cliente!
João da Silva
Por favor, digite o saldo que deseja depositar!
1000.50
Olá João da Silva, obrigado por criar uma conta em nosso banco, sua agência é 1234, conta 56789 e seu saldo 1000.5 já está disponível para saque.

```



## Contribuições

Contribuições para melhorias deste programa são bem-vindas. Se você encontrar bugs ou tiver sugestões de melhorias, sinta-se à vontade para contribuir.
