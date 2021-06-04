package Lab8.com.capgemini;

import java.io.File;


public class Exercise1FileProgram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File sm_source=new File("D:\\CapgeminiJA17\\LabBookPrograms\\src\\com\\capgemini\\lab8\\source.txt");
		File sm_target=new File("D:\\CapgeminiJA17\\LabBookPrograms\\src\\com\\capgemini\\lab8\\target.txt"); 
		Exercise1CopyDataThread cdt = new Exercise1CopyDataThread();
		cdt.start();
	}

}
