package com.chao.dao;

import com.chao.model.Picture;

public interface PictureMapper {
    int insert(Picture u);

    Picture  getLastPic(int userId);
}
