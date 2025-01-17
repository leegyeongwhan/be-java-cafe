package kr.codesqaud.cafe.cafeservice.repository.article;

import kr.codesqaud.cafe.cafeservice.domain.Article;
import kr.codesqaud.cafe.cafeservice.dto.ArticleDTO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ArticleRepository {
    // TODO article 저장, 회원가입에 저장된 회원의 iD와 article의 글쓴이와 일치하는지 확인.
    void save(ArticleDTO article);

    Optional<Article> findById(Long id);

    List<Article> findAll();

    void delete(Long id);

    void update(Article article, String title, String content);

    void findReplyList();
}
