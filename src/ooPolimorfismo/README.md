# Programação orientada a Objetos: Polimorfismo

Ele auxilia na parte de programar de maneira mais generalizada, um exemplo seria o uso de um método de uma superclasse,
ela será utilizada por várias subclasses e cada subclasse vai realizar algo diferente.

<blockquote>
A mesma mensagem enviada a uma variedade de objetos tem muitas formas de resultados. <br>
- Deitel
</blockquote>

- Torna sistemas mais extensíveis. Pois, uma vez implementado o polimorfismo, bastaria uma nova subclasse que ela
  usuaria os métodos da superclasse.
- Um objeto de subclasse pode ser atribuído a uma variável com o tipo da sua superclasse. Pois uma subclasse faz parte
  da superclasse (é um)
- Pense na chamada de um método, poderia passar uma superclasse nela, e assim poderá passar todas as subclasses dela
  como argumento.
- Uma superclasse não poderá chamar métodos específicos de uma subclasse dela, isso daria o erro "cannot find symbol"

<blockquote>
Quando uma variável de superclasse contém uma referência a um objeto de subclasse, e essa referência é utilizada 
para chamar um método, a versão da subclasse do método é chamada. (vinculação dinâmica) <br>
- Deitel
</blockquote>

- `instanceof`: verifica se determinado elemento é de determinado tipo. ex: `"ola" instanceof String` daria true.
    - obs: caso valor desejado seja subclasse da classe verificada, ele também dará true.

- **DownCasting**: coerção do tipo que é superclasse e se transforma em subclasse. (caí o nível da hierarquia) <br>
  ex: `Carro carro = (Carro) veiculo;`, veículo é uma variável que referencia a superclasse de Carro.
    - Caso não faça o Dowcasting, ele irá acusar erro "incompatible types", pois não é possível atribuir uma superclasse
      para uma subclasse diretamente. Pois, um Veículo Não é um Carro, mas sim, um Veículo TEM um Carro.

## Classes e métodos abstratos

- **são classes que não se pretende criar objetos** (superclasses abstratas)
- é utilizado a keyword `abstract`
- elas são incompletas
- **classes concretas**: são as **subclasses que completam** as superclasses abstratas (classes que podem instanciar
  objetos), caso a subclasse não a complete, ela também será uma classe abstrata.
- A intenção é criar uma superclasse que fornece um design em comum entre as classes que vão herdar dela.
- são excessivamente gerais para criar objetos reais. Elas só especificam o que é comum entre as suas subclasses.
- Na classe abstrata podem ser declarados métodos abstratos e concretos.
- Método abstrato
    - subclasses devem obrigatoriamente implementar os métodos abstratos da sua superclasse (isso torna os métodos
      concretos).
    - Construtores e métodos static **não podem ser** abstratos.

## métodos e classes `final`

O `final` além de criar variáveis que não podem ser alteradas após serem instanciadas (constantes), elas também **podem
ser utilizadas em métodos, parâmetros de métodos e classes**.

- Métodos
    - ela não **pode ser sobrescrita (Override)** por suas subclasses.
    - métodos declarados com `static` são implicitamente `final`.
    - as chamadas de métodos são resolvidas em tempo de compilação (vinculação estática).
- Classes
    - Não podem ser superclasses (estendidas).
    - Todos os métodos dela serão implicitamente `final`.
    - Classes `final` podem ajudar os programadores a `Não criarem subclasses` que poderiam ser utilizadas para driblar
      as restrições de segurança.

## Construtor da subclasse

- Caso o construtor utilize um método (de instância) sobrescrito dentro dele, deve-se ter atenção.
- uma subclasse passa pela superclasse antes de ser instanciada, logo, caso tenha um método que foi sobrescrito e dentro
  desse método tenha uma variável que necessita da instanciação da subclasse ocorrerá um erro.
- Para evitar erros, é válido utilizar métodos `static` dentro do construtor. Ex: validação de valores que se repetem no
  método set e no construtor.

## Interfaces

Elas padronizam como coisas, pessoas e sistemas se interagem entre si. ex: realizar operações, mas sem saber como ela
foi implementada. <br>
Elas são como "contratos" com os compiladores (significa que vou cumprir com todas as ações que ele especificar).

- Os objetos no Java também se interagem pelas interfaces.
- São muitas vezes utilizadas quando _classes diferentes necessitam compartilhar métodos e constantes comuns_.
- Declarando:
    - Deve iniciar com a keyword `interface`.
    - uma `interface` **contém apenas constantes e métodos abstract**.
    - todos os membros devem ser public.
    - métodos não podem especificar detalhe de implementação (métodos concretos e variáveis de instância).
    - **Todos os membros são implicitamente** métodos `public abstract` e campos (variáveis) são `public`, `static`
      e `final`.
- Utilizando:
    - Uma classe concreta deve dizer que **implementa** a interface.
    - Utilize a keyword `implements` na frente do nome da classe.
    - Deve declarar cada método na interface com a assinatura especificada.
        - Caso não implemente todos os métodos dela, essa classe deve ser declarada como `abstract`.
    - é possível **implementar mais de uma interface** em uma classe, diferente de **classes que podem extender apenas 1
      superclasse**.
        - a classe que implementa as interfaces, vai ter o relacionamento "é um" com cada uma delas.
- Classe abstrata ou interface ?
    - interfaces são utilizadas quando a classe não tem implementação padrão que serão herdados.
- No Java SE8:
    - keyword `default`, permite implementar métodos concretos na interface. ex:
        ```Java
        public default double soma(n, m) { return n + m; };
        ```
        - classes de implementação **NÃO precisam sobrescrever métodos default** da interface, caso queira, pode
          sobrescrever.
    - Caso tenha apenas um método abstract, a interface é conhecida como **interface funcional**. Elas podem ser
      utilizadas com as novas capacidades lambdas(programação funcional) que o compilador gera métodos anônimos.