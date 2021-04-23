package com.drivers.controller;


import com.drivers.dto.DriverDto;
import com.drivers.dto.NewDriverDto;
import com.drivers.service.DriversService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/drivers")
public class DriversController {

    @Autowired
    DriversService driversService;


    @PostMapping("/add/")
    public DriverDto addDriver(@RequestBody NewDriverDto newDriver) {
        System.out.println("here");
        return driversService.addNewDriver(newDriver);
    }


    @GetMapping("/{id}")
    public DriverDto getPost(@PathVariable Long id) {
        return driversService.getDriver(id);
    }

    @DeleteMapping("/{id}")
    public DriverDto removePost(@PathVariable Long id) {
        return driversService.removeDriver(id);
    }

    @GetMapping("/getall/")
    public Iterable<DriverDto> findAllDrivers(){
        return driversService.findAllDrivers();
    }

//
//    @PutMapping("/{id}")
//    public PostDto updatePost(@PathVariable String id, @RequestBody NewPostDto postUpdateDto) {
//        return service.updatePost(postUpdateDto, id);
//    }
//
//    @PutMapping("/post/{id}/like")
//    public boolean addLike(@PathVariable String id) {
//        return service.addLike(id);
//    }
//
//    @PutMapping("/post/{id}/comment/{author}")
//    public PostDto addComment(@PathVariable String id, @PathVariable String author, @RequestBody NewCommentDto newCommentDto) {
//        return service.addComment(id, author, newCommentDto);
//    }
//
//    @GetMapping("/posts/author/{author}")
//    public Iterable<PostDto> getPostsByAuthor(@PathVariable String author) {
//        return service.findPostsByAuthor(author);
//    }
//
//    @PostMapping("/posts/tags")
//    public Iterable<PostDto> findPostsByTags(@RequestBody List<String> tags) {
//        return service.findPostsByTags(tags);
//    }
//
//    @PostMapping("/posts/period")
//    public Iterable<PostDto> findPostsByDate(@RequestBody DatePeriodDto datePeriodDto) {
//        return service.findPostsByDates(datePeriodDto);
//    }
//
//    @GetMapping("/post/{id}/comments")
//    public Iterable<CommentDto> findAllPostComments(@PathVariable String id){
//        return service.findAllPostComments(id);
//    }
//
//    @GetMapping("/post/{id}/author/{author}/comments")
//    public Iterable<CommentDto> findAllPostCommentsByAuthor(@PathVariable String id, @PathVariable String author) {
//        return service.findAllPostCommentsByAuthor(id, author);
//    }




}
