# Instruções de controle

## Anotações

O Java possuí três tipos de instruções de controle (instrução de sequência, instruções de seleção e instruções de
repetição)

- **Instruções de seleção**
    - `if`
    - `if...else`
        - pode ser feito um ternário com `?:`
          ```
           condição ? true : false
          ```
    - `switch`

- **Instruções de repetição (iteração ou instrução de loop)**
    - `while`
    - `do...while`
    - `for` (existem for aprimorados)

<br/>

- Repetição controlada por contador (repetição definida)
    - é a técnica que realiza um loop e utiliza uma variável com um contador.

- Repetição controlada por sentinela (valor de flag) ou repetição indefinida.
    - A sentinela (flag) é quem vai parar a execução do loop. Como pode ser visto em `ClassAverageSentinela`, a nossa
      flag foi o valor `-1`.

<br/>

**Truncamento**: perde os valores após o ponto flutuante, ex: 1 / 2 = 1,5 se for truncado será 1 (,5 é perdido) <br/>

**Estouro Aritmético**: O tipo `int` possui um limite, caso chegue nesse limite ocorre o erro de `Integer_overflow`,
para evitar isto, dê uma olhada
no [CERT “NUM00-J”](https://wiki.sei.cmu.edu/confluence/display/java/NUM00-J.+Detect+or+prevent+integer+overflow) <br/>

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
  
**Precisão dos tipos**: os tipos flutuantes `float` não representam valores precisos, o tipo `double` possui maior precisão. Para realizar 
cálculos que necessitem valores precisos o Java fornece o `BigDecimal` do `Java.Math`. <br/>
  

  


