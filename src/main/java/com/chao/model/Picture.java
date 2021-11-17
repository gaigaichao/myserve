package com.chao.model;

public class Picture {
    private Integer userId;

    private byte[] img;

    public Integer getPicId() {
        return userId;
    }

    public void setPicId(int picId) {
        this.userId = picId;
    }

    public byte[] getPic() { return img; }

    public void setPic(byte[] pic) { this.img = pic == null ? null : pic.clone(); }
}
