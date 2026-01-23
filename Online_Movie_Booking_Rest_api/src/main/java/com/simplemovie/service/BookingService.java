package com.simplemovie.service;


import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.simplemovie.entity.Booking;
import com.simplemovie.entity.Show;
import com.simplemovie.repository.BookingRepository;
import com.simplemovie.repository.ShowRepository;


@Service
public class BookingService {


@Autowired
private BookingRepository bookingRepository;


@Autowired
private ShowRepository showRepository;

<<<<<<< HEAD

=======
//POST
>>>>>>> 66d2abe (Added)
public Booking bookTickets(Booking booking) {
Show show = showRepository.findById(booking.getShow().getShowId()).orElseThrow();


if (booking.getSeatsBooked() > show.getAvailableSeats()) {
throw new RuntimeException("Not enough seats available");
}


<<<<<<< HEAD
show.setAvailableSeats(show.getAvailableSeats() - booking.getSeatsBooked());
booking.setBookingDate(LocalDate.now());//Booking dae should auto generated
booking.setShow(show);


=======
show.setAvailableSeats(show.getAvailableSeats() - booking.getSeatsBooked());//reduce after each booking....
booking.setBookingDate(LocalDate.now());//Booking dae should auto generated
booking.setShow(show);
>>>>>>> 66d2abe (Added)
showRepository.save(show);
return bookingRepository.save(booking);
}

<<<<<<< HEAD

=======
//Get
>>>>>>> 66d2abe (Added)
public List<Booking> getAllBookings() {
return bookingRepository.findAll();
}


<<<<<<< HEAD
public void cancelBooking(Long bookingId) {
=======
public void  cancelBooking(Long bookingId) {
>>>>>>> 66d2abe (Added)
Booking booking = bookingRepository.findById(bookingId).orElseThrow();
Show show = booking.getShow();


<<<<<<< HEAD
show.setAvailableSeats(show.getAvailableSeats() + booking.getSeatsBooked());
showRepository.save(show);
bookingRepository.deleteById(bookingId);
=======

show.setAvailableSeats(show.getAvailableSeats() + booking.getSeatsBooked());//total_seat=100,availb=100-->Now 4 seats booked-->availble=96,...Now cancel 4 tickets-->availble seats=(already availble_seat)96+seats_booked(4)=100.

showRepository.save(show);
bookingRepository.deleteById(bookingId);
//return "Booking cancelled successfully";
>>>>>>> 66d2abe (Added)
}
}