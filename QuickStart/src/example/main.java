package example;

import it.zielke.moji.SocketClient;

import java.io.File;
import java.net.URL;
import java.util.Collection;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// a list of students' source code files located in the prepared
		// directory.
		System.out.println("Primeiro é preciso que os arquivos estejam em uma hierarquia especifica e dentro da pasta ArquivosParaTeste!");
		System.out.println("ArquivosParaTeste");
		System.out.println("	¬Aluno1");
		System.out.println("		¬arquivoX.java");
		System.out.println("	¬Aluno2");
		System.out.println("		¬arquivoY.java");
		
		//Se estiver usado em alguma outra pasta diferente da padrão, basta mudar nessa linha!
		Collection<File> files = FileUtils.listFiles(new File(
				"C:\\QuickStart\\ArquivosParaTeste"), new String[] { "java" }, true);

		// get a new socket client to communicate with the MOSS server
		// and set its parameters.
		SocketClient socketClient = new SocketClient();

		// set your MOSS user ID
		System.out.println("Agora, insira o seu ID: ");
		socketClient.setUserID(sc.nextLine());
		// socketClient.setOpt...

		// set the programming language of all student source codes
		socketClient.setLanguage("java");

		// initialize connection and send parameters
		socketClient.run();

		// upload all source files of students
		for (File f : files) {
			socketClient.uploadFile(f);
		}

		// finished uploading, tell server to check files
		socketClient.sendQuery();

		// get URL with MOSS results and do something with it
		URL results = socketClient.getResultURL();
		System.out.println("Results available at " + results.toString());
	}
}
