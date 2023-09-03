package cl.barbatos.reservations.services;

import java.util.List;

import cl.barbatos.reservations.model.Reservation;


public interface IReservationService {
	
	List<Reservation> search();

}
