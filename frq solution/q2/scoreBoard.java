public class scoreBoard {
  private String t1;
  private String t2;
  private int s1;
  private int s2;
  private String active;
  public scoreBoard(String team1,String team2) {
    t1 = team1;
    t2 = team2;
    active = t1;
    s1 = 0;
    s2 = 0;
  }
  public String getScore() {
    String s = "";
    return (s + s1 + "-" + s2 + "-" + active);
  }
  public void recoredPlay(int score) {
    if(score != 0 && active.equals(t1)) {
      t1 += score;
    } else {
      t2 += score;
    }
    if(score == 0 && active.equals(t1)) {
      active = t2;
    } else if(score == 0 && active.equals(t2)) {
      active = t1;
    }
  }
}
