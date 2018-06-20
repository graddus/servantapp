package servant.domain;

public class Servant {
	private int id;
	private String name;
	private String title;
	private String gender;
	private String servantclass;
	private int attackstat;
	private int defensestat;
	private String attribute;
	private String shortdesc;
	private String description;
	private String appearance;
	private String biography;
	private int height;
	private int weight;
	private String region;
	
	public Servant(int id, String name, String title, String gender, String servantclass, int attackstat,
			int defensestat, String attribute, String shortdesc, String description, String appearance,
			String biography, int height, int weight, String region) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.gender = gender;
		this.servantclass = servantclass;
		this.attackstat = attackstat;
		this.defensestat = defensestat;
		this.attribute = attribute;
		this.shortdesc = shortdesc;
		this.description = description;
		this.appearance = appearance;
		this.biography = biography;
		this.height = height;
		this.weight = weight;
		this.region = region;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getServantclass() {
		return servantclass;
	}

	public void setServantclass(String servantclass) {
		this.servantclass = servantclass;
	}

	public int getAttackstat() {
		return attackstat;
	}

	public void setAttackstat(int attackstat) {
		this.attackstat = attackstat;
	}

	public int getDefensestat() {
		return defensestat;
	}

	public void setDefensestat(int defensestat) {
		this.defensestat = defensestat;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public String getShortdesc() {
		return shortdesc;
	}

	public void setShortdesc(String shortdesc) {
		this.shortdesc = shortdesc;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAppearance() {
		return appearance;
	}

	public void setAppearance(String appearance) {
		this.appearance = appearance;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
}
	