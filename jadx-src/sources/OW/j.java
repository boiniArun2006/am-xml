package OW;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final BigInteger f7478n = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);
    private static final double rl = Math.log(10.0d);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final double f7479t = Math.log(2.0d);

    public static BigInteger n(BigInteger bigInteger, BigInteger bigInteger2, RoundingMode roundingMode) {
        return new BigDecimal(bigInteger).divide(new BigDecimal(bigInteger2), 0, roundingMode).toBigIntegerExact();
    }
}
