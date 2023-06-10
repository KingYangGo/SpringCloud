package com.yk.springcloud.alibaba.service.impl;/**
 * @Title: StorageServiceImpl
 * @Author YangK
 * @Package com.yk.springcloud.alibaba.service.impl
 * @Date 2023/6/10 18:38
 * @description:
 */

import com.yk.springcloud.alibaba.dao.StorageDao;
import com.yk.springcloud.alibaba.service.StorageService ;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 * @author YangCoder
 * @version 2023/6/10 18:38
 * @since JDK8
 */
@Service
public class StorageServiceImpl implements StorageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Resource
    private StorageDao storageDao;

    /**
     * 扣减库存
     */
    @Override
    public void decrease(Long productId, Integer count) {
        LOGGER.info("------->storage-service中扣减库存开始");
        storageDao.decrease(productId,count);
        LOGGER.info("------->storage-service中扣减库存结束");
    }
}

