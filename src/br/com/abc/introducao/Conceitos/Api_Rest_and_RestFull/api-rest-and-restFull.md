# API, REST AND RESTFULL

###``API``

<br>

- Cliente (client)
  - pode ser seu app ou sua página na web.
- Garçon (pegar os pedidos, levar seus pedidos, para a cozinha)
- Cozinha (server)

<br>

```shell script
  Acronimo de Application Programming Interface (Interface de Programação de Aplicações)
é basicamente um conjunto de rotinas e padrões estabelecidos por uma aplicação, para
que outras aplicações possam utilizar as funcionalidades desta aplicação.
 
 -Ela é responsável por estabelecer comunicação entre diferentes serviços.
 -É um meio de campo entre as tecnologias.
 -É um intermediador para troca de informações.
```

<br>

###``Rest``

<br>

 - Rest determina alguns padões de como será feita esta comunicação.
 - Tranferência de dados, geralmente, utilizando o protocolo HTTP.
 - Ser restful é você cumprir os padrões rest.

<br>

```shell script
    Acronimo para REpresentational State Transfer (Transferência de Estado Representativo).
  Será feita a tranferência de dados de uma maneira simbólica, figurativa, de maneira didática.
  O Rest, delimita algumas obrigações nessas transferências de dados. 
```

## 6 necessidades (constraints) para ser RESTful

<br>

 - `_Interface uniforme_`: Como o próprio nome da restrição se aplica, você DEVE decidir 
a interface das APIs para os recursos dentro do sistema que são expostos aos consumidores 
da API e seguem religiosamente. Um recurso no sistema deve ter apenas um URI lógico e isso 
deve fornecer uma maneira de buscar dados relacionados ou adicionais. É sempre melhor 
sinonimizar um recurso com uma página da web. Qualquer recurso único não deve ser muito grande 
e conter tudo e todos em sua representação. Sempre que relevante, um recurso deve conter links 
(HATEOAS) apontando para URIs relativos para buscar informações relacionadas. Além disso, as 
representações de recursos em todo o sistema devem seguir diretrizes específicas, como convenções 
de nomenclatura, formatos de link ou formato de dados (XML e/ou JSON). Todos os recursos devem 
ser acessíveis por meio de uma abordagem comum, como HTTP GET, e modificados de maneira semelhante 
usando uma abordagem consistente. Assim que um desenvolvedor se familiarizar com uma de suas APIs, 
ele poderá seguir uma abordagem semelhante para outras APIs.

<br>

 - `_Client-server_`: Separação do cliente e do armazenamento de dados (servidor). Dessa forma,
poderemos ter uma portabilidade do nosso sistema, usando o React para web e React native
para o smartphone, por exemplo.

<br>

 - `_Stateless_`: Cada requisição que o cliente faz para o servidor, deverá conter todas as
informações necessárias para o servidor entender e responder (RESPONSE) a requisição (REQUEST).
Exemplo: a sessão do usuário deverá ser enviada em todas as requisições, para saber se aquele 
usuário está autenticado e apto a usar os serviços, e o servidor não pode lembrar que o cliente 
foi autenticado na requisição anterior. Podemos utilizar tokens para autenticar esta comunicação.
 
<br>

  - `_Cacheable_`: As respostas para uma requisição, deverão ser explicitadas ao dizer se aquela
requisição, pode ou não ser cacheada pelo cliente.

<br>

  - `_Layered System_`: O cliente acessa a um endpoint, sem precisar saber da complexidade, de
quais passos estão sendo necessários para o servidor responder a requisição, ou quais outrar 
camadas o servidor está lidando, para que a requisição seja respondida. 

<br>

  - `_Code on demand (optional)_`: Dá a possibilidade da nossa aplicação pegar códigos, como o 
javaScript, por exemplo, e executar no cliente.

## Praticas

### `Verbos HTTP`

 - `GET`: Receber dados de um Resource.
 - `POST`: Enviar dados ou informações para serem processados por um Resource.
 - `PUT`: Atualizar dados de um Resource.
 - `DELETE`: Deletar um Resource.

Onde por exemplo, esta minha URL: `http://localhost:3000/clients` é meu endpoint e o `/clients` é meu Resource.



