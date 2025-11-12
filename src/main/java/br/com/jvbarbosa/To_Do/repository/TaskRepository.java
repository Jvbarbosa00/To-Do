package br.com.jvbarbosa.To_Do.repository;

import br.com.jvbarbosa.To_Do.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
