import java.util.Scanner;
class ReadVariables {
  String leerVariables(){
    System.out.println("Escriba algo: ");
    Scanner getVar = new Scanner(System.in); //Instanciamos Scanner para que el usuario pueda ingresar desde el teclado
    String var = getVar.nextLine(); //con el metodo nextLine capturamos lo que el usuario ingreso y lo asignamos a la variable var como un string
    int numero = getVar.nextInt();
    int otroNumero = getVar.nextInt();
    int suma = numero + otroNumero;
    return var + " la suma de los numeros es: " + suma; //devolvemos var
  }
}
