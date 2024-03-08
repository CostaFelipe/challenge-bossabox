package com.api.challenge.challengebossabox.dtos;

import java.util.List;

import com.api.challenge.challengebossabox.models.Tools;

public record ToolsRequest(String title, String link, String description, List<String> tags) {

  public Tools toModel() {
    return new Tools(title, link, description, tags);
  }

}
