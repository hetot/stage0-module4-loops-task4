package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
            return;
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        }
        int res = 0;
        for (int i = 0; i <= lastInRow; i++) {
            if (numberToSkip == i) {
                System.out.println("skipped sum is " + (res + i));
                res = 0;
                continue;
            }
            res += i;
        }
        System.out.println("counted sum is " + res);
    }
}
