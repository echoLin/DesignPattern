package Builder.Text;

/**
 * Builder Pattern 介绍的是循序渐进组合较复杂的对象实例，组合过程的详细处理则隐藏在Director参与者中。
 * Main类中并不知道Builder类的方法，Main类只调用Director类的construct方法；
 * Director类唯一知道的就是Builder类，但Director类并不知道利用的是Builder类的哪个子类，因此Director类中才有通用的方法，使得Director这个零件具有独立性
 * @author echo
 * */
public class Main {

	public static void main(String[] args) {
		args = new String[1];
		args[0] = "plain";
		if (args.length != 1) {
            usage();
            System.exit(0);
        }
        if (args[0].equals("plain")) {
            TextBuilder textbuilder = new TextBuilder();
            Director director = new Director(textbuilder);
            director.construct();
            String result = textbuilder.getResult();
            System.out.println(result);
        } else if (args[0].equals("html")) {
            HTMLBuilder htmlbuilder = new HTMLBuilder();
            Director director = new Director(htmlbuilder);
            director.construct();
            String filename = htmlbuilder.getResult();
            System.out.println(filename + "‚ªì¬‚³‚ê‚Ü‚µ‚½B");
        } else {
            usage();
            System.exit(0);
        }
	}

	public static void usage() {
        System.out.println("Usage: java Main plain      Text");
        System.out.println("Usage: java Main html       HTML");
    }
}
