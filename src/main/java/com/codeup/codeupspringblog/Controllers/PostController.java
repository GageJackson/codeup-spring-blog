package com.codeup.codeupspringblog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/posts/index")
    public String showAllPosts(Model model) {
        List<Post> savedPosts = new ArrayList<>();
        Post post1 = new Post("First Post", "This is my first post. I am so cool. Look at me gooooo!");
        Post post2 = new Post("Turtles", "Let me list all of the coolest turtles...Tomorrow");
        savedPosts.add(post1);
        savedPosts.add(post2);

        model.addAttribute("savedPosts", savedPosts);

        return "posts/index";
    }

    @GetMapping("/posts/show")
    public String showOnePost(Model model) {
        Post post = new Post("Best Post", "This is the best post ever.");

        model.addAttribute("post", post);

        return "posts/show";
    }


}
