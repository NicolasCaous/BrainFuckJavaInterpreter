import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {

	private static final String CODE = "C:\\Users\\aluno\\Desktop\\code.txt";
	private static final String INPUT = "C:\\Users\\aluno\\Desktop\\input.txt";

	public static void main(String[] args) {

		BrainfuckInterpreter BrainFuck = new BrainfuckInterpreter();
		BufferedReader codebr = null;
		BufferedReader inputbr = null;
		FileReader codefr = null;
		FileReader inputfr = null;

		try {

			codefr = new FileReader(CODE);
			inputfr = new FileReader(INPUT);
			codebr = new BufferedReader(codefr);
			inputbr = new BufferedReader(inputfr);

			String sCurrentLineCode;
			String sCurrentLineInput;

			codebr = new BufferedReader(new FileReader(CODE));
			inputbr = new BufferedReader(new FileReader(INPUT));

			char code[] = codebr.readLine().toCharArray();
			char input[] = inputbr.readLine().toCharArray();
			
			int j = 0; //input
			looping loop = new looping();
			for(int i=0; i<code.length; i++) {
				if(code[i] == '>') 
					BrainFuck.MD();
				else if(code[i] == '<')
					BrainFuck.ME();
				else if(code[i] == '+') {
					BrainFuck.atual.valor++;
				}
				else if(code[i] == '-') {
					int tmp = BrainFuck.atual.valor--;
				}
				else if(code[i] == ',') {
					BrainFuck.atual.valor = input[j];
					j++;
				} else if(code[i] == '.') {
					char tmp = (char) (BrainFuck.atual.valor);
					System.out.print(tmp);
				} else if(code[i] == '[') {
					loop.push(i);
				} else if(code[i] == ']') {
					if(BrainFuck.atual.valor > 0) {
						i = loop.topo.valor;
					} else {
						loop.pop();
					}
				}
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (codebr != null)
					codebr.close();
				
				if (inputbr != null)
					inputbr.close();

				if (codefr != null)
					codefr.close();

				if (inputfr != null)
					inputfr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	}

}
