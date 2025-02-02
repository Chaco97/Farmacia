package Farmacia.Backend.Repository;

import Farmacia.Backend.Entity.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository  extends JpaRepository<Compra, Long> {
}
