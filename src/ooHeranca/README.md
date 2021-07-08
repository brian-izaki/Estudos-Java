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
    - pode fazer as subclasses dependerem das variáveis da superclasse qnd, na verdade, subclasses **devem apenas
      depender dos serviços dela**.

## Construtor

Os constructors de subclasses vão subindo a hierarquia até chegar na origem das classes, a **classe Object**. Depois,
ele vai descendo de novo e instanciando as variáveis (caso haja) de cada objeto até chegar novamente na subclasse. <br>
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

## Classe Object

É a classe mãe, **todas as classes do Java a extendem de forma direta ou indireta**.

- Como todas utilizam ela, toda classe terá os métodos que ela possuí, algumas podem acabar sobrescrevendo elas para se
  adequarem ao seu escopo.
    - `equals`: realiza comparação entre dois objetos para saber se possuem valores iguais, para que ele faça comparação
      dos atributos de uma classe específica é necessário sobrescrever nas classes esse método.
    - `hashCode`: eles são valores `int` utilizados para armazenamento e recuperação em alta velocidade.
    - `toString`
    - `getClass`: retorna os dados sobre o tipo do objeto.

## GUI

- utilizado o JLabel (javax.swing) para exibir textos na interface gráfica.

<br>

**Executando GUI para ver a imagem:**

1. deve conferir se os comandos do Java funciona no terminal, basta digitar: <br>
   `java --version` deve aparecer a versão dele.
2. deve ir para o diretório `src` no terminal e digitar o seguinte comando: <br>
   `javac ooHeranca/gui/LabelDemo.java` (ele irá criar um arquivo .class)
3. agora para ver a aplicação funcionando: `java ooHeranca.gui.LabelDemo`