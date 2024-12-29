package com.Mederdev.Havenplace.service.interfac;

import com.Mederdev.Havenplace.dto.Response;
import com.Mederdev.Havenplace.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
