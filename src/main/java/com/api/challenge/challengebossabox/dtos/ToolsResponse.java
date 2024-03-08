package com.api.challenge.challengebossabox.dtos;

import java.util.List;

public record ToolsResponse(Long id, String title, String link, String description, List<String> tags) {

}
