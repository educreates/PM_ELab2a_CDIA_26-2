import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ColaboradorTest {
    @Test 
    void exemploAnalistaDados() {
        AnalistaDados analista = new AnalistaDados("Lucca Java", "6767");
        analista.addHoraPipeline(21);
        double pagamento = analista.registrarPagamento();
        analista.toString();
        System.out.println("O salario de Lucca Java no último mês foi de " + pagamento + " reais.");
        assertEquals(5302.5, pagamento);
    }

    @Test
    void exemploAnalistaDados02() {
        AnalistaDados analista02 = new AnalistaDados("Felipe Python", "4242");
        analista02.addHoraPipeline(-1);
        double pagamento = analista02.registrarPagamento();
        analista02.toString();
        System.out.println("O salario de Lucca Java no último mês foi de " + pagamento + " reais.");
assertEquals(4200, pagamento);
    }

}
