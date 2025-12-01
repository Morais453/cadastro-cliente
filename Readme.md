# Início de Projeto — Sistema de Cadastro de Clientes

## Primeiro Passo: Criação da Camada de Domínio (Domain Layer)

### O que é?
A camada de domínio é responsável por representar a lógica central do negócio, contendo regras, entidades, serviços e estados totalmente independentes de detalhes técnicos, como banco de dados, interface gráfica ou frameworks externos.
Ela é o coração do sistema, garantindo que a lógica principal seja coesa, reutilizável e testável.

### Funções Principais da Camada de Domínio
#### Lógica de Negócios

Contém as regras essenciais que determinam como o sistema funciona.
Exemplo: regras para aprovar uma proposta financeira, validar dados de um cliente, calcular limites ou verificar elegibilidade.

#### Entidades de Domínio

Define os principais objetos/conceitos que representam o negócio, como:

- Cliente

- Endereço

- Pedido

- Curso

- Proposta financeira

Essas entidades encapsulam atributos e comportamentos importantes.

#### Independência de Infraestrutura

A camada de domínio não deve depender de banco de dados, interface de usuário, APIs externas ou frameworks específicos.
Isso garante flexibilidade, testabilidade e longevidade da lógica.

#### Reutilização da Lógica de Negócios

Ao isolar a lógica de negócio, ela pode ser usada por diversos componentes.
Exemplo:

- Diferentes ViewModels

- APIs

- Aplicações web e mobile

- Scripts de automação