package com.searcproject.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import com.searcproject.demo.domain.Concept;
import com.searcproject.demo.repository.ConceptRepository;

@RestController
@RequiredArgsConstructor
public class SearchController {
    private final ConceptRepository repo;

  @GetMapping("/search")
  public List<Concept> search(@RequestParam String keyword) {
    // 수정된 검색 로직
    return repo.findByKeywordContaining(keyword);
  }
}
