package lgscourse.javacore.lesson10.Palindromes;

import java.io.*;

public class Application {

	public static void main(String[] args) {
		BufferedReader  bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Веддіть слово: ");
		Palindrome word = null;
		try {
			word = new Palindrome(bufferedReader.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(word);
		System.out.println("Замінимо голосні тире");
		word.replaceVowelsWithDashes();
		System.out.println(word);
		
		
		System.out.println("Веддіть речення: ");
		String sentence=null;
		try {
			sentence = bufferedReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		numberWordsInSentence(sentence);
		
		
		System.out.println("Веддіть текст: ");
		String text=null;
		try {
			text = bufferedReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		numberSentencesInText(text);
		
		System.out.println("Веддіть речення: ");
		try {
			sentence = bufferedReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		firstMostCommonlyInSentences(sentence);
		
		System.out.println("Веддіть текст: ");
		text=null;
		try {
			text = bufferedReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		firstMostCommonlyInSentences(text);
	}
	
	public static void numberWordsInSentence(String sentence){
		int words = 0;
		for (String string : sentence.split(" ")) {
			System.out.println(string);
			++words;
		}
		System.out.println("number of words: "+ words);
	}
	public static void numberSentencesInText(String text){
		System.out.println(text);
		int sentences = 0;
		for (String string : text.split("[.]")) {
			System.out.println(string + ".");
			++sentences;
		}
		System.out.println("number of sentences: "+ sentences);
	}

	public static void firstMostCommonlyInSentences(String sentenceOrText){
		sentenceOrText = sentenceOrText.replace('-', ' ');
		sentenceOrText = sentenceOrText.replace('.', ' ');
		sentenceOrText = sentenceOrText.replace(',', ' ');
		sentenceOrText = sentenceOrText.replace('?', ' ');
		sentenceOrText = sentenceOrText.replace('!', ' ');
		sentenceOrText = sentenceOrText.replace("  ", " ");
		String[] words = sentenceOrText.split(" ");
		int max = 1;
		for (int i = 0; i < words.length; i++) {
			int count=1;
			for (int j = 0; j < words.length; j++) {
				if(i!=j && words[i].equalsIgnoreCase(words[j])) {
					count++;
				}
			}
			if(max < count)
				max = count;
		}
		for (int i = 0; i < words.length; i++) {
				int count=0;
				for (int j = 0; j < words.length; j++) {
					if(words[i].equalsIgnoreCase(words[j])) {
						count++;
					}
				}
				if(max == count){
					System.out.println("Найбільш часто в реченні зустрічається слово - " + words[i]);
					break;
				}
		}
	}
}
			