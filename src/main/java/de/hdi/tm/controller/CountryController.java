package de.hdi.tm.controller;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import de.hdi.tm.model.Country;
import de.hdi.tm.model.User;
import de.hdi.tm.repository.CountryRepository;
import de.hdi.tm.repository.UserRepository;
import lombok.AllArgsConstructor;

@Path("/country")
@AllArgsConstructor
public class CountryController {

	private CountryRepository countryRepo;

	@GET()
	@Path("{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public Country hello(@PathParam(value = "name") String name) {
		return countryRepo.findByName(name);
	}

//	@GET()
//	@Path("/movie")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response getMovie() {
//		
//	}

//	@POST
//	@Path("/user/add/{name}")
//	public void addUser(@PathParam(value = "name") String name) {
//		User user = new User();
//		user.setName(name);
//		userRepo.save(user);
//	}
}