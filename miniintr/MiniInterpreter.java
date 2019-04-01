package miniintr;

public class MiniInterpreter {
    private void usage() {
        System.out.println("[USAGE] miniintr.MiniInterpreter EXPRESSION");
    }

    private int eval(String expression) {
        int ret = 0;
        int len = expression.length();
        if (expression.charAt(0) == '+') {
            int lhs = this.eval(expression.substring(2,3));
            int rhs = this.eval(expression.substring(4));
            return lhs + rhs;
        }

        for (int i = 0; i < len; i++) {
            ret = ret * 10 + expression.charAt(i) - '0';
        }
        return ret;
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
