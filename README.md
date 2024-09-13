# Generation QRCode

Um gerador de QRCode usando Spring Boot e dependência "com.google.zxing" do Maven Central Repository, ele é uma aplicação web que pode criar e exibir QRCode para vários tipos de dados.
Os QRCodes são códigos de barras bidimensionais que podem armazenar grandes quantidades de informações em um espaço pequeno. Eles podem ser digitalizados por smartphones ou outros dispositivos para acessar os dados codificados.

Para criar um gerador de QRCode usando o Spring Boot e a dependência com.google.zxing, você precisará seguir estas etapas:

1. Crie um projeto Spring Boot usando start.spring.io e adicione `spring-boot-starter-web` e `com.google.zxing` do repositório Maven, dependências ao arquivo `pom.xml`.
2. Adicione as dependências `com.google.zxing:core` e `com.google.zxing:javase` ao arquivo pom.xml. Estas são as bibliotecas que fornecem a funcionalidade para gerar e ler códigos QR.
3. Crie uma classe chamada QRCodeGenerator que tenha dois métodos estáticos: um para gerar uma imagem de código QR e salvá-la em um caminho especificado e outro para gerar um código QR como uma matriz de bytes.
4. Crie uma classe de controladora chamada `QRCodeController` que tenha um método com `@GetMapping` anotação para lidar com as solicitações de geração e exibição de QRCode. Esse método chamará os métodos `QRCodeGenerator` e retornará um arquivo que mostra a imagem do QRCode ou a matriz de bytes.

### Exemplo da requisição
```
  GET /qr/qrcode/{content}
```
```
http://localhost:8080/qr/qrcode/teste
```
#### Resposta esperada

![imagem](https://th.bing.com/th/id/OIP.NDKNbQ-I9ApLLVp-E6HSPwAAAA?rs=1&pid=ImgDetMain.png)

