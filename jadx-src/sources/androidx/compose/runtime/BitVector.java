package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/compose/runtime/BitVector;", "", "<init>", "()V", "", "index", "", c.f62177j, "(I)Z", "value", "", "nr", "(IZ)V", "t", "(I)I", TtmlNode.START, TtmlNode.END, "O", "(II)V", "", "toString", "()Ljava/lang/String;", "", "J", "first", "rl", "second", "", "[J", "others", "()I", "size", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/BitVector\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n1#1,3963:1\n3500#1,5:3967\n3505#1,27:3973\n3500#1,5:4000\n3505#1,27:4006\n3810#2:3964\n3810#2:3965\n3810#2:3966\n3580#2:3972\n3580#2:4005\n3580#2:4033\n3580#2:4034\n3580#2:4035\n3810#2:4036\n3810#2:4037\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/BitVector\n*L\n3490#1:3967,5\n3490#1:3973,27\n3492#1:4000,5\n3492#1:4006,27\n3467#1:3964\n3473#1:3965\n3487#1:3966\n3490#1:3972\n3492#1:4005\n3504#1:4033\n3510#1:4034\n3527#1:4035\n3544#1:4036\n3555#1:4037\n*E\n"})
public final class BitVector {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private long first;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private long second;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private long[] others = SlotTableKt.f30389n;

    public final boolean n(int index) {
        int i2;
        if (index < 64) {
            return ((1 << index) & this.first) != 0;
        }
        if (index < 128) {
            return ((1 << (index - 64)) & this.second) != 0;
        }
        long[] jArr = this.others;
        int length = jArr.length;
        if (length != 0 && (index / 64) - 2 < length) {
            return ((1 << (index % 64)) & jArr[i2]) != 0;
        }
        return false;
    }

    public final void O(int start, int end) {
        long j2 = start < end ? -1L : 0L;
        this.first = (((((long) (start < 64 ? 1 : 0)) * j2) >>> (64 - (Math.min(64, end) - start))) << start) | this.first;
        if (end > 64) {
            int iMax = Math.max(start, 64);
            this.second = (((j2 * ((long) (iMax < 128 ? 1 : 0))) >>> (128 - (Math.min(128, end) - iMax))) << iMax) | this.second;
            if (end > 128) {
                for (int iMax2 = Math.max(iMax, 128); iMax2 < end; iMax2++) {
                    nr(iMax2, true);
                }
            }
        }
    }

    public final void nr(int index, boolean value) {
        if (index < 64) {
            this.first = ((value ? 1L : 0L) << index) | ((~(1 << index)) & this.first);
            return;
        }
        if (index < 128) {
            this.second = ((value ? 1L : 0L) << index) | ((~(1 << (index - 64))) & this.second);
            return;
        }
        int i2 = index / 64;
        int i3 = i2 - 2;
        int i5 = index % 64;
        long j2 = 1 << i5;
        long[] jArrCopyOf = this.others;
        if (i3 >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2 - 1);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.others = jArrCopyOf;
        }
        jArrCopyOf[i3] = ((value ? 1L : 0L) << i5) | ((~j2) & jArrCopyOf[i3]);
    }

    public final int rl() {
        return (this.others.length + 2) * 64;
    }

    public final int t(int index) {
        int iNumberOfTrailingZeros;
        if (index < 64 && (iNumberOfTrailingZeros = Long.numberOfTrailingZeros(((~this.first) >>> index) << index)) < 64) {
            return iNumberOfTrailingZeros;
        }
        if (index < 128) {
            int i2 = index - 64;
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(((~this.second) >>> i2) << i2);
            if (iNumberOfTrailingZeros2 < 64) {
                return iNumberOfTrailingZeros2 + 64;
            }
        }
        int iMax = Math.max(index, 128);
        int i3 = (iMax / 64) - 2;
        long[] jArr = this.others;
        int length = jArr.length;
        for (int i5 = i3; i5 < length; i5++) {
            long j2 = ~jArr[i5];
            if (i5 == i3) {
                int i7 = iMax % 64;
                j2 = (j2 >>> i7) << i7;
            }
            int iNumberOfTrailingZeros3 = Long.numberOfTrailingZeros(j2);
            if (iNumberOfTrailingZeros3 < 64) {
                return (i5 * 64) + 128 + iNumberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BitVector [");
        int iRl = rl();
        boolean z2 = true;
        for (int i2 = 0; i2 < iRl; i2++) {
            if (n(i2)) {
                if (!z2) {
                    sb.append(", ");
                }
                sb.append(i2);
                z2 = false;
            }
        }
        sb.append(']');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
