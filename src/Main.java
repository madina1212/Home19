import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cаламатсызбы сиз кайсыл планетаны коргунуз келип жатат " +
                "Меркурий, Венера, Жер, Марс, Юпитер, Сатурн, Уран жана Нептун");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    System.out.println(Planeta.Mercury + " Жердин үчтөн бирине араң жетет жана Күнгө жакын планета");
                    break;
                case 2:
                    System.out.println(Planeta.Venus+ " айлануусу өтө жай жана Венера убактысы жердин убактысына салыштырсак 243 кунго созулат");
                    break;
                case 3:
                    System.out.println(Planeta.Ger + " жашоо көбөйүшү үчүн идеалдуу аралыкта, ошондой эле коргоочу озон катмары, суюк суусу мол");
                    break;
                case 4:
                    System.out.println(Planeta.Mars+" жер планетасына окшош");
                    break;
                case 5:
                    System.out.println(Planeta.Jupiter+" күн системасындагы эң чоң планета");
                    break;
                case 6:
                    System.out.println(Planeta.Saturn + " ушунчалык жеңил, ал гипотетикалык океанда сүзүп, аны камтый алат.");
                    break;
                case 7:
                    System.out.println(Planeta.Uranus + """
                      дын 
                     Сатурндагыдай кереметтүү болбосо дагы, 
                     өзүнүн шакекчеси бар.
                     Алар абдан начар, ошондуктан Жерден оңой менен көрүнбөйт       
                            """);
                    break;
                case 8:
                    System.out.println(Planeta.Neptune + " метанга бай атмосфера, ошондой эле Урандыкына окшогон алсыз шакек системасы бар.");
                default:
                    System.out.println("Кечиресиз андай плананета жок");
            }
        }
    }
}