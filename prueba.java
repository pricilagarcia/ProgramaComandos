import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		
		String comando [] = new String[5];
		comando [0] = "pwd";
		comando [1] = "ls";
		comando [2] = "cd";
		comando [3] = "touch";
		comando [4] = "mkdir";

		
		String descripcion [] = new String [5];
		descripcion [0] = "sirve para saber dónde te encuentras";
		descripcion [1] = "sirve para enlistar los arhivos";
		descripcion [2] = "sirve para viajar entre carpetas";
		descripcion [3] = "sirve para crear una nueva carpeta";
		descripcion [4] = "sirve para crear un nuevo directorio";
        
		
				/*------------------------------------SECCION DE BULE DO WHILE*/
		         String exit = "exit";
		        	 
			        	do {
			        	Scanner Comando = new Scanner(System.in);//<---ingreso de codigo del producto
			        	System.out.println("");
			        	System.out.println("              COMANDOS:");
			        	System.out.println("_____________________________________________");
						System.out.print("Buscar comando: ");
						String coman = Comando.nextLine();
						System.out.println("---------------------------------------------");
			         
					
						if(coman.equalsIgnoreCase("exit")) {
							
							exit ="salir";
							
						}else {
							
							for(int i = 0;i<comando.length;i++) {
								
								if(coman.equals(comando [i])) {
									
									System.out.println("Descripción:"+descripcion [i]);

								}
							}	
						}
						
			        }while(exit.equalsIgnoreCase("exit"));//false
						
		       }
	}


