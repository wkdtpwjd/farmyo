package com.ssafy.farmyo.crop.service;

import com.ssafy.farmyo.crop.dto.AddCropReqDto;
import com.ssafy.farmyo.crop.dto.FindCropCategoryDto;
import org.springframework.security.core.Authentication;

import java.util.List;

public interface CropService {

    //작물 등록
    Integer addCrop(AddCropReqDto addCropReqDto, Authentication authentication);

    //작물 이미지 수정
    void updateCropImgUrl(Integer cropId, String cropImgUrl);


    //카테고리조회
    List<FindCropCategoryDto> findAllCropCategories();
}
