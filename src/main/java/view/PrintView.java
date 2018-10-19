package view;

import ladder.Ladder;
import ladder.Line;

import java.util.HashMap;
import java.util.List;

public class PrintView {
    static StringBuilder stringBuilder = new StringBuilder();

    public static void totalPrint(Ladder ladder, String[] result) {
        String showResult = InputView.showResult();
        List<Line> ladders = ladder.getLadders();
        String[] names = ladder.getPeople();
        HashMap<Integer, Integer> resultHash = ladder.moveLine();
        printResult(ladders, names, result);
        checkResult(resultHash, result, names, showResult);
        System.out.println(String.valueOf(stringBuilder));
    }

    public static void printResult(List<Line> ladders, String[] names, String[] result) {
        for (int i = 0; i < names.length; i++) {
            stringBuilder.append(String.format("%-6s", names[i]));
        }
        stringBuilder.append("\n");
        for (int i = 0; i < ladders.size(); i++) {
            insidePrintResult(ladders, names, i);
            stringBuilder.append("\n");
        }

        for (int i = 0; i < result.length; i++) {
            stringBuilder.append(String.format("%-6s", result[i]));
        }
        stringBuilder.append("\n");
    }

    private static void insidePrintResult(List<Line> ladders, String[] names, int i) {
        for (int j = 0; j < names.length; j++) {
            printBar();
            stringBuilder.append(printDash(ladders, i, j));
        }
    }

    public static void printBar() {
        stringBuilder.append("|");
    }

    private static String printDash(List<Line> ladders, int i, int j) {
        if (ladders.get(i).getPoints().get(j)) {
            return "-----";
        }
        return "     ";
    }

    public static void checkResult(HashMap<Integer, Integer> hashMap, String[] result, String[] names, String resultShow) {
        if (resultShow.equals("all")) {
            for (int i = 0; i < result.length; i++) {
                stringBuilder.append(names[i] + " : " + result[hashMap.get(i)]);
                stringBuilder.append("\n");
            }
        }
        for (int i = 0; i < result.length; i++) {
            if (resultShow.equals(names[i])) {
                stringBuilder.append(result[hashMap.get(i)]);
            }
        }
    }
}