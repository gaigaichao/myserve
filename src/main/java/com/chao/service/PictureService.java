package com.chao.service;

import com.chao.model.Picture;

public interface PictureService {

    int addUser(Picture u);

    Picture getLastPic(int userId);

}

