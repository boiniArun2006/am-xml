package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ=\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0017R\u001c\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001c\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "", "<init>", "()V", "", "offset", "", "fromSource", "Landroidx/compose/ui/text/TextRange;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(IZ)J", "opOffset", "untransformedLen", "transformedLen", "nr", "(IIIIZ)J", "sourceStart", "sourceEnd", "newLength", "", "O", "(III)V", "t", "(I)J", "rl", "Landroidx/compose/foundation/text/input/internal/OpArray;", "[I", "ops", "I", "opsSize", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOffsetMappingCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text/input/internal/OffsetMappingCalculator\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text/input/internal/OpArray\n*L\n1#1,419:1\n96#2,5:420\n395#3,21:425\n*S KotlinDebug\n*F\n+ 1 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text/input/internal/OffsetMappingCalculator\n*L\n266#1:420,5\n302#1:425,21\n*E\n"})
public final class OffsetMappingCalculator {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int[] ops = OpArray.n(10);

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private int opsSize;

    public final void O(int sourceStart, int sourceEnd, int newLength) {
        if (!(newLength >= 0)) {
            InlineClassHelperKt.n("Expected newLen to be ≥ 0, was " + newLength);
        }
        int iMin = Math.min(sourceStart, sourceEnd);
        int iMax = Math.max(iMin, sourceEnd) - iMin;
        if (iMax >= 2 || iMax != newLength) {
            int i2 = this.opsSize + 1;
            if (i2 > OpArray.O(this.ops)) {
                this.ops = OpArray.t(this.ops, Math.max(i2 * 2, OpArray.O(this.ops) * 2));
            }
            OpArray.Uo(this.ops, this.opsSize, iMin, iMax, newLength);
            this.opsSize = i2;
        }
    }

    public final long rl(int offset) {
        return n(offset, false);
    }

    public final long t(int offset) {
        return n(offset, true);
    }

    private final long n(int offset, boolean fromSource) {
        int i2;
        int iMin;
        int[] iArr = this.ops;
        int i3 = this.opsSize;
        if (i3 >= 0) {
            if (fromSource) {
                int i5 = 0;
                iMin = offset;
                while (i5 < i3) {
                    int i7 = i5 * 3;
                    int i8 = iArr[i7];
                    int i9 = iArr[i7 + 1];
                    int i10 = iArr[i7 + 2];
                    long jNr = nr(iMin, i8, i9, i10, fromSource);
                    long jNr2 = nr(offset, i8, i9, i10, fromSource);
                    int iMin2 = Math.min(TextRange.ty(jNr), TextRange.ty(jNr2));
                    int iMax = Math.max(TextRange.xMQ(jNr), TextRange.xMQ(jNr2));
                    i5++;
                    iMin = iMin2;
                    offset = iMax;
                }
            } else {
                int i11 = i3 - 1;
                iMin = offset;
                while (-1 < i11) {
                    int i12 = i11 * 3;
                    int i13 = iArr[i12];
                    int i14 = iArr[i12 + 1];
                    int i15 = iArr[i12 + 2];
                    boolean z2 = fromSource;
                    long jNr3 = nr(iMin, i13, i14, i15, z2);
                    long jNr4 = nr(offset, i13, i14, i15, z2);
                    iMin = Math.min(TextRange.ty(jNr3), TextRange.ty(jNr4));
                    offset = Math.max(TextRange.xMQ(jNr3), TextRange.xMQ(jNr4));
                    i11--;
                    fromSource = z2;
                }
            }
            i2 = offset;
            offset = iMin;
        } else {
            i2 = offset;
        }
        return TextRangeKt.rl(offset, i2);
    }

    private final long nr(int offset, int opOffset, int untransformedLen, int transformedLen, boolean fromSource) {
        int i2 = fromSource ? untransformedLen : transformedLen;
        if (fromSource) {
            untransformedLen = transformedLen;
        }
        return offset < opOffset ? TextRangeKt.n(offset) : offset == opOffset ? i2 == 0 ? TextRangeKt.rl(opOffset, untransformedLen + opOffset) : TextRangeKt.n(opOffset) : offset < opOffset + i2 ? untransformedLen == 0 ? TextRangeKt.n(opOffset) : TextRangeKt.rl(opOffset, untransformedLen + opOffset) : TextRangeKt.n((offset - i2) + untransformedLen);
    }
}
