package cl.barbatos.reservations.services;

import java.util.List;

import cl.barbatos.reservations.dao.IReservationDao;
import cl.barbatos.reservations.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements IReservationService {

	@Autowired
	private IReservationDao reservationDao;
	
	@Override
	public List<Reservation> search() {
		return (List<Reservation>) reservationDao.findAll();
	}

}
