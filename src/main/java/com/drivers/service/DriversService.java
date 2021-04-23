package com.drivers.service;

import com.drivers.dto.DriverDto;
import com.drivers.dto.NewDriverDto;

public interface DriversService {

    DriverDto addNewDriver(NewDriverDto newDriver);

    DriverDto getDriver(Long id);

    DriverDto removeDriver(Long id);

    Iterable<DriverDto> findAllDrivers();

//    PostDto getPost(String id);
//
//    PostDto removePost(String id);
//
//    PostDto updatePost(NewPostDto postUpdateDto, String id);
//
//    boolean addLike(String id);
//
//    PostDto addComment(String id, String author, NewCommentDto newCommentDto);
//
//    Iterable<PostDto> findPostsByAuthor(String author);
//
//    Iterable<PostDto> findPostsByTags(List<String> tags);
//
//    Iterable<PostDto> findPostsByDates(DatePeriodDto datePeriodDto);
//
//    Iterable<CommentDto> findAllPostComments(String id);
//
//    Iterable<CommentDto> findAllPostCommentsByAuthor(String id, String author);


}
