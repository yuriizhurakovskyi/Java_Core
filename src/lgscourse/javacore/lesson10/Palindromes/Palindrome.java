package lgscourse.javacore.lesson10.Palindromes;

public class Palindrome {
	private String word;

	public Palindrome(String word) {
		if(word.length()!=5)
			System.out.println("����� ������ ���� 5 ����");
		else {
			String w = word.toLowerCase();
			if(w.charAt(0)==w.charAt(4)&& w.charAt(1)==w.charAt(3)) {
				System.out.println("�� ����� ��������!");
				this.word = word;
			} else System.out.println("�� ����� �� ��������!");
		}
	}
	
	public void replaceVowelsWithDashes() {
		if(this.word!=null) {
			this.word= this.word.replace('a', '-');
			this.word= this.word.replace('�', '-');
			this.word= this.word.replace('�', '-');
			this.word= this.word.replace('�', '-');
			this.word= this.word.replace('�', '-');
			this.word= this.word.replace('�', '-');
			this.word= this.word.replace('�', '-');
			this.word= this.word.replace('�', '-');
			this.word= this.word.replace('�', '-');
			this.word= this.word.replace('�', '-');
			this.word= this.word.replace('�', '-');
			this.word= this.word.replace('�', '-');
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
		}else System.out.println("����� ������");
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
		else return "����� ������";
	}
}
