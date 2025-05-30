package com.mariuszilinskas.vsp.media.catalog.repository;

import com.mariuszilinskas.vsp.media.catalog.model.document.Episode;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EpisodeRepository extends MongoRepository<Episode, String> {

    boolean existsBySeriesIdAndSeasonIdAndEpisodeNumber(String seriesId, String seasonId, int episodeNumber);

    Optional<Episode> findBySeriesIdAndSeasonIdAndEpisodeNumber(String seriesId, String seasonId, int episodeNumber);

    Optional<Episode> findByIdAndSeriesIdAndSeasonId(String id, String seriesId, String seasonId);

    int countBySeriesIdAndSeasonId(String seriesId, String seasonId);

    void deleteAllBySeriesIdAndSeasonId(String seriesId, String seasonId);

    void deleteAllBySeriesId(String seriesId);
}
