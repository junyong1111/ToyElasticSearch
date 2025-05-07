package com.searcproject.demo.repository;
import java.util.List;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import com.searcproject.demo.domain.Concept;


@Repository
public interface ConceptRepository extends ElasticsearchRepository<Concept, String> {
  // 기본 CRUD + 페이징, 정렬 제공

  // 커스텀 메서드 예시: 키워드가 포함된 문서 검색
  List<Concept> findByConceptContainingOrIntermediateContainingOrAdvancedContaining(String c1, String c2, String c3);
  List<Concept> findByKeywordContaining(String keyword);
}