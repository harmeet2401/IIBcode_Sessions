package com.in28minutes.rest.webservices.restfullservice.serviceDAO;

import com.in28minutes.rest.webservices.restfullservice.bean.Post;
import com.in28minutes.rest.webservices.restfullservice.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,Integer> {
}
