# Entrada de dados

Aqui será visto o uso de variáveis e um cálculo de soma que o usuário digita no terminal 2 numeros

- **Declaração de variáveis**
  - No Java **deve** declarar a variável com o tipo e nome dela.
    ```Java
    String nome = "nome da variavel";
    int numero = 23;
    boolean hasCat = false;
    
    Scanner input;
    ```
    - o tipo de uma variavel pode variar, sendo que existem os **tipos primitivos** do Java:
      - boolean
      - byte
      - char
      - short
      - int
      - long
      - float
      - double

- **Operadores aritméticos**
  - Quando é feito uma divisão de valores inteiros, ele não irá mostrar restos nem arredondar os valores. ex: 7 / 4 = 1.75, mas iria ser armazenado 1 na variável.

- **Tomada decisão (condições)**, retornam booleanos
  - operadores de igualdade:
    - `"a" == "a"`: os valores são iguais?
    - `"a" != "a"`: os valores são diferentes?
  - operadores relacioais:
    - `>`: é maior que...
    - `<`: é menor que...
    - `>=`: é maior ou igual que...
    - `<=`: é menor ou igual que...
    
- Anotações:
  - O objeto `Scanner` está sendo utilizado para poder haver interação do usuario com o terminal (nesse caso adicionar numeros).
    - os números estão sendo salvos na variável com o método `.nextInt()`. (existem outros "next" que capturam outros tipos dedados)
    