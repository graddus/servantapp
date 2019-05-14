package servant.domain;

import java.util.List;

public class ServantService {
	private DataSource data;

	public ServantService() {
		data = new DataSource();
	}

	public List<Servant> getAllServants() {
		return data.getData();
	}

	public Servant getServantById(int id) {
		Servant result = null;
		for (Servant s : data.getData()) {
			if (s.getId() == id) {
				result = s;
			}
		}
		return result;
	}
}
