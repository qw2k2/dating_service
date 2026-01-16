package ru.example.dating_service.controller;

import org.springframework.web.bind.annotation.*;
import ru.example.dating_service.model.Match;
import ru.example.dating_service.service.MatchService;

/**
 * REST controller for matches.
 */
@RestController
@RequestMapping("/matches")
public class MatchController {

    private final MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    /**
     * Creates match.
     *
     * @param match match data
     * @return created match
     */
    @PostMapping
    public Match createMatch(@RequestBody Match match) {
        return matchService.createMatch(match);
    }
}
