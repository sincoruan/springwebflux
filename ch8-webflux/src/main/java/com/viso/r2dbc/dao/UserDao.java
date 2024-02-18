package com.viso.r2dbc.dao;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;
import com.viso.r2dbc.entity.UserDO;

public interface UserDao extends ReactiveCrudRepository<UserDO, Long> {
    Mono<UserDO> findByEmail(String email);
}
