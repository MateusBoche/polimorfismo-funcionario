package entidades;

public class Tercerizados extends Funcionarios {
    private double adicional;


    public Tercerizados(){
        super();
    }
    public Tercerizados(String nome, double horas, double valorPorHora, double adicional) {
        super(nome, horas, valorPorHora);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    @Override
    public double pagamento(){
        return super.pagamento()+adicional*1.1;
    }
}
