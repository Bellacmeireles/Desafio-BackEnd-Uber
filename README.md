# Email Microservice
## Uber Backend Challenge

This challenge was made together with the video of 
Fernanda Kipper
To access the material, click on the link -> [Uber Backend Challenge](https://github.com/uber-archive/coding-challenge-tools/blob/master/coding_challenge.md).         
This project is an API built using **Java, Java Spring, AWS Simple Email Service.**

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)


## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)

## Installation

1. Clone the repository:

```bash
git clone https://github.com/Bellacmeireles/Desafio-BackEnd-Uber.git
```

2. Install dependencies with Maven

3. Update `application.properties` puting your AWS Credentials

```yaml
aws.region=us-east-1
aws.accessKeyId=1111111
aws.secretKey=111111
```
## Usage

1. Start the application with Maven
2. The API will be accessible at http://localhost:8080

## API Endpoints
The API provides the following endpoints:

**GET EMAIL**
```markdown
POST /api/email/send - Send a e-mail from your sender to the destination
```

**BODY**
```json
{
  "to": "use seu email",
  "subject": "teste",
  "body": "teste"
}
```
<br>

### More challenges available at the link -> [Uber Challenge](https://github.com/uber-archive/coding-challenge-tools/blob/master/coding_challenge.md).   
