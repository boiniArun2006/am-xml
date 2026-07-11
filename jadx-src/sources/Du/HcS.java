package Du;

import java.util.Arrays;
import kotlin.UIntArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class HcS extends oXP {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f1960n;
    private int rl;

    public /* synthetic */ HcS(int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr);
    }

    public final void O(int i2) {
        oXP.t(this, 0, 1, null);
        int[] iArr = this.f1960n;
        int iNr = nr();
        this.rl = iNr + 1;
        UIntArray.m473setVXSXFK8(iArr, iNr, i2);
    }

    private HcS(int[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f1960n = bufferWithData;
        this.rl = UIntArray.m469getSizeimpl(bufferWithData);
        rl(10);
    }

    public int[] J2() {
        int[] iArrCopyOf = Arrays.copyOf(this.f1960n, nr());
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return UIntArray.m463constructorimpl(iArrCopyOf);
    }

    @Override // Du.oXP
    public int nr() {
        return this.rl;
    }

    @Override // Du.oXP
    public void rl(int i2) {
        if (UIntArray.m469getSizeimpl(this.f1960n) < i2) {
            int[] iArr = this.f1960n;
            int[] iArrCopyOf = Arrays.copyOf(iArr, RangesKt.coerceAtLeast(i2, UIntArray.m469getSizeimpl(iArr) * 2));
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f1960n = UIntArray.m463constructorimpl(iArrCopyOf);
        }
    }

    @Override // Du.oXP
    public /* bridge */ /* synthetic */ Object n() {
        return UIntArray.m461boximpl(J2());
    }
}
