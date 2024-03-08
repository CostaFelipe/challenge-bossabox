package com.api.challenge.challengebossabox.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.challenge.challengebossabox.dtos.ToolsResponse;
import com.api.challenge.challengebossabox.models.Tools;
import com.api.challenge.challengebossabox.repositories.ToolsRepository;

@Service
public class ToolsService {

  private ToolsRepository toolsRepository;

  public ToolsService(ToolsRepository toolsRepository) {
    this.toolsRepository = toolsRepository;
  }

  public List<Tools> getAllTools() {
    List<Tools> toolsList = toolsRepository.findAll();
    return toolsList;
  }

  public List<Tools> findToAllTag(List<String> tags) {
    List<Tools> toolsList = toolsRepository.findByTagsIn(tags);
    return toolsList;
  }

  public ToolsResponse saveTools(Tools tools) {
    Tools toolsSaved = toolsRepository.save(tools);
    ToolsResponse toolsResponse = new ToolsResponse(
        toolsSaved.getId(),
        toolsSaved.getTitle(),
        toolsSaved.getLink(),
        toolsSaved.getDescription(),
        toolsSaved.getTags());

    return toolsResponse;
  }

  public void deleteByToolsId(Long id) {
    toolsRepository.deleteById(id);
  }

}
