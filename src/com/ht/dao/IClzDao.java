package com.ht.dao;

import com.ht.entity.Course;

import java.util.List;


public interface IClzDao {

    public List<Course> selectAll();

    public Course selectById(Integer id);

    public void update(Course course);


}
