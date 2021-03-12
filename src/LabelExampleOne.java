
//we want to break the outer loop when the value of j (inner loop var) is 3.
public class LabelExampleOne {

    public static void main(String[] args) {

        p:
        for (int i = 1; i <= 5; i++) {

            q:
            for (int j = 1; j <= 5; j++) {

                if (j == 3) {
                    break p;    //outer (loop with label p)
                }

                System.out.println(j);

            }

        }

    }
}
