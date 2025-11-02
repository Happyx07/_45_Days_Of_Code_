package _21_Day.BasicProblems;

public class _03_CountVowelsConsonants {
  public static void main(String[] args) {
    System.out.println("\n=== VOWEL & CONSONANT COUNTING CHALLENGE ===");
    String sentence = "Programming is Fun";
    
    int vowelCount = 0;
    int consonantCount = 0;
    
    System.out.println("Original sentence: \"" + sentence + "\"");
    
    // 🎯 ENHANCED SOLUTION: Handle both cases
    for(char c : sentence.toCharArray()) {
      // Convert to lowercase for easy checking
      char lowerC = Character.toLowerCase(c);
      
      // Check if it's a letter
      if(Character.isLetter(c)) {
        if("aeiou".indexOf(lowerC) != -1) {
          vowelCount++;
        } else {
          consonantCount++;
        }
      }
      // Skip spaces and punctuation
    }
    
    System.out.println("Vowels found: " + vowelCount);
    System.out.println("Consonants found: " + consonantCount);
    System.out.println("Total letters: " + (vowelCount + consonantCount));
    
    // 🎯 BONUS: Show which characters are vowels
    System.out.print("Vowels found: ");
    for(char c : sentence.toCharArray()) {
      char lowerC = Character.toLowerCase(c);
      if(Character.isLetter(c) && "aeiou".indexOf(lowerC) != -1) {
        System.out.print(c + " ");
      }
    }
    System.out.println();
  }
}
