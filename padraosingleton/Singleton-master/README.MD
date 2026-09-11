# Padrão Singleton

Implementação do padrão de projeto Singleton em Java.

## Sobre o projeto

O projeto apresenta uma implementação do padrão Singleton utilizando a classe `ParametrosMusica`.

O Singleton garante que exista apenas uma instância da classe durante a execução da aplicação.

## Funcionalidades

- Armazenamento da música atual
- Armazenamento do volume
- Armazenamento do cantor
- Garantia de uma única instância da classe

## Testes

Foram implementados testes utilizando JUnit para verificar:

- Música atual
- Volume
- Cantor
- Retorno da mesma instância do Singleton

## Diagrama de Classes

lasse: Singleton

Atributos:

instance: ParametrosMusica
musicaAtual: String
volume: int
cantor: String

Métodos:

ParametrosMusica()
getInstance(): ParametrosMusica
getMusicaAtual(): String
setMusicaAtual(musicaAtual: String)
getVolume(): int
setVolume(volume: int)
getCantor(): String
setCantor(cantor: String)