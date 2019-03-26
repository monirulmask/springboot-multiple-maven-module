package com.monirulmask.persistence;

import com.monirulmask.domain.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by monir on 3/26/2019.
 */
@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
