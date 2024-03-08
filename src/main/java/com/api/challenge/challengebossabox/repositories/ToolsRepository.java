package com.api.challenge.challengebossabox.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.challenge.challengebossabox.models.Tools;

public interface ToolsRepository extends JpaRepository<Tools, Long> {

  List<Tools> findByTagsIn(List<String> tags);

}
