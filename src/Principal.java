import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
ConsultaCep consultaCep = new ConsultaCep();
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um CEP para busca: ");
        var cep = leitura.nextLine();
try {
    Endereco novoEndereco = consultaCep.buscaEndereco(cep);
    System.out.println(novoEndereco);
    GeradorDeArquivo gerador = new GeradorDeArquivo();
    gerador.salvaJson(novoEndereco);
}catch (RuntimeException | IOException e){
    System.out.println(e.getMessage());
    System.out.println("Execução finalizada");
}

    }
}