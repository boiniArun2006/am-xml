package Du;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class g9s extends oXP {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private double[] f2016n;
    private int rl;

    public final void O(double d2) {
        oXP.t(this, 0, 1, null);
        double[] dArr = this.f2016n;
        int iNr = nr();
        this.rl = iNr + 1;
        dArr[iNr] = d2;
    }

    public g9s(double[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f2016n = bufferWithData;
        this.rl = bufferWithData.length;
        rl(10);
    }

    @Override // Du.oXP
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public double[] n() {
        double[] dArrCopyOf = Arrays.copyOf(this.f2016n, nr());
        Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    @Override // Du.oXP
    public int nr() {
        return this.rl;
    }

    @Override // Du.oXP
    public void rl(int i2) {
        double[] dArr = this.f2016n;
        if (dArr.length < i2) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, RangesKt.coerceAtLeast(i2, dArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
            this.f2016n = dArrCopyOf;
        }
    }
}
