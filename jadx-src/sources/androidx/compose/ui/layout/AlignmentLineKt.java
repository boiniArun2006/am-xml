package androidx.compose.ui.layout;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"Landroidx/compose/ui/layout/AlignmentLine;", "", "position1", "position2", "t", "(Landroidx/compose/ui/layout/AlignmentLine;II)I", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", c.f62177j, "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "()Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "FirstBaseline", "rl", "LastBaseline", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AlignmentLineKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final HorizontalAlignmentLine f32189n = new HorizontalAlignmentLine(AlignmentLineKt$FirstBaseline$1.f32190n);
    private static final HorizontalAlignmentLine rl = new HorizontalAlignmentLine(AlignmentLineKt$LastBaseline$1.f32191n);

    public static final HorizontalAlignmentLine n() {
        return f32189n;
    }

    public static final HorizontalAlignmentLine rl() {
        return rl;
    }

    public static final int t(AlignmentLine alignmentLine, int i2, int i3) {
        return ((Number) alignmentLine.getMerger().invoke(Integer.valueOf(i2), Integer.valueOf(i3))).intValue();
    }
}
