public class FormatadorCepExemplo {
    public static void main(String[] args) {

        try {
            String cepFormatado = formatadorCep("2376586");
            System.out.println(cepFormatado);

        } catch (CepInvalidoException e) {
            System.out.println("O cep contem menos de 8 digitos!");
        }
    }

    static String formatadorCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8){
            throw new CepInvalidoException();
        }
        return "23.765-864";
    }
}
