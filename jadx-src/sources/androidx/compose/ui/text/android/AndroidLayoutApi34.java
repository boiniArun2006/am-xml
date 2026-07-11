package androidx.compose.ui.text.android;

import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.selection.Api34SegmentFinder;
import androidx.compose.ui.text.android.selection.WordSegmentFinder;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@RequiresApi
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/android/AndroidLayoutApi34;", "", "<init>", "()V", "Landroidx/compose/ui/text/android/TextLayout;", TtmlNode.TAG_LAYOUT, "Landroid/graphics/RectF;", "rectF", "", "granularity", "Lkotlin/Function2;", "", "inclusionStrategy", "", "t", "(Landroidx/compose/ui/text/android/TextLayout;Landroid/graphics/RectF;ILkotlin/jvm/functions/Function2;)[I", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidLayoutApi34 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AndroidLayoutApi34 f33521n = new AndroidLayoutApi34();

    public final int[] t(TextLayout layout, RectF rectF, int granularity, final Function2 inclusionStrategy) {
        SegmentFinder segmentFinderN;
        if (granularity == 1) {
            segmentFinderN = Api34SegmentFinder.f33572n.n(new WordSegmentFinder(layout.X(), layout.N()));
        } else {
            n.n();
            segmentFinderN = w6.n(j.n(layout.X(), layout.getTextPaint()));
        }
        return layout.getAndroidx.media3.extractor.text.ttml.TtmlNode.TAG_LAYOUT java.lang.String().getRangeForRect(rectF, segmentFinderN, new Layout.TextInclusionStrategy() { // from class: androidx.compose.ui.text.android.I28
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return AndroidLayoutApi34.rl(inclusionStrategy, rectF2, rectF3);
            }
        });
    }

    private AndroidLayoutApi34() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rl(Function2 function2, RectF rectF, RectF rectF2) {
        return ((Boolean) function2.invoke(rectF, rectF2)).booleanValue();
    }
}
