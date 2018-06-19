package servant.domain;

import java.util.ArrayList;

public class ServantClass {
	private int id;
	private String classname;
	private ArrayList<Servant> servantlist;

	public ServantClass(int id, String classname, ArrayList<Servant> servantlist) {
		super();
		this.id = id;
		this.classname = classname;
		this.servantlist = servantlist;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public ArrayList<Servant> getServantlist() {
		return servantlist;
	}

	public void setServantlist(ArrayList<Servant> servantlist) {
		this.servantlist = servantlist;
	}
}
