package androidx.compose.material3.tokens;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/tokens/PlainTooltipTokens;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "rl", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", c.f62177j, "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerColor", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "t", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "nr", "SupportingTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "O", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "SupportingTextFont", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PlainTooltipTokens {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final PlainTooltipTokens f29832n = new PlainTooltipTokens();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.InverseSurface;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerExtraSmall;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens SupportingTextColor = ColorSchemeKeyTokens.InverseOnSurface;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final TypographyKeyTokens SupportingTextFont = TypographyKeyTokens.BodySmall;

    public final ColorSchemeKeyTokens n() {
        return ContainerColor;
    }

    public final TypographyKeyTokens nr() {
        return SupportingTextFont;
    }

    public final ShapeKeyTokens rl() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens t() {
        return SupportingTextColor;
    }

    private PlainTooltipTokens() {
    }
}
