# Repositório de Padrões de Projeto

Este repositório contém implementações de vários padrões de projeto. Abaixo está um breve resumo de cada padrão, juntamente com um exemplo de uso.

## Adapter (Adaptador)
**Intenção:** Permite que interfaces incompatíveis trabalhem juntas, convertendo a interface de uma classe em outra que os clientes esperam.

**Exemplo de Uso:** Adaptar a interface de um sistema legado para funcionar com um novo sistema sem modificar o código legado.

## Decorator (Decorador)
**Intenção:** Anexa responsabilidades adicionais a um objeto dinamicamente, oferecendo uma alternativa flexível ao uso de subclasses para estender funcionalidades.

**Exemplo de Uso:** Adicionar diferentes tipos de bordas a componentes de interface gráfica (GUI) sem alterar o código deles.

## Facade (Fachada)
**Intenção:** Fornece uma interface simplificada para um subsistema complexo, facilitando seu uso.

**Exemplo de Uso:** Simplificar a interação com um sistema de home theater, fornecendo uma interface única para controlar o DVD player, projetor, sistema de som e iluminação.

## Factory (Fábrica)
**Intenção:** Define uma interface para criar um objeto, mas permite que subclasses alterem o tipo de objetos que serão criados.

**Exemplo de Uso:** Criar diferentes tipos de documentos (por exemplo, Word, Excel) sem especificar suas classes concretas.

## Singleton (Singleton)
**Intenção:** Garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a ela.

**Exemplo de Uso:** Gerenciar um objeto de configuração global para uma aplicação.

## Observer (Observador)
**Intenção:** Define uma dependência um-para-muitos entre objetos, de modo que quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente.

**Exemplo de Uso:** Implementar um sistema de publicação/assinatura onde múltiplos assinantes precisam ser atualizados quando um evento ocorre.

## Proxy (Proxy)
**Intenção:** Fornece um substituto ou placeholder para outro objeto para controlar o acesso a ele.

**Exemplo de Uso:** Implementar inicialização preguiçosa, onde um objeto é criado apenas quando é acessado pela primeira vez.

## Strategy (Estratégia)
**Intenção:** Define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis. Permite que o algoritmo varie independentemente dos clientes que o utilizam.

**Exemplo de Uso:** Implementar diferentes algoritmos de ordenação que podem ser trocados em tempo de execução.

## Template (Template)
**Intenção:** Define o esqueleto de um algoritmo em um método, delegando alguns passos para subclasses. Permite que subclasses redefinam certos passos de um algoritmo sem mudar sua estrutura.

**Exemplo de Uso:** Criar um framework para um pipeline de processamento de dados onde passos específicos do processamento podem ser personalizados por subclasses.

## Visitor (Visitante)
**Intenção:** Representa uma operação a ser realizada em elementos de uma estrutura de objetos, permitindo definir uma nova operação sem mudar as classes dos elementos sobre os quais opera.

**Exemplo de Uso:** Adicionar operações a uma estrutura de objetos composta (por exemplo, um sistema de arquivos) sem alterar as classes que representam arquivos e diretórios.

## Como Usar
Cada diretório contém um ou mais exemplos de implentação.

