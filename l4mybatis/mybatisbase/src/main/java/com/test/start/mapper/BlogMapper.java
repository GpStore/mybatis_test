package com.test.start.mapper;

import com.test.start.model.Blog;

public interface BlogMapper {
    Blog selectBlog(int id);
    int insertBlog(Blog blog);
}
