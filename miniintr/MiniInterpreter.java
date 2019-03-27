package miniintr;

public class MiniInterpreter {
    private void usage() {
        System.out.println("[USAGE] miniintr.MiniInterpreter EXPRESSION");
    }

    private int eval(String expression) {
        return expression.charAt(0) - '0';
    }

    public static void main(String[] args) {
        MiniInterpreter intr = new MiniInterpreter();
        if (args.length < 1) {
            intr.usage();
            System.exit(1);
        }

        System.out.println(intr.eval(args[0]));
    }
}
