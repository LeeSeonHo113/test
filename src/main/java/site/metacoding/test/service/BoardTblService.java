package site.metacoding.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.test.domain.BoardTbl;
import site.metacoding.test.domain.BoardTblRepository;

@RequiredArgsConstructor
@Service
public class BoardTblService {

    private final BoardTblRepository boardTblRepository;

    public List<BoardTbl> 글검색(String keyword) {
        return boardTblRepository.mSearchByTitle(keyword);
    }
}