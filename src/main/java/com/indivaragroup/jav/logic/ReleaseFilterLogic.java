package com.indivaragroup.jav.logic;

import com.indivaragroup.jav.dto.VideoReleaseDTO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReleaseFilterLogic {

    public void processReleases() {

        List<VideoReleaseDTO> allReleases = new ArrayList<>();
        allReleases.add(new VideoReleaseDTO("STAR-1001", LocalDate.of(2025, 5, 10)));
        allReleases.add(new VideoReleaseDTO("STAR-1002", LocalDate.of(2026, 1, 13)));
        allReleases.add(new VideoReleaseDTO("STAR-1003", LocalDate.of(2024, 12, 1)));
        allReleases.add(new VideoReleaseDTO("STAR-1004", LocalDate.of(2026, 2, 20)));
        allReleases.add(new VideoReleaseDTO("STAR-1005", LocalDate.of(2025, 8, 15)));
        allReleases.add(new VideoReleaseDTO("STAR-1006", LocalDate.of(2026, 3, 5)));
        allReleases.add(new VideoReleaseDTO("STAR-1007", LocalDate.of(2023, 10, 11)));
        allReleases.add(new VideoReleaseDTO("STAR-1008", LocalDate.of(2026, 4, 10)));
        allReleases.add(new VideoReleaseDTO("STAR-1009", LocalDate.of(2025, 11, 22)));
        allReleases.add(new VideoReleaseDTO("STAR-1010", LocalDate.of(2026, 5, 1)));

        List<VideoReleaseDTO> outdatedList = new ArrayList<>();
        List<VideoReleaseDTO> updatedList = new ArrayList<>();

        for (VideoReleaseDTO dto : allReleases) {
            if (dto.getReleaseDate().getYear() < 2026) {
                outdatedList.add(dto);
            } else {
                updatedList.add(dto);
            }
        }

        System.out.println("\n=== LIST KODE SUDAH TIDAK KE-UPDATE (DI BAWAH 2026) ===");
        for (VideoReleaseDTO dto : outdatedList) {
            System.out.println("Code: " + dto.getReleaseCode() + " | Date: " + dto.getReleaseDate());
        }

        System.out.println("\n=== LIST KODE UPDATE TERBARU (2026 KE ATAS) ===");
        for (VideoReleaseDTO dto : updatedList) {
            System.out.println("Code: " + dto.getReleaseCode() + " | Date: " + dto.getReleaseDate());
        }
    }
}
