package francieudo.aluraone.conversor.ui;

public final class UI {

    public static void printText(String text){
        System.out.println(text);
    }

    public static void printTextWithNewLine(String text){
        System.out.print(text);
    }

    public static void printNewLine(){
        System.out.println();
    }

    public static void printTitle(){
        printText("*******************************************");
        printText("#### SISTEMA DE CONVERSÃO DE MOEDAS ####");
        printText("*******************************************");
        printNewLine();
    }

    public static void printOptionsMenu(){
     
        printText("Escolha uma opção válida: ");
        printNewLine();
        printText("1) Dólar =>> Peso argentino");
        printText("2) Peso argentino =>> Dólar");
        printText("3) Dólar =>> Real brasileiro");
        printText("4) Real brasileiro =>> Dólar");
        printText("5) Dólar =>> Peso colombiano");
        printText("6) Peso colombiano =>> Dólar");
        printText("7) Sair");
        printNewLine();
        printText("*******************************************");
    }
}
