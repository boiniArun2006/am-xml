package Du;

import cS.Zv.SzFNXybiSxdx;
import java.util.Arrays;
import kotlin.UShortArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class W extends oXP {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private short[] f1998n;
    private int rl;

    public /* synthetic */ W(short[] sArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(sArr);
    }

    public final void O(short s2) {
        oXP.t(this, 0, 1, null);
        short[] sArr = this.f1998n;
        int iNr = nr();
        this.rl = iNr + 1;
        UShortArray.m657set01HTLdE(sArr, iNr, s2);
    }

    private W(short[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f1998n = bufferWithData;
        this.rl = UShortArray.m653getSizeimpl(bufferWithData);
        rl(10);
    }

    public short[] J2() {
        short[] sArrCopyOf = Arrays.copyOf(this.f1998n, nr());
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, SzFNXybiSxdx.xSkryhGfQzp);
        return UShortArray.m647constructorimpl(sArrCopyOf);
    }

    @Override // Du.oXP
    public int nr() {
        return this.rl;
    }

    @Override // Du.oXP
    public void rl(int i2) {
        if (UShortArray.m653getSizeimpl(this.f1998n) < i2) {
            short[] sArr = this.f1998n;
            short[] sArrCopyOf = Arrays.copyOf(sArr, RangesKt.coerceAtLeast(i2, UShortArray.m653getSizeimpl(sArr) * 2));
            Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
            this.f1998n = UShortArray.m647constructorimpl(sArrCopyOf);
        }
    }

    @Override // Du.oXP
    public /* bridge */ /* synthetic */ Object n() {
        return UShortArray.m645boximpl(J2());
    }
}
