package com.ht.dao;

import com.ht.entity.StudyInfo;

import java.util.List;

public interface IStudyInfoDao {


    public List<StudyInfo> selectByClzId(Integer clzId);

    public List<StudyInfo> selectByStuId(String stuId);

    public StudyInfo check(String stuId, Integer clzId);

    public void insert(StudyInfo studyInfo);

    public void delete(String stuId, Integer clzId);

}
