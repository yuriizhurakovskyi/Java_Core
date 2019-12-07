package lgscourse.javacore.lesson10.Palindromes;

public class Palindrome {
	private String word;

	public Palindrome(String word) {
		if(word.length()!=5)
			System.out.println("Слово мусить мати 5 літер");
		else {
			String w = word.toLowerCase();
			if(w.charAt(0)==w.charAt(4)&& w.charAt(1)==w.charAt(3)) {
				System.out.println("Це слово паліндром!");
				this.word = word;
			} else System.out.println("Це слово не паліндром!");
		}
	}
	
	public void replaceVowelsWithDashes() {
		if(this.word!=null) {
			this.word= this.word.replace('a', '-');
			this.word= this.word.replace('А', '-');
			this.word= this.word.replace('о', '-');
			this.word= this.word.replace('О', '-');
			this.word= this.word.replace('у', '-');
			this.word= this.word.replace('У', '-');
			this.word= this.word.replace('е', '-');
			this.word= this.word.replace('Е', '-');
			this.word= this.word.replace('и', '-');
			this.word= this.word.replace('И', '-');
			this.word= this.word.replace('і', '-');
			this.word= this.word.replace('І', '-');
			this.word= this.word.replace('a', '-');
			this.word= this.word.replace('A', '-');
			this.word= this.word.replace('e', '-');
			this.word= this.word.replace('E', '-');
			this.word= this.word.replace('i', '-');
			this.word= this.word.replace('I', '-');
			this.word= this.word.replace('o', '-');
			this.word= this.word.replace('O', '-');
			this.word= this.word.replace('u', '-');
			this.word= this.word.replace('U', '-');
			this.word= this.word.replace('y', '-');
			this.word= this.word.replace('Y', '-');
		}else System.out.println("Слово відсутнє");
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	@Override
	public String toString() {
		if(this.word!=null)
			return "\nPalindrome is " + this.word + "\n";
		else return "Слово відсутнє";
	}
}
