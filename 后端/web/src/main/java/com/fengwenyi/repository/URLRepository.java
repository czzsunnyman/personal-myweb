package com.fengwenyi.repository;

import com.fengwenyi.entity.URL;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Name   : URLRepository
 * Desc   : ...
 * Use    : ...
 * Author : xfsyMrFeng
 * Date   : 2017-07-26
 * Time   : 下午10:32
 */
public interface URLRepository extends JpaRepository<URL, Integer> {

    // 通过url进行查找
    List<URL> findAllByUrl(String url);

}
