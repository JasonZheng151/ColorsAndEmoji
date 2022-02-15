public class WaddlePaddle {
    private final String BLUE = "\u001B[36m";
    private final String RED = "\u001B[31m";
    private final String BROWN = "\u001B[33m";
    private final String WHITE = "\u001b[37m";
    private final String BLACK = "\u001B[30m";
    private final String CYAN = "\033[0;34m";
    private final String BLUE_BRIGHT = "\033[0;94m";
    private final String PURPLE = "\033[0;35m";
    private final String GREEN_APPLE_EMOJI = "\uD83C\uDF4F";

    // instance variable
    private String name;

    // constructor
    public WaddlePaddle(String name)
    {
        this.name = name;
    }
    public void animatewalk() throws InterruptedException
    {
        System.out.print(RED);
        int count=0;
        while(count!=1000)
        {
            System.out.println("(0-0)\n /|\\\n /\\");
            Thread.sleep(500);

            System.out.println("(0-o)\n|\\\n/\\");
            Thread.sleep(500);

            System.out.println("(o-o)\n |\\\n/");
            Thread.sleep(500);

            System.out.println("(q-q)\n/|\n/\\\\");
            Thread.sleep(500);

            System.out.println("(O+0)\n|\\\n/\\");
            Thread.sleep(500);

            System.out.println(" O\n<|>\n/\\");
            Thread.sleep(500);

            System.out.println("(OOOOO---00000)\n        |\\\n        /\\");
            Thread.sleep(500);
            System.out.print(RED);
            count++;
        }
    }
}
