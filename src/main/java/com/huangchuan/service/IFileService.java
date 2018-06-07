package com.huangchuan.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by hc on 2018/6/1.
 */
public interface IFileService {

    String upload(MultipartFile file, String path);

}
