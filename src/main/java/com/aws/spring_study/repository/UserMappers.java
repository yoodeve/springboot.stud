package com.aws.spring_study.repository;

import com.aws.spring_study.dto.RegisterUserReqDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMappers {
    // 메소드명과 xml파일 id 일치해야함
    public Integer saveUser(RegisterUserReqDto registerUserReqDto);
}
