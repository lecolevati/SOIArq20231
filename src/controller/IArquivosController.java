package controller;

import java.io.IOException;

public interface IArquivosController {

	public void leDir(String path) throws IOException;
	public void escreveArquivo(String path, String arquivo) throws IOException;
	public void leArquivo(String path, String arquivo) throws IOException;
	public void abreArquivo(String path, String arquivo) throws IOException;
	
}
