## Anotações

- variáveis definidas dentro de uma classe são chamadas de variáveis de instância, pois seus valores ficam armazenados dentro de cada instância dessa classe. 
  - _ex: se tenho dois objetos (instancias da classe), mesmo sendo da mesma classe, eles podem ter valores diferentes armazenados neles._
  - as variáveis definidas dentro do escopo de um método é chamado de **variável local**.

- Os métodos com início get e set:
  - `get`: servem para pegar o valor que está armazenado na variavel dentro do objeto.
  - `set`: para alterar eles.
  - o Java reconhece essa nomenclatura, então get e set no inicio d um método torna ele em palavra reservada.

- um arquivo deve possuir o mesmo nome que a classe criada (com a diferença que no arquivo tera o .java).

- Um objeto é instanciado quando é utilizado a palavra chave `new NomeClasse()`

- **modificadores de acesso**, eles auxiliam no encapsulamento de código. Um modificador public permite que todos fora da classe possa ver o método(Mtd) ou atributo(Attr), já um private não permite que ninguem de fora da classe veja o Mtd ou Attr. (mais pra frente será visto o protected - é relacionado com herança -.)

- Para declarar um construtor em uma classe é necessário utilizar o mesmo nome que a classe tem em um "método publico".
  ```Java
  class MinhaClasse {
  	// esse é o contrutor
  	public MinhaClasse(String passeParametros) {
  	
  	}
  }
  ```
  - nessa classe, quando instanciar ela é necessário que passe um argumento que seja do tipo String.
  - note que não é necessário passar o tipo de um retorno pois ele **É um contrutor**, **NÃO é um método**.
  - normalmente são definidos como public, mas em alguns casos podem ter o modificador de acesso private.
  
- **especificador de formato** 
  - `%.2f` : serve para especificar formatos com ponto flutuante. O `.2` serve para especificar quantos digitos eu quero após o ponto flutuante (ele pode ser alterado para outros números tambem).
  