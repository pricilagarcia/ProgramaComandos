import java.util.Scanner;

public class COmandos {

	public static void main (String [] args) {


        String comando [] = new String [21];
        comando [0]= "pwd";
        comando [1]= "ls";
        comando [2]= "cd";
        comando [3]= "touch";
        comando [4]= "mkdir";
        comando [5]= "ls -l";
        comando [6]= "rm";
        comando [7]= "rmdir";
        comando [8]= "mv";
        comando [9]= "cat";
        comando [10]= "clear";
        comando [11]= "ls -a";
        comando [12]= "cp";
        comando [13]= "grep";
        comando [14]= "sudo";
	comando [15]= "chmod";
	comando [16]= "head";
	comando [17]= "head -n";
	comando [18]= "chown";
	comando [19]= "shutdown";
	comando [20]= "dd";


	String descripcion [] = new String [21];
	descripcion [0] = "Sirve para saber dónde te encuentras";
        descripcion [1] = "Sirve para enlistar los archivos de la carpeta";
        descripcion [2] = "Sirve para viajar por archivos y directorios";
        descripcion [3] = "Sirve para crear una nueva carpeta";
        descripcion [4] = "Sirve para crear un nuevo directorio";
        descripcion [5] = "Sirve para hacer una lista más detallada";
        descripcion [6] = "Sirve para eliminar archivos";
        descripcion [7] = "Sirve para eliminar directorios";
        descripcion [8] = "Mueve directorios o archivos de una ubicación a otra";
        descripcion [9] = "Permite leer el contenido de archivos.";
        descripcion [10] = "Sirve para limpiar la terminal";
        descripcion [11] = "Sirve para mostrar archivos ocultos";
        descripcion [12] = "Sirve para copiar archivos del directorio";
        descripcion [13] = "Permite buscar a través de todo el texto";
        descripcion [14] = "Permite realizar tareas que requieren permisos administrativos";
	descripcion [15] = "Sirve para cambiar los permisos de archivos o directorios";
	descripcion [16] = "Permite leer las primeras 10 líneas de un archivo";
	descripcion [17] = "Permite leer las últimas 10 líneas de un archivo";
	descripcion [18] = "Permite cambiar el propietario de un archivo o directorio";
	descripcion [19] = "Prepara el sistema para un apagado seguro";
	descripcion [20] = "Se utiliza para copiar archivos o particiones enteral al nivel de bits";


	//Instancia de clase

	 String exit = "exit";

	do{
	Scanner Comando = new Scanner(System.in);
	System.out.println("");
	System.out.println("                    COMANDOS");
	System.out.println("_______________________________________________________");
	System.out.println("Este programa es como un diccionario de comandos,");
	System.out.println("tú puedes buscar el comando que necesites.");
	System.out.println("");
	System.out.print("Buscar comando: ");
	String coman = Comando.nextLine();
	System.out.println("----------------------------------------------");

	int correcto = 0;

	if(coman.equalsIgnoreCase("exit")){

	exit = "salir";

	}else if(coman.equals("noEncon")) {
		correcto =1;

	}else {

	for(int i = 0; i<comando.length; i++) {

	    if(coman.equalsIgnoreCase(comando [i])) {
		System.out.println("Comando:"  + comando [i]);
		System.out.println("Descripción:"  + descripcion [i]);
		correcto =1;
          		}
         	  }
     	   }

	if(correcto == 0) {
	     System.out.println("Comando no encontrado en la base de datos");
	     System.out.println("");

	}

	}while(exit.equalsIgnoreCase("exit"));
}

}


