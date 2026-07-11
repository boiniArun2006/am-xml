package androidx.compose.animation.core;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0010\u001a7\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a7\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a/\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a7\u0010\u0015\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0011\u001aG\u0010\u0017\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"", "stiffness", "dampingRatio", "initialVelocity", "initialDisplacement", "delta", "", "rl", "(FFFFF)J", "", c.f62177j, "(DDDDD)J", "firstRootReal", "firstRootImaginary", "p0", "v0", "Uo", "(DDDDD)D", "t", "(DDDD)D", "secondRootReal", "O", "initialPosition", "nr", "(DDDDDDD)J", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSpringEstimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,348:1\n347#1:349\n347#1:351\n344#1:353\n347#1:354\n347#1:356\n344#1:358\n150#2:350\n150#2:352\n150#2:355\n150#2:357\n150#2:359\n*S KotlinDebug\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n*L\n172#1:349\n173#1:351\n213#1:353\n247#1:354\n248#1:356\n294#1:358\n172#1:350\n173#1:352\n247#1:355\n248#1:357\n347#1:359\n*E\n"})
public final class SpringEstimationKt {
    private static final double J2(double d2, double d4, double d5, double d6, double d7) {
        return (d2 * Math.exp(d4 * d5)) + (d6 * Math.exp(d7 * d5));
    }

    public static final long rl(float f3, float f4, float f5, float f6, float f7) {
        if (f4 == 0.0f) {
            return 9223372036854L;
        }
        return n(f3, f4, f5, f6, f7);
    }

    private static final double O(double d2, double d4, double d5, double d6, double d7) {
        double d8 = d7;
        double d9 = d2 - d4;
        double d10 = ((d2 * d5) - d6) / d9;
        double d11 = d5 - d10;
        double dLog = Math.log(Math.abs(d8 / d11)) / d2;
        double dLog2 = Math.log(Math.abs(d8 / d10)) / d4;
        if ((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) < 9218868437227405312L) {
            if ((Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) < 9218868437227405312L) {
                dLog = Math.max(dLog, dLog2);
            }
        } else {
            dLog = dLog2;
        }
        double d12 = d11 * d2;
        double dLog3 = Math.log(d12 / ((-d10) * d4)) / (d4 - d2);
        if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
            d8 = -d8;
        } else if (dLog3 <= 0.0d || (-J2(d11, d2, dLog3, d10, d4)) >= d8) {
            dLog = Math.log((-((d10 * d4) * d4)) / (d12 * d2)) / d9;
        } else {
            if (d10 > 0.0d && d11 < 0.0d) {
                dLog = 0.0d;
            }
            d8 = -d8;
        }
        double d13 = d10 * d4;
        if (Math.abs((Math.exp(d2 * dLog) * d12) + (Math.exp(d4 * dLog) * d13)) < 1.0E-4d) {
            return dLog;
        }
        double dAbs = Double.MAX_VALUE;
        int i2 = 0;
        while (dAbs > 0.001d && i2 < 100) {
            i2++;
            double d14 = d2 * dLog;
            double d15 = d4 * dLog;
            double dExp = dLog - ((((Math.exp(d14) * d11) + (Math.exp(d15) * d10)) + d8) / ((Math.exp(d14) * d12) + (Math.exp(d15) * d13)));
            dAbs = Math.abs(dLog - dExp);
            dLog = dExp;
        }
        return dLog;
    }

    private static final double Uo(double d2, double d4, double d5, double d6, double d7) {
        double d8 = (d6 - (d2 * d5)) / d4;
        return Math.log(d7 / Math.sqrt((d5 * d5) + (d8 * d8))) / d2;
    }

    public static final long n(double d2, double d4, double d5, double d6, double d7) {
        double dSqrt = 2.0d * d4 * Math.sqrt(d2);
        double d8 = (dSqrt * dSqrt) - (4.0d * d2);
        double dSqrt2 = d8 < 0.0d ? 0.0d : Math.sqrt(d8);
        double d9 = -dSqrt;
        return nr((d9 + dSqrt2) * 0.5d, (d8 < 0.0d ? Math.sqrt(Math.abs(d8)) : 0.0d) * 0.5d, (d9 - dSqrt2) * 0.5d, d4, d5, d6, d7);
    }

    private static final long nr(double d2, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d7;
        if (d8 == 0.0d && d10 == 0.0d) {
            return 0L;
        }
        if (d8 < 0.0d) {
            d10 = -d10;
        }
        double d11 = d10;
        double dAbs = Math.abs(d8);
        return (long) ((d6 > 1.0d ? O(d2, d5, dAbs, d11, d9) : d6 < 1.0d ? Uo(d2, d4, dAbs, d11, d9) : t(d2, dAbs, d11, d9)) * 1000.0d);
    }

    private static final double t(double d2, double d4, double d5, double d6) {
        double d7 = d6;
        double d8 = d2 * d4;
        double d9 = d5 - d8;
        double dLog = Math.log(Math.abs(d7 / d4)) / d2;
        double dLog2 = Math.log(Math.abs(d7 / d9));
        int i2 = 0;
        double dLog3 = dLog2;
        for (int i3 = 0; i3 < 6; i3++) {
            dLog3 = dLog2 - Math.log(Math.abs(dLog3 / d2));
        }
        double d10 = dLog3 / d2;
        if (!((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) < 9218868437227405312L)) {
            dLog = d10;
        } else if ((Double.doubleToRawLongBits(d10) & Long.MAX_VALUE) < 9218868437227405312L) {
            dLog = Math.max(dLog, d10);
        }
        double d11 = (-(d8 + d9)) / (d2 * d9);
        double d12 = d2 * d11;
        double dExp = (Math.exp(d12) * d4) + (d9 * d11 * Math.exp(d12));
        if (Double.isNaN(d11) || d11 <= 0.0d) {
            d7 = -d7;
        } else if (d11 <= 0.0d || (-dExp) >= d7) {
            dLog = (-(2.0d / d2)) - (d4 / d9);
        } else {
            if (d9 < 0.0d && d4 > 0.0d) {
                dLog = 0.0d;
            }
            d7 = -d7;
        }
        double dAbs = Double.MAX_VALUE;
        while (dAbs > 0.001d && i2 < 100) {
            i2++;
            double d13 = d2 * dLog;
            double d14 = d7;
            double dExp2 = dLog - ((((d4 + (d9 * dLog)) * Math.exp(d13)) + d7) / ((((((double) 1) + d13) * d9) + d8) * Math.exp(d13)));
            dAbs = Math.abs(dLog - dExp2);
            dLog = dExp2;
            d7 = d14;
        }
        return dLog;
    }
}
