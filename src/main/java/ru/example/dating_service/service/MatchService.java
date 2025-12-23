package ru.example.dating_service.service;

import org.springframework.stereotype.Service;
import ru.example.dating_service.model.Match;
import ru.example.dating_service.repository.MatchRepository;

/**
 * Service for matches.
 */
@Service
public class MatchService {

    private final MatchRepository matchRepository;

    public MatchService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    /**
     * Creates new match.
     *
     * @param match match data
     * @return saved match
     */
    public Match createMatch(Match match) {
        return matchRepository.save(match);
    }
}
