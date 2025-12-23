package ru.example.dating_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.example.dating_service.model.Match;

/**
 * Repository for matches.
 */
public interface MatchRepository extends JpaRepository<Match, Long> {
}
