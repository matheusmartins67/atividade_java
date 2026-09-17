public class aula {
    public static void main(String[] args) {

        int[] valores = {10, 25, 7, 42, 99};

        int maior = valores[0];

        for (int i = 1; i < valores.length; i++) {

            if (valores[i] > maior) {
                maior = valores[i];
            }
        }

        System.out.println("O maior valor é: " + maior);
    }
}
