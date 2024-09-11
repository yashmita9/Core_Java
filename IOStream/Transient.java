package In.com.IOStream;

import java.io.Serializable;

public class Transient implements Serializable{

	public String name = null;
	public int maths = 0;
	public int phy = 0;
	int chem = 0;
	transient int total = 0;
	private transient double percentage =0;
}
