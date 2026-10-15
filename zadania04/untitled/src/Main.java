void main() {
//    int[] tablicaParzysta = {10, 20, 30, 40, 50, 60};
//    int[] tablicaNieparzysta = {9, 19, 29, 39, 49, 59};
//
//    System.out.println("Co drugi element z tablicy parzystej:");
//
//    for (int i = 0; i < tablicaParzysta.length; i += 2) {
//        System.out.println("Indeks " + i + ": " + tablicaParzysta[i]);
//    }
//
//    System.out.println("Co drugi element z tablicy nieparzystej:");
//
//    for (int i = 0; i < tablicaNieparzysta.length; i += 2) {
//        System.out.println("Indeks " + i + ": " + tablicaNieparzysta[i]);

    // zad 2
    int[] najwiekszacyfra = {65, 2, 18,  99, 15};

    int najwieksza = najwiekszacyfra[0];

    for (int i = 1; i < najwiekszacyfra.length; i++) {
        if (najwiekszacyfra[i] > najwieksza) {
            najwieksza = najwiekszacyfra[i];
        }

    }
    System.out.println("najwieksza liczba to:" + najwieksza);
}