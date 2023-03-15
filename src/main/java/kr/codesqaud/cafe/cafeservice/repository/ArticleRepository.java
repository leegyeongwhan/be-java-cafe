package kr.codesqaud.cafe.cafeservice.repository;

import kr.codesqaud.cafe.cafeservice.domain.Article;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
public class ArticleRepository {
    final List<Article> store = new ArrayList<>();

    // TODO article 저장, 회원가입에 저장된 회원의 iD와 article의 글쓴이와 일치하는지 확인.
    public void save(Article article) {
        store.add(article);
    }

    public Optional<Article> findById(Long id) {
        return store.stream().filter(article -> article.getId() == id).findFirst();
    }

    public List<Article> findAll() {
        return new ArrayList<>(Collections.unmodifiableList(store));
    }

    public Article findOne(Long id) {
        return findById(id).get();
    }
}