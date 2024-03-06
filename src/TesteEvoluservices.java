public class TesteEvoluservices {

    public static void main(String[] args) {
        TesteEvoluservices main = new TesteEvoluservices();
        System.out.println("QUESTÃO 1:");
        main.ticoTeco();
        System.out.println("QUESTÃO 2:");
        System.out.println(main.isPalindrome("Deleveled"));
        System.out.println(main.isPalindrome("false"));
    }

    public void ticoTeco() {
        StringBuilder saida = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 & i % 5 == 0) {
                saida.append("Tico e Teco");
            }
            else if (i % 3 == 0) {
                saida.append("Tico");
            }
            else if (i % 5 == 0) {
                saida.append("Teco");
            }
            else {
                saida.append(i);
            }
            if(i != 100){
                saida.append(", ");
            }
        }
        System.out.println(saida);
    }

    public boolean isPalindrome(String s){
        String minuscula = s.toLowerCase();

        int i = 0;
        int j = minuscula.length() - 1;
        while (i < j){
            if(minuscula.charAt(i) != minuscula.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}


