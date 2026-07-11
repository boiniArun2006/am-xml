package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.material3.tokens.SuggestionChipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006JN\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J0\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u0006JN\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0010R\u001d\u0010\"\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010%\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R\u0018\u0010(\u001a\u00020\u0004*\u00020&8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010'R\u0011\u0010,\u001a\u00020)8G¢\u0006\u0006\u001a\u0004\b*\u0010+\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Landroidx/compose/material3/SuggestionChipDefaults;", "", "<init>", "()V", "Landroidx/compose/material3/ChipColors;", "KN", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ChipColors;", "Landroidx/compose/ui/unit/Dp;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "Landroidx/compose/material3/ChipElevation;", "xMQ", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;", "", "enabled", "Landroidx/compose/ui/graphics/Color;", "borderColor", "disabledBorderColor", "borderWidth", "Landroidx/compose/foundation/BorderStroke;", "Uo", "(ZJJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "Landroidx/compose/material3/ChipBorder;", "J2", "(JJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipBorder;", c.f62177j, "rl", "F", "nr", "()F", "Height", "t", "getIconSize-D9Ej5fM", "IconSize", "Landroidx/compose/material3/ColorScheme;", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ChipColors;", "defaultElevatedSuggestionChipColors", "Landroidx/compose/ui/graphics/Shape;", "O", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/SuggestionChipDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2787:1\n1#2:2788\n*E\n"})
public final class SuggestionChipDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SuggestionChipDefaults f27932n = new SuggestionChipDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float Height;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    static {
        SuggestionChipTokens suggestionChipTokens = SuggestionChipTokens.f29910n;
        Height = suggestionChipTokens.n();
        IconSize = suggestionChipTokens.WPU();
    }

    public final ChipBorder J2(long j2, long j3, float f3, Composer composer, int i2, int i3) {
        long jAz;
        long jXMQ = (i3 & 1) != 0 ? ColorSchemeKt.xMQ(SuggestionChipTokens.f29910n.r(), composer, 6) : j2;
        if ((i3 & 2) != 0) {
            SuggestionChipTokens suggestionChipTokens = SuggestionChipTokens.f29910n;
            jAz = Color.az(ColorSchemeKt.xMQ(suggestionChipTokens.ck(), composer, 6), suggestionChipTokens.Ik(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jAz = j3;
        }
        float fO = (i3 & 4) != 0 ? SuggestionChipTokens.f29910n.o() : f3;
        if (ComposerKt.v()) {
            ComposerKt.p5(439283919, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1845)");
        }
        ChipBorder chipBorder = new ChipBorder(jXMQ, jAz, fO, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return chipBorder;
    }

    public final BorderStroke Uo(boolean z2, long j2, long j3, float f3, Composer composer, int i2, int i3) {
        long jAz;
        long jXMQ = (i3 & 2) != 0 ? ColorSchemeKt.xMQ(SuggestionChipTokens.f29910n.r(), composer, 6) : j2;
        if ((i3 & 4) != 0) {
            SuggestionChipTokens suggestionChipTokens = SuggestionChipTokens.f29910n;
            jAz = Color.az(ColorSchemeKt.xMQ(suggestionChipTokens.ck(), composer, 6), suggestionChipTokens.Ik(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jAz = j3;
        }
        float fO = (i3 & 8) != 0 ? SuggestionChipTokens.f29910n.o() : f3;
        if (ComposerKt.v()) {
            ComposerKt.p5(-637354809, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1818)");
        }
        if (!z2) {
            jXMQ = jAz;
        }
        BorderStroke borderStrokeN = BorderStrokeKt.n(fO, jXMQ);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return borderStrokeN;
    }

    public final float nr() {
        return Height;
    }

    public final ChipElevation rl(float f3, float f4, float f5, float f6, float f7, float f8, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f3 = SuggestionChipTokens.f29910n.xMQ();
        }
        if ((i3 & 2) != 0) {
            f4 = SuggestionChipTokens.f29910n.ty();
        }
        if ((i3 & 4) != 0) {
            f5 = SuggestionChipTokens.f29910n.qie();
        }
        if ((i3 & 8) != 0) {
            f6 = SuggestionChipTokens.f29910n.az();
        }
        if ((i3 & 16) != 0) {
            f7 = SuggestionChipTokens.f29910n.Uo();
        }
        float f9 = f7;
        if ((i3 & 32) != 0) {
            f8 = SuggestionChipTokens.f29910n.gh();
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(1118088467, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipElevation (Chip.kt:1932)");
        }
        float f10 = f8;
        float f11 = f5;
        float f12 = f3;
        ChipElevation chipElevation = new ChipElevation(f12, f4, f11, f6, f9, f10, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return chipElevation;
    }

    public final ChipColors t(ColorScheme colorScheme) {
        ChipColors defaultElevatedSuggestionChipColorsCached = colorScheme.getDefaultElevatedSuggestionChipColorsCached();
        if (defaultElevatedSuggestionChipColorsCached != null) {
            return defaultElevatedSuggestionChipColorsCached;
        }
        SuggestionChipTokens suggestionChipTokens = SuggestionChipTokens.f29910n;
        long jUo = ColorSchemeKt.Uo(colorScheme, suggestionChipTokens.KN());
        long jUo2 = ColorSchemeKt.Uo(colorScheme, suggestionChipTokens.Z());
        long jUo3 = ColorSchemeKt.Uo(colorScheme, suggestionChipTokens.S());
        Color.Companion companion = Color.INSTANCE;
        long jUo4 = companion.Uo();
        long jUo5 = ColorSchemeKt.Uo(colorScheme, suggestionChipTokens.mUb());
        AssistChipTokens assistChipTokens = AssistChipTokens.f29393n;
        ChipColors chipColors = new ChipColors(jUo, jUo2, jUo3, jUo4, Color.az(jUo5, assistChipTokens.qie(), 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, suggestionChipTokens.t()), suggestionChipTokens.nr(), 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, assistChipTokens.t()), assistChipTokens.nr(), 0.0f, 0.0f, 0.0f, 14, null), companion.Uo(), null);
        colorScheme.UhV(chipColors);
        return chipColors;
    }

    public final ChipElevation xMQ(float f3, float f4, float f5, float f6, float f7, float f8, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f3 = SuggestionChipTokens.f29910n.HI();
        }
        if ((i3 & 2) != 0) {
            f4 = f3;
        }
        if ((i3 & 4) != 0) {
            f5 = f3;
        }
        if ((i3 & 8) != 0) {
            f6 = f3;
        }
        if ((i3 & 16) != 0) {
            f7 = SuggestionChipTokens.f29910n.Uo();
        }
        float f9 = f7;
        if ((i3 & 32) != 0) {
            f8 = f3;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(1929994057, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipElevation (Chip.kt:1792)");
        }
        float f10 = f8;
        float f11 = f5;
        float f12 = f3;
        ChipElevation chipElevation = new ChipElevation(f12, f4, f11, f6, f9, f10, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return chipElevation;
    }

    private SuggestionChipDefaults() {
    }

    public final ChipColors KN(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1918570697, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:1739)");
        }
        ChipColors chipColorsO = ChipKt.o(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return chipColorsO;
    }

    public final Shape O(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(641188183, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.<get-shape> (Chip.kt:1943)");
        }
        Shape shapeO = ShapesKt.O(SuggestionChipTokens.f29910n.rl(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }

    public final ChipColors n(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1671233087, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:1857)");
        }
        ChipColors chipColorsT = t(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return chipColorsT;
    }
}
