package modulobonus;

import java.math.BigDecimal;

public class Gerente extends Funcionario{
    
    public Gerente(int id, BigDecimal salario, Departamento departamento) {
        super(id, salario, Cargo.GERENTE, departamento);
    }
    
}
