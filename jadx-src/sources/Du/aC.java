package Du;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class aC extends oXP {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f2003n;
    private int rl;

    public final void O(byte b2) {
        oXP.t(this, 0, 1, null);
        byte[] bArr = this.f2003n;
        int iNr = nr();
        this.rl = iNr + 1;
        bArr[iNr] = b2;
    }

    public aC(byte[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f2003n = bufferWithData;
        this.rl = bufferWithData.length;
        rl(10);
    }

    @Override // Du.oXP
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public byte[] n() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f2003n, nr());
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @Override // Du.oXP
    public int nr() {
        return this.rl;
    }

    @Override // Du.oXP
    public void rl(int i2) {
        byte[] bArr = this.f2003n;
        if (bArr.length < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, RangesKt.coerceAtLeast(i2, bArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            this.f2003n = bArrCopyOf;
        }
    }
}
