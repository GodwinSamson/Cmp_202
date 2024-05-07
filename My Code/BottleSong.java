public class BottleSong {
    public static void main (String [] args) {
        int bottlesNum = 99;
        String word = "bottle";
        String sentence_1 = " bottles of beer on the wall, ";
        String sentence_2 = " bottles of beer";
        while (bottlesNum > 0) {
            if (bottlesNum == 1) {
                word = "bottle"; // one bottle.
            }
            if (bottlesNum == 1) {
                System.out.println(bottlesNum + " "+ word + " of beer on the wall ," + bottlesNum + " bottle of beer on the wall");
            }
            System.out.println(bottlesNum + sentence_1 + bottlesNum + sentence_2);

           
        
            bottlesNum = bottlesNum - 1;
            if (bottlesNum > 0) {
                System.out.println("Take one down and pass it around, " + bottlesNum + sentence_1);
            
            


            } else {
                System.out.println("Take one down and it around, no more bottles of beers on the wall.");
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
                System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");

            }


        }
    }
    
}
