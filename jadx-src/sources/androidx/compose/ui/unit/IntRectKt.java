package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Landroidx/compose/ui/unit/IntOffset;", "offset", "Landroidx/compose/ui/unit/IntSize;", "size", "Landroidx/compose/ui/unit/IntRect;", c.f62177j, "(JJ)Landroidx/compose/ui/unit/IntRect;", "Landroidx/compose/ui/geometry/Rect;", "rl", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/unit/IntRect;", "ui-unit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIntRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntRect.kt\nandroidx/compose/ui/unit/IntRectKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,276:1\n54#2:277\n59#2:279\n85#3:278\n90#3:280\n26#4:281\n26#4:282\n26#4:283\n26#4:284\n*S KotlinDebug\n*F\n+ 1 IntRect.kt\nandroidx/compose/ui/unit/IntRectKt\n*L\n209#1:277\n210#1:279\n209#1:278\n210#1:280\n271#1:281\n272#1:282\n273#1:283\n274#1:284\n*E\n"})
public final class IntRectKt {
    public static final IntRect n(long j2, long j3) {
        return new IntRect(IntOffset.gh(j2), IntOffset.qie(j2), IntOffset.gh(j2) + ((int) (j3 >> 32)), IntOffset.qie(j2) + ((int) (j3 & 4294967295L)));
    }

    public static final IntRect rl(Rect rect) {
        return new IntRect(Math.round(rect.getLeft()), Math.round(rect.getTop()), Math.round(rect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String()), Math.round(rect.xMQ()));
    }
}
