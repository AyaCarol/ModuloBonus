<H1>Modulo Bonus</H1>
<p>Repositório com objetivo de armazenar as diferentes versões do projeto voltado a disciplina de Imersão Profissional: Fábrica de Software</p>

![image](https://github.com/user-attachments/assets/e7cc41ba-bcf0-4361-8c41-4fd2983f9d36)


<h2>Descrição do Projeto</h2>
<p>O objetivo do módulo BONUS é aumentar o salário de todos os funcionários que pertencem ao(s) departamento(s) com o maior valor de vendas. O bônus salarial padrão é de $2.000.
No entanto, existem algumas exceções para esse aumento:</p>
<ul>
  <li><strong>Funcionários com salário igual ou superior a $150.000:</strong> Caso o funcionário já tenha um salário maior ou igual a $150.000, o bônus aplicado será reduzido para $1.000.</p></li>
  <li><strong>Gerentes:</strong> Independentemente do salário, funcionários que possuem o cargo de gerente também recebem um bônus de $1.000.</li>
</ul>
<h2>Entradas</h2>
<p>O módulo recebe como entrada as seguintes informações:</p>
<ul>
  <li>Tabela de Funcionários: Contém dados sobre cada funcionário, incluindo:
      <ul>
        <li>Identificação única do funcionário.</li>
        <li>Salário atual.</li>
        <li>Cargo (para determinar se o funcionário é gerente ou não).</li>
        <li>Código do departamento ao qual o funcionário pertence.</li>
      </ul>
  </li>
  <li>Tabela de Departamentos: Contém dados sobre cada departamento, incluindo:
      <ul>
        <li>Identificação única do departamento.</li>
        <li>Valor total de vendas realizadas pelo departamento.</li>
      </ul>
  </li>
  </li>
</ul>
<h2>Saídas:</h2>
<p>O módulo BONUS deve retornar os seguintes códigos de erro, dependendo do resultado da execução (utilizem exception):</p>
<ul>
  <li><strong>Código 1:</strong> Retornado se qualquer uma das tabelas de entrada (Funcionários ou Departamentos) estiver vazia, ou seja, sem dados.</li>
  <li><strong>Código 2:</strong> Retornado se não houver nenhum funcionário elegível nos departamentos com maior valor de vendas.</li>
</ul>

Caso o modulo execute com sucesso deve retornar o valor 0.
Regras de Negócio:
O módulo deve identificar o(s) departamento(s) com o maior valor de vendas.
Apenas funcionários que pertencem ao(s) departamento(s) identificado(s) como os de maior valor de vendas são elegíveis para o bônus.
Para cada funcionário elegível, o valor do bônus deve ser adicionado ao salário, respeitando as exceções descritas:
Funcionários com salário >= $150.000 ou que possuem o cargo de gerente recebem apenas $1.000 de aumento.
Se não houver nenhum funcionário nos departamentos de maior venda, o módulo deve retornar o código de erro apropriado (código 2).

O modulo deve ser programado em Java
