package miniintr;

public class MiniInterpreter {
    private void usage() {
        System.out.println("[USAGE] miniintr.MiniInterpreter EXPRESSION");
    }

    private int eval(String expression) {
        int ret = 0;
        int first = expression.charAt(0);
        if ((first == '+')
            || (first == '-')
            || (first == '*')
            || (first == '/')) {
            int op = first;
            int lhs_idx = expression.indexOf(' ') + 1;
            String lhs_str = expression.substring(lhs_idx);
            int lhs = this.eval(lhs_str);
            int rhs_idx = expression.indexOf(' ', lhs_idx) + 1;
            String rhs_str = expression.substring(rhs_idx);
            int rhs = this.eval(rhs_str);
            switch (op)
                {
                case '+':
                    return lhs + rhs;
                case '-':
                    return lhs - rhs;
                case '*':
                    return lhs * rhs;
                case '/':
                    return lhs / rhs;
                }
        }

        int last = expression.indexOf(' ');
        int len = (last < 0) ? expression.length() : last;
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
