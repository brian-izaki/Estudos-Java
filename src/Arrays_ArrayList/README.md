# Arrays
Array é um grupo de variáveis (chamados elementos ou componentes) 
- **Contém valores do mesmo tipo**. 
- Também são objetos, ou seja, são considerados tipos por referência.
- Dentro do array, pode haver tipos primitivos ou por referência.
- numero de posição de um elemento em um array é chamado de índice ou subscrito, a primeira posição é sempre 0 (zero)
- para **acessar um elemento de um array** é necessário pegar o nome e o índice referente a esse elemento. ex:
    ```
    nomeArray[0] = 3
    int inteiro = 1
    nomeArray[inteiro]
    ```
    - é atribuído 3 à primeira posição do array.
    - podem ser passados variáveis no lugar que acessa o índice, essa variável deve ser do tipo `int` ou qualquer outra 
      que possa ser promovida para `int` como: `byte`, `short` ou `char`. **Menos** `long`, isso resulta em erro de compilação.

## Declarando uma array
- para declarar um array de determinado tipo, é necessário dizer o tipo e adicionar o `[]` na frente:
    ```
    int[] listaInteiros = new int[12];  
    ```
    - Esta array terá somente elementos do tipo inteiro.
    - Como uma array é um objeto é necessário instanciar ela com `new` e a quantidade de elementos que ela deverá possuir.
    - no momento de instanciação, os elementos serão valores default, eles variam de acordo com o tipo.
        - tipos primitivos numéricos: `0`
        - booleanos: `false`
        - tipos por referência: `null` (isso inclui tipos String)
    
- uma array também pode ser declarada com valores iniciais, mas aí o tamanho dela será definida de acordo com a quantidade de elementos.
    ```
    int[] listaInteiros = { 10, 20, 30, 40, 50 }
    ```
    - o array foi definido no `int[]`
    - os valores dessa array será definido dentro do `{}`
    - por ter 5 elementos, o tamanho dessa array tbm será de 5.
    - nota-se que não foi utilizado o `new`, isso é pq o Java irá fazer isso "por baixo dos panos" logo após contar a quantidade de elementos.
    

- na classe InitArray foi utilizado uma variável constante (utilizando o `final`), elas sempre devem ser definidas no início 
  e dps não podem ser alteradas após serem definidas, isso resulta em erro de compilação.
  
## Erros de compilação
- `ArrayIndexOutOfBoundsException`: erro ao tentar acessar valores fora do intervalo de índices de um Array.

## Exceções
- Quando ocorre um erro de compilação o java lança uma exceção dizendo qual o erro que ocorreu.

<blockquote>
    Se a "regra" é uma instrução executando corretamente, então um problema representa a "exceção à regra".
</blockquote>

- instrução `try`:
    - para realizar tratamento de erros, utilize o bloco try.
    - nele pode colocar qualquer código que lance uma exceção, se caso houver uma, ele executa o bloco `catch`.
- instrução `catch`:
    - executa os códigos no seu bloco quando o try captura alguma exceção.
    - variáveis declaradas no bloco `try` estão fora do escopo do bloco `catch`.
    - O erro quando passado para o System.out.println() ele implicitamente executa o toString presente na classe de erro.
    
    
    
