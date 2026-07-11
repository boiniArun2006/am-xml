package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.unit.LayoutDirection;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Stable
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bç\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0003\n\u000b\fJ*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/Alignment;", "", "Landroidx/compose/ui/unit/IntSize;", "size", "space", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/IntOffset;", c.f62177j, "(JJLandroidx/compose/ui/unit/LayoutDirection;)J", "Companion", "Horizontal", "Vertical", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Alignment {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f31038n;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\f\u0010\bR \u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0010\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0013\u0010\bR \u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u0017\u0010\bR \u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u000f\u0010\bR \u0010!\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u0005\u0010\bR \u0010$\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u0006\u0012\u0004\b#\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010+\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010\u0003\u001a\u0004\b(\u0010)R \u0010-\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010'\u0012\u0004\b,\u0010\u0003\u001a\u0004\b\u001f\u0010)R \u00100\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010'\u0012\u0004\b/\u0010\u0003\u001a\u0004\b.\u0010)R \u00105\u001a\u0002018\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00102\u0012\u0004\b4\u0010\u0003\u001a\u0004\b&\u00103R \u00107\u001a\u0002018\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00102\u0012\u0004\b6\u0010\u0003\u001a\u0004\b\u001a\u00103R \u0010:\u001a\u0002018\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u00102\u0012\u0004\b9\u0010\u0003\u001a\u0004\b\"\u00103¨\u0006;"}, d2 = {"Landroidx/compose/ui/Alignment$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/Alignment;", "rl", "Landroidx/compose/ui/Alignment;", "HI", "()Landroidx/compose/ui/Alignment;", "getTopStart$annotations", "TopStart", "t", "az", "getTopCenter$annotations", "TopCenter", "nr", "ty", "getTopEnd$annotations", "TopEnd", "O", "KN", "getCenterStart$annotations", "CenterStart", "J2", "getCenter$annotations", "Center", "Uo", "getCenterEnd$annotations", "CenterEnd", "getBottomStart$annotations", "BottomStart", "xMQ", "getBottomCenter$annotations", "BottomCenter", "mUb", "getBottomEnd$annotations", "BottomEnd", "Landroidx/compose/ui/Alignment$Vertical;", "gh", "Landroidx/compose/ui/Alignment$Vertical;", "qie", "()Landroidx/compose/ui/Alignment$Vertical;", "getTop$annotations", "Top", "getCenterVertically$annotations", "CenterVertically", c.f62177j, "getBottom$annotations", "Bottom", "Landroidx/compose/ui/Alignment$Horizontal;", "Landroidx/compose/ui/Alignment$Horizontal;", "()Landroidx/compose/ui/Alignment$Horizontal;", "getStart$annotations", "Start", "getCenterHorizontally$annotations", "CenterHorizontally", "ck", "getEnd$annotations", "End", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ Companion f31038n = new Companion();

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private static final Alignment TopStart = new BiasAlignment(-1.0f, -1.0f);

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private static final Alignment TopCenter = new BiasAlignment(0.0f, -1.0f);

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private static final Alignment TopEnd = new BiasAlignment(1.0f, -1.0f);

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private static final Alignment CenterStart = new BiasAlignment(-1.0f, 0.0f);

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private static final Alignment Center = new BiasAlignment(0.0f, 0.0f);

        /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
        private static final Alignment CenterEnd = new BiasAlignment(1.0f, 0.0f);

        /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
        private static final Alignment BottomStart = new BiasAlignment(-1.0f, 1.0f);

        /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
        private static final Alignment BottomCenter = new BiasAlignment(0.0f, 1.0f);

        /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
        private static final Alignment BottomEnd = new BiasAlignment(1.0f, 1.0f);

        /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
        private static final Vertical Top = new BiasAlignment.Vertical(-1.0f);

        /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
        private static final Vertical CenterVertically = new BiasAlignment.Vertical(0.0f);

        /* JADX INFO: renamed from: az, reason: from kotlin metadata */
        private static final Vertical Bottom = new BiasAlignment.Vertical(1.0f);

        /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
        private static final Horizontal Start = new BiasAlignment.Horizontal(-1.0f);

        /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
        private static final Horizontal CenterHorizontally = new BiasAlignment.Horizontal(0.0f);

        /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
        private static final Horizontal End = new BiasAlignment.Horizontal(1.0f);

        public final Alignment HI() {
            return TopStart;
        }

        public final Alignment J2() {
            return CenterEnd;
        }

        public final Alignment KN() {
            return CenterStart;
        }

        public final Alignment O() {
            return Center;
        }

        public final Horizontal Uo() {
            return CenterHorizontally;
        }

        public final Alignment az() {
            return TopCenter;
        }

        public final Horizontal gh() {
            return Start;
        }

        public final Horizontal mUb() {
            return End;
        }

        public final Vertical n() {
            return Bottom;
        }

        public final Alignment nr() {
            return BottomStart;
        }

        public final Vertical qie() {
            return Top;
        }

        public final Alignment rl() {
            return BottomCenter;
        }

        public final Alignment t() {
            return BottomEnd;
        }

        public final Alignment ty() {
            return TopEnd;
        }

        public final Vertical xMQ() {
            return CenterVertically;
        }

        private Companion() {
        }
    }

    @Stable
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bç\u0080\u0001\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/Alignment$Horizontal;", "", "", "size", "space", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", c.f62177j, "(IILandroidx/compose/ui/unit/LayoutDirection;)I", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Horizontal {
        int n(int size, int space, LayoutDirection layoutDirection);
    }

    @Stable
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/Alignment$Vertical;", "", "", "size", "space", c.f62177j, "(II)I", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Vertical {
        int n(int size, int space);
    }

    long n(long size, long space, LayoutDirection layoutDirection);
}
