package Du;

import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class nKK {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final EJn.Wre f2030n;
    private final long[] nr;
    private final Function2 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f2031t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final j f2029O = new j(null);
    private static final long[] J2 = new long[0];

    private static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public nKK(EJn.Wre descriptor, Function2 readIfAbsent) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(readIfAbsent, "readIfAbsent");
        this.f2030n = descriptor;
        this.rl = readIfAbsent;
        int iNr = descriptor.nr();
        if (iNr <= 64) {
            this.f2031t = iNr != 64 ? (-1) << iNr : 0L;
            this.nr = J2;
        } else {
            this.f2031t = 0L;
            this.nr = O(iNr);
        }
    }

    private final long[] O(int i2) {
        long[] jArr = new long[(i2 - 1) >>> 6];
        if ((i2 & 63) != 0) {
            jArr[ArraysKt.getLastIndex(jArr)] = (-1) << i2;
        }
        return jArr;
    }

    private final void rl(int i2) {
        int i3 = (i2 >>> 6) - 1;
        long[] jArr = this.nr;
        jArr[i3] = jArr[i3] | (1 << (i2 & 63));
    }

    private final int t() {
        int length = this.nr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            int i5 = i3 * 64;
            long j2 = this.nr[i2];
            while (j2 != -1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j2);
                j2 |= 1 << iNumberOfTrailingZeros;
                int i7 = iNumberOfTrailingZeros + i5;
                if (((Boolean) this.rl.invoke(this.f2030n, Integer.valueOf(i7))).booleanValue()) {
                    this.nr[i2] = j2;
                    return i7;
                }
            }
            this.nr[i2] = j2;
            i2 = i3;
        }
        return -1;
    }

    public final void n(int i2) {
        if (i2 < 64) {
            this.f2031t |= 1 << i2;
        } else {
            rl(i2);
        }
    }

    public final int nr() {
        int iNumberOfTrailingZeros;
        int iNr = this.f2030n.nr();
        do {
            long j2 = this.f2031t;
            if (j2 == -1) {
                if (iNr > 64) {
                    return t();
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j2);
            this.f2031t |= 1 << iNumberOfTrailingZeros;
        } while (!((Boolean) this.rl.invoke(this.f2030n, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue());
        return iNumberOfTrailingZeros;
    }
}
