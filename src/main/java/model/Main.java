package model;

import ladder.Ladder;
import view.InputView;
import view.PrintView;

public class Main {
    public static void main(String[] args) {
        String[] names = InputView.humans();
        int height = InputView.height();
        String[] result = InputView.result(names);

        Ladder ladder = new Ladder(height, names);
        ladder.makeLadders();

        PrintView.totalPrint(ladder, result);
    }
}
