/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zModelosSeparados;

/**
 *
 * @author VM
 */
public class Comprovante implements Formato{


    /**
     * gera uma string com formato de comprovante de transacao.
     *
     * @param dataEmissao (data em que o saque foi realizado)
     * @param numeroConta (conta em que o saque foi feito)
     * @param nomeTitular (nome do titular da conta)
     * @param cpfTitular (cpf do titular)
     * @param valor (valor sacado)
     * @return (String de comprovante)
     */
    public static String comprovanteDeSaque(Data dataEmissao, String numeroConta,
            String nomeTitular, String cpfTitular, double valor) {

        return DATA + dataEmissao + TRANSACAO + Transacao.SAQUE + CONTA + numeroConta + TITULAR_NOME
                + nomeTitular + TITULAR_CPF + cpfTitular + VALOR + valor;
    }

    /**
     * gera uma string com formato de comprovante de transacao.
     *
     * @param data (data em que o deposito foi realizado)
     * @param numeroConta (conta em que o deposito foi feito)
     * @param nomeTitular (nome do titular da conta)
     * @param cpfTiutlar (cpf do titular)
     * @param valor (valor sdepositado)
     * @return (String de comprovante)
     */
    public static String comprovanteDeDeposito(Data data, String numeroConta,
            String nomeTitular, String cpfTiutlar, double valor) {
        return DATA + data + TRANSACAO + Transacao.DEPOSITO + CONTA
                + numeroConta + TITULAR_NOME + nomeTitular + TITULAR_CPF + cpfTiutlar + VALOR + valor;
    }
}
