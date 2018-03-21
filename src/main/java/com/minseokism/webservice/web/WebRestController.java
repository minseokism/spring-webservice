package com.minseokism.webservice.web;

import com.minseokism.webservice.domain.posts.PostsRepository;
import com.minseokism.webservice.dto.posts.PostsSaveRequestDto;
import com.minseokism.webservice.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostService postService;

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto) {
        postService.save(dto);
    }

}
