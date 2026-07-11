package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001e\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001e\u0010\u0007\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001e\u0010\t\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u001a\u001e\u0010\n\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/geometry/Rect;", "rect", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(JLandroidx/compose/ui/geometry/Rect;)J", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "offset", "t", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;J)J", "rl", "nr", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextLayoutState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text/input/internal/TextLayoutStateKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n65#2:251\n65#2:254\n65#2:257\n69#2:260\n69#2:263\n69#2:266\n60#3:252\n60#3:255\n60#3:258\n70#3:261\n70#3:264\n70#3:267\n53#3,3:270\n22#4:253\n22#4:256\n22#4:259\n22#4:262\n22#4:265\n22#4:268\n30#5:269\n1#6:273\n*S KotlinDebug\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text/input/internal/TextLayoutStateKt\n*L\n200#1:251\n201#1:254\n202#1:257\n206#1:260\n207#1:263\n208#1:266\n200#1:252\n201#1:255\n202#1:258\n206#1:261\n207#1:264\n208#1:267\n210#1:270,3\n200#1:253\n201#1:256\n202#1:259\n206#1:262\n207#1:265\n208#1:268\n210#1:269\n*E\n"})
public final class TextLayoutStateKt {
    public static final long n(long j2, Rect rect) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return Offset.O((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2) < rect.getLeft() ? rect.getLeft() : Float.intBitsToFloat(i2) > rect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() ? rect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() : Float.intBitsToFloat(i2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i3) < rect.getTop() ? rect.getTop() : Float.intBitsToFloat(i3) > rect.xMQ() ? rect.xMQ() : Float.intBitsToFloat(i3))) & 4294967295L));
    }

    public static final long nr(TextLayoutState textLayoutState, long j2) {
        LayoutCoordinates layoutCoordinatesO = textLayoutState.O();
        if (layoutCoordinatesO != null && layoutCoordinatesO.nr()) {
            return layoutCoordinatesO.jB(j2);
        }
        return j2;
    }

    public static final long rl(TextLayoutState textLayoutState, long j2) {
        Offset offsetNr;
        long jNHg;
        LayoutCoordinates layoutCoordinatesMUb = textLayoutState.mUb();
        if (layoutCoordinatesMUb != null) {
            LayoutCoordinates layoutCoordinatesO = textLayoutState.O();
            if (layoutCoordinatesO != null) {
                if (layoutCoordinatesMUb.nr() && layoutCoordinatesO.nr()) {
                    jNHg = layoutCoordinatesMUb.nHg(layoutCoordinatesO, j2);
                } else {
                    jNHg = j2;
                }
                offsetNr = Offset.nr(jNHg);
            } else {
                offsetNr = null;
            }
            if (offsetNr != null) {
                return offsetNr.getPackedValue();
            }
        }
        return j2;
    }

    public static final long t(TextLayoutState textLayoutState, long j2) {
        LayoutCoordinates layoutCoordinatesMUb = textLayoutState.mUb();
        if (layoutCoordinatesMUb != null) {
            Offset offsetNr = null;
            if (!layoutCoordinatesMUb.nr()) {
                layoutCoordinatesMUb = null;
            }
            if (layoutCoordinatesMUb != null) {
                LayoutCoordinates layoutCoordinatesNr = textLayoutState.nr();
                if (layoutCoordinatesNr != null) {
                    if (!layoutCoordinatesNr.nr()) {
                        layoutCoordinatesNr = null;
                    }
                    if (layoutCoordinatesNr != null) {
                        offsetNr = Offset.nr(layoutCoordinatesNr.nHg(layoutCoordinatesMUb, j2));
                    }
                }
                if (offsetNr != null) {
                    return offsetNr.getPackedValue();
                }
            }
        }
        return j2;
    }
}
