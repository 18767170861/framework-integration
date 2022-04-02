package org.wmc.dtx.notifydemo.bank1.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.wmc.dtx.notifydemo.bank1.dao.AccountInfoDao;
import org.wmc.dtx.notifydemo.bank1.entity.AccountPay;
import org.wmc.dtx.notifydemo.bank1.model.AccountChangeEvent;
import org.wmc.dtx.notifydemo.bank1.service.AccountInfoService;
import org.wmc.dtx.notifydemo.bank1.spring.PayClient;

@Service
@Slf4j
public class AccountInfoServiceImpl implements AccountInfoService {

    @Autowired
    AccountInfoDao accountInfoDao;

    @Autowired
    PayClient payClient;

    //更新账户金额
    @Override
    @Transactional
    public void updateAccountBalance(AccountChangeEvent accountChange) {
        //幂等校验
        if(accountInfoDao.isExistTx(accountChange.getTxNo())>0){
            return ;
        }
        int i = accountInfoDao.updateAccountBalance(accountChange.getAccountNo(), accountChange.getAmount());
        //插入事务记录，用于幂等控制
        accountInfoDao.addTx(accountChange.getTxNo());
    }

    //远程调用查询充值结果
    @Override
    public AccountPay queryPayResult(String tx_no) {

        //远程调用
        AccountPay payresult = payClient.payresult(tx_no);
        if("success".equals(payresult.getResult())){
            //更新账户金额
            AccountChangeEvent accountChangeEvent = new AccountChangeEvent();
            accountChangeEvent.setAccountNo(payresult.getAccountNo());//账号
            accountChangeEvent.setAmount(payresult.getPayAmount());//金额
            accountChangeEvent.setTxNo(payresult.getId());//充值事务号
            updateAccountBalance(accountChangeEvent);
        }
        return payresult;
    }
}
