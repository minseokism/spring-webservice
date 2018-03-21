package com.minseokism.webservice.service;

import com.minseokism.webservice.domain.posts.PostsRepository;

import com.minseokism.webservice.dto.posts.PostsSaveRequestDto;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class PostService {

    private PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto dto) {
        return postsRepository.save(dto.toEntity()).getId();
    }

}
