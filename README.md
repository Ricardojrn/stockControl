
# Trabalho de produção textual individual
Disciplina: Algoritimos e programação II

Curso: Analise e desenvolvimento de sistemas, segundo semestre.

# Tema
Software para Controle de Estoque 

# Enunciado
    Você foi contratado por uma empresa para desenvolver um software que 
    gerenciará o estoque de seus produtos. No primeiro protótipo que você
    desenvolverá, o sistema ainda não irá se conectar ao banco de dados. As
    informações ficarão em memória, assim, serão perdidas ao reiniciar o
    programa.
    
    Assim que o software abrir, ele deve apresentar o seguinte menu:
    [1] Novo   [4] Entrada Estoque
    [2] Listar Produtos  [5] Saída Estoque
    [3] Remover Produtos  [0] Sair
    
    O Menu deve ser recursivo, após a realização da ação escolhida, ele deve
    voltar a ser apresentado até que seja escolhida a ação Sair.
    
    Essa PTI possui duas etapas:
    
    Primeira Parte
    Escolha um ramo de empresa e defina a estrutura da classe que
    representará um produto. Lembre-se de considerar ao menos, o nome, o
    preço e a quantidade em estoque. Você deve acrescentar no mínimos mais
    03 atributos para o produto. A quantidade em estoque deve iniciar em zero.
    
    Segunda Parte
    Implementar um Tipo Abstrato de Dado que possibilite o controle do estoque
    implementando as ações do menu acima citado. Utilizar o TAD no programa
    principal (Main) possibilitando a interação do usuário conforme dinâmica no
    anexo abaixo.