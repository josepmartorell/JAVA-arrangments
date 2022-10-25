package WordSplitter;

public class wordSplitter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String[] words = new String[]{"TORO", "GEMA", "GOMA", "PISO", "RABO", "TIMO", "RETO", "COCO", "MESA", "COPA"}; 
		String word;
		
		String[]letters; 
		
		int randomNumber = (int)Math.floor(Math.random()*9);
		word = words[randomNumber];
		
		System.out.println("WORD: "+word);
		
		letters = wordSplited(word);
		
		for (int i = 0; i < letters.length; i++) {
			System.out.println("SPLITER: "+letters[i]);
		}
		

		

	}
	
	public static String[] wordSplited(String str) {
		return str.split("");
	}

}
