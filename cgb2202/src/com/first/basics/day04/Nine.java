package com.first.basics.day04;

public class Nine {
    //第一部分代码，通过回溯法随机生成符合九宫格规则的九宫格
    //用回溯法随机生成九宫格（此处只生成一个九宫格）
    //jiuGongGe作为临时储存随机生成的九宫格，当回溯法结束时，jiuGongGe将会变为初始状态；
    private static int jiuGongGe[][] = new int[9][9];

    // bl用来作为标记，当随机生成第一个九宫格时，将bl置为true，然后结束回溯。
    private static Boolean bl = false;

    // end_jiuGongGe用来储存最终随机生成的九宫格
    private static int end_jiuGongGe[][] = new int[9][9];

    /**
     * 判断在九宫格中的坐标(x,y)的位置上插入value，是否符合规则
     *
     * @param x
     * @param y
     * @param value
     * @return
     */
    public static Boolean legal(int a[][], int x, int y, int value) {

        for (int i = 0; i < 9; i++) {
            //如果列中有value，则返回false
            if (i != x && a[i][y] == value) {
                return false;
            }
            //如果行中有value，则返回false
            if (i != y && a[x][i] == value) {
                return false;
            }
        }

        //(minX,minY)是(x,y)所属小九宫格的左上角的坐标
        int minX = x / 3 * 3;
        int minY = y / 3 * 3;

        for (int i = minX; i < minX + 3; i++) {
            for (int j = minY; j < minY + 3; j++) {
                //如果小九宫格中的非(x,y)的坐标上的值为value，返回false
                if (i != x && j != y && a[i][j] == value) {
                    return false;
                }
            }
        }

        return true;
    }
}
