package ladder;

import java.util.ArrayList;
import java.util.Random;

public class Line {
    private int peopleNum;
    private ArrayList<Boolean> points = new ArrayList<>();

    public Line(int peopleNum) {
        this.peopleNum = peopleNum;
    }

    public ArrayList<Boolean> getPoints() {
        return points;
    }

    public ArrayList<Boolean> oneLine(int peopleNum) {
        for (int i = 0; i < peopleNum - 1; i++) {
            boolean random = random();
            points.add(checkNextLine(i, random));
        }
        points.add(false);
        return points;
    }

    public boolean checkNextLine(int num, boolean random) {
        if (num > 0 && points.get(num - 1)) {
            return false;
        }
        return random;
    }

    public boolean random() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public int leftRightMove(int possition) {
        if (possition > 0 && points.get(possition - 1)) {
//            System.out.println("왼쪽");
            return possition -= 1;
        }
        if (possition < peopleNum && points.get(possition)) {
//            System.out.println("오른쪽");
            return possition += 1;
        }
        return possition;
    }
}