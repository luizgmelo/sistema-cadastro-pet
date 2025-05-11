<h1 align="center" style="font-weight: bold;">Sistema de Adoção de Pets 💻</h1>

<p align="center">
 <a href="#tech">Tecnologias</a> • 
 <a href="#started">Inicio</a> • 
  <a href="#routes">API Endpoints</a>
</p>

<p align="center">
    <b>Um sistema para controle da adoção de animais.</b>
</p>

<h2 id="technologies">💻 Tecnologias</h2>

- Java 21
- Spring Boot (Spring Web, Spring JPA)
- PostgreSQL


<h2 id="started">🚀 Inicio</h2>

Para rodar o projeto você vai precisar de

<h3>Requisitos</h3>

- Java 21
- Git
- Maven


<h3>Clone</h3>

Clone o repositório utilizando o comando

```bash
git clone https://github.com/luizgmelo/sistema-cadastro-pet.git
```

<h3>Rodando a aplicação</h3>

How to start your project

```bash
cd sistema-cadastro-pet
mvn install
mvn springboot:run
```

<h2 id="routes">📍 API Endpoints</h2>

| rota                  | descrição                                          
|-----------------------|-----------------------------------------------------
| <kbd>GET /pets</kbd>  | lista os pets cadastrados no sistema [response details](#list-pet-details)
| <kbd>POST /pets</kbd> | cadastra um novo pet [request details](#add-pet)

<h3 id="list-pet-details">GET /pets</h3>

**RESPONSE**

```json
[
  {
    "nome": "Scooby",
    "tipo": "CACHORRO",
    "idade": 12,
    "peso": 12.42
  },
  {
    "nome": "Garfield",
    "tipo": "GATO",
    "idade": 20,
    "peso": 16.30
  }
]
```

<h3 id="add-pet">POST /pets</h3>

**REQUEST**
```json
{
  "nome": "Garfield",
  "tipo": "GATO",
  "idade": 20,
  "peso": 16.30
}
```

**RESPONSE**
```json
{
  "message": "Cadastro realizado com sucesso"
}
```