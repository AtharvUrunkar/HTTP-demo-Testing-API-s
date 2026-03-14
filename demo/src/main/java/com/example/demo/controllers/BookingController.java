package com.example.demo.controllers;

import com.example.demo.model.Booking;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

	private List<Booking> bookings = new ArrayList<>();
//1booking created..!
	@PostMapping
	public String createBooking(@RequestBody Booking booking){
		bookings.add(booking);
		return "Booking created";
	}

	@GetMapping
	public List<Booking> getAllBookings(){
		return bookings;
	}
}


