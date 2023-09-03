package cl.barbatos.reservations.controller;

import java.util.List;

import cl.barbatos.reservations.config.ReservationsServiceConfig;
import cl.barbatos.reservations.model.Reservation;
import cl.barbatos.reservations.services.IReservationService;
import cl.barbatos.reservations.model.PropertiesReservations;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {
	
	@Autowired
	private IReservationService service;

	@Autowired
	private ReservationsServiceConfig config;

	@GetMapping("reservations")
	public List<Reservation> search(){
		return (List<Reservation>) this.service.search();	
	}


	@GetMapping("reservations/properties")
	public String getProperties() throws JsonProcessingException {

		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		PropertiesReservations properties = new PropertiesReservations(config.getMsg(), config.getBuildVersion(), config.getMailDetails());

		return ow.writeValueAsString(properties);
	}
}
