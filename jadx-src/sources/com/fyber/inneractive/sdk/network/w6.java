package com.fyber.inneractive.sdk.network;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract /* synthetic */ class w6 {
    public static /* synthetic */ BigDecimal n(BigDecimal bigDecimal) {
        if (bigDecimal.signum() == 0) {
            return new BigDecimal(BigInteger.ZERO, 0);
        }
        return bigDecimal.stripTrailingZeros();
    }
}
