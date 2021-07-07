# Classes e objetos um exame mais profundo

- Uma classe quando não é declarada um construtor, o compilador declara um padrão, ou seja, variáveis que são declaradas
  também rebem valores padrões.
- o 0 à esquerda nas flags do format são para preencher os espaços vazios que não foram preenchidos pela quantidade
  especificada no campo, `%04 == 0001, 0002, 0012`

## Métodos sobrecarregados

(ver package time2)

- É a forma de fazer um método trabalhar de diferentes formas apenas variando a quantidade de argumentos no construtor
  dele.
- Por garantia é necessário declarar um construtor sem argumento antes, pois após a declaração de um construtor, o
  compilador não irá fornecer mais nenhum por padrão.
- o `this()` apenas pode ser utilizado na primeira linha do bloco, ele está sendo usado para reaproveitar as instruções
  passadas em um construtor.

## Uso do get e set

- o uso do get ao invés de pegar as variáveis private diretamente tem a ver com a manutenção de código, pois caso tenha
  necessidade de alterar os valores, basta apenas trocar no construtor e nas implementações de get e set ao invés de
  alterar todos os locais que utilizaram a variável private.
- eles também ajudam a acessar variaveis privadas, pois eles geralmente são publicas.
- Então, por que não tornar as variáveis public? Pois, esses métodos podem auxiliar na filtragem/validação de como um
  cliente pode acessar e alterar as variáveis de uma classe.
- os métodos set, geralmente tem retorno void, e para realizar o retorno caso alguma alteração dê errado, é lançado uma
  exception.

## Construtores padrão

- Toda classe deve possuir pelo menos um construtor.
- Caso o desenvolvedor não a crie, o compilador gera um vazio, na qual inicializa os valores de acordo com o que for
  atribuído nas variáveis, caso não tenha nada será preenchido com false para booleans, 0 para tipos numéricos
  primitivos e null para referências.

## Tipos Enum

- Como classes, eles são tipos por referência.
- Declara-se um com `enum`, e uma lista separada por vírgula de constantes enum. ela pode conter componentes de classes
  como métodos, campos e construtores.
    - Cada declaração são: **implicitamente final e static**.
    - elas podem ser utilizadas em qualquer lugar que pudesse utilizar uma constante.
    - As constantes devem ser declaradas sempre no início, o construtor, métodos e variáveis sempre devem ser declaradas
      depois.
- cada constante em um Enum é, na verdade, um objeto dele mesmo que tem sua própria cópia das variáveis de instância.
- O compilador gera métodos static para um tipo Enum:
    - `.values`: **retorna uma array** com as constantes do Enum de acordo com a ordem que foi especificado nela.

## Membros da classe static

- um objeto possui uma cópia das variáveis de instância, na qual cada uma pode ter valores diferentes. Porém, uma
  variável/método com static possuirá seu valor igual independente do objeto. Elas tbm são conhecidas como variável de
  classe.
- uma variável static pode ser vista por todos os objetos da classe.
- static existe mesmo quando não há um objeto instanciado.
- exemplo: `Math.random()`
- métodos static não podem acessar variáveis e métodos de instâncias da própria classe.
- Tem como realizar a importação de métodos/variáveis static sem precisa usar a classe e ".". Possui duas maneiras:
    - simples: `import static nomeDoPacote.NomeDaClasse.nomeDoMembroStatic`. Assim será trazido apenas um elemento e
      depois basta usar o nome.
    - Todos de uma vez: `import static nomeDoPacote.NomeDaClasse.*`. Assim poderá usar todos os static da classe.

## variáveis final

- declara uma constante que não poderá ser modificada.
- ela pode ser:
    - **declarada diretamente**: é recomendado declarar com `static`, pois objetos diferentes utilizarão os mesmos
      valores. <br> ex: `private static final int valorFixo = 10;`
    - **declarada no construtor**: possibilita que objetos diferentes possuam constantes diferentes. <br>
      ex: `private final int valorDependeObjeto;`
    - caso não seja declarada nas duas situações acima, ocorre erro de compilação. <br>
      ex: `java: cannot assign a value to final variable`

## Acesso de pacote

- é quando um método ou variável **não possui os modificadores de acesso**(private, public ou protected) e estão no
  mesmo pacote.
- as classes podem se comunicar pegando ou alterando os valores entre elas através de referências da classe.

## BigDecimal

- Aplicações que precisem de maior precisão com relação a valores double deve utilizar a classe `BigDecimal` do pacote
  java.Math, como valores financeiros, cálculos da distância, etc.
- utilizando o pacote de `java.text.NumberFormat`, é possível converter os dados de acordo a região (EUA, BRL, etc), ele
  também faz o arrendondamento de decimal;
- para realizar cálculos básicos com instancias dessa classe é necessário utilizar os métodos que ele fornece:
    - `BigDecimal.valueOf(valorDouble)`: instancia um BigDecimal a partir de um double.
    - `valorBigDecimal.multiply(outroValorBigInt)`: multiplicação.
    - `valorBigDecimal.add(outroValorBigInt)`: adição.
    - `valorBigDecimal.pow(outroValorBigInt)`: elevado a ...
    - `valorBigDecimal.setScale(2, RoundingMode.HALF_EVEN)`: seta a quantidade de arredondamento, o `2` representa a
      quantidade de casas à direita o BigDecimal pode ter, o segundo argumento diz que está utilizando arredondamento
      contábil.
- a classe tbm fornece constantes que podem ser utilizadas, como `BigDecimal.ONE`, `BigDecimal.ZERO` e `BigDecimal.TEN`.
- como a classe **não realiza arredondamento por padrão**, quando houver casos que uma operação resulte em valores
  aritméticos o Java lança a Exception: `ArithmeticException`.
- é possível **configurar o arredondamento** do BigDecimal no momento de instanciar ela, com o `MathContext` (pacote
  java.math)

    
