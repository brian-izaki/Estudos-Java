# Métodos: um exame mais profundo

Classes relacionadas são agrupadas em **pacotes** (podem ser importadas e reutilizadas) <br/>
- Dividir um programa em métodos e classes torna o programa mais fácil de ser depurado e mantido.
- Um método que realiza apenas uma tarefa é mais fácil de ser utilizado e testado.
- Relação hierárquica de chamada de métodos. Pense na seguinte analogia:
  - um Chefe possui uma tarefa a ser cumprida, para que ele não se sobrecarregue, ele delega uma tarefa para cada trabalhador,
    e esses trabalhadores executam e retornam o resultado para o chefe.
  - na analogia acima, o chefe é o chamador, os trabalhadores são os métodos, e cada método retorna algo.
  
## Métodos
- o retorno de um método pode ser no máximo de 1 valor, mas esse valor pode ser um objeto (um objeto pode contar varios valores)
- ao declarar um parâmetro deve sermpre especificar o tipo dele (para cada parametro). <br/> 
  `public void nomeCompleto(String nome, String sobrenome)`
- métodos static não podem acessar métodos e variaveis de instância.
- apenas deve-se declarar um método dentro de uma classe. **Declarar um método dentro d outro é um erro de sintaxe**
  
- métodos podem ser chamados de diferentes maneiras:
  - um método principal que vai chamar outros métodos.
  - pelo método de classe (precisam apensa d uma classe para ser chamado).
  - pelo método de instância (precisam de um objeto para poder ser chamado).

## Chamada de métodos
- o funcionamento da chamada de métodos segue a ideia da Pilha na estrutura d dados.
  - cada chamada de método é adicionada na pilha e qnd uma delas realizar o retorno final vai tirando as chamadas.
  - além disso, cada chamada tbm tem as variaveis em memória, elas são chamadas de quadros de pilha. 
  - no momento que uma chamada é retirada, esse quadro tbm some e o garbage colector do java exclui elas.
- promoção de argumentos - momento que um método espera receber um tipo, mas é passado outro, nesse momento é feito uma conversão de tipo
  - PORÉM, nem com todos os tipos é possível e isso pode levar a erros. isso ocorre para que não haja perda de dados.

## Método Static
O **método static** (também chamado de método de classe), possuem a seguinte estrutura ao ser chamado:
`Classe.método(args)` 
<br/>
Para criar será: 
```Java
class ClasseTeste {
  public static void main(String[] args) {
    String naoInstanciei = ClasseEstatica.nomeMetodo();
  }
}

class ClasseEstatica {
  public String olaMundo() {
      return nomeMetodo();
    }

  public static String nomeMetodo() {
      return "será retornado sem precisar instanciar essa classe";
    }
}
```
  - um método static pode ser chamada dentro da própria classe sem chamar a classe novamente.
  - se o método de uma classe é static, é possível chamar ela sem instanciar essa classe.

Um exemplo dele é o método `pow` da classe Math. (_obs: todos os métodos da classe Math são estáticos_)

- Variáveis static (ou de classe)
  - são variáveis que mantém constante seu valor independente do que foi preenchido no objeto.
  - essa variável terá o mesmo valor em objetos diferentes.
  

## concatenação
- utilizar o `+` com duas Strings faz juntar e criar um novo objeto String. ex: `"nome" + " é"` se torna `"nome é"`
- ao tentar concatenar uma String com outros tipos, o resultado do outro tipo se torna String.
  - isso é por causa do método `toString()` que está presente em todos os tipos primitivos (ele retorna uma 
    representação em string do objeto).
  - esse método é chamado implicitamente qnd é tentado fazer uma concatenação.
  

## Referências
- Pacotes (packages) nativos da: 
    - [Java API 8](https://docs.oracle.com/javase/8/docs/api/)
    - [Java API 10](https://docs.oracle.com/javase/10/docs/api/overview-summary.html)