import java.util.Vector;

public class UlamP {

    public static void main(String[] args) {
        System.out.println(ulam(4));
        System.out.println(ulam(206));
    }

    /** Метод для вычисления n-числа в последовательности Улама **/
    public static int ulam(int n) {
        Vector<Integer> vecnum = new Vector();
        vecnum.add(1);
        vecnum.add(2);
        for (int i = 3; i < 5000; i++) {
            int res = 0;
            for (int j = 0; j < vecnum.size() - 1; j++)
                for (int k = j + 1; k < vecnum.size(); k++)
                    if (vecnum.get(j) + vecnum.get(k) == i) res++;
            if (res == 1) vecnum.add(i);
            if (vecnum.size() == n) return i;
        }

        return 0;
    }

}
