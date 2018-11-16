public class array { 
 public static void main(String[] args) { 
  char[] word = {'a','b','f','u','g','i','o','r'};

}
public static int countVowels(char[] word) {
int vowelCount = 0; 

for (int i = 0; i < word.length; i++) 
{ 
char c = word[i]; 
if ( (c == 'a') 
|| (c == 'e') 
|| (c == 'i') 
|| (c == 'o') 
|| (c == 'u') 
|| (c == 'A') 
|| (c == 'E') 
|| (c == 'I') 
|| (c == 'O') 
|| (c == 'U') 
) 
vowelCount++; 
  }
return vowelCount;
  } 
}