public class Waddle {
    public static void main(String[] args)  {
        WaddlePaddle walker = new WaddlePaddle("Walker");
        try {
            walker.animatewalk();
        }
        catch(Exception e){}
    }
}
