public class pieceByPiece{
	public static void main(String[] args){
		for (String line = "abc def"; line.indexOf(' ')!=-1; line = line.substring(line.indexOf(' ')+1)){
			IO.outputStringAnswer(line.substring(0,line.indexOf(' ')));
		}
	}
}