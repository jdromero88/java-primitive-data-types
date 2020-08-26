public class Main {
  public static void main(String[] args) {
    ReadVariables hola = new ReadVariables(); //instanciamos la clase ReadVairables
    PrintVariables imprimir = new PrintVariables(); //instanciamos la clase PrintVariables

    byte soyUnByte = 12;
    short soyUnShort = 343;
    int soyUnInt = 2343;
    long soyUnLong = 23432;
    double soyUnDouble = 234234;
    boolean soyUnBoolean = false; //puedo ser falso o verdadero
    char soyUnChar = 'a';

    imprimir.printing(soyUnByte);
    imprimir.printing(soyUnShort);
    imprimir.printing(soyUnInt);
    imprimir.printing(soyUnLong);
    imprimir.printing(soyUnDouble);
    imprimir.printing(soyUnBoolean);
    imprimir.printing(soyUnChar);
    // String leido = hola.leerVariables(); //invocamos el metodo leerVariables que nos va a devolver lo que el usuario ingreso. Y luego lo asignamos a la variable leido
    // imprimir.printing(leido); //invocamos el metodo printing que va a imprimir lo que el usuario ingreso.
  }
}
