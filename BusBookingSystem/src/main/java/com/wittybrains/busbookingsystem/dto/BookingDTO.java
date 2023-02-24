package com.wittybrains.busbookingsystem.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.wittybrains.busbookingsystem.model.Booking;
import com.wittybrains.busbookingsystem.model.MyUser;

public class BookingDTO {
	private Long bookingId;
	private LocalDate dateOfBooking;
	private TravelScheduleDTO schedule;
	private Integer numberOfSeats;
	private Double fareAmount;
	private BusDTO bus;
	private String routeInfo;
    private Long id;
	private MyUserDTO user;

	private Double totalAmount;
	private String bookingStatus;
	
	public BookingDTO() {
		super();
	}

	public MyUserDTO getUser() {
		return user;
	}

	// Constructor
	public BookingDTO(Booking booking) {
		this.bookingId = booking.getBookingId();
		this.dateOfBooking = booking.getDateOfBooking();
		this.schedule = new TravelScheduleDTO(booking.getSchedule());
		this.numberOfSeats = booking.getNumberOfSeats();
		this.fareAmount = booking.getFareAmount();
		this.bus = new BusDTO(booking.getBus());
		this.routeInfo = booking.getRouteInfo();

		this.totalAmount = booking.getTotalAmount();
		this.bookingStatus = booking.getBookingStatus();
	}

//	public List<BookingDTO> getBookings() {
//
//		List<BookingDTO> bookingDTOs = new ArrayList<>();
//		for (Booking booking : bookings) {
//			BookingDTO bookingDTO = new BookingDTO(booking);
//
//			bookingDTO.setDateOfBooking(booking.getDateOfBooking());
//
//			bookingDTO.setDateOfBooking(booking.getDateOfBooking());
//			bookingDTO.setNumberOfSeats(booking.getNumberOfSeats());
//			bookingDTO.setFareAmount(booking.getFareAmount());
//			// bookingDTO.setBus(booking.getBus());
//			bookingDTO.setRouteInfo(booking.getRouteInfo());
//
//			bookingDTO.setTotalAmount(booking.getTotalAmount());
//			bookingDTO.setBookingStatus(booking.getBookingStatus());
//			bookingDTOs.add(bookingDTO);
//		}
//		return bookingDTOs;
//	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public LocalDate getDateOfBooking() {
		return dateOfBooking;
	}

	public void setDateOfBooking(LocalDate dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}

	public TravelScheduleDTO getSchedule() {
		return schedule;
	}

	public void setSchedule(TravelScheduleDTO schedule) {
		this.schedule = schedule;
	}

	public Integer getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(Integer numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public Double getFareAmount() {
		return fareAmount;
	}

	public void setFareAmount(Double fareAmount) {
		this.fareAmount = fareAmount;
	}

	public BusDTO getBus() {
		return bus;
	}

	public void setBus(BusDTO bus) {
		this.bus = bus;
	}

	public String getRouteInfo() {
		return routeInfo;
	}

	public void setRouteInfo(String routeInfo) {
		this.routeInfo = routeInfo;
	}

	public void setUser(MyUserDTO userDTO) {
		this.user = userDTO;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
