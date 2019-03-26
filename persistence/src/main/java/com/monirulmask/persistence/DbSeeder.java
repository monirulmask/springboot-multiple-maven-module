package com.monirulmask.persistence;


import com.monirulmask.domain.Hotel;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by monir on 3/26/2019.
 */
@Component
public class DbSeeder implements CommandLineRunner {
    private HotelRepository hotelRepository;

    public DbSeeder(HotelRepository hotelRepository){
        this.hotelRepository = hotelRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Hotel westing = new Hotel("Marriot", 5, true);
        Hotel ibis = new Hotel("Ibis", 3, false);
        Hotel goldenTulip = new Hotel("Golden Tulip", 4, true);

        List<Hotel> hotels = new ArrayList<>();
        hotels.add(westing);
        hotels.add(ibis);
        hotels.add(goldenTulip);
        this.hotelRepository.saveAll(hotels);
    }
}
