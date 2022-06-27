import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner wczytaj=new Scanner(System.in);
    int wybor=0,  podstawa;
    String wynik="", licz="";
    while(wybor!=3)
      {
        System.out.println("____________________");
        System.out.println("MENU");
        System.out.println("____________________");
        System.out.println("1. Zamiana z systemu dziesiętnego");
        System.out.println("2. Wyjście z programu");
        wybor=wczytaj.nextInt();
        switch(wybor){
          case 1:{
            System.out.println("Podaj liczbę jaką chcesz zamienić:(>=0) ");
            licz=wczytaj.next();
            int liczba=Integer.parseInt(licz);
            if (liczba<0){
              System.out.println("Niepoprawne dane");
              break;
            }
            System.out.println("Podaj na jaki system chcesz zamienić: ");
            podstawa=wczytaj.nextInt();
            if (podstawa<2){
              System.out.println("Niepoprawne dane");
              break;
            }
            if (liczba==0){
              System.out.println("Wynik to 0");
              break;
            }
            while(liczba > 0)
              {
                int rest=liczba%podstawa;
                liczba/=podstawa;
                wynik=rest+wynik;
              }
            System.out.println("Wynik to: "+wynik);
 
            break;
          }
         
          case 2:{
            System.exit(0);
          }
        }
      }
    
  }
}