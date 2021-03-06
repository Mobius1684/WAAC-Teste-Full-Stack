Teste De lógica 1.0 
-Adicionada Sessão de planejamento ao final do documento.

# Teste de Lógica - WAAC

Leia primeiro toda a proposta, faça sua estimativa de horas do planejamento a ser realizado, explique a estratégia a ser seguida de acordo com as tecnologias que escolheu e envie um e-mail com o título **[Fullstack] Teste do Triângulo - Estimativa** para beawsome@waac.com.br com o link do seu git.
O primeiro commit é somente com o README.MD e esse arquivo será o seu documento técnico, portanto os processos de evolução precisam ser descritas e commitadas nesse arquivo. Tenha o hábito de commitar cada evolução ao longo da realização do projeto. Não suba o projeto no git apenas quando estiver pronto.

## O Desafio

Dado um triângulo de números, encontre o total máximo de cima para baixo.

## O triângulo

                6
            3       5
        9       7       1
    4       6       8       4    

    Nesse triângulo, o total máximo é 6 + 5 + 7 + 8 = 26.

## Requisitos

Um elemento só pode ser somando com um dos dois elementos mais próximos da próxima linha. Assim, o elemento 3 na linha 2 pode ser somado com 9 e 7, mas não com 1.

## A sua estratégia

Escolha a linguagem de programação desejada e deixo nos saber a sua estratégia por trás da eleboração do problema.

## Parâmetros de entrada e de saída

Seu código receberá uma lista multidimensional como parametro. O triangulo do exemplo receberá, então: [[6],[3,5],[9,7,1],[4,6,8,4]].

## Resolução FULL-STACK

Você deverá mostrar as suas habilidades de desenvolvimento em um ambiente "full stack", portanto resolverá o desafio dentro de uma estrutura não relacional com o desenvolvimento back-end e front-end.
Para cada etapa do processo da resolução para a soma do triângulo, você deverá:

1. Armazenar a lista inserida pelo usuário com um ID;
2. Armazenar as etapas do processamento com o tempo de execução e o método utilizado para resolução da etapa;
3. Mostrar o triângulo de forma tracejada com o caminho percorrido e o resultado.

## Processo de avaliação

1. Padrões de projeto e arquitetura
2. Redibilidade
3. Teste automatizado
4. Tempo de execução
5. Estratégia
6. Escopo de tecnologias utilizadas

#### Finalização e Dúvidas

As dúvidas para a resolução da lógica do problema faz parte do teste, portanto ao passar os 7 dias mande um e-mail com o título **[Teste Fullstack] Teste do Triângulo - Finalização** para beawsome@waac.com.br mesmo se não tiver finalizado.

#### Planejamento

Estimativa de Horas para Realização: 40 horas

Tecnologia que será utilizada:
 
1. Devido a minha prévia experiencia com Java, ela será utilizada para o desenvolvimento desse teste. No campo de estratégia é mencionado que posso escolher a linguagem de programação. Porém admito que fiquei na dúvida se java poderia ser utilizado nesse teste;
2. Com relação ao posterior teste automatizado, nesse momento inicial de desenvolvimento, ainda não tenho certeza se vou utilizar JUnit ou Robot framework para seu desenvolvimento, mas com certeza um desses dois métodos de teste será utilizado;

Estratégia para desenvolvimento:
 
1. Iniciar desenvolvimento de front-end, definir posicionamento na tela para inserção dos dados, além de definir posicionamento das informações que serão mostradas;
2. Iniciar desenvolvimento do back-end, codificar a lógica que será utilizada para a execução do programa e preparar informações para serem exibidas, codificar a lógica para a soma dos valores inseridos, armazenamento dos dados por ID e os tempos de execução;
3. Continuar desenvolvimento do front-end, quando as informações estiverem sendo retornadas corretamente, preparar a exibição do triangulo na tela mostrando o caminho percorrido e os números que foram somados;