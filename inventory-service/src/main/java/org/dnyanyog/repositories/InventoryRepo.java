package org.dnyanyog.repositories;

import java.util.Optional;
import org.dnyanyog.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepo extends JpaRepository<Inventory, Integer> {

  Optional<Inventory> findByProductId(Integer product_id);

  // List<Inventory> getAllProducts();

  Integer deleteByProductId(Integer product_id);
}
