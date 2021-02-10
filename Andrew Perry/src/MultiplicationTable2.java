public class MultiplicationTable2 {
        public static void main(String[] arguments) {
            int num;
            int mult = 0;
            int sqrSize = 9;
            int sqrSizeHolder = sqrSize;

            //Loop Start
            while (mult < sqrSizeHolder) {

                //New Line and Multiplier
                mult = mult + 1;
                System.out.println();
                num = 0  + mult;

                //Square Reset
                sqrSize = sqrSizeHolder;
                while (sqrSize != 0) {

                    //Printer
                    //Single digit
                    if(num <= 9) {
                        System.out.print(" " + num + " ");
                    }
                    //Double digit
                   else {
                        System.out.print(num + " ");
                    }

                   //Number increase and Place correction
                   num = num + mult;
                   sqrSize = sqrSize--;
                }
            }
        }
}



