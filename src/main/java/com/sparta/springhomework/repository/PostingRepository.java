package com.sparta.springhomework.repository;

import com.sparta.springhomework.domain.entity.Posting;
import com.sparta.springhomework.dto.response.PostingListResponseDto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostingRepository extends JpaRepository<Posting, Long> {

  List<PostingListResponseDto> findAllByOrderByModifiedAtDesc();
}
