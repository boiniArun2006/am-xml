package Du;

import java.util.Arrays;
import kotlin.UByteArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class z3w extends oXP {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f2057n;
    private int rl;

    public /* synthetic */ z3w(byte[] bArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr);
    }

    public final void O(byte b2) {
        oXP.t(this, 0, 1, null);
        byte[] bArr = this.f2057n;
        int iNr = nr();
        this.rl = iNr + 1;
        UByteArray.m394setVurrAj0(bArr, iNr, b2);
    }

    private z3w(byte[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f2057n = bufferWithData;
        this.rl = UByteArray.m390getSizeimpl(bufferWithData);
        rl(10);
    }

    public byte[] J2() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f2057n, nr());
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return UByteArray.m384constructorimpl(bArrCopyOf);
    }

    @Override // Du.oXP
    public int nr() {
        return this.rl;
    }

    @Override // Du.oXP
    public void rl(int i2) {
        if (UByteArray.m390getSizeimpl(this.f2057n) < i2) {
            byte[] bArr = this.f2057n;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, RangesKt.coerceAtLeast(i2, UByteArray.m390getSizeimpl(bArr) * 2));
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            this.f2057n = UByteArray.m384constructorimpl(bArrCopyOf);
        }
    }

    @Override // Du.oXP
    public /* bridge */ /* synthetic */ Object n() {
        return UByteArray.m382boximpl(J2());
    }
}
