public class Card {
    public enum Suit{
        HEARTS, DIAMONDS, CLUBS, SPADES;
    }

    public enum Rank{
        ACE(11), TWO(1) , THREE(2) , FOUR(3) , FIVE(4) , SIX(5) , SEVEN(6) , EIGHT(7) , NINE(8) , TEN(10) , JACK(10) ,QUEEN(10) ,KING(10);
        
        int points;
        Rank(int points){
            this.points = points;
        }

        public int getPoints(){
            return this.points;
        }
    }

    public static void main(String []args){
        Card card = new Card();

        for(Rank r : Rank.values()){
            System.out.println(r.name()+"->"+r.ordinal());
            System.out.println();
        }
    }
}
