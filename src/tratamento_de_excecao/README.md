# Tratamento de exceção

Exceções indicam problemas que ocorrem durante execução de um programa. <br>
Ajuda a criar programas **robustos e tolerantes a falhas**, que podem resolver o problema ou encerrar elegantemente.<br>

- Apenas classes que estendem `Throwable` (java.lang) direta ou indiretamente podem ser utilizadas para tratamento de
  exceções.
- Quando ocorre uma Exception, aparece varias informações, elas são conhecidas como **rastreamento de pilha**. Elas
  incluem:
    - **nome da exceção**: em uma mensagem descritiva que mostra o erro que ocorreu.
    - **pilha de chamadas de métodos**: cadeia de chamadas no momento que ela ocorreu.
    - **caminho de execução**: que resulta a exception método por método.
- Quando utilizar tratamento?
    - Ele serve para processar **erros síncronos**
- A classe `Throwable` é a superClasse de `Exception` e `Error`.

## Bloco `try`

Fica o código que lançará a exceção, caso uma linha tenha uma exception ela irá pular as linhas restantes e ir direto
para um bloco `catch`.

- Avançado: _try com recursos_. é uma forma de evitar o finally qnd encerra um processo aberto no try.

## Bloco `catch`

Fica o código que irá capturar e tentar tratar as exceções lançadas pelo bloco `try`. <br>

- ele apenas vai existir após o bloco try.
- Ele possui um parâmetro: que especifica o erro que ocorreu para cair no bloco.
- pode ser feito um **Multi-catch** caso a mensagem de erro seja igual para mais d um tipo de erro. <br>
  ex: `...catch(InputMismatchException | ArithmeticException e)`, o `|` separa os tipos, caso ocorra qualquer um dos
  tipos passados, será executado o bloco.

## Bloco `finally`

ele pode ou não ser usado, o bloco dele sempre irá ser executado independente se tem ou não uma exceção no try.

- normalmente ele terá códigos de liberação do recurso.

## Exceções

- **Não verificadas**
    - **RuntimeExceptions e classes diretas ou indiretas** dela fazem parte desta categoria.
    - geralmente são causadas por defeitos no código do programa.

- **Verificadas**
    - **Exceptions e classes herdadas dela (retirando a RuntimeException e suas filhas)** fazem parte dessa categoria.
    - são exceções que geralmente são causadas por condições que não estão sob o controle do programa, exemplo:
      processamento de arquivos (não é possível abrir um arquivo que não existe).

## Throw

- `throw`: especifica as exceções que um método lança.
- O operando de um throw pode ser de qualquer classe derivada da classe **Throwable**.
- **capture ou declare (catch-or-declare)**: o compilador checa se a exceção verificada é capturada ou declarada em uma
  cláusula throws.
    - _capture_: o código que gera exceções deve ser **empacotado em um bloco try e fornecer um tratamento** com o catch
      para o tipo da exceção ou uma de suas superclasses
    - _declare_: o método contendo o código com exceção deve **fornecer um throws** com o tipo da exceção.

## Nova Exceção

- um novo tipo de exceção deve extender de um já existente.
- pagina 365 do livro.
- por convenção Classes de exceção devem terminar com Exception no final do nome. ex: EmptyListException,
  NotTeacherException.

## Pré-condições, Pós-condições e o uso do `assert`

- **pré-condições**
    - diz respeito ao momento da invocação do método.
    - Descrevem restrições nos parâmetros do método e qualquer outra expectativa sobre o estado atual do programa antes
      de começar a executar.
    - Caso os valores iniciais estejam incorretos, pode ser lançado uma exceção ou se recuperar do erro.
- **pós-condições**
    - diz respeito ao retorno com sucesso do método.
    - ela descreve as restrições sobre o valor de retorno e quaisquer outros efeitos colaterais.

- Assert
    - **É APENAS PARA DEBUG DA APLICAÇÃO**
    - ele **NÃO** deve ser utilizado como verificação, tratamento de erro, etc.
    - é uma boa maneira de verificar as pré-condições e pós-condições de um método.
    - ele apenas irá funcionar caso utilize a flag `-ea` no momento de compilação.
    - estrutura do assert:
      ```Java
       assert expressao : mensagemErro;
      ```
        - o assert lançará uma exception caso o valor da expressão seja false.
        - a mensagem de erro é o que será mostrado na mensagem de erro da exception.
  
  