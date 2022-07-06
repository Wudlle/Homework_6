public class Homework_6 {
    public static void main(String[] args) {
        int[] a = {9, 4, 32, 3, 4, 15, 2, 6, -7};

        //228
//        int k = 3;
//        int sum = 0;
//        for (int i = 0; i < a.length; i++) {
//            if (i % k == 0) {
//                sum = sum + a[i];
//            }
//        }
//
//        System.out.println(sum);


        //229
//        int sum = 1;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] - i >= 0) {
//                sum *= a[i];
//            }
//        }
//
//        System.out.println(sum);

        //231

//        int sum = 0;
//        for (int j : a) {
//            if (j % 2 == 0) {
//                sum = sum + (j * j);
//            }
//        }
//
//        System.out.println(sum);


        //232

//        int count = 0;
//
//        for (int j : a) {
//            if (j % 2 == 0) {
//                count++;
//            }
//        }
//
//        System.out.println(count);


        //233

//        int sum = 0;
//        int product = 1;
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] % 2 == 0){
//                sum = sum + a[i];
//                product = product * a[i];
//            }
//        }
//
//        System.out.println("Sum = " + sum);
//        System.out.println("Product of a numbers = " + product);


        //234

//        int sum = 0;
//        int count = 0;
//
//        for (int j : a) {
//            if (j % 2 == 1) {
//                sum += j;
//                count++;
//            }
//        }
//
//        System.out.println(sum / count);


        //236

//        int count = 0;
//        int product = 1;
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] % 2 == 1 || a[i] % 2 == -1) {
//                product *= a[i];
//                count++;
//            }
//        }
//
//
//        System.out.println("Count = " + count);
//        System.out.println("Product of a numbers = " + product);


        //237

//        int countOfZero = 0;
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == 0) {
//                countOfZero++;
//            }
//        }
//
//
//        System.out.println(countOfZero);


        //238

//        int sum = 0;
//        int count = 0;
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] % 3 == 0) {
//                sum = sum + a[i];
//                count++;
//            }
//        }
//
//        System.out.println(sum / count);


        //240

//        int count = 0;
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] % 7 == 0) {
//                count++;
//            }
//        }
//
//        System.out.println(count);


        //241

//        int k = 4;
//        int sum = 0;
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] % k == 0) {
//                sum += a[i];
//            }
//        }
//
//        System.out.println(sum);

        //242

//        int m = 5;
//        int product = 1;
//
//        for (int j : a)
//            if (j % m == 0) {
//                product *= j;
//            }
//
//        System.out.println(product);


        //243

//        int t = 6;
//        int count = 0;
//
//        for (int j : a)
//            if (j % t == 0) {
//                count++;
//            }
//
//        System.out.println(count);


        //244

//        int product = 1;
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] % 5 == 2) {
//                product *= a[i];
//            }
//        }
//
//        System.out.println(product);


        //245

//        int sum = 0;
//
//        for (int i = 0; i < a.length; i++) {
//            if ((a[i] + i) % 3  == 0) {
//                sum = sum + (a[i] * a[i]);
//            }
//        }
//
//        System.out.println(sum);
        


        //248

//        int k = 3;
//        int sum = 0;
//
//        for (int i = 0; i < a.length; i++) {
//            if (((a[i] + i) * (a[i] + i)) % k == 0) {
//                sum += a[i];
//            }
//        }
//
//        System.out.println(sum);


        //250

//        int product = 1;
//
//        for (int i = 0; i < a.length; i++) {
//            if ((a[i] * i) % 3 == 2) {
//                product *= a[i];
//            }
//        }
//
//        System.out.println(product);


        //251

//        int max = a[0];
//
//        for (int i = 1; i < a.length; i++) {
//            if (a[i] > max) {
//                max = a[i];
//            }
//        }
//
//        System.out.println(max);


        //252


//        int min = a[0];
//
//        for (int i = 1; i < a.length; i++) {
//            if (a[i] < min) {
//                min = a[i];
//            }
//        }
//
//        System.out.println(min);


        //253


//        int min = a[0];
//        int max = min;
//
//        for (int i = 0, m = 0; i < a.length; i++, m++) {
//            if (a[i] < min){
//                min = a[i];
//            }
//            if (a[m] > max){
//                max = a[m];
//            }
//        }
//
//        System.out.println(min + max);


        //254


//        int min = a[0];
//        int max = min;
//
//        for (int i = 0, m = 0; i < a.length; i++, m++) {
//            if (a[i] < min){
//                min = a[i];
//            }
//            if (a[m] > max){
//                max = a[m];
//            }
//        }
//
//        System.out.println(min * max);


        //255


//        int max = a[0];
//        int index = 0;
//
//        for (int i = 1; i < a.length; i++) {
//            if (a[i] > max) {
//                max = a[i];
//                index = i;
//            }
//        }
//
//        System.out.println(max + index);


        //256

//        int min = a[0];
//        int index = 0;
//
//        for (int i = 1; i < a.length; i++) {
//            if (a[i] < min) {
//                min = a[i];
//                index = i;
//            }
//        }
//
//        System.out.println(min + index);


        //257

//        int max = a[0];
//        int index = 0;
//
//        for (int i = 1; i < a.length; i++) {
//            if (a[i] > max) {
//                max = a[i];
//                index = i;
//            }
//        }
//
//        System.out.println(index);


        //258


//        int max = a[0];
//        int index = 0;
//
//        for (int i = 1; i < a.length; i++) {
//            if (a[i] >= max) {
//                max = a[i];
//                index = i;
//            }
//        }
//
//        System.out.println(index);


        //259


//        int min = a[0];
//        int index = 0;
//
//        for (int i = 1; i < a.length; i++) {
//            if (a[i] < min) {
//                min = a[i];
//                index = i;
//            }
//        }
//
//        System.out.println(index);


        //260


//        int min = a[0];
//        int index = 0;
//
//        for (int i = 1; i < a.length; i++) {
//            if (a[i] <= min) {
//                min = a[i];
//                index = i;
//            }
//        }
//
//        System.out.println(index);

    }
}
