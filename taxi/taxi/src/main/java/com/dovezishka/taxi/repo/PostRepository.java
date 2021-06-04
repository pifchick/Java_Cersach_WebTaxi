package com.dovezishka.taxi.repo;

import com.dovezishka.taxi.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
