package Du;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class eO extends oXP {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private char[] f2012n;
    private int rl;

    public final void O(char c2) {
        oXP.t(this, 0, 1, null);
        char[] cArr = this.f2012n;
        int iNr = nr();
        this.rl = iNr + 1;
        cArr[iNr] = c2;
    }

    public eO(char[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f2012n = bufferWithData;
        this.rl = bufferWithData.length;
        rl(10);
    }

    @Override // Du.oXP
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public char[] n() {
        char[] cArrCopyOf = Arrays.copyOf(this.f2012n, nr());
        Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    @Override // Du.oXP
    public int nr() {
        return this.rl;
    }

    @Override // Du.oXP
    public void rl(int i2) {
        char[] cArr = this.f2012n;
        if (cArr.length < i2) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, RangesKt.coerceAtLeast(i2, cArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
            this.f2012n = cArrCopyOf;
        }
    }
}
