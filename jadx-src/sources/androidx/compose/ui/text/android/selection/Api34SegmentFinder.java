package androidx.compose.ui.text.android.selection;

import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.w6;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@RequiresApi
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/android/selection/Api34SegmentFinder;", "", "<init>", "()V", "Landroidx/compose/ui/text/android/selection/SegmentFinder;", "Landroid/text/SegmentFinder;", c.f62177j, "(Landroidx/compose/ui/text/android/selection/SegmentFinder;)Landroid/text/SegmentFinder;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Api34SegmentFinder {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Api34SegmentFinder f33572n = new Api34SegmentFinder();

    public final android.text.SegmentFinder n(final SegmentFinder segmentFinder) {
        return w6.n(new android.text.SegmentFinder() { // from class: androidx.compose.ui.text.android.selection.Api34SegmentFinder$toAndroidSegmentFinder$1
            public int nextEndBoundary(int offset) {
                return segmentFinder.t(offset);
            }

            public int nextStartBoundary(int offset) {
                return segmentFinder.n(offset);
            }

            public int previousEndBoundary(int offset) {
                return segmentFinder.nr(offset);
            }

            public int previousStartBoundary(int offset) {
                return segmentFinder.rl(offset);
            }
        });
    }

    private Api34SegmentFinder() {
    }
}
