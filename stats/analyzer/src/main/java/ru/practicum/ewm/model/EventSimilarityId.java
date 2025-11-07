package ru.practicum.ewm.model;

import jakarta.persistence.Embeddable;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@Builder(toBuilder = true)
public class EventSimilarityId implements Serializable {
    private Long eventA;
    private Long eventB;

    public EventSimilarityId(Long eventA, Long eventB) {
        this.eventA = Math.min(eventA, eventB);
        this.eventB = Math.max(eventB, eventA);
    }
}