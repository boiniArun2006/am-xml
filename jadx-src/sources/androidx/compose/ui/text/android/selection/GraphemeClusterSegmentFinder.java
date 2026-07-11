package androidx.compose.ui.text.android.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0007¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/android/selection/GraphemeClusterSegmentFinder;", "Landroidx/compose/ui/text/android/selection/SegmentFinder;", "<init>", "()V", "", "offset", "J2", "(I)I", "O", "rl", "nr", c.f62177j, "t", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class GraphemeClusterSegmentFinder implements SegmentFinder {
    public abstract int J2(int offset);

    public abstract int O(int offset);

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int n(int offset) {
        int iO = O(offset);
        if (iO == -1 || O(iO) == -1) {
            return -1;
        }
        return iO;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int nr(int offset) {
        int iJ2 = J2(offset);
        if (iJ2 == -1 || J2(iJ2) == -1) {
            return -1;
        }
        return iJ2;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int rl(int offset) {
        return J2(offset);
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int t(int offset) {
        return O(offset);
    }
}
