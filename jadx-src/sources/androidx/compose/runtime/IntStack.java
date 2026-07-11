package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\rJ\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\rJ\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0010J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0003J\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0010R\u0016\u0010\u0018\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/IntStack;", "", "<init>", "()V", "", "xMQ", "()[I", "", "value", "", "KN", "(I)V", "Uo", "()I", "default", "J2", "(I)I", "t", "O", "index", "nr", c.f62177j, "rl", "[I", "slots", "I", "tos", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IntStack {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int[] slots = new int[10];

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public int tos;

    public final void n() {
        this.tos = 0;
    }

    private final int[] xMQ() {
        int[] iArr = this.slots;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        this.slots = iArrCopyOf;
        return iArrCopyOf;
    }

    public final int J2(int i2) {
        int i3 = this.tos - 1;
        return i3 >= 0 ? this.slots[i3] : i2;
    }

    public final void KN(int value) {
        int[] iArrXMQ = this.slots;
        if (this.tos >= iArrXMQ.length) {
            iArrXMQ = xMQ();
        }
        int i2 = this.tos;
        this.tos = i2 + 1;
        iArrXMQ[i2] = value;
    }

    public final int O() {
        return this.slots[this.tos - 2];
    }

    public final int Uo() {
        int[] iArr = this.slots;
        int i2 = this.tos - 1;
        this.tos = i2;
        return iArr[i2];
    }

    public final int nr(int index) {
        return this.slots[index];
    }

    public final int rl(int value) {
        int[] iArr = this.slots;
        int iMin = Math.min(iArr.length, this.tos);
        for (int i2 = 0; i2 < iMin; i2++) {
            if (iArr[i2] == value) {
                return i2;
            }
        }
        return -1;
    }

    public final int t() {
        return this.slots[this.tos - 1];
    }
}
