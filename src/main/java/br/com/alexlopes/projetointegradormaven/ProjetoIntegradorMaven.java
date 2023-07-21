package br.com.alexlopes.projetointegradormaven;

import br.com.alexlopes.projetointegradormaven.util.Janelas;
import br.com.alexlopes.projetointegradormaven.util.Mensagem;

public class ProjetoIntegradorMaven {

    public static void main(String[] args) {

        try {
            Janelas.irEntrar();
        } catch (Exception e) {
            Mensagem.mensagemErro("Erro ao Iniciar o Programa!");
        }

    }
}
