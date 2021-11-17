package com.chao.service.impl;


import com.chao.dao.PictureMapper;
import com.chao.model.Picture;
import com.chao.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "pictureService")
public class PictureServiceImpl implements PictureService {

    @Autowired
    private PictureMapper pictureMapper;//这里会报错，但是并不会影响

    @Override
    public int addUser(Picture u) {
        return pictureMapper.insert(u);
    }

    @Override
    public Picture  getLastPic( int userId) {
        return pictureMapper.getLastPic(userId);
    }
}
