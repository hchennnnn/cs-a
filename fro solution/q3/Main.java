import java.util.*;
public class wordChecker {
  private ArrayList<String> wordList;
  public wordChecker(ArrayList<String> list) {
    wordList = list;
  }
  public boolean isWordChain() {
    for(int i = 1;i < wordList.size();i++) {
      if(wordList.get(i).indexOf(wordList.get(i-1)) < 0) {
        return false;
      }
    }
    return true;
  }
  public ArrayList<String> createList(String target) {
    ArrayList<String> s = new ArrayList<String>();
    for(int i = 0;i < wordList.size();i++) {
      if(wordList.get(i).indexOf(target) == 0) {
        s.add(wordList.get(i).substring(target.length()));
      }
    }
    return s;
  }
}
