package com.smartschoolhub.repository;

import com.smartschoolhub.domain.Notification;
import com.smartschoolhub.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByRecipientOrderByCreatedAtDesc(UserAccount recipient);
    long countByRecipientAndIsReadFalse(UserAccount recipient);
}
