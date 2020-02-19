package com.mm.red.expansion

import android.util.Log
import java.math.BigDecimal
import java.text.SimpleDateFormat

fun BigDecimal.to2(): BigDecimal {
    return setScale(2, BigDecimal.ROUND_HALF_UP)
}






fun BigDecimal.trimZero(): String {
    var s = toString()
    if (s.indexOf(".") > 0) {
        // 去掉多余的0
        s = s.replace("0+?$".toRegex(), "")
        // 如最后一位是.则去掉
        s = s.replace("[.]$".toRegex(), "")
    }
    return s
}

fun Number.toTimeFormat(pattern:String="yyyyMMdd.HHmmss"): String {
    val v = toLong()
   return SimpleDateFormat(pattern).run {
        format(v)
    }
}


fun Number.fillZero(): String {
    return if (toLong() > 9) {
        toString()
    } else {
        "0${toShort()}"
    }
}
