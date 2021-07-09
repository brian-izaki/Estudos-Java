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
    - Caso não faça o Dowcasting, ele irá acusar erro "incompatible types", pois não é possível atribuir uma superclasse para uma subclasse
      diretamente. Pois, um Veículo Não é um Carro, mas sim, um Veículo TEM um Carro.
      

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

  
