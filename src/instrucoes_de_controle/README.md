# Instruções de controle

> primeiro, faça código simples e correto; então, torne-o rápido e pequeno, mas apenas se necessário.
> -Deitel

## Anotações

O Java possuí três tipos de instruções de controle (instrução de sequência, instruções de seleção e instruções de
repetição)

- **Instrução em sequência**
    - são os códigos que são executados linha em linha (uma em sequência outra).

- **Instruções de seleção**
    - `if` - (ver dir student)
    - `if...else` - (ver dir student)
        - pode ser feito um ternário com `?:`
          ```
           condição ? true : false
          ```
    - `switch`
        - na declaração Switch é feito uma comparação e para cada caso dessa comparação pode ser feito algo diferente
          ```
           switch (nota / 10) {
                case 9: // o 9 é um caso que se junta com o abaixo. 9 AND 10.
                case 10:
                    // diz tchau
                    break;
                case 8:
                    // diz ola
                    break;
                default: 
                    // executa qnd não os casos acima
                    break;
           }
          ```
          - os valores de cada `case` devem ser representados por: char, inteiros, Strings e valores constates (Enum) apenas; 
        - Em outra anotação sobre polimorfismo, será apresentado forma mais legível de implementar o switch.
        
- **Instruções de repetição (iteração ou instrução de loop)**
    - `while` - (ver dir classAverage)
    - `do...while`
    - `for` (existem for aprimorados)

<br/>

- Repetição controlada por contador (repetição definida)
    - é a técnica que realiza um loop e utiliza uma variável com um contador.
    - Geralmente este tipo utiliza a instrução `for`.
    - ver student_approved.

- Repetição controlada por sentinela (valor de flag) ou repetição indefinida.
    - A sentinela (flag) é quem vai parar a execução do loop. Como pode ser visto em `ClassAverageSentinela`, a nossa
      flag foi o valor `-1`. 
    - Geralmente é utilizado com a instrução `while`.
    - Ver ClassAverage, a flag é -1. 

<br/>

**Truncamento**: perde os valores após o ponto flutuante, ex: 1 / 2 = 1,5 se for truncado será 1 (,5 é perdido) <br/>

**Estouro Aritmético**: O tipo `int` possui um limite, caso chegue nesse limite ocorre o erro de `Integer_overflow`,
para evitar isto, dê uma olhada
no [CERT “NUM00-J”](https://wiki.sei.cmu.edu/confluence/display/java/NUM00-J.+Detect+or+prevent+integer+overflow) <br/>

**Precisão dos tipos**: os tipos flutuantes `float` não representam valores precisos, o tipo `double` possui maior precisão. Para realizar
cálculos que necessitem valores precisos o Java fornece o `BigDecimal` do `Java.Math`. <br/>

**Conversão explícita e implícita**: Java traz o operador unário de coerção `(tipagem)`

  ```Java
public class exemplo {
    public void media() {
        int n1 = 1;
        int n2 = 2;

        // operador unário de coerção
        //          |____
        //              |
        //              v
        double media = (double) n1 / n2;
    }
}
  ```

- no exemplo acima o `(double)` realiza uma conversão momentânea do `n1` de tipo int para o double, esta é a **forma
  explícita**. Como o Java necessita de dois tipos iguais para realizar operações, na variável `n2` ocorre uma **
  conversão Implícita** do tipo para ser double, isto é **conhecido como promoção**. <br/>
  _obs: a promoção ocorre nas variáveis que sejam possíveis serem convertidas pelo tipo do unário, do contrário, pode
  resultar em erros de compilação._ <br/>

**Break e Continue**
- **Instrução break**: além de ser utilizado no switch, ele também pode ser visto em estruturas de repetição como while e for.
ele faz com que saia do loop imediatamente, não executando as outras iterações nem as instruções
após ele dentro do loop.
    ```Java
    public class Exemplo {
        
        public void exemploBreak() {
            for (int i = 0; i < 5; i++) {
                if (i == 2)
                    break;
                
                System.out.println("aparece uma vez!");
            }
        }
        
    }
    ```
    - no código acima, o loop será parado qnd o indice for 2.
    - no momento que parar, ele não executa os códigos do loop seguintes nem as outras iterações.
    
- **Instrução continue**: dentro das instruções for e while ele pula as próximas instruções e vai 
para a outra iteração. (diferente do break que para os dois)
    ```Java
    public class Exemplo {
        
        public void exemploContinue() {
            for (int i = 0; i < 5; i++) {
                if (i == 2)
                    continue;
                
                System.out.println("Bazinga!");
            }
        }
        
    }
    ```
    - neste código, quando a iteração estiver no 2, ele não irá printar "Bazinga!".
    - vai continuar o loop normalmente após o índice 2.
---

- Operadores
    - Atribuição compostos:
        - Servem para abreviar expressões. ex:
            ```
            contador = contador + 3;
          
            // com atribuição composta da soma
            contador += 3;
            ```
            - Podem ser utilizados os outros operadores `/, *, -, %`.
        
    - Incremento e decremento
        - são operadores unários para adicionar 1 ou subtrair 1 do valor de uma variável.
            ```
            int v1 = 1
            v1++ // seria v1 += 1 e imprimiria 1
            ```
        - Deve-se prestar atenção na ordem que o unário se apresenta. Quando estiver antes da 
          variável chama-se **pré-incremento**, ele **adiciona 1 antes dela ser utilizada**.
            ```
            ++v1 // imprimiria 2
            ```
        - o incremento e pré-incremento qnd estão isolados fazem a msm coisa. Apenas haverá diferença
          quando estiverem numa expressão.
          
---

- GUI para desenhar
    - Sistema de coordenadas: 
        - Deve-se imaginar um plano cartesiano. Na qual o canto superior esquerdo da aplicação é o ponto (0, 0).
    - Foi extendido o JPanel para criar uma subclasse que pudesse implementar as linhas formando um X.
      - Todo JPanel tem o método `paintComponent` (o sistema chama automaticamente). Esse método é executado sempre que 
        houver uma manipulação no visual da aplicação.
      - É necessário sempre passar o objeto Graphics, ele será o responsável por desenhar linhas, quadrados, etc na tela.
    - no teste para executar, foi utilizado o JFrame para criar um quadro que permite pintar o painel feito.

    