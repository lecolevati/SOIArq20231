package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivosController;

public class Principal {

	public static void main(String[] args) {
		IArquivosController arqCont = new ArquivosController();
		String path1 = "C:\\Windows";
		String path = "C:\\temp";
		
		try {
//			arqCont.leDir(path1);
//			arqCont.escreveArquivo(path, "cadastro.csv");
//			arqCont.leArquivo(path, "cadastro.csv");
			arqCont.abreArquivo(path, "cadastro.csv");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
