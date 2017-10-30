package dir;

import java.io.File;

public class Principal {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		File dir = new File("prueba/carpeta");
		String file = "hola.txt";

		try {
			localizar(dir, file);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	
	public static int localizar(File carpeta, String archivo) throws Exception {
		//Comprobamos que es una carpeta
		if (!carpeta.isDirectory()) {
			throw new Exception("El supuesto directorio \"" + carpeta.getAbsolutePath() + "\" no es un directorio");
		}
		
		//Construimos el archivo
		File archivoTEMP = new File(carpeta + "/" + archivo);
		
		//Comprobamos que el archivo existe
		if (!archivoTEMP.exists()) {
			throw new Exception("El archivo \"" + archivo + "\" no existe");
		} else {
			System.out.println("Correcto! \n" + "Se ha encontrado un fichero llamado \"" + archivo + "\" en el directorio \n\"" + carpeta.getAbsolutePath() + "\"");
		}
						
		return 1;
	}
	
	public static void comparar(){
		
	}

}
