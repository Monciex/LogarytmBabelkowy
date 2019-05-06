import java.util.Arrays;

class main {

    public static void main(String[] args) {

        int wek[] = { 5, 1, 2, 4, 3 };
        for (int j = 0; j < wek.length - 1; j++) {

            for (int i = 0; i < wek.length - 1; i++) {
                
                if (wek[i] > wek[i + 1]) {
                    int basic = wek[i];
                    wek[i] = wek[i + 1];
                    wek[i + 1] = basic;
                }
            }
        }
        System.out.println(Arrays.toString(wek));

    }
}
