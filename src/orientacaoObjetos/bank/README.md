## Anota��es

- vari�veis definidas dentro de uma classe s�o chamadas de vari�veis de inst�ncia, pois seus valores ficam armazenados dentro de cada inst�ncia dessa classe. 
  - _ex: se tenho dois objetos (instancias da classe), mesmo sendo da mesma classe, eles podem ter valores diferentes armazenados neles._
  - as vari�veis definidas dentro do escopo de um m�todo � chamado de **vari�vel local**.

- Os m�todos com in�cio get e set:
  - `get`: servem para pegar o valor que est� armazenado na variavel dentro do objeto.
  - `set`: para alterar eles.
  - o Java reconhece essa nomenclatura, ent�o get e set no inicio d um m�todo torna ele em palavra reservada.

- um arquivo deve possuir o mesmo nome que a classe criada (com a diferen�a que no arquivo tera o .java).

- Um objeto � instanciado quando � utilizado a palavra chave `new NomeClasse()`

- **modificadores de acesso**, eles auxiliam no encapsulamento de c�digo. Um modificador public permite que todos fora da classe possa ver o m�todo(Mtd) ou atributo(Attr), j� um private n�o permite que ninguem de fora da classe veja o Mtd ou Attr. (mais pra frente ser� visto o protected - � relacionado com heran�a -.)

- Para declarar um construtor em uma classe � necess�rio utilizar o mesmo nome que a classe tem em um "m�todo publico".
  ```Java
  class MinhaClasse {
  	// esse � o contrutor
  	public MinhaClasse(String passeParametros) {
  	
  	}
  }
  ```
  - nessa classe, quando instanciar ela � necess�rio que passe um argumento que seja do tipo String.
  - note que n�o � necess�rio passar o tipo de um retorno pois ele **� um contrutor**, **N�O � um m�todo**.
  - normalmente s�o definidos como public, mas em alguns casos podem ter o modificador de acesso private.
  
- **especificador de formato** 
  - `%.2f` : serve para especificar formatos com ponto flutuante. O `.2` serve para especificar quantos digitos eu quero ap�s o ponto flutuante (ele pode ser alterado para outros n�meros tambem).
  