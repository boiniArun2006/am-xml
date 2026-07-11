package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.PointerId;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u0003J\u0015\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u0011R$\u0010!\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\"\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "", "<init>", "()V", "", "minSize", "", "xMQ", "(I)[J", "index", "Landroidx/compose/ui/input/pointer/PointerId;", "nr", "(I)J", "", "pointerIdValue", "", "Uo", "(J)Z", "KN", "(I)Z", "J2", "()Z", "value", c.f62177j, "", "mUb", "(IJ)V", "rl", "t", "<set-?>", "I", "O", "()I", "size", "[J", "internalArray", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PointerIdArray {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private long[] internalArray = new long[2];

    public final void rl() {
        this.size = 0;
    }

    private final long[] xMQ(int minSize) {
        long[] jArr = this.internalArray;
        long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(minSize, jArr.length * 2));
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        this.internalArray = jArrCopyOf;
        return jArrCopyOf;
    }

    public final boolean J2() {
        return this.size == 0;
    }

    public final boolean KN(int index) {
        int i2 = this.size;
        if (index >= i2) {
            return false;
        }
        int i3 = i2 - 1;
        while (index < i3) {
            long[] jArr = this.internalArray;
            int i5 = index + 1;
            jArr[index] = jArr[i5];
            index = i5;
        }
        this.size--;
        return true;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final boolean Uo(long pointerIdValue) {
        int i2 = this.size;
        int i3 = 0;
        while (i3 < i2) {
            if (pointerIdValue == this.internalArray[i3]) {
                int i5 = this.size - 1;
                while (i3 < i5) {
                    long[] jArr = this.internalArray;
                    int i7 = i3 + 1;
                    jArr[i3] = jArr[i7];
                    i3 = i7;
                }
                this.size--;
                return true;
            }
            i3++;
        }
        return false;
    }

    public final void mUb(int index, long value) {
        long[] jArrXMQ = this.internalArray;
        if (index >= jArrXMQ.length) {
            jArrXMQ = xMQ(index + 1);
        }
        jArrXMQ[index] = value;
        if (index >= this.size) {
            this.size = index + 1;
        }
    }

    public final long nr(int index) {
        return PointerId.n(this.internalArray[index]);
    }

    public final boolean t(long pointerIdValue) {
        int i2 = this.size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.internalArray[i3] == pointerIdValue) {
                return true;
            }
        }
        return false;
    }

    public final boolean n(long value) {
        if (!t(value)) {
            mUb(this.size, value);
            return true;
        }
        return false;
    }
}
