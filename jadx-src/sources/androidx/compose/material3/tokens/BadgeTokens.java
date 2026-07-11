package androidx.compose.material3.tokens;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\n\u0010\u0018R\u001d\u0010\u001e\u001a\u00020\u001a8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\r\u0010\u001dR\u0017\u0010 \u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018R\u001d\u0010\"\u001a\u00020\u001a8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\u0016\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/material3/tokens/BadgeTokens;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "rl", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", c.f62177j, "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "Color", "t", "getLargeColor", "LargeColor", "nr", "getLargeLabelTextColor", "LargeLabelTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "O", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LargeLabelTextFont", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "J2", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "LargeShape", "Landroidx/compose/ui/unit/Dp;", "Uo", "F", "()F", "LargeSize", "KN", "Shape", "xMQ", "Size", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBadgeTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadgeTokens.kt\nandroidx/compose/material3/tokens/BadgeTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,33:1\n158#2:34\n158#2:35\n*S KotlinDebug\n*F\n+ 1 BadgeTokens.kt\nandroidx/compose/material3/tokens/BadgeTokens\n*L\n29#1:34\n31#1:35\n*E\n"})
public final class BadgeTokens {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private static final ShapeKeyTokens LargeShape;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private static final ShapeKeyTokens Shape;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final TypographyKeyTokens LargeLabelTextFont;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private static final float LargeSize;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final BadgeTokens f29398n = new BadgeTokens();

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens LargeLabelTextColor;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens Color;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final ColorSchemeKeyTokens LargeColor;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private static final float Size;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Error;
        Color = colorSchemeKeyTokens;
        LargeColor = colorSchemeKeyTokens;
        LargeLabelTextColor = ColorSchemeKeyTokens.OnError;
        LargeLabelTextFont = TypographyKeyTokens.LabelSmall;
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        LargeShape = shapeKeyTokens;
        LargeSize = Dp.KN((float) 16.0d);
        Shape = shapeKeyTokens;
        Size = Dp.KN((float) 6.0d);
    }

    public final float J2() {
        return Size;
    }

    public final ShapeKeyTokens O() {
        return Shape;
    }

    public final ColorSchemeKeyTokens n() {
        return Color;
    }

    public final float nr() {
        return LargeSize;
    }

    public final TypographyKeyTokens rl() {
        return LargeLabelTextFont;
    }

    public final ShapeKeyTokens t() {
        return LargeShape;
    }

    private BadgeTokens() {
    }
}
