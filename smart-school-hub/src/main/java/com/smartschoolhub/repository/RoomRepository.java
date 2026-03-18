package com.smartschoolhub.repository;

import com.smartschoolhub.domain.Hostel;
import com.smartschoolhub.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {
    List<Room> findByHostel(Hostel hostel);
}
