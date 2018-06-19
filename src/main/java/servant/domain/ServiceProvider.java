package servant.domain;

public class ServiceProvider {
	private static ServantService servantService = new ServantService();

	public static ServantService getServantService() {
		return servantService;
	}
}