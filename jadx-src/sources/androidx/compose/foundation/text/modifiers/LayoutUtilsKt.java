package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u001a2\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a2\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a*\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u0018\u0010\u0012\u001a\u00020\u0002*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/unit/Constraints;", "constraints", "", "softWrap", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "maxIntrinsicWidth", c.f62177j, "(JZIF)J", "", "t", "(JZIF)I", "maxLinesIn", "rl", "(ZII)I", "nr", "(I)Z", "isEllipsis", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LayoutUtilsKt {
    public static final int rl(boolean z2, int i2, int i3) {
        if (z2 || !nr(i2)) {
            return RangesKt.coerceAtLeast(i3, 1);
        }
        return 1;
    }

    public static final long n(long j2, boolean z2, int i2, float f3) {
        return Constraints.INSTANCE.rl(0, t(j2, z2, i2, f3), 0, Constraints.gh(j2));
    }

    public static final boolean nr(int i2) {
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        return TextOverflow.KN(i2, companion.rl()) || TextOverflow.KN(i2, companion.nr()) || TextOverflow.KN(i2, companion.t());
    }

    public static final int t(long j2, boolean z2, int i2, float f3) {
        int iQie = ((z2 || nr(i2)) && Constraints.KN(j2)) ? Constraints.qie(j2) : Integer.MAX_VALUE;
        return Constraints.ty(j2) == iQie ? iQie : RangesKt.coerceIn(TextDelegateKt.n(f3), Constraints.ty(j2), iQie);
    }
}
