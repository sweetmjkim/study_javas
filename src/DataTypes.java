public class DataTypes {
    public static void main(String[] args){
        // Numbers
        int intFirst = 3;
        // Type mismatch in case
        // intFirst = 5.2
        // intFirst = "5.2"
        // mis result in case
        // intFirst = 2 / 3
        System.out.println("Numbers int First : "+intFirst);

        boolean boolFirst = true;
        // Type mismatch in case
        // boolFirst = 5
        System.out.println("boolean bool First : "+boolFirst);

        String stringFirst = "Hello DataTypes!";
        System.out.println("String string First : "+stringFirst);

        float floatFirst = 2 / 3;
        System.out.println("float First : "+floatFirst);
        return ;
    }
}
