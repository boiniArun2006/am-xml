package Du;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class CN3 extends oXP {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean[] f1948n;
    private int rl;

    public final void O(boolean z2) {
        oXP.t(this, 0, 1, null);
        boolean[] zArr = this.f1948n;
        int iNr = nr();
        this.rl = iNr + 1;
        zArr[iNr] = z2;
    }

    public CN3(boolean[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f1948n = bufferWithData;
        this.rl = bufferWithData.length;
        rl(10);
    }

    @Override // Du.oXP
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public boolean[] n() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f1948n, nr());
        Intrinsics.checkNotNullExpressionValue(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @Override // Du.oXP
    public int nr() {
        return this.rl;
    }

    @Override // Du.oXP
    public void rl(int i2) {
        boolean[] zArr = this.f1948n;
        if (zArr.length < i2) {
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, RangesKt.coerceAtLeast(i2, zArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(zArrCopyOf, "copyOf(...)");
            this.f1948n = zArrCopyOf;
        }
    }
}
