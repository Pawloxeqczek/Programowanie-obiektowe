import java.sql.SQLOutput;
import java.util.Scanner;
void main() {
Scanner scanner = new Scanner(System.in);
System.out.println("Podaj liczbe i sprawdz czy jest podzielna przez 3");
int liczba = scanner.nextInt();
if (liczba % 3 == 0) {
    System.out.println("liczba jest podzielna");
}
 else {
     System.out.println("liczba nie jest podzielna mordzia");
 }
}
