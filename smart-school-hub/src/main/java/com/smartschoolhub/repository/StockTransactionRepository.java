package com.smartschoolhub.repository;

import com.smartschoolhub.domain.InventoryItem;
import com.smartschoolhub.domain.StockTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StockTransactionRepository extends JpaRepository<StockTransaction, Long> {
    List<StockTransaction> findByItemOrderByTransactionDateDesc(InventoryItem item);
}
