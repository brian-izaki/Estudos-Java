# Sa�da de dados

O m�todo main � quem ir� executar um programa Java, sem ela a aplica��o n�o executa.

- O objeto `System.out` � conhecido como **objeto de sa�da padr�o**.
  - m�todos:
    - `.println("texto")`: digita no terminal e posiciona o cursor na proxima linha;
    - `.print("mais um")`: igual ao m�todo anterior, com a diferen�a que ir� posicionar o cursor no final do caracter de texto.
    - `.printf("%s", "vai substituir")`: Cria um formato de texto (pensar no template string do JavaScript). O "f" significa formato. A `%s` � um **especificador de formato** 
      - "%s": String
      - "%d": integer
      - "%f": double
      - "%b": boolean
      - "%c": char
    - 