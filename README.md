# Projeto de Automação do Site Saucedemo
![swaglabs](./assets/swaglabs.jpeg)
Automação do fluxo de compra do site https://www.saucedemo.com/

## Para executar este projeto é necessário instalar: 
- JDK 8
- IDE Eclipse/IntelliJ

## Dependências configuradas no pom.xml:
- junit 4.12
- cucumber-junit 5.6.0
- cucumber-java 5.6.0
- cucumber-gherkin 5.6.0
- selenium-java 3.141.59

## Execução do projeto:
- Abra o arquivo run.java no caminho src/test/java/runners e na linha 13 referente ao atributo tags, insira o valor "@comprasucesso" para executar o fluxo de compra completo com sucesso

- Abra o arquivo run.java no caminho src/test/java/runners e na linha 13 referente ao atributo tags, insira o valor "@problemacompra" para executar o fluxo de compra com falha

- Abra o arquivo run.java no caminho src/test/java/runners e na linha 13 referente ao atributo tags, insira o valor "@saucedemo" para executar o fluxo de compra com sucesso e em seguida o fluxo com falha

