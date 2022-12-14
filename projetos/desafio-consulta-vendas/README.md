Formação Desenvolvedor Moderno
Módulo: Back end
Capítulo: JPA, consultas SQL e JPQL

DESAFIO: Consulta vendas
Forma de entrega: link do projeto no seu Github

Trata-se de um sistema de vendas (Sale) e vendedores (Seller). Cada venda está para um vendedor, e um
vendedor pode ter várias vendas.

![Captura de tela de 2022-12-14 14-12-51](https://user-images.githubusercontent.com/90224120/207662161-14c66717-39e2-470c-abf8-91b2aab9938c.png)

Você deverá implementar as seguintes consultas (ambas deverão estar corretas):

Relatório de vendas
1. [IN] O usuário informa, opcionalmente, data inicial, data final e um trecho do nome do vendedor.
2. [OUT] O sistema informa uma listagem paginada contendo id, data, quantia vendida e nome do
vendedor, das vendas que se enquadrem nos dados informados.

Informações complementares:

 Se a data final não for informada, considerar a data atual do sistema. 

 Se a data inicial não for informada, considerar a data de 1 ano antes da data final. 

 Se o nome não for informado, considerar o texto vazio.

 Dica: receba todos os dados como String no controller, e faça os tratamentos das datas acima,
instanciando os objetos LocalDate, no service.

Sumário de vendas por vendedor
1. [IN] O usuário informa, opcionalmente, data inicial, data final.
2. [OUT] O sistema informa uma listagem contendo nome do vendedor e soma de vendas deste vendedor
no período informado.

Informações complementares:

 As mesmas do caso de uso Relatório de vendas
