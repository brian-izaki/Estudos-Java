# Métodos: um exame mais profundo

Classes relacionadas são agrupadas em **pacotes** (podem ser importadas e reutilizadas) <br/>
- Dividir um programa em métodos e classes torna o programa mais fácil de ser depurado e mantido.
- Um método que realiza apenas uma tarefa é mais fácil de ser utilizado e testado.
- Relação hierárquica de chamada de métodos. Pense na seguinte analogia:
  - um Chefe possui uma tarefa a ser cumprida, para que ele não se sobrecarregue, ele delega uma tarefa para cada trabalhador,
    e esses trabalhadores executam e retornam o resultado para o chefe.
  - na analogia acima, o chefe é o chamador, os trabalhadores são os métodos, e cada método retorna algo.

## Static
Às vezes queremos utilizar métodos sem a necessidade de instanciar um objeto. 
O **método static** (também chamado de método de classe) são assim, eles possuem a seguinte estrutura:`Classe.método(args)` 
<br/>

Um exemplo dele é o método `pow` da classe Math. (_obs: todos os métodos da classe Math são estáticos_)

- Variáveis static (ou de classe)
  - são variáveis que mantém constante seu valor independente do que foi preenchido no objeto.
  - essa variável terá o mesmo valor em objetos diferentes.
  

## Referências
- Pacotes (packages) nativos da: 
    - [Java API 8](https://docs.oracle.com/javase/8/docs/api/)
    - [Java API 10](https://docs.oracle.com/javase/10/docs/api/overview-summary.html)