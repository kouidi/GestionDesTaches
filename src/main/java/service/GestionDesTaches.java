package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.*;

public class GestionDesTaches {
	
	public static int id_sec=1;
	public static Map <Integer,LesTaches> taches = new HashMap<Integer, LesTaches>();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("getAllTaches")
	public ArrayList<LesTaches> getallTache() {
		return new ArrayList<LesTaches>(taches.values()) ;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("getTacheById/{id}")
	public LesTaches getOneTache(@PathParam("id") int id) {
		return taches.get(id);
	}
	
	@POST
	@Path("addTache")
	public void addTache(LesTaches onetache) {
		taches.put(onetache.getId(), onetache);
	}
	
	@PUT
	@Path("updateTache/{id}")
	public void updateOneTache(@PathParam("id") int id, LesTaches oneTache) {
		taches.replace(id, oneTache);
	}
	
	@DELETE
	@Path("deleteTache/{id}")
	public void deleteTache(@PathParam("id") int id) {
		taches.remove(id);
	}
	

}
