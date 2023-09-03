package cl.barbatos.reservations.dao;

import org.springframework.data.repository.CrudRepository;

import cl.barbatos.reservations.model.Reservation;

public interface IReservationDao extends CrudRepository<Reservation, Long>{

}
