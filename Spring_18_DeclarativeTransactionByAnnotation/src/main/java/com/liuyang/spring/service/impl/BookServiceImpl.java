package com.liuyang.spring.service.impl;

import com.liuyang.spring.dao.BookDao;
import com.liuyang.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    //@Transactional(
    //        //readOnly = true
    //        //timeout = 5
    //        noRollbackFor = ArithmeticException.class
    //)
    public void buyBook(Integer userId, Integer bookId) {
        //try {
        //    TimeUnit.SECONDS.sleep(10);
        //} catch (InterruptedException e) {
        //    throw new RuntimeException(e);
        //}

        // 查询图书价格
        Integer price = bookDao.getPriceByBookId(bookId);
        // 更新图书库存
        bookDao.updateStock(bookId);
        //更新账户余额
        bookDao.updateBalance(userId, price);
        //System.out.println(1/0);
    }
}
