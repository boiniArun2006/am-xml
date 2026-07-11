package Du;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class P extends oXP {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f1979n;
    private int rl;

    public final void O(int i2) {
        oXP.t(this, 0, 1, null);
        int[] iArr = this.f1979n;
        int iNr = nr();
        this.rl = iNr + 1;
        iArr[iNr] = i2;
    }

    public P(int[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f1979n = bufferWithData;
        this.rl = bufferWithData.length;
        rl(10);
    }

    @Override // Du.oXP
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public int[] n() {
        int[] iArrCopyOf = Arrays.copyOf(this.f1979n, nr());
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @Override // Du.oXP
    public int nr() {
        return this.rl;
    }

    @Override // Du.oXP
    public void rl(int i2) {
        int[] iArr = this.f1979n;
        if (iArr.length < i2) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, RangesKt.coerceAtLeast(i2, iArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f1979n = iArrCopyOf;
        }
    }
}
