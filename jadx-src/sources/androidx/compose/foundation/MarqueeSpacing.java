package androidx.compose.foundation;

import androidx.compose.foundation.MarqueeSpacing;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Stable
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bç\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\bJ#\u0010\u0006\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/MarqueeSpacing;", "", "Landroidx/compose/ui/unit/Density;", "", "contentWidth", "containerWidth", c.f62177j, "(Landroidx/compose/ui/unit/Density;II)I", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface MarqueeSpacing {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f16225n;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/MarqueeSpacing$Companion;", "", "<init>", "()V", "", "fraction", "Landroidx/compose/foundation/MarqueeSpacing;", "rl", "(F)Landroidx/compose/foundation/MarqueeSpacing;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ Companion f16225n = new Companion();

        /* JADX INFO: Access modifiers changed from: private */
        public static final int t(float f3, Density density, int i2, int i3) {
            return MathKt.roundToInt(f3 * i3);
        }

        public final MarqueeSpacing rl(final float fraction) {
            return new MarqueeSpacing() { // from class: androidx.compose.foundation.w6
                @Override // androidx.compose.foundation.MarqueeSpacing
                public final int n(Density density, int i2, int i3) {
                    return MarqueeSpacing.Companion.t(fraction, density, i2, i3);
                }
            };
        }

        private Companion() {
        }
    }

    int n(Density density, int i2, int i3);
}
