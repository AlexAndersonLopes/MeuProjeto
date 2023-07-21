package br.com.alexlopes.projetointegradormaven.util;

public class ValidarCPF {

    /**
     * Esse metodo retorna true se o cpf for um numero valido
     *
     * @param cpf
     * @return
     */
    public static boolean validarCPF(String cpf) {
        if (cpf.length() != 11) {
            return false;
        }
        int[] pesosPrimeiroDigito = {10, 9, 8, 7, 6, 5, 4, 3, 2};
        int[] pesosSegundoDigito = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
        // Verificar o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            int digito = Character.getNumericValue(cpf.charAt(i));
            soma += digito * pesosPrimeiroDigito[i];
        }
        int resto = soma % 11;
        int digitoVerificador1 = resto < 2 ? 0 : 11 - resto;
        if (digitoVerificador1 != Character.getNumericValue(cpf.charAt(9))) {
            return false;
        }
        // Verificar o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            int digito = Character.getNumericValue(cpf.charAt(i));
            soma += digito * pesosSegundoDigito[i];
        }
        resto = soma % 11;
        int digitoVerificador2 = resto < 2 ? 0 : 11 - resto;
        if (digitoVerificador2 != Character.getNumericValue(cpf.charAt(10))) {
            return false;
        }
        return true;
    }

}
