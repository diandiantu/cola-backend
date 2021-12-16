package com.yinbaitu.diandiantu

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * none.
 * @package com.yinbaitu.diandiantu
 * @since 2021/12/16 14:28
 * @author 陈泉
 */

@SpringBootApplication(scanBasePackages = ["com.yinbaitu.diandiantu", "com.alibaba.cola"])
class ApiApplication

fun main(args: Array<String>) {
    runApplication<ApiApplication>(*args)
}
