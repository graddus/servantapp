package servant.rest;

import java.util.ArrayList;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import servant.domain.Servant;
import servant.domain.ServantService;
import servant.domain.ServiceProvider;

@Path("/servants")
public class ServantRestService {
		ServantService service=ServiceProvider.getServantService();

		@GET
		@Produces("application/json")
		public String CountryList(@QueryParam("batch")int batch ) {
			JsonArrayBuilder jab = Json.createArrayBuilder();
			ArrayList<Servant>servantlist=service.getAllServants();
			int batchend=batch+4;
			if (batchend>servantlist.size()) {
				batchend=servantlist.size();
			}if (batch<=servantlist.size()) {
			ArrayList<Servant> result = new ArrayList<Servant>(servantlist.subList(batch,batchend ));
			for (Servant s : result) {
				jab.add(createJson(s));
			}

			JsonArray array = jab.build();

			return (array.toString());
			}else {
				return null;
			}
		}

		@Path("{id}")
		@GET
		@Produces("application/json")
		public String getProductByID(@PathParam("id") int id) {

			Servant s=service.getServantById(id);
			if (s!=null){
				return(createJson(s).build().toString());
			}
			else{
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
			}
		public JsonObjectBuilder createJson(Servant s){
			JsonObjectBuilder job = Json.createObjectBuilder();
			job.add("id", s.getId());
			job.add("name", s.getName());
			job.add("title", s.getTitle());
			job.add("gender", s.getGender());
			job.add("servantclass", s.getServantclass());
			job.add("region", s.getRegion());
			job.add("shortdesc", s.getShortdesc());
			job.add("description", s.getDescription());
			job.add("appearance", s.getAppearance());
			job.add("biography", s.getBiography());
			job.add("attribute", s.getAttribute());
			job.add("height", s.getHeight()+"cm");
			job.add("weight", s.getWeight()+" kg");
			job.add("attack", s.getAttackstat());
			job.add("defense", s.getDefensestat());
			return job;
		}
}