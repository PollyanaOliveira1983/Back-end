Formação Desenvolvedor Moderno

Módulo: Back end
Capítulo: Componentes e injeção de dependência


DESAFIO: Componentes e injeção de dependência

Você deve criar um sistema para calcular o valor total de um pedido, considerando uma porcentagem
de desconto e o frete. O cálculo do valor total do pedido consiste em aplicar o desconto ao valor
básico do pedido, e adicionar o valor do frete. A regra para cálculo do frete é a seguinte:

![Captura de tela de 2022-12-01 15-24-30](https://user-images.githubusercontent.com/90224120/205133037-7f525bcf-45dc-4fff-9fdc-c7482d436b81.png)




Sua solução deverá seguir as seguintes especificações:

Um pedido deve ser representado por um objeto conforme projeto abaixo:

![Captura de tela de 2022-12-01 15-24-47](https://user-images.githubusercontent.com/90224120/205133230-279b3f21-d777-41bc-8cc5-73e5dc40e3a5.png)


A lógica do cálculo do valor total do pedido deve ser implementada por componentes (serviços), cada
um com sua responsabilidade, conforme projeto abaixo: 

![Captura de tela de 2022-12-01 15-24-59](https://user-images.githubusercontent.com/90224120/205133331-14e6ac9b-a4e0-4201-a727-d11450c78ff2.png)

Serviço OrderService: responsável por operações referentes a pedidos.
Serviço ShippingService: responsável por operações referentes a frete.


Sua solução deverá ser implementada em Java com Spring Boot. A saída deverá ser mostrada no log
do terminal da aplicação. Cada serviço deve ser implementado como um componente registrado com
@Service. 


