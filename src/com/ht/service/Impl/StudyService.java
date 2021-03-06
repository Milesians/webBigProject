package com.ht.service.Impl;

import com.ht.dao.IStudyInfoDao;
import com.ht.entity.StudyInfo;
import com.ht.service.IStudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能描述:
 *
 * @Author ht
 * @Date 16/7/7.
 */

@Service
public class StudyService implements IStudyService {

    @Autowired
    private IStudyInfoDao studyInfoDao;

    @Override
    public List<StudyInfo> getAllClzByStuId(String stuId) {
        return studyInfoDao.selectByStuId(stuId);
    }

    @Override
    public List<StudyInfo> getAllStuByClzId(Integer clzId) {
        return studyInfoDao.selectByClzId(clzId);
    }

    @Override
    public void delCourse(String stuId, Integer clzId) {
        studyInfoDao.delete(stuId, clzId);
    }
}
