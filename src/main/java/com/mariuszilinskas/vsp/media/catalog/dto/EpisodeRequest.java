package com.mariuszilinskas.vsp.media.catalog.dto;

import java.time.LocalDate;

public record EpisodeRequest(
        int episodeNumber,
        String title,
        String description,
        LocalDate releaseDate,
        Double rating,
        Integer duration, // duration in minutes
        String thumbnail,
        String contentUrl
) {}
