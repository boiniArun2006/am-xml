package androidx.compose.material3.internal;

import androidx.compose.material3.internal.AnchorAlignmentOffsetPosition;
import androidx.compose.material3.internal.WindowAlignmentMarginPosition;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.AbsoluteAlignment;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Stable
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u000f¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/internal/MenuPosition;", "", "<init>", "()V", "", "offset", "Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "gh", "(I)Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "O", "margin", "Uo", "xMQ", "Landroidx/compose/material3/internal/MenuPosition$Vertical;", "az", "(I)Landroidx/compose/material3/internal/MenuPosition$Vertical;", c.f62177j, "nr", "HI", "t", "Horizontal", "Vertical", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MenuPosition {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final MenuPosition f29232n = new MenuPosition();

    @Stable
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bç\u0080\u0001\u0018\u00002\u00020\u0001J2\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "", "menuWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", c.f62177j, "(Landroidx/compose/ui/unit/IntRect;JILandroidx/compose/ui/unit/LayoutDirection;)I", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Horizontal {
        int n(IntRect anchorBounds, long windowSize, int menuWidth, LayoutDirection layoutDirection);
    }

    @Stable
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bç\u0080\u0001\u0018\u00002\u00020\u0001J*\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/material3/internal/MenuPosition$Vertical;", "", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "", "menuHeight", c.f62177j, "(Landroidx/compose/ui/unit/IntRect;JI)I", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Vertical {
        int n(IntRect anchorBounds, long windowSize, int menuHeight);
    }

    public static /* synthetic */ Horizontal J2(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return menuPosition.O(i2);
    }

    public static /* synthetic */ Horizontal KN(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return menuPosition.Uo(i2);
    }

    public static /* synthetic */ Horizontal mUb(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return menuPosition.xMQ(i2);
    }

    public static /* synthetic */ Horizontal qie(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return menuPosition.gh(i2);
    }

    public static /* synthetic */ Vertical rl(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return menuPosition.n(i2);
    }

    public static /* synthetic */ Vertical ty(MenuPosition menuPosition, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return menuPosition.az(i2);
    }

    public final Vertical HI(int margin) {
        return new WindowAlignmentMarginPosition.Vertical(Alignment.INSTANCE.qie(), margin);
    }

    public final Horizontal O(int offset) {
        Alignment.Companion companion = Alignment.INSTANCE;
        return new AnchorAlignmentOffsetPosition.Horizontal(companion.mUb(), companion.mUb(), offset);
    }

    public final Horizontal Uo(int margin) {
        return new WindowAlignmentMarginPosition.Horizontal(AbsoluteAlignment.f31033n.n(), margin);
    }

    public final Vertical az(int offset) {
        Alignment.Companion companion = Alignment.INSTANCE;
        return new AnchorAlignmentOffsetPosition.Vertical(companion.qie(), companion.n(), offset);
    }

    public final Horizontal gh(int offset) {
        Alignment.Companion companion = Alignment.INSTANCE;
        return new AnchorAlignmentOffsetPosition.Horizontal(companion.gh(), companion.gh(), offset);
    }

    public final Vertical n(int offset) {
        Alignment.Companion companion = Alignment.INSTANCE;
        return new AnchorAlignmentOffsetPosition.Vertical(companion.n(), companion.qie(), offset);
    }

    public final Vertical nr(int offset) {
        Alignment.Companion companion = Alignment.INSTANCE;
        return new AnchorAlignmentOffsetPosition.Vertical(companion.xMQ(), companion.qie(), offset);
    }

    public final Vertical t(int margin) {
        return new WindowAlignmentMarginPosition.Vertical(Alignment.INSTANCE.n(), margin);
    }

    public final Horizontal xMQ(int margin) {
        return new WindowAlignmentMarginPosition.Horizontal(AbsoluteAlignment.f31033n.rl(), margin);
    }

    private MenuPosition() {
    }
}
