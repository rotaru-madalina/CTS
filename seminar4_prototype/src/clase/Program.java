package clase;

public class Program {

    public static void main(String[] args) throws CloneNotSupportedException {
        Autobuz autobuz = new Autobuz("Vasile");
        Tramvai tramvai = new Tramvai("Gigel");

        Autobuz autobuz1 = (Autobuz) autobuz.copiaza();
        Tramvai tramvai1 = (Tramvai) tramvai.copiaza();

        System.out.println(autobuz.toString());
        System.out.println(autobuz1.toString());
        System.out.println(tramvai.toString());
        System.out.println(tramvai1.toString());

        // string e imutabil, vom folosi StringBuilder
        StringBuilder builder = new StringBuilder();
        builder.append("Ana ").append("are ").append("mere");
        String text = builder.toString();

    }
}
