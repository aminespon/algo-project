class Main {

  public static void main(String[] args) {
    String line = "This website is aw3som3.";
    int vowels = 0, consonants = 0, digits = 0, spaces = 0;
     int wordCount = 0;  

    line = line.toLowerCase();
    for (int i = 0; i < line.length(); ++i) {
      char ch = line.charAt(i);

      
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        ++vowels;
      }

     
    }
     for(int i = 0; i < line.length()-1; i++) {  
           
            if(line.charAt(i) == ' ' && Character.isLetter(line.charAt(i+1)) && (i > 0)) {  
                wordCount++;  
            }  
        }  
        
        wordCount++;  
          
        
        System.out.println("Total number of words in the given string: " + wordCount); 

    System.out.println("Vowels: " + vowels);
    System.out.println("string length is: "+line.length());
  
    
  }
}
