package com.example.demo.service;


import com.example.demo.modal.Course;
import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Component
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public List<Course> findAllCourses(){

        return courseRepository.findAllClasses();
    }

    public List<Course> searchByCourseName(String input){

        return courseRepository.findCourseByName(input);
    }

    public List<List<Integer>> twoSum (int target ) {
        List<List<Integer>> res = new ArrayList<>();
        int[] nums = new int[100];
        for( int i = 0; i< 100 ; i++) {
            nums[i] = i + 1;
        }

        Set<Integer> set = new HashSet<>();
        for( int num : nums) {
            if(set.contains( target - num) ) {
                res.add(Arrays.asList( target - num , num));
            } else {
                set.add(num);
            }
        }

        return res;

     }

}
