package ey;

import as.aC;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Q4.Ml f63930n;
    private d2n.Wre nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private fuX f63931t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final C0859j f63929O = new C0859j(null);
    private static final List J2 = CollectionsKt.listOf((Object[]) new Q4.w6[]{Q4.w6.PCM_8BIT, Q4.w6.PCM_16BIT, Q4.w6.PCM_24BIT, Q4.w6.PCM_32BIT, Q4.w6.PCM_FLOAT});

    /* JADX INFO: renamed from: ey.j$j, reason: collision with other inner class name */
    public static final class C0859j {
        public /* synthetic */ C0859j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0859j() {
        }
    }

    public j(Q4.Ml inputFormat) {
        Intrinsics.checkNotNullParameter(inputFormat, "inputFormat");
        this.f63930n = inputFormat;
        List list = J2;
        if (list.contains(n.t(inputFormat))) {
            this.rl = Q4.I28.n(n.t(inputFormat));
            this.f63931t = O(d2n.Wre.nr.rl(0L, 1L));
            return;
        }
        throw new IllegalArgumentException(("The provided input format encoding is unsupported. Provided encoding: " + n.t(inputFormat) + ".Supported encodings: " + list).toString());
    }

    public final void J2(d2n.Wre value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f63931t = O(value);
        this.nr = value;
    }

    public final boolean n(ByteBuffer sourceBuffer, long j2) {
        Intrinsics.checkNotNullParameter(sourceBuffer, "sourceBuffer");
        if (!Intrinsics.areEqual(sourceBuffer.order(), ByteOrder.nativeOrder())) {
            throw new IllegalArgumentException(("Buffer provided has wrong endianness (" + sourceBuffer.order() + ')').toString());
        }
        if (!t()) {
            throw new IllegalStateException(("No range to accumulate was provided. Current range is " + this.nr).toString());
        }
        fuX fuxRl = n.rl(sourceBuffer, this.f63930n.J2(), j2);
        if (fuxRl.nr().compareTo(this.f63931t.O()) <= 0) {
            v9.n.ck(sourceBuffer, v9.n.J2(sourceBuffer));
            return false;
        }
        if (fuxRl.O().compareTo(this.f63931t.nr()) >= 0) {
            return true;
        }
        Dsr.nr(fuxRl, this.f63931t);
        return !this.f63931t.n().hasRemaining();
    }

    public final d2n.Wre nr() {
        d2n.Wre wre = this.nr;
        if (wre != null) {
            return wre;
        }
        throw new IllegalStateException("Cannot access rangeToAccumulate since no value has been provided.");
    }

    public final boolean t() {
        return this.nr != null;
    }

    private final fuX O(d2n.Wre wre) {
        return new fuX(v9.n.O(Q4.n.rl(wre.t(), this.f63930n.J2()), null, 2, null), aC.nr(wre.O(), this.f63930n.O()), this.f63930n.t(), this.rl, null);
    }

    public final ByteBuffer rl() {
        if (t()) {
            ByteBuffer byteBufferN = this.f63931t.n();
            this.nr = null;
            byteBufferN.flip();
            return byteBufferN;
        }
        throw new IllegalStateException(("No range to accumulate was provided. Current range is " + this.nr).toString());
    }
}
