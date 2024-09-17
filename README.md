<h1> Verificador de Senhas </h1>

<h2> Descrição do Projeto </h2>

**Explicação e instruções do programa:**

O programa simula um verificador de requisitos para a criação de senhas que sejam mais complexas e, consequentemente, mais seguras e de difícil acesso a terceiros desconhecidos/não-autorizados.

Sempre que iniciado, o prompt solicitará uma senha ao usuário.

A senha será considerada inválida e o programa continuará rodando caso a entrada não cumpra os seguintes requisitos mínimos:

• Tamanho da senha: 10

• Quantidade de letras: 5

• Quantidade de números: 3

• Quantidade de símbolos: 2

Se a senha não compreender pelo menos 1 letra maíscula e 1 letra minúscula, ela será reprovada.

Caso o usuário cumpra os requisitos necessários para a criação de uma senha considerada segura, o programa será finalizado.

___

**Explicação do código:**

Para capturar as entradas do usuário, foi usada a classe Scanner.

Toda a estrutura do programa está inserida dentro de uma estrutura de repetição do-while com uma condição do tipo boolean chamada "ok" que é iniciada com o valor "false", pois enquanto a senha não cumprir os requisitos mínimos a senha é inválida; ou seja, "false". Enquanto a entrada do usuário não for uma senha que cumpra com os requisitos a condição não estará satisfeita e a estrutura de repetição do-while continuará rodando o programa. Caso a entrada inserida pelo usuário cumpra com os requisitos necessários para uma senha forte e segura, o valor do boolean "ok" será invertido para "true" e o programa finalizado.

Para verificar a quantidade de caracteres inseridos de cada requisito necessário da senha foi utilizado a estrutura de repetição for, com condicionais if's em seu interior para limitar cada interação com sua especificidade e o método charAt() para passar pela entrada do usuário e verificar cada um dos caracteres individualmente.

Os símbolos (caracteres especiais) tiveram de ser armazenados em uma String, pois não há dimensões que limitem esses caracteres (como o alfabeto, que vai de "a" a "z", ou o sistema numérico, que vai de 0 a 9) e a Tabela ASCII compreende esses símbolos de forma não-sequencial, impossibilitando, portanto, com que haja abordagens mais lógicas do que compreender esses caracteres em uma String. Para verificar a existência desses caracteres especiais na entrada do usuário foi necessário criar um for dentro do for que percorre os if's das demais condições da senha; do contrário, não será possível contabilizá-los adequadamente.

Por fim, para verificar se a quantidade de caracteres inseridos e seu conteúdo respeitam os requisitos mínimos para a senha foram utilizados operadores ternários.

___

<h2> Habilidades adquiridas: </h2>

Esse projeto, de modo geral, me proporcionou uma maior visão e compreensão acerca da importância da criação de senhas fortes e imprevisíveis em situações que demandam maior segurança, pois é mais difícil de descobrí-las intuitivamente ou decodificá-las, eventualmente, de algum modo. Consolidei, por meio da prática, o conhecimento acerca da construção de operadores ternários (if-else em sintaxe de apenas uma linha); da utilização do método charAt(); da versatilidade da estrutura de repetição for.

<h2> Habilidades requisitadas: </h2>

Para (re)criar esse projeto você necessitará consolidar e aplicar certos conhecimentos específicos:

1. Declaração de variáveis e tipos primitivos (tipos utilizados: int e boolean)
2. Estruturas de repetição (estruturas utilizadas: do-while e for)
3. Estruturas condicionais (estrutura utilizada: if-else)
4. Operadores ternários (estrutura utilizada: if-else em sintaxe de apenas uma linha ((expressão booleana) ? código 1 : código 2))
5. Operadores de igualdade (operadores utilizados: == e !=)
6. Operadores relacionais (operadores utilizados: >, < e >=)
7. Operadores de atribuição composta (operadores utilizados: += e -=)
8. Operador de incremento (operador utilizado: ++ (pós-incremento))
9. Aplicação de métodos (método utilizado: charAt())
10. Declaração de Strings
11. Importação e aplicação da classe Scanner

<h2> Linguagens Utilizadas: </h2>

- <b> Java 17 </b> 

<h2> Ambiente utilizado: </h2>

- <b> Windows 11 </b>
- <b> IntelliJ IDEA </b>

<h2> Ilustrações do programa: </h2>

<p align="center">
Tela inicial solicitando uma senha ao usuário: <br/> <br/>
<img src="https://imgur.com/1dQwwW9.png" height="80%" width="80%" alt="Disk Sanitization Steps"/>
<br/>
<br/>
Exemplo de caso de senha fraca (não cumprimento de todos os requisitos mínimos):  <br/> <br/>
<img src="https://imgur.com/xqJxdHz.png" height="80%" width="80%" alt="Disk Sanitization Steps"/>
<br/>
<br/>
Exemplo de caso de senha forte (cumprimento de todos os requisitos mínimos): <br/> <br/>
<img src="https://imgur.com/Dk89Y9Z.png" height="80%" width="80%" alt="Disk Sanitization Steps"/>
<br/>
<br/>
_______

<p align = "center">
<i> Gostaria de agradecer ao professor Cristóvão José Dias da Cunha, da Faculdade de Tecnologia (FATEC) de Guaratinguetá, por me proporcionar esse exercício desafiador e instigante com base em sua experiência profissional que demandou, em uma situação específica, a criação de um sistema semelhante. </i> </p>

      Muito obrigado por acompanhar a leitura dessa apresentação até aqui! Desfrute-o como quiser! 😁☕
