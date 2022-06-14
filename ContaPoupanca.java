import Banco.Conta;
import Banco.TipoConta;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Enum<TipoConta> tipoContaEnum, Long numeroConta, Integer agencia) {
        super(tipoContaEnum,numeroConta,agencia);
    }
    public ContaPoupanca(Long numeroConta, Integer agencia) {
        super(numeroConta, agencia);
    }

    public ContaPoupanca() {

    }

    public void renderJuros(double taxa) {
        super.saldo = super.saldo.multiply(BigDecimal.valueOf(100));

    }
    public BigDecimal deposita(BigDecimal valor){
        BigDecimal novoValor = valor.multiply(java.math.BigDecimal.valueOf(1.10));
        super.saldo = super.saldo.add(novoValor);
        return super.saldo;
            }

}





