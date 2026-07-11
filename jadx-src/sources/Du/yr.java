package Du;

import java.util.Arrays;
import kotlin.ULongArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class yr extends oXP {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long[] f2055n;
    private int rl;

    public /* synthetic */ yr(long[] jArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(jArr);
    }

    public final void O(long j2) {
        oXP.t(this, 0, 1, null);
        long[] jArr = this.f2055n;
        int iNr = nr();
        this.rl = iNr + 1;
        ULongArray.m552setk8EXiF4(jArr, iNr, j2);
    }

    private yr(long[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f2055n = bufferWithData;
        this.rl = ULongArray.m548getSizeimpl(bufferWithData);
        rl(10);
    }

    public long[] J2() {
        long[] jArrCopyOf = Arrays.copyOf(this.f2055n, nr());
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return ULongArray.m542constructorimpl(jArrCopyOf);
    }

    @Override // Du.oXP
    public int nr() {
        return this.rl;
    }

    @Override // Du.oXP
    public void rl(int i2) {
        if (ULongArray.m548getSizeimpl(this.f2055n) < i2) {
            long[] jArr = this.f2055n;
            long[] jArrCopyOf = Arrays.copyOf(jArr, RangesKt.coerceAtLeast(i2, ULongArray.m548getSizeimpl(jArr) * 2));
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.f2055n = ULongArray.m542constructorimpl(jArrCopyOf);
        }
    }

    @Override // Du.oXP
    public /* bridge */ /* synthetic */ Object n() {
        return ULongArray.m540boximpl(J2());
    }
}
