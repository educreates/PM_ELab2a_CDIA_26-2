/** Analista de dados (CLT): salário base + horas de pipeline. */
public class AnalistaDados extends Colaborador {
    private static final double SALARIO = 4200.0;
    private static final double FRACAO_HORA = 1.0 / 80.0;
    private static final int MAX_HORAS = 35;

    private double horasPipeline;

    public AnalistaDados(String nome, String registro) {
        super(nome, registro);
        this.horasPipeline = 0.0;
    }

    private double valorHorasPipeline() {
        return horasPipeline * SALARIO * FRACAO_HORA;
    }

    public double addHoraPipeline(double quantidade) {
        if (quantidade <= 0) {
            System.out.println("valor inválido");
        }

        else if (quantidade + horasPipeline < MAX_HORAS) {
            horasPipeline += quantidade;
        }

        return horasPipeline;
    }

    @Override
    public double registrarPagamento() {
        double pagamento = SALARIO + valorHorasPipeline();
        horasPipeline = 0;
        ultimoPagamento = pagamento;

        return pagamento;
    }

    @Override
    public String toString() {
        return "AnalistaDados " + super.toString() + " | horasPipeline=" + horasPipeline;
    }
}
