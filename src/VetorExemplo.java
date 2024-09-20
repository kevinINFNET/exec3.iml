 public class VetorExemplo {
    private int[] vetor;

    public VetorExemplo() {
        vetor = new int[]{1, 9, 2, 5, 3, 7, 4, 10, 8, 6};
    }

    public boolean pesquisar(int numero) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                return true;
            }
        }
        return false;
    }

    public int maiorNumero() {
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    public int menorNumero() {
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    public double calcularMedia() {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return (double) soma / vetor.length;
    }
}
