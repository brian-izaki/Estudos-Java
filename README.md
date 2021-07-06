# Estudos sobre a linguagem Java

Os estudos foram feitos vendo a documentação e principalmente seguindo o livro "Java Como programar" dos autores Paul e
Harvey Deitel.

## Recursos necessários

- JDK (ou openJdk) instalada e configurado o JAVA_HOME nas variaveis de ambiente do PC (eu utilizei a versão 1.8)

---

## Sumario dos estudos

- **EntradaSaida**: Comportamentos da saida de dados com o objeto `System.out` e entrada com `System.in`. Além de ver
  sobre a **declaração de variáveis** e os **tipos de dados**.

## Anotações gerais

- letra "T" (por convenção) nas documentações: significa espaço reservado, ele pode ser substituído pelo tipo que
  desejar.
    - ele significa que a classe é genérica.
    - apenas tipos NÃO primitivos podem substituir o "T", para utilizar os tipos primitivos o Java fornece mecanismo
      chamado boxing que empacota eles e os torna em Objetos. `int` se torna `Integer`
- notação de losango `<>` é usado quando for instanciar classes genéricas:
  ```
  ArrayList<String> items = new ArrayList<>();
  ```
    - nota-se que o losango está vazio, e isto é permitido, pois, o compilador determina o tipo pela variável, isso é
      chamado de **inferir o tipo de elemento**, assim, evitando repetição.
- Static
    - são métodos que não tem necessidade de instanciar uma classe para poder utilizar ele. ex: `Math.pow(2, 3)`
- final
    - declara uma constante, ou seja, seu valor não poderá ser alterado depois que for inicializado.
    - Caso passe uma variável, no momento que ela receber um valor, esse valor será considerado a constante.

---

### REFERÊNCIAS

- [open JDK](https://adoptopenjdk.net/index.html?variant=openjdk8&jvmVariant=hotspot) (versão openSource)
  ou [Java JDK](https://www.oracle.com/br/java/technologies/javase-downloads.html) (versão da Oracle)
- [Documentação das versões do Java SE](https://docs.oracle.com/en/java/javase/index.html) (ao clicar nos links, procure
  por "API documentation")
- livro [Java como programar](https://www.amazon.com.br/Java%C2%AE-como-programar-Paul-Deitel/dp/8543004799)
- Diretrizes para um código
  seguro [CERT](https://wiki.sei.cmu.edu/confluence/display/java/SEI+CERT+Oracle+Coding+Standard+for+Java)