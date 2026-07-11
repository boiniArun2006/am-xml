package androidx.compose.material3.tokens;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001d\u0010\u0018\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\rR\u001d\u0010\u001a\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u0016\u0010\rR\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u0017\u0010&\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\bR\u0017\u0010)\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u0017\u0010,\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b+\u0010\bR\u001d\u0010/\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010\f\u001a\u0004\b.\u0010\rR\u001d\u00102\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b0\u0010\f\u001a\u0004\b1\u0010\rR\u0017\u00105\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\bR\u0017\u00108\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\b7\u0010\bR\u0017\u0010;\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\bR\u0017\u0010>\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b<\u0010\u0006\u001a\u0004\b=\u0010\bR\u0017\u0010A\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\bR\u0017\u0010D\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bB\u0010\u0006\u001a\u0004\bC\u0010\bR\u0017\u0010F\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bE\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010I\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bG\u0010\u0006\u001a\u0004\bH\u0010\bR\u0017\u0010L\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bJ\u0010\u0006\u001a\u0004\bK\u0010\bR\u0017\u0010O\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bM\u0010\u0006\u001a\u0004\bN\u0010\bR\u0017\u0010R\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bP\u0010\u0006\u001a\u0004\bQ\u0010\bR\u0017\u0010U\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bS\u0010\u0006\u001a\u0004\bT\u0010\bR\u0017\u0010Z\u001a\u00020V8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\b\u0019\u0010Y\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006["}, d2 = {"Landroidx/compose/material3/tokens/PrimaryNavigationTabTokens;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "rl", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", c.f62177j, "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveIndicatorColor", "Landroidx/compose/ui/unit/Dp;", "t", "F", "()F", "ActiveIndicatorHeight", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "nr", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "ActiveIndicatorShape", "O", "ContainerColor", "J2", "getContainerElevation-D9Ej5fM", "ContainerElevation", "Uo", "ContainerHeight", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "KN", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "xMQ", "getActiveFocusIconColor", "ActiveFocusIconColor", "mUb", "getActiveHoverIconColor", "ActiveHoverIconColor", "gh", "getActiveIconColor", "ActiveIconColor", "qie", "getActivePressedIconColor", "ActivePressedIconColor", "az", "getIconAndLabelTextContainerHeight-D9Ej5fM", "IconAndLabelTextContainerHeight", "ty", "getIconSize-D9Ej5fM", "IconSize", "HI", "getInactiveFocusIconColor", "InactiveFocusIconColor", "ck", "getInactiveHoverIconColor", "InactiveHoverIconColor", "Ik", "getInactiveIconColor", "InactiveIconColor", "r", "getInactivePressedIconColor", "InactivePressedIconColor", "o", "getActiveFocusLabelTextColor", "ActiveFocusLabelTextColor", "Z", "getActiveHoverLabelTextColor", "ActiveHoverLabelTextColor", "XQ", "ActiveLabelTextColor", "S", "getActivePressedLabelTextColor", "ActivePressedLabelTextColor", "WPU", "getInactiveFocusLabelTextColor", "InactiveFocusLabelTextColor", "aYN", "getInactiveHoverLabelTextColor", "InactiveHoverLabelTextColor", "ViF", "getInactiveLabelTextColor", "InactiveLabelTextColor", "nY", "getInactivePressedLabelTextColor", "InactivePressedLabelTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "g", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPrimaryNavigationTabTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimaryNavigationTabTokens.kt\nandroidx/compose/material3/tokens/PrimaryNavigationTabTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,53:1\n158#2:54\n158#2:55\n158#2:56\n158#2:57\n158#2:58\n*S KotlinDebug\n*F\n+ 1 PrimaryNavigationTabTokens.kt\nandroidx/compose/material3/tokens/PrimaryNavigationTabTokens\n*L\n27#1:54\n28#1:55\n31#1:56\n37#1:57\n38#1:58\n*E\n"})
public final class PrimaryNavigationTabTokens {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens InactiveFocusIconColor;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens InactiveIconColor;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private static final float ContainerElevation;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private static final ShapeKeyTokens ContainerShape;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens ContainerColor;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens ActivePressedLabelTextColor;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private static final float ContainerHeight;

    /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens InactiveLabelTextColor;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens InactiveFocusLabelTextColor;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens ActiveLabelTextColor;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens ActiveHoverLabelTextColor;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens InactiveHoverLabelTextColor;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private static final float IconAndLabelTextContainerHeight;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens InactiveHoverIconColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final TypographyKeyTokens LabelTextFont;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens ActiveIconColor;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens ActiveHoverIconColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final PrimaryNavigationTabTokens f29838n = new PrimaryNavigationTabTokens();

    /* JADX INFO: renamed from: nY, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens InactivePressedLabelTextColor;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final RoundedCornerShape ActiveIndicatorShape;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens ActiveFocusLabelTextColor;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens ActivePressedIconColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens InactivePressedIconColor;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens ActiveIndicatorColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float ActiveIndicatorHeight;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private static final float IconSize;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens ActiveFocusIconColor;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        ActiveIndicatorColor = colorSchemeKeyTokens;
        float f3 = (float) 3.0d;
        ActiveIndicatorHeight = Dp.KN(f3);
        ActiveIndicatorShape = RoundedCornerShapeKt.t(Dp.KN(f3));
        ContainerColor = ColorSchemeKeyTokens.Surface;
        ContainerElevation = ElevationTokens.f29511n.n();
        ContainerHeight = Dp.KN((float) 48.0d);
        ContainerShape = ShapeKeyTokens.CornerNone;
        ActiveFocusIconColor = colorSchemeKeyTokens;
        ActiveHoverIconColor = colorSchemeKeyTokens;
        ActiveIconColor = colorSchemeKeyTokens;
        ActivePressedIconColor = colorSchemeKeyTokens;
        IconAndLabelTextContainerHeight = Dp.KN((float) 64.0d);
        IconSize = Dp.KN((float) 24.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        InactiveFocusIconColor = colorSchemeKeyTokens2;
        InactiveHoverIconColor = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurfaceVariant;
        InactiveIconColor = colorSchemeKeyTokens3;
        InactivePressedIconColor = colorSchemeKeyTokens2;
        ActiveFocusLabelTextColor = colorSchemeKeyTokens;
        ActiveHoverLabelTextColor = colorSchemeKeyTokens;
        ActiveLabelTextColor = colorSchemeKeyTokens;
        ActivePressedLabelTextColor = colorSchemeKeyTokens;
        InactiveFocusLabelTextColor = colorSchemeKeyTokens2;
        InactiveHoverLabelTextColor = colorSchemeKeyTokens2;
        InactiveLabelTextColor = colorSchemeKeyTokens3;
        InactivePressedLabelTextColor = colorSchemeKeyTokens2;
        LabelTextFont = TypographyKeyTokens.TitleSmall;
    }

    public final float J2() {
        return ContainerHeight;
    }

    public final ColorSchemeKeyTokens O() {
        return ContainerColor;
    }

    public final TypographyKeyTokens Uo() {
        return LabelTextFont;
    }

    public final ColorSchemeKeyTokens n() {
        return ActiveIndicatorColor;
    }

    public final ColorSchemeKeyTokens nr() {
        return ActiveLabelTextColor;
    }

    public final float rl() {
        return ActiveIndicatorHeight;
    }

    public final RoundedCornerShape t() {
        return ActiveIndicatorShape;
    }

    private PrimaryNavigationTabTokens() {
    }
}
