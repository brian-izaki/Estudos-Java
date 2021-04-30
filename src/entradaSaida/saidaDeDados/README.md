# Saída de dados

O método main é quem irá executar um programa Java, sem ela a aplicação não executa.

- O objeto `System.out` é conhecido como **objeto de saída padrão**.
  - métodos:
    - `.println("texto")`: digita no terminal e posiciona o cursor na proxima linha;
    - `.print("mais um")`: igual ao método anterior, com a diferença que irá posicionar o cursor no final do caracter de texto.
    - `.printf("%s", "vai substituir")`: Cria um formato de texto (pensar no template string do JavaScript). O "f" significa formato. A `%s` é um **especificador de formato** 
      - "%s": String
      - "%d": integer
      - "%f": double
      - "%b": boolean
      - "%c": char
    - 