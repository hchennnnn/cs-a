public class feeder {
  private int currentFood;
  public feeder(int num) {
    currentFood = num;
  }
  public void simulateOneDay(int num) {
    int prob = (int)(Math.random()*100 + 1;
    int food = (int)(Math.random()*41 + 10;
    if(prob <= 5) {
      currentFood = 0;
    } else {
      currentFood -= (food * num);
    }
  }
  public int simulateManyDays(int numBird,int numDay) {
    if(currentFood == 0) {
      return 0;
    }
    for(int i = 1;i <= numDay;i++) {
      simulateOneDay(numBird);
      if(currentFood == 0) {
        return i;
      }
    }
    return numDay;
  }
}
