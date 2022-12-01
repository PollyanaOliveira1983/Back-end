Formação Desenvolvedor Moderno
Módulo: Back end
Capítulo: Modelo de domínio e ORM


DESAFIO: Modelo de domínio e ORM
Forma de entrega: link do projeto no Github
Você deve criar um projeto no Spring Boot com Java e banco de dados H2, e implementar o modelo
conceitual conforme especificação a seguir. Além disso, você deve fazer o seeding da base de dados
conforme diagrama de objetos que segue.
Como o trabalho será corrigido?
O repositório do Github será clonado pelo professor, que executará o projeto localmente. O projeto
deverá executar sem erros, e a base de dados deverá ser criada corretamente. O H2 Console será
executado no navegador, e todas tabelas esperadas deverão ser criadas, com todos relacionamentos, e
os dados do seeding deverão estar presentes em cada tabela.

ESPECIFICAÇÃO - Sistema EVENTO:
Deseja-se construir um sistema para gerenciar as informações dos participantes das atividades de um
evento acadêmico. As atividades deste evento podem ser, por exemplo, palestras, cursos, oficinas
práticas, etc. Cada atividade que ocorre possui nome, descrição, preço, e pode ser dividida em vários
blocos de horários (por exemplo: um curso de HTML pode ocorrer em dois blocos, sendo necessário
armazenar o dia e os horários de início de fim do bloco daquele dia). Para cada participante, deseja-se
cadastrar seu nome e email.

![Captura de tela de 2022-12-01 15-22-47](https://user-images.githubusercontent.com/90224120/205134643-9fe273df-19b1-4ef1-bc2d-4415acfb661b.png)


Instância dos dados para seeding (próxima página):

![Captura de tela de 2022-12-01 15-22-55](https://user-images.githubusercontent.com/90224120/205134750-bf8467eb-65a6-46bd-b081-543101a02556.png)

