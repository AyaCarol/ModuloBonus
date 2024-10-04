package modulobonus;

import java.math.BigDecimal;

public class ModuloBonus {

    public static void main(String[] args) {
        Departamento vendas1 = new Departamento(1);
        Departamento vendas2 = new Departamento(2);
        
        Vendedor v1 = new Vendedor(1, BigDecimal.valueOf(150000), vendas1, BigDecimal.valueOf(100000));
        v1.calcularSalario();
        Vendedor v2 = new Vendedor(2, BigDecimal.valueOf(21300), vendas1, BigDecimal.valueOf(200000));
        v2.calcularSalario();
        Vendedor v3 = new Vendedor(3, BigDecimal.valueOf(150000), vendas2, BigDecimal.valueOf(150000));
        v3.calcularSalario();
        Vendedor v4 = new Vendedor(4, BigDecimal.valueOf(12200), vendas2, BigDecimal.valueOf(350000));
        v4.calcularSalario();
        Gerente g1 = new Gerente(5, BigDecimal.valueOf(11200), vendas1);
        Gerente g2 = new Gerente (6, BigDecimal.valueOf(11200), vendas2);
        
        vendas1.adicionarFuncionario(g1);
        vendas1.adicionarFuncionario(v1);
        vendas1.adicionarFuncionario(v2);
        
        vendas2.adicionarFuncionario(g2);
        vendas2.adicionarFuncionario(v3);
        vendas2.adicionarFuncionario(v4);
        
        
        Controle controle = new Controle();
        
        controle.adicionarDepartamento(vendas1);
        controle.adicionarDepartamento(vendas2);
        
        System.out.println("O departamento com maior venda foi: " + controle.verificaMaiorVenda().getId());
        
        if(controle.verificaMaiorVenda() == null){
            throw new IllegalArgumentException("Erro 1: Departamento vazio ou não encontrado.");
        }else{
            controle.calcularBonus();
        }
        
        
         /*
        - modificar DOUBLE por BIGDECIMAL pelo erro de arredondamento FEITO!!!
        - modificar total de vendas de inteiro para total em reais FEITO!!
        - modificar tratativa de erro para exception FEITO!!!!
        - ADICIONAR CALCULO DE SALARIO + COMISSAO   FEITO!!
        - Modificar FOR por FOR EACH no Controle   FEITO!!!
        - adicionar calculo de bonus    FEITO!!
        - adicionar verificação se é vendedor ou gerente e dar respectivos bonus FEITO!!
        - adicionar tratativa de erro  FEITO!!
               Código 1: Retornado se qualquer uma das tabelas de entrada (Funcionários ou Departamentos) estiver vazia, ou seja, sem dados.
               Código 2: Retornado se não houver nenhum funcionário elegível nos departamentos com maior valor de vendas.
        */
    }
}
