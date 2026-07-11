package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a8\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\b2\b\b\u0002\u0010\u0002\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\b2\b\b\u0002\u0010\u0004\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"", TtmlNode.START, "top", TtmlNode.END, "bottom", "Landroidx/compose/ui/node/TouchBoundsExpansion;", "rl", "(IIII)J", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/ui/node/DpTouchBoundsExpansion;", c.f62177j, "(FFFF)Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTouchBoundsExpansion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/TouchBoundsExpansionKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,248:1\n102#2,5:249\n102#2,5:254\n102#2,5:259\n102#2,5:264\n113#3:269\n113#3:270\n113#3:271\n113#3:272\n*S KotlinDebug\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/TouchBoundsExpansionKt\n*L\n215#1:249,5\n218#1:254,5\n221#1:259,5\n224#1:264,5\n241#1:269\n242#1:270\n243#1:271\n244#1:272\n*E\n"})
public final class TouchBoundsExpansionKt {
    public static final long rl(int i2, int i3, int i5, int i7) {
        if (!(i2 >= 0 && i2 < 32768)) {
            InlineClassHelperKt.n("Start must be in the range of 0 .. 32767");
        }
        if (!(i3 >= 0 && i3 < 32768)) {
            InlineClassHelperKt.n("Top must be in the range of 0 .. 32767");
        }
        if (!(i5 >= 0 && i5 < 32768)) {
            InlineClassHelperKt.n("End must be in the range of 0 .. 32767");
        }
        if (!(i7 >= 0 && i7 < 32768)) {
            InlineClassHelperKt.n("Bottom must be in the range of 0 .. 32767");
        }
        return TouchBoundsExpansion.nr(TouchBoundsExpansion.INSTANCE.t(i2, i3, i5, i7, true));
    }

    public static final DpTouchBoundsExpansion n(float f3, float f4, float f5, float f6) {
        return new DpTouchBoundsExpansion(f3, f4, f5, f6, true, null);
    }

    public static /* synthetic */ long t(int i2, int i3, int i5, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i2 = 0;
        }
        if ((i8 & 2) != 0) {
            i3 = 0;
        }
        if ((i8 & 4) != 0) {
            i5 = 0;
        }
        if ((i8 & 8) != 0) {
            i7 = 0;
        }
        return rl(i2, i3, i5, i7);
    }
}
