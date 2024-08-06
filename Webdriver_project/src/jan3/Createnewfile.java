package jan3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Createnewfile {

	public static void main(String[] args) throws Throwable {
		File f = new File("d:/sample.text");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("iam learning python");
		bw.newLine();
		bw.write("iam learning sap");
		bw.newLine();
		bw.write("iam learning servicenow");
		bw.flush();
		bw.close();

	}

}
