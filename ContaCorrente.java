import Banco.Conta;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {
    private BigDecimal limiteCredito;

    public ContaCorrente () {}

    public ContaCorrente(Long numeroConta, Integer agencia) {
        super(numeroConta, agencia);
        this.limiteCredito = BigDecimal.ZERO;
    }

    public void setLimiteCredito(BigDecimal limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public BigDecimal getLimiteCredito() {

        return this.limiteCredito;
    }
    public void pedirLimiteCredito(int i){
        this.limiteCredito = this.limiteCredito.add(BigDecimal.valueOf(100));

    }

}