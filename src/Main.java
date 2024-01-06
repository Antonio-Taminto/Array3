//Scrivere un programma che contenga un metodo che permetta di rimuovere
//gli elementi duplicati in un array di interi.
//L'array ottenuto dovrà essere stampato a video.
public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,1,2,1,2};
        noDuplicati(array);
    }
    public static void noDuplicati(int[] array){

        int grandezzaArray = 0;

        for(int i = 0 ; i< array.length;i++){
            boolean trovato = false;
            for(int j = 0;j<i;j++) {
                if (array[i] == array[j]) {
                    trovato = true;

                    break;
                }

            }
            if(!trovato){
                grandezzaArray++;
            }
        }
        int[] appoggio = new int[grandezzaArray];
        int contatore = 0;
        for(int i = 0 ; i< array.length;i++){
            boolean trovato = false;
            for(int j = 0;j<i;j++) {
                if (array[i] == array[j]) {
                    trovato = true;
                    break;
                }

            }
            if(!trovato){
                appoggio[contatore] = array[i];
                contatore++;
            }
        }
        for (int numero : appoggio){
            System.out.println(numero);
        }
    }
}