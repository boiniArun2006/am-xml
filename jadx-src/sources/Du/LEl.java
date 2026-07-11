package Du;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class LEl extends oXP {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long[] f1966n;
    private int rl;

    public final void O(long j2) {
        oXP.t(this, 0, 1, null);
        long[] jArr = this.f1966n;
        int iNr = nr();
        this.rl = iNr + 1;
        jArr[iNr] = j2;
    }

    public LEl(long[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f1966n = bufferWithData;
        this.rl = bufferWithData.length;
        rl(10);
    }

    @Override // Du.oXP
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public long[] n() {
        long[] jArrCopyOf = Arrays.copyOf(this.f1966n, nr());
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @Override // Du.oXP
    public int nr() {
        return this.rl;
    }

    @Override // Du.oXP
    public void rl(int i2) {
        long[] jArr = this.f1966n;
        if (jArr.length < i2) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, RangesKt.coerceAtLeast(i2, jArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.f1966n = jArrCopyOf;
        }
    }
}
