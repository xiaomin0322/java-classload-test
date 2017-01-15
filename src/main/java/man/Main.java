package man;

import zzm.Z;

public class Main {

	
	//java -Djava.ext.dirs=D:\workspace\java-classload-test\lib -jar D:\workspace\java-classload-test\target\123-0.0.1-SNAPSHOT.jar
	 //执行结果为 1，因为先假装ext的类,可用于扩展class,替换相关jar中的class
	
	//java -jar D:\workspace\java-classload-test\target\123-0.0.1-SNAPSHOT.jar
   //执行结果3，本地的class  
	public static void main(String[] args) {
		 ///ZZM.p();
		 Z.p();
	}
}
