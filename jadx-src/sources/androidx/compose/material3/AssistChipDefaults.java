package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006JN\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J0\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u0006JN\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0010R\u001d\u0010\"\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010$\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b#\u0010!R\u0018\u0010(\u001a\u00020\u0004*\u00020%8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0018\u0010*\u001a\u00020\u0004*\u00020%8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0011\u0010.\u001a\u00020+8G¢\u0006\u0006\u001a\u0004\b,\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Landroidx/compose/material3/AssistChipDefaults;", "", "<init>", "()V", "Landroidx/compose/material3/ChipColors;", "t", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ChipColors;", "Landroidx/compose/ui/unit/Dp;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "Landroidx/compose/material3/ChipElevation;", "nr", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;", "", "enabled", "Landroidx/compose/ui/graphics/Color;", "borderColor", "disabledBorderColor", "borderWidth", "Landroidx/compose/foundation/BorderStroke;", "rl", "(ZJJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "Landroidx/compose/material3/ChipBorder;", c.f62177j, "(JJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipBorder;", "O", "J2", "F", "xMQ", "()F", "Height", "getIconSize-D9Ej5fM", "IconSize", "Landroidx/compose/material3/ColorScheme;", "Uo", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ChipColors;", "defaultAssistChipColors", "KN", "defaultElevatedAssistChipColors", "Landroidx/compose/ui/graphics/Shape;", "mUb", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/AssistChipDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2787:1\n1#2:2788\n*E\n"})
public final class AssistChipDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AssistChipDefaults f24444n = new AssistChipDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float Height;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    static {
        AssistChipTokens assistChipTokens = AssistChipTokens.f29393n;
        Height = assistChipTokens.n();
        IconSize = assistChipTokens.S();
    }

    public final ChipElevation J2(float f3, float f4, float f5, float f6, float f7, float f8, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f3 = AssistChipTokens.f29393n.xMQ();
        }
        if ((i3 & 2) != 0) {
            f4 = AssistChipTokens.f29393n.HI();
        }
        if ((i3 & 4) != 0) {
            f5 = AssistChipTokens.f29393n.az();
        }
        if ((i3 & 8) != 0) {
            f6 = AssistChipTokens.f29393n.ty();
        }
        if ((i3 & 16) != 0) {
            f7 = AssistChipTokens.f29393n.Uo();
        }
        float f9 = f7;
        if ((i3 & 32) != 0) {
            f8 = AssistChipTokens.f29393n.gh();
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(1457698077, i2, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipElevation (Chip.kt:1244)");
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

    public final ChipColors KN(ColorScheme colorScheme) {
        ChipColors defaultElevatedAssistChipColorsCached = colorScheme.getDefaultElevatedAssistChipColorsCached();
        if (defaultElevatedAssistChipColorsCached != null) {
            return defaultElevatedAssistChipColorsCached;
        }
        AssistChipTokens assistChipTokens = AssistChipTokens.f29393n;
        ChipColors chipColors = new ChipColors(ColorSchemeKt.Uo(colorScheme, assistChipTokens.KN()), ColorSchemeKt.Uo(colorScheme, assistChipTokens.WPU()), ColorSchemeKt.Uo(colorScheme, assistChipTokens.XQ()), ColorSchemeKt.Uo(colorScheme, assistChipTokens.XQ()), Color.az(ColorSchemeKt.Uo(colorScheme, assistChipTokens.mUb()), assistChipTokens.qie(), 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, assistChipTokens.O()), assistChipTokens.J2(), 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, assistChipTokens.t()), assistChipTokens.nr(), 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, assistChipTokens.t()), assistChipTokens.nr(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.GD(chipColors);
        return chipColors;
    }

    public final ChipColors Uo(ColorScheme colorScheme) {
        ChipColors defaultAssistChipColorsCached = colorScheme.getDefaultAssistChipColorsCached();
        if (defaultAssistChipColorsCached != null) {
            return defaultAssistChipColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        long jJ2 = companion.J2();
        AssistChipTokens assistChipTokens = AssistChipTokens.f29393n;
        ChipColors chipColors = new ChipColors(jJ2, ColorSchemeKt.Uo(colorScheme, assistChipTokens.WPU()), ColorSchemeKt.Uo(colorScheme, assistChipTokens.XQ()), ColorSchemeKt.Uo(colorScheme, assistChipTokens.XQ()), companion.J2(), Color.az(ColorSchemeKt.Uo(colorScheme, assistChipTokens.O()), assistChipTokens.J2(), 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, assistChipTokens.t()), assistChipTokens.nr(), 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, assistChipTokens.t()), assistChipTokens.nr(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.Jk(chipColors);
        return chipColors;
    }

    public final ChipBorder n(long j2, long j3, float f3, Composer composer, int i2, int i3) {
        long jAz;
        long jXMQ = (i3 & 1) != 0 ? ColorSchemeKt.xMQ(AssistChipTokens.f29393n.o(), composer, 6) : j2;
        if ((i3 & 2) != 0) {
            AssistChipTokens assistChipTokens = AssistChipTokens.f29393n;
            jAz = Color.az(ColorSchemeKt.xMQ(assistChipTokens.Ik(), composer, 6), assistChipTokens.r(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jAz = j3;
        }
        float fZ = (i3 & 4) != 0 ? AssistChipTokens.f29393n.Z() : f3;
        if (ComposerKt.v()) {
            ComposerKt.p5(382372847, i2, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:1152)");
        }
        ChipBorder chipBorder = new ChipBorder(jXMQ, jAz, fZ, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return chipBorder;
    }

    public final ChipElevation nr(float f3, float f4, float f5, float f6, float f7, float f8, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f3 = AssistChipTokens.f29393n.ck();
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
            f7 = AssistChipTokens.f29393n.Uo();
        }
        float f9 = f7;
        if ((i3 & 32) != 0) {
            f8 = f3;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(245366099, i2, -1, "androidx.compose.material3.AssistChipDefaults.assistChipElevation (Chip.kt:1098)");
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

    public final BorderStroke rl(boolean z2, long j2, long j3, float f3, Composer composer, int i2, int i3) {
        long jAz;
        long jXMQ = (i3 & 2) != 0 ? ColorSchemeKt.xMQ(AssistChipTokens.f29393n.o(), composer, 6) : j2;
        if ((i3 & 4) != 0) {
            AssistChipTokens assistChipTokens = AssistChipTokens.f29393n;
            jAz = Color.az(ColorSchemeKt.xMQ(assistChipTokens.Ik(), composer, 6), assistChipTokens.r(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jAz = j3;
        }
        float fZ = (i3 & 8) != 0 ? AssistChipTokens.f29393n.Z() : f3;
        if (ComposerKt.v()) {
            ComposerKt.p5(-1458649561, i2, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:1124)");
        }
        if (!z2) {
            jXMQ = jAz;
        }
        BorderStroke borderStrokeN = BorderStrokeKt.n(fZ, jXMQ);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return borderStrokeN;
    }

    public final float xMQ() {
        return Height;
    }

    private AssistChipDefaults() {
    }

    public final ChipColors O(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(655175583, i2, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:1163)");
        }
        ChipColors chipColorsKN = KN(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return chipColorsKN;
    }

    public final Shape mUb(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1988153916, i2, -1, "androidx.compose.material3.AssistChipDefaults.<get-shape> (Chip.kt:1255)");
        }
        Shape shapeO = ShapesKt.O(AssistChipTokens.f29393n.rl(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }

    public final ChipColors t(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1961061417, i2, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:1019)");
        }
        ChipColors chipColorsUo = Uo(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return chipColorsUo;
    }
}
