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
  

