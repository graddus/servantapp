package servant.persistence;

import java.util.ArrayList;

import servant.domain.Servant;

public interface ServantDao{
		ArrayList<Servant> getAllServants();
		Servant getServantByID(int i);
		ArrayList<Servant> getServantByClass(String servantclass);
}
