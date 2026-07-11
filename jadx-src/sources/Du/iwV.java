package Du;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class iwV extends oXP {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float[] f2021n;
    private int rl;

    public final void O(float f3) {
        oXP.t(this, 0, 1, null);
        float[] fArr = this.f2021n;
        int iNr = nr();
        this.rl = iNr + 1;
        fArr[iNr] = f3;
    }

    public iwV(float[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f2021n = bufferWithData;
        this.rl = bufferWithData.length;
        rl(10);
    }

    @Override // Du.oXP
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public float[] n() {
        float[] fArrCopyOf = Arrays.copyOf(this.f2021n, nr());
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @Override // Du.oXP
    public int nr() {
        return this.rl;
    }

    @Override // Du.oXP
    public void rl(int i2) {
        float[] fArr = this.f2021n;
        if (fArr.length < i2) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, RangesKt.coerceAtLeast(i2, fArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
            this.f2021n = fArrCopyOf;
        }
    }
}
