package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.*;

public class GestionDesTaches {
	
	public static int id_sec=1;
	public static Map <Integer,LesTaches> taches = new HashMap();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("getAllTaches")
	public ArrayList<LesTaches> getEtudiants() {
		return new ArrayList<LesTaches>(taches.values()) ;
	}

}
