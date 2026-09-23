void main() {
    System.out.println("witaj swiecie"); // wypisz i zrob enter
    System.out.println("sout"); //skrot

    System.out.print("cos bez robienia entera");
    System.out.println("nowa linia");

    System.out.println("w taki sposob robie znaki specjalne:");
    System.out.println("\t tabulacja");
    System.out.println("\n enter");
    System.out.println("to jest jak na maszynie \rdo pisania");
    System.out.println("\"cuzysluw\"");
    System.out.println("\'apostrof\'");
    System.out.println("backslash: \\");

    int liczbacalkowita = 5;
    double liczbarzeczywista;
    liczbarzeczywista = (double) liczbacalkowita/2;

    System.out.println("wynik dzielenia 5 przez 2 to:" + liczbarzeczywista/2);

    char znak = 'a';
    System.out.println("Litera a ma wartosc " + (znak + 0));

    String napis = "napis";
    System.out.println("Napis wielkimi literami:" + napis.toUpperCase());

    System.out.println("Wynik 1+2+3=" +1 +2 +3);
    System.out.println("Wynik 1+2+3=" + (1 +2 +3) );
    System.out.println( 1 + 2 + 3 + "to Wynik 1+2+3"  );
}
