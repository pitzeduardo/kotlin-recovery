### API para recuperação de dívidas

Criando ambiente para recuperações de cobranças em sua empresa através de um robô de voz e plataforma de cobranças. Este projeto, com fim educacinal, busca por evoluir meus conhecimentos com Kotlin e Spring Boot e aplicá-los em um problema real do mercado: inadimplência de clientes.

A ideia aqui é permitir que um cliente seja notificado e, através da TotalVoice, cobrar este cliente através de um robo de voz. O sistema também deve permitir que cobranças sejam negociáveis através da plataforma Asaas.

#### Salvando uma recuperação [Migrar para o Apiary]
POST `http://localhost:8080/api/recovery/`
```json
// request
{
    "value": 1231.20,
    "originDate": "2020-01-29T23:33:31.332Z",
    "description": "Descrição da dívida",
    "debtor": {
	      "publicId": "192y3981",
        "name": "Eduardo Pitz",
        "address": "Rua",
        "addressNumber": "123",
        "neighborhood": "St. Antônio",
        "postalCode": 90218180,
        "ibgeCityCode": 1,
        "complement": "Complemento",
        "state": "SC" 
    }
}
```
```json
// response
{
  "id": 3,
  "error": ""
}
```
