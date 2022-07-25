/**
 * @Author: xiezuozhang xiezuozhang@zjipst.com
 * @Description: sm2 密钥对
 * @Date: 2022-06-14 17:52:34
 * @LastEditors: xiezuozhang xiezuozhang@zjipst.com
 * @LastEditTime: 2022-06-17 10:29:20
 */
package com.jb.model.enity;


/**
 * @author zhaojb
 * <p>
 * SM2密钥对实体类
 */
public class SM2KeyPair {

    /**
     * 私钥
     */
    private String priKey;

    /**
     * 公钥
     */
    private String pubKey;

    public String getPriKey() {
        return priKey;
    }

    public void setPriKey(String priKey) {
        this.priKey = priKey;
    }

    public String getPubKey() {
        return pubKey;
    }

    public void setPubKey(String pubKey) {
        this.pubKey = pubKey;
    }
}
