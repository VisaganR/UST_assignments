package com.simplemovie.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.simplemovie.entity.Booking;
import com.simplemovie.service.BookingService;


@RestController
@RequestMapping("/api/bookings")
public class BookingController {


@Autowired
private BookingService bookingService;

<<<<<<< HEAD
=======
@GetMapping
public List<Booking> getAllBookings() {
return bookingService.getAllBookings();
}
>>>>>>> 66d2abe (Added)

@PostMapping
public Booking bookTickets(@RequestBody Booking booking) {
return bookingService.bookTickets(booking);
}


<<<<<<< HEAD
@GetMapping
public List<Booking> getAllBookings() {
return bookingService.getAllBookings();
}


@DeleteMapping("/{bookingId}")
public String cancelBooking(@PathVariable Long bookingId) {
bookingService.cancelBooking(bookingId);
=======

@DeleteMapping("/{bookingId}")
public String cancelBooking(@PathVariable Long bookingId) {
 bookingService.cancelBooking(bookingId);
>>>>>>> 66d2abe (Added)
return "Booking cancelled successfully";
}
}