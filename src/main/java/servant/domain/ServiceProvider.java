package servant.domain;

public class ServiceProvider {
	private static ServantService servantService = new ServantService();

	private ServiceProvider() {}
	public static ServantService getServantService() {
		return servantService;
	}
}