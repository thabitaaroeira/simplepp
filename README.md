Fonte: https://github.com/PicPay/picpay-desafio-backend/blob/main/readme.md

# Desafio Back-end – Estudo Técnico

Bem-vindo! Este é um projeto de estudo baseado em um desafio técnico para back-end. A seguir estão os detalhes e requisitos para desenvolvimento e avaliação.

---

## ✅ Instruções Gerais

- Leia tudo com atenção e siga as instruções.
- Suba o projeto em um repositório **sem mencionar PicPay**.
- Faça commits claros e envie o link ao recrutador.
- Pode usar Google, StackOverflow ou projetos pessoais como referência.
- Consulte os [materiais úteis](#materiais-úteis).
- Veja como será a [entrevista técnica](#entrevista-técnica).
- Em caso de dúvidas, pergunte!

### Envio por e-mail

```
Seu nome  
Nome do recrutador  
Link do repositório  
Link do LinkedIn
```

---

## 🧪 Ambiente de Desenvolvimento

- Use qualquer framework com o qual se sinta confortável (ou nenhum).
- Caso não use framework, implemente via script.
- Evite métodos mágicos e abstrações automáticas — queremos ver **seu código**.
- Contêineres personalizados são bem-vindos.

---

## 🎯 Objetivo

Criar uma API de pagamentos simplificada com transferências entre dois tipos de usuários:

- **Comuns**: podem enviar e receber dinheiro.
- **Lojistas**: **só recebem**, não enviam.

---

## 📜 Requisitos

- Cadastro de usuários com `nome`, `CPF`, `e-mail`, `senha`. CPF e e-mail devem ser únicos.
- Transferências entre usuários e para lojistas.
- Lojistas não podem transferir valores.
- Validar saldo antes de transferir.
- Consultar autorização externa via:  
  `GET https://util.devi.tools/api/v2/authorize`
- Transferência deve ser transacional (reversível em caso de erro).
- Enviar notificação (email/sms) após transferência via:  
  `POST https://util.devi.tools/api/v1/notify`
- A API deve ser **RESTful**.

> Tudo que for possível implementar, será considerado. O que não for feito pode ser discutido na entrevista.

---

## 🔁 Exemplo de Endpoint de Transferência

```http
POST /transfer
Content-Type: application/json

{
  "value": 100.0,
  "payer": 4,
  "payee": 15
}
```

> Pode propor outro formato se desejar.

---

## 💬 Entrevista Técnica

- Tenha a aplicação rodando localmente no dia.
- Faremos uma revisão de código juntos, como se já fôssemos colegas de time.
- Fale sobre suas decisões e ideias de melhoria.

---

## 🧪 O que será avaliado

### Essencial

- Código limpo e organizado  
- Uso do Git  
- Conhecimento de REST  
- Capacidade analítica  

### Diferenciais técnicos

- Aderência a PSRs / boas práticas  
- Aplicação de SOLID e Design Patterns  
- Uso de cache e containers (Docker, Podman)  
- Testes (unitários e integração)  
- Propostas de melhoria  
- Boas práticas com banco de dados relacional  

### Alta qualidade (desejável)

- Observabilidade  
- CI (integração contínua)  
- Bancos não-relacionais  
- Arquiteturas modernas (CQRS, microserviços, etc)  
- Mensageria e escalabilidade  
- Análise estática (PHPStan, PHPMD etc)  
- Conhecimento em PHP assíncrono  

---

## 🚫 O que **não será avaliado**

- Fluxo de cadastro de usuários/lojistas  
- Frontend  
- Autenticação  

---

## 🌟 Diferenciais

- Uso de Docker  
- Boa cobertura de testes  
- Uso de Design Patterns  
- Documentação clara  
- Propostas arquiteturais  
- Argumentação técnica  
- Boas práticas de modelagem e segurança  
- Código desacoplado (camadas, services, repositórios)  

---

## 🛠️ Boas Práticas

- PHP: siga as [PSRs](https://www.php-fig.org/psr/psr-12/)
- Outras linguagens: siga as boas práticas da comunidade

### PHPMD

Ferramenta sugerida para análise estática:

```bash
docker run -it --rm -v $(pwd):/project -w /project jakzal/phpqa phpmd app text cleancode,codesize,controversial,design,naming,unusedcode
```

---

## 📚 Materiais Úteis

- [Sobre o PicPay](https://picpay.com/site/sobre-nos)  
- [Design Patterns – Packt](https://hub.packtpub.com/why-we-need-design-patterns/)  
- [Refactoring Guru](https://refactoring.guru/)  
- [PHP: The Right Way](http://br.phptherightway.com/)  
- [PSR-12](https://www.php-fig.org/psr/psr-12/)  
- [Tipos de Testes – Atlassian](https://www.atlassian.com/continuous-delivery/software-testing/types-of-software-testing)  
- [Ferramentas de Análise Estática – Exakat](https://github.com/exakat/php-static-analysis-tools)  
- [Microservices – Martin Fowler](https://martinfowler.com/articles/microservices.html)  
- [Guzzle HTTP Options](https://docs.guzzlephp.org/en/stable/request-options.html)  
- [REST Tutorial – DevMedia](https://www.devmedia.com.br/rest-tutorial/28912)
