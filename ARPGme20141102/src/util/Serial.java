package util;
import java.io.Serializable;

public class Serial implements Serializable{
	/**序列化运行时使用一个称为 serialVersionUID 的版本号与每个可序列化类相关联，该序列号在反序列化过程中用于验证序列化对象的发送者和接收者是否为该对象加载了与序列化兼容的类。
	 * 如果接收者加载的该对象的类的 serialVersionUID 与对应的发送者的类的版本号不同，则反序列化将会导致 InvalidClassException。
	 * 可序列化类可以通过声明名为 "serialVersionUID" 的字段（该字段必须是静态 (static)、最终 (final) 的 long 型字段）显式声明其自己的 serialVersionUID：
      如果可序列化类未显式声明 serialVersionUID，则序列化运行时将基于该类的各个方面计算该类的默认 serialVersionUID 值，如“Java(TM) 
      对象序列化规范”中所述。不过，强烈建议所有可序列化类都显式声明 serialVersionUID 值，原因计算默认的 serialVersionUID 
      对类的详细信息具有较高的敏感性，根据编译器实现的不同可能千差万别，这样在反序列化过程中可能会导致意外的 InvalidClassException。
      因此，为保证 serialVersionUID 值跨不同 java 编译器实现的一致性，序列化类必须声明一个明确的 serialVersionUID 
      值。还强烈建议使用 private 修改器显示声明 serialVersionUID（如果可能），原因是这种声明仅应用于立即声明类 -- serialVersionUID 字段作为继承成员没有用处。*   */ 
	private static final long serialVersionUID = 6977402643848374753L; 
	
	int id;       
	String name;       
	public Serial(int id, String name) 
	{           
		this.id = id;           
		this.name = name;       
	}       
	public String toString() 
	{         
		return "DATA: " + id + " " +name;        
	}  
}