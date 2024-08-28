
class HelloWorld {
   public String longestString(String[] words) {
  if (words == null || words.length == 0)  {
    return "";
  }
  String longest = words[0];
  for  (String word : words ) {
    if(word.length() > longest.length()) {
      longest = word;
    }
  }
  return longest;
}

public static void main(String[] args) {
   HelloWorld hello = new HelloWorld();
   String[] words = {"hello", "world", "abc", "defghi"};
   System.out.println(hello.longestString(words));
}

}

