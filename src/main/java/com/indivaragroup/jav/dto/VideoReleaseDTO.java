package com.indivaragroup.jav.dto;

import java.time.LocalDate;

public class VideoReleaseDTO {
    private String releaseCode;
    private LocalDate releaseDate;

    public VideoReleaseDTO(String releaseCode, LocalDate releaseDate) {
        this.releaseCode = releaseCode;
        this.releaseDate = releaseDate;
    }

    public String getReleaseCode() {
        return releaseCode;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }
}
