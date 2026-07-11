package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a&\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/geometry/Rect;", "rect1", "rect2", "", "rl", "(JLandroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)I", "rect", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(JLandroidx/compose/ui/geometry/Rect;)F", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MathUtils.kt\nandroidx/compose/foundation/text/input/internal/MathUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
public final class MathUtilsKt {
    private static final float n(long j2, Rect rect) {
        if (SelectionManagerKt.nr(rect, j2)) {
            return 0.0f;
        }
        float fQie = Offset.qie(Offset.ck(rect.Z(), j2));
        if (fQie >= Float.MAX_VALUE) {
            fQie = Float.MAX_VALUE;
        }
        float fQie2 = Offset.qie(Offset.ck(rect.XQ(), j2));
        if (fQie2 < fQie) {
            fQie = fQie2;
        }
        float fQie3 = Offset.qie(Offset.ck(rect.gh(), j2));
        if (fQie3 < fQie) {
            fQie = fQie3;
        }
        float fQie4 = Offset.qie(Offset.ck(rect.qie(), j2));
        if (fQie4 < fQie) {
            return fQie4;
        }
        return fQie;
    }

    public static final int rl(long j2, Rect rect, Rect rect2) {
        float fN = n(j2, rect);
        float fN2 = n(j2, rect2);
        if (fN == fN2) {
            return 0;
        }
        if (fN < fN2) {
            return -1;
        }
        return 1;
    }
}
