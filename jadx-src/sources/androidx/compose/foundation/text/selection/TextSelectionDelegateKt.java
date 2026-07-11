package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.TextLayoutResult;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "", "offset", "", "isStart", "areHandlesCrossed", "Landroidx/compose/ui/geometry/Offset;", "rl", "(Landroidx/compose/ui/text/TextLayoutResult;IZZ)J", "", c.f62177j, "(Landroidx/compose/ui/text/TextLayoutResult;IZZ)F", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextSelectionDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/TextSelectionDelegateKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,69:1\n54#2:70\n59#2:72\n85#3:71\n90#3:73\n53#3,3:75\n30#4:74\n*S KotlinDebug\n*F\n+ 1 TextSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/TextSelectionDelegateKt\n*L\n47#1:70\n49#1:72\n47#1:71\n49#1:73\n50#1:75,3\n50#1:74\n*E\n"})
public final class TextSelectionDelegateKt {
    public static final float n(TextLayoutResult textLayoutResult, int i2, boolean z2, boolean z3) {
        return textLayoutResult.mUb(i2, textLayoutResult.t(((!z2 || z3) && (z2 || !z3)) ? Math.max(i2 + (-1), 0) : i2) == textLayoutResult.ViF(i2));
    }

    public static final long rl(TextLayoutResult textLayoutResult, int i2, boolean z2, boolean z3) {
        int iIk = textLayoutResult.Ik(i2);
        if (iIk >= textLayoutResult.ty()) {
            return Offset.INSTANCE.rl();
        }
        return Offset.O((((long) Float.floatToRawIntBits(RangesKt.coerceIn(n(textLayoutResult, i2, z2, z3), 0.0f, (int) (textLayoutResult.getSize() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(RangesKt.coerceIn(textLayoutResult.az(iIk), 0.0f, (int) (textLayoutResult.getSize() & 4294967295L)))) & 4294967295L));
    }
}
