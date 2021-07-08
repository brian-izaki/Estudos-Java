# Programação Orientada a Objetos: Herança

Classes (sub classe) geradas a partir de uma classe (super classe) podendo utilizar suas implementações e evitando
repetição de código.

- Geralmente tende a criar uma forma hierárquica em forma de árvore.
- Subclasses herdam os modificadores de acesso da superclasse, **apenas os privates não são acessíveis**.
- Implicitamente toda classe já extend a classe Object.
- o uso da anotação `@Override` dita que o método está **sobrescrevendo** o método da superclasse, **ele é opcional**.
    - ele auxilia o compilador a verificar se o método na subclasse está sobrescrevendo um da superclasse (verifica os
      parâmetros também), caso não esteja o compilador dispara um erro
- auxilia a evitar repetição de código
- para dizer que uma classe está herdando de outra deve-se utilizar a keyword `extends`. <br>
  ex: `Subclasse extends Superclasse {}`
- criar subclasses não afeta a superclasse.

## Tem um - é um

- "é um" representa a herança
    - um objeto de uma subclasse também pode ser tratado como um objeto da superclasse.
- "tem um" representa a composição
    - um objeto contém referências como membros a outros objetos.

## Super e Sub classes

- **Superclasses**:
    - São mais generalizadas.

- **Subclasses**:
    - São mais específicas.

## Protected

É outro modificador de acesso.

- ele fornece acesso para subclasses, superclasses e outras classes do mesmo pacote (_acesso de pacote_).
- pode criar potenciais problemas:
    - subclasse pode alterar variaveis diretamente sem utilizar o método set (pode atribuir valores inválidos).
    - pode fazer as subclasses dependerem das variáveis da superclasse qnd, na verdade, subclasses **devem apenas depender
      dos serviços dela**.

## Super()

**Ao criar construtor de uma subclasse deve conhecer o construtor da superclasse antes**, pois é necessário instanciar
as variáveis da superclasse.

- é utilizado a keyword `super()` e dentro as variaveis.
- o compilador implicitamente chama o `super()` caso uma subclasse não chame ela, se a superclasse não tiver um
  construtor sem parâmetros, o compilador lança erro.
- é possível utilizar os métodos da superclasse dentro do que está sendo sobrescrito na subclasse. ex:
  ```
  // calculando com variação em dia de ventos fortes
  @Override
  public double calculoVelocidade() {
    return super.calculoVelocidade() - forcaVento;
  }
  ```
  - o retorno do `super.calculoVelocidade()` é a velocidade total sem nenhuma interferência.
  - porem, nesse trecho de subclasse o vento irá atrapalhar a velocidade diminuindo ela.
  - nota-se que não foi necessário refazer o cálculo de velocidade novamente, pois na superclasse já havia ela.
