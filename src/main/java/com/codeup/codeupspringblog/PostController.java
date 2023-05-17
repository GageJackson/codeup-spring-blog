package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String getPost(){
        return "String";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String viewPost(@PathVariable int postId){
        return "Post by id: " + postId;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String createPostForm(){
        return "Create posts";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPostResult(){
        return "New post";
    }

}
