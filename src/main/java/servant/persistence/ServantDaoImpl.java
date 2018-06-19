/*package servant.persistence;

import java.util.ArrayList;

import servant.domain.Servant;
import servant.domain.ServantClass;

public class ServantDaoImpl extends BaseDao implements ServantDao{
	public ServantDaoImpl() {
	}

	*//**
	 * Made it so that this func retrieves all rules and not rules based on id
	 *
	 * @return
	 *//*
	public ArrayList<Servant> getAllServants() {
		ArrayList<Servant> list = new ArrayList<Servant>();
		try (Connection conn = super.getConnection()) {
			PreparedStatement statement = conn.prepareStatement("SELECT * from Servants");
			statement.executeQuery();
			ResultSet rs = statement.executeQuery();

			int id;
			String naam;
			String omschrijving;
			double prijs;
			String fabrikant;
			Servant servant;

			while (rs.next()) {
				id = rs.getInt("id");
				naam = rs.getString("naam");
				omschrijving = rs.getString("omschrijving");
				prijs = rs.getDouble("Prijs");
				fabrikant = rs.getString("fabrikant");
				java.sql.Blob blob = rs.getBlob("Afbeelding");
				InputStream in = blob.getBinaryStream();
				BufferedImage image = ImageIO.read(in);
				product = new Product(naam, image, prijs, id, omschrijving, fabrikant);
				list.add(product);
			}
			rs.close();
			statement.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}

	public Servant getServantByID(int i) {
		Servant s=null;
		try (Connection conn = super.getConnection()) {
			PreparedStatement statement = conn.prepareStatement("SELECT * from Producten Where ID=?");
			statement.setInt(1, i);
			statement.executeQuery();
			ResultSet rs = statement.executeQuery();

			int id;
			String naam;
			String omschrijving;
			double prijs;
			String fabrikant;

			while (rs.next()) {
				id = rs.getInt("id");
				naam = rs.getString("naam");
				omschrijving = rs.getString("omschrijving");
				prijs = rs.getDouble("Prijs");
				fabrikant = rs.getString("fabrikant");
				java.sql.Blob blob = rs.getBlob("Afbeelding");
				InputStream in = blob.getBinaryStream();
				BufferedImage image = ImageIO.read(in);
				r = new Product(naam, image, prijs, id, omschrijving, fabrikant);
			}
			rs.close();
			statement.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return r;
	}

	public ArrayList<ServantClass> getAllClasses() {
		ArrayList<Servant> result = new ArrayList<Servant>();
		try (Connection conn = super.getConnection()) {
			PreparedStatement statement = conn.prepareStatement("SELECT * from CategorieProduct where categoryid=?");
			statement.setInt(1, catid);
			statement.executeQuery();
			ResultSet rs = statement.executeQuery();

			Product prod = null;

			while (rs.next()) {
				prod = getProductByID(rs.getInt("productid"));
				result.add(prod);
			}
			rs.close();
			statement.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public ServantClass getClassById(int catid) {
		ArrayList<Servant> result = new ArrayList<Servant>();
		try (Connection conn = super.getConnection()) {
			PreparedStatement statement = conn.prepareStatement("SELECT * from CategorieProduct where categoryid=?");
			statement.setInt(1, catid);
			statement.executeQuery();
			ResultSet rs = statement.executeQuery();

			Product prod = null;

			while (rs.next()) {
				prod = getProductByID(rs.getInt("productid"));
				result.add(prod);
			}
			rs.close();
			statement.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public ArrayList<Servant> getServantsByClass(int classid){
		return getClassById(classid).getServantlist();
	}

}
*/