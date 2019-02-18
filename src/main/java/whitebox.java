public class whitebox {

    private int mi, ma, obs;

        public String whiteBoxTest(String[] args ){

            /* 1 */
            if (args.length == 0){
                return "No numbers";
            }

            else

            {
                //Set both the mi(n) and ma(x) int to the 0 element in the given Array
                mi = ma = Integer.parseInt(args[0]);

                /* 2 */
                for (int i = 1; i < args.length; i++)
                {
                    //Assign the current array to obs
                    obs = Integer.parseInt(args[i]);

                    /* 3 */
                    //If the current integer obs is > greater than the current max,
                    //assign ma the value of obs
                    if (obs > ma){
                        ma = obs;
                    }

                    /* 4 */
                    //If the integer mi is < less than the current obs,
                    //assign mi the value of obs
                    //THIS IS WHERE THE ERROR IS!
                    //Should be (obs < min)!
                    else if (mi < obs){
                        mi = obs;
                    }
                }
                return "Minimum = " + mi + "; maximum = " + ma;
            }
        }

}
