package servant.persistence;

import java.util.ArrayList;

import servant.domain.Servant;
import servant.domain.ServantClass;

public interface ServantDao{
		ArrayList<Servant> getAllServants();
		Servant getServantByID(int i);
		ArrayList<ServantClass> getAllClasses();
		ServantClass getClassById(int i);
}