package org.dnyanyog.repositories;

import org.dnyanyog.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepo extends JpaRepository<Inventory, Integer> {}
