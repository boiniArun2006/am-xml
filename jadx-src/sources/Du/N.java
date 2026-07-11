package Du;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class N extends oXP {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private short[] f1975n;
    private int rl;

    public final void O(short s2) {
        oXP.t(this, 0, 1, null);
        short[] sArr = this.f1975n;
        int iNr = nr();
        this.rl = iNr + 1;
        sArr[iNr] = s2;
    }

    public N(short[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f1975n = bufferWithData;
        this.rl = bufferWithData.length;
        rl(10);
    }

    @Override // Du.oXP
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public short[] n() {
        short[] sArrCopyOf = Arrays.copyOf(this.f1975n, nr());
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @Override // Du.oXP
    public int nr() {
        return this.rl;
    }

    @Override // Du.oXP
    public void rl(int i2) {
        short[] sArr = this.f1975n;
        if (sArr.length < i2) {
            short[] sArrCopyOf = Arrays.copyOf(sArr, RangesKt.coerceAtLeast(i2, sArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
            this.f1975n = sArrCopyOf;
        }
    }
}
