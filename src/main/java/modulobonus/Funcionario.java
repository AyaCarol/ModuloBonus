package modulobonus;

import java.math.BigDecimal;

public abstract class Funcionario {
    private int id;
    protected BigDecimal salario;
    private Cargo cargo;
    private Departamento departamento;
    
    public enum Cargo{
        VENDEDOR,
        GERENTE
    }

    public Funcionario(int id, BigDecimal salario, Cargo cargo, Departamento departamento) {
        this.id = id;
        this.salario = salario;
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public int getId() {
        return id;
    }
}
