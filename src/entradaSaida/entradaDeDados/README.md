# Entrada de dados

Aqui ser� visto o uso de vari�veis e um c�lculo de soma que o usu�rio digita no terminal 2 numeros

- **Declara��o de vari�veis**
  - No Java **deve** declarar a vari�vel com o tipo e nome dela.
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

- **Operadores aritm�ticos**
  - Quando � feito uma divis�o de valores inteiros, ele n�o ir� mostrar restos nem arredondar os valores. ex: 7 / 4 = 1.75, mas iria ser armazenado 1 na vari�vel.

- **Tomada decis�o (condi��es)**, retornam booleanos
  - operadores de igualdade:
    - `"a" == "a"`: os valores s�o iguais?
    - `"a" != "a"`: os valores s�o diferentes?
  - operadores relacioais:
    - `>`: � maior que...
    - `<`: � menor que...
    - `>=`: � maior ou igual que...
    - `<=`: � menor ou igual que...
    
- Anota��es:
  - O objeto `Scanner` est� sendo utilizado para poder haver intera��o do usuario com o terminal (nesse caso adicionar numeros).
    - os n�meros est�o sendo salvos na vari�vel com o m�todo `.nextInt()`. (existem outros "next" que capturam outros tipos dedados)
    