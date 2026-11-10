import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/** Experimento conduzido por um cientista de ML. */
public class Experimento {
    private LocalDate iniciadoEm;
    private LocalDate finalizadoEm;
    private String nome;

    public Experimento(String nome, LocalDate dataInicio) {
        this.nome = nome;
        this.iniciadoEm = dataInicio;
        this.finalizadoEm = null;
    }

    public int finalizar() {
        this.finalizadoEm = LocalDate.now();
        return (int) ChronoUnit.DAYS.between(iniciadoEm, finalizadoEm);
    }

    public int diasAposFinalizacao() {
        if (finalizadoEm == null) {
            return -1;
        }

        else {
            return (int) ChronoUnit.DAYS.between(finalizadoEm, LocalDate.now());
        }
    }

    public String getNome() { return nome; }

    @Override
    public String toString() {
        return nome + " | inicio=" + iniciadoEm + " | fim=" + finalizadoEm;
    }
}
