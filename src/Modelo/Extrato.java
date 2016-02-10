/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.excecoes.DataInvalidaException;
import Modelo.excecoes.HoraInvalidaException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author VM
 */
public class Extrato implements Formato {

    private static final Map<Data, Set<String>> extrato = new HashMap<>();

    ;

    /**
     *
     * @param data (data em que a transacao foi feita)
     * @param comprovantes (transacoes feitas nesta data)
     */
    public static void addComprovantes(Data data, HashSet<String> comprovantes) {
        extrato.put(data, comprovantes);
    }

    public static void limpaExtrato() {
        extrato.clear();
    }

    /**
     *
     * @param dataEmissao
     * @param nomeTitular
     * @param cpfTitular
     * @param numeroConta
     * @return (um String representando o extrato)
     */
    public static String geraExtrato(Data dataEmissao, String nomeTitular, String cpfTitular,
            String numeroConta) {
        String resultado = "";
        String cabecalho = DATA + dataEmissao + TITULAR_NOME + nomeTitular + TITULAR_CPF + cpfTitular + CONTA + numeroConta + "\n";
        Iterator<Data> iteratorChave = extrato.keySet().iterator();
        String conteudo = "";
        Data chavaAtual;
        while (iteratorChave.hasNext()) {
            chavaAtual = iteratorChave.next();
            conteudo += DATA + chavaAtual + "\n";
            Iterator<String> iteratorConteudo = extrato.get(chavaAtual).iterator();
            while(iteratorConteudo.hasNext()){
                conteudo += iteratorConteudo.next()+"\n";
            }
        }
        resultado = cabecalho+conteudo;
        return resultado;
    }

}
