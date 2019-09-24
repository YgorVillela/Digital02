package br.com.fiap.revisao.repository;

import br.com.fiap.revisao.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
}
