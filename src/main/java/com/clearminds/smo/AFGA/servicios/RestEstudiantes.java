package com.clearminds.smo.AFGA.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.clearminds.AFGA.dtos.Estudiante;
import com.clearminds.AFGA.excepciones.BDDException;
import com.clearminds.AFGA.servicios.ServicioEstudiante;

@Path("estudiantes")
public class RestEstudiantes {
	
	@POST
	@Path("insertar")
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Estudiante estudiante){
		ServicioEstudiante servicioEstudiante = new ServicioEstudiante();
		try {
			servicioEstudiante.insertarEstudiante(estudiante);
		} catch (BDDException e) {
			e.printStackTrace();
		}
	}
	
	@PUT
	@Path("actualizar")
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar(Estudiante estudiante){
		ServicioEstudiante servicioEstudiante = new ServicioEstudiante();
		try{
			servicioEstudiante.actualizarEstudiante(estudiante);
		} catch (BDDException e) {
			e.printStackTrace();
		}
		
	}
}
