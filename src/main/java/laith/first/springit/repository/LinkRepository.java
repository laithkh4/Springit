package laith.first.springit.repository;

import laith.first.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LinkRepository extends JpaRepository<Link,Long> {
  /* Link findByTitle(String title);//spring jpa under the hood will create this method for us
   List<Link> findAllByTitleLikeOrderByCreationDateDesc(String title);*/
}
