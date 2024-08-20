# Controle de Fluxo - Desafio

Este projeto implementa uma aplicação simples que recebe dois parâmetros inteiros e imprime uma contagem do número 1 até a diferença entre esses dois parâmetros. Se o primeiro parâmetro for maior que o segundo, uma exceção personalizada será lançada, solicitando ao usuário que insira os valores novamente.

## Funcionalidades

- Solicitação de dois parâmetros inteiros do usuário.
- Verificação de que o segundo parâmetro é maior que o primeiro.
- Contagem e exibição de números de 1 até a diferença entre os dois parâmetros.
- Tratamento de exceções personalizadas para garantir que os valores sejam válidos.

## Estrutura do Projeto

O projeto é composto pelos seguintes arquivos:

### 1. `Contador.java`

Localização: `src/model/entities/Contador.java`

Classe responsável por:
- Validar os parâmetros.
- Realizar a contagem e exibir os números.

### 2. `ParametrosInvalidosException.java`

Localização: `src/model/exceptions/ParametrosInvalidosException.java`

Classe responsável por:
- Implementar uma exceção personalizada que é lançada quando o primeiro parâmetro é maior que o segundo.

### 3. `Main.java`

Localização: `src/model/entities/Main.java`

Classe responsável por:
- Interagir com o usuário para obter os parâmetros.
- Tratar exceções que podem ocorrer devido à entrada inválida.
- Reexecutar o programa até que os parâmetros sejam válidos.

## Tecnologias e Conceitos Utilizados

- **Java 8 ou superior**: Linguagem de programação utilizada para desenvolver o projeto.
- **Tratamento de Exceções**: Captura e tratamento de exceções personalizadas (`ParametrosInvalidosException`) e nativas (`InputMismatchException`).
- **Loops (`while`)**: Utilizado para garantir que o usuário possa tentar inserir os valores até que estejam corretos.
- **Classe `Scanner`**: Para a leitura de dados de entrada do usuário via terminal.
- **Orientação a Objetos**: Estruturação do código em classes com responsabilidades bem definidas.

## Como Executar

1. Clone o repositório para sua máquina local:
   ```bash
   git clone https://github.com/absjuniordev/DesafioControleFluxo.git
   ```

2. Navegue até o diretório do projeto:
   ```bash
   cd seu-repositorio
   ```

3. Compile os arquivos Java:
   ```bash
   javac -d bin src/model/entities/*.java src/model/exceptions/*.java
   ```

4. Execute a aplicação:
   ```bash
   java -cp bin model.entities.Main
   ```

5. Siga as instruções no terminal para inserir os parâmetros.

## Exemplo de Uso

```text
Digite o primeiro parâmetro (inteiro): 2
Digite o segundo parâmetro (inteiro): 5
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
```

## Autor

- [Arnaldo Junior](https://github.com/github.com/absjuniordev)

## Licença

Este projeto está licenciado sob os termos da licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

