package basicSyntax;

public class ForWhile {
    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {
	    if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(num);
            }
        }

        String[] languages = {"Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript"};
        for (String lang : languages) {
            switch (lang) {
                case "Java":
                    System.out.println("現在学習中の言語はJavaです。");
                    continue;
                case "HTML":
                    System.out.println("HTMLはプログラミング言語ではありません。");
                    break;
                default:
                    System.out.println(lang);
                    break;
            }
        }
    }
}