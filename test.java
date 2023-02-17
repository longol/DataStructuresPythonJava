import java.util.Arrays;

class MinhaClasse {
    public static void main(String[] args) {

        // Declaração do vetor pessoasEmFileirasAssentos
        String[][] pessoasEmFileirasAssentos = {
            {"João", "Maria", "Luiz"},
            {"Amanda", "José", "Paulo"}
        };

        // Imprir vetor
        System.out.println("0) Pessoas em fileiras e assentos: " + Arrays.deepToString(pessoasEmFileirasAssentos));

        // Pegar segunda(1) fileira do vetor pessoasEmFileirasAssentos - um vetor de assentos (que são strings)
        String[] segundaFileira = pessoasEmFileirasAssentos[1];
        
        // Da segunda fileira, pegar pessoa no terceiro(2) assento - um string dentro do vetor segundaFileira
        String pessoaSegundaFileiraTerceiroAssento = segundaFileira[2];

        // Imprimir resultado
        System.out.println("1) Pessoa na segunda fileira, terceiro assento: " + pessoaSegundaFileiraTerceiroAssento);

        // Pegar pessoa na primeira(0) fileira, primeiro(0) assento diretamente do vetor pessoasEmFileirasAssentos
        String pessoaPrimeiraFileiraPrimeiroAssento = pessoasEmFileirasAssentos[0][0];

        // Imprimir resultado
        System.out.println("2) Pessoa na primeira fileira, primeiroAssento: " + pessoaPrimeiraFileiraPrimeiroAssento);

        // Trocar o nome da pessoa na primeira fileira(0), segundo assento(1)
        pessoasEmFileirasAssentos[0][1] = "Adriana";

        // Imprimir resultado
        System.out.println("3) Pessoas em fileiras e assentos: " + Arrays.deepToString(pessoasEmFileirasAssentos));
    }
}