package Builder.Text;

/**
 * 利用construct方法产生一份具体的文件，文件格式有builder类型指定
 * @author echo
 * */
public class Director {
	private Builder builder;
	public Director(Builder builder){
		this.builder = builder;
	}
	
	public void construct(){
		builder.makeTitle("Greeting");
		builder.makeString("Hello world");
		builder.makeItems(new String[]{"item one", "item two"});
		builder.makeString("Hello honey");
		builder.makeItems(new String[]{"item three", "item four", "item five"});
		builder.close();
	}
}
