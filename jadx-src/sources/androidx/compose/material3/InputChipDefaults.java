package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.InputChipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006JN\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J^\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010!\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001d\u0010$\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010 R\u001d\u0010&\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b%\u0010 R\u0018\u0010*\u001a\u00020\u0004*\u00020'8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010-\u001a\u00020+8G¢\u0006\u0006\u001a\u0004\b\"\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/material3/InputChipDefaults;", "", "<init>", "()V", "Landroidx/compose/material3/SelectableChipColors;", "O", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SelectableChipColors;", "Landroidx/compose/ui/unit/Dp;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "Landroidx/compose/material3/SelectableChipElevation;", "J2", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipElevation;", "", "enabled", "selected", "Landroidx/compose/ui/graphics/Color;", "borderColor", "selectedBorderColor", "disabledBorderColor", "disabledSelectedBorderColor", "borderWidth", "selectedBorderWidth", "Landroidx/compose/foundation/BorderStroke;", "nr", "(ZZJJJJFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "rl", "F", "()F", "Height", "t", "getIconSize-D9Ej5fM", "IconSize", "getAvatarSize-D9Ej5fM", "AvatarSize", "Landroidx/compose/material3/ColorScheme;", c.f62177j, "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SelectableChipColors;", "defaultInputChipColors", "Landroidx/compose/ui/graphics/Shape;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/InputChipDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2787:1\n1#2:2788\n*E\n"})
public final class InputChipDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final InputChipDefaults f26073n = new InputChipDefaults();

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final float AvatarSize;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float Height;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    static {
        InputChipTokens inputChipTokens = InputChipTokens.f29662n;
        Height = inputChipTokens.nr();
        IconSize = inputChipTokens.az();
        AvatarSize = inputChipTokens.rl();
    }

    public final SelectableChipElevation J2(float f3, float f4, float f5, float f6, float f7, float f8, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f3 = InputChipTokens.f29662n.t();
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
            f7 = InputChipTokens.f29662n.gh();
        }
        float f9 = f7;
        if ((i3 & 32) != 0) {
            f8 = f3;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(1745270109, i2, -1, "androidx.compose.material3.InputChipDefaults.inputChipElevation (Chip.kt:1672)");
        }
        float f10 = f8;
        float f11 = f5;
        float f12 = f3;
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(f12, f4, f11, f6, f9, f10, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return selectableChipElevation;
    }

    public final SelectableChipColors n(ColorScheme colorScheme) {
        SelectableChipColors defaultInputChipColorsCached = colorScheme.getDefaultInputChipColorsCached();
        if (defaultInputChipColorsCached != null) {
            return defaultInputChipColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        long jJ2 = companion.J2();
        InputChipTokens inputChipTokens = InputChipTokens.f29662n;
        SelectableChipColors selectableChipColors = new SelectableChipColors(jJ2, ColorSchemeKt.Uo(colorScheme, inputChipTokens.o()), ColorSchemeKt.Uo(colorScheme, inputChipTokens.Z()), ColorSchemeKt.Uo(colorScheme, inputChipTokens.WPU()), companion.J2(), Color.az(ColorSchemeKt.Uo(colorScheme, inputChipTokens.J2()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, inputChipTokens.Uo()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, inputChipTokens.xMQ()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, inputChipTokens.ty()), Color.az(ColorSchemeKt.Uo(colorScheme, inputChipTokens.KN()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, inputChipTokens.HI()), ColorSchemeKt.Uo(colorScheme, inputChipTokens.ck()), ColorSchemeKt.Uo(colorScheme, inputChipTokens.r()), null);
        colorScheme.a63(selectableChipColors);
        return selectableChipColors;
    }

    public final BorderStroke nr(boolean z2, boolean z3, long j2, long j3, long j4, long j5, float f3, float f4, Composer composer, int i2, int i3) {
        long jXMQ = (i3 & 4) != 0 ? ColorSchemeKt.xMQ(InputChipTokens.f29662n.XQ(), composer, 6) : j2;
        long jJ2 = (i3 & 8) != 0 ? Color.INSTANCE.J2() : j3;
        long jAz = (i3 & 16) != 0 ? Color.az(ColorSchemeKt.xMQ(InputChipTokens.f29662n.mUb(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        long jJ22 = (i3 & 32) != 0 ? Color.INSTANCE.J2() : j5;
        float fS = (i3 & 64) != 0 ? InputChipTokens.f29662n.S() : f3;
        float fIk = (i3 & 128) != 0 ? InputChipTokens.f29662n.Ik() : f4;
        if (ComposerKt.v()) {
            ComposerKt.p5(2050575347, i2, -1, "androidx.compose.material3.InputChipDefaults.inputChipBorder (Chip.kt:1709)");
        }
        if (!z2) {
            jXMQ = z3 ? jJ22 : jAz;
        } else if (z3) {
            jXMQ = jJ2;
        }
        if (z3) {
            fS = fIk;
        }
        BorderStroke borderStrokeN = BorderStrokeKt.n(fS, jXMQ);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return borderStrokeN;
    }

    public final float rl() {
        return Height;
    }

    private InputChipDefaults() {
    }

    public final SelectableChipColors O(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-770375587, i2, -1, "androidx.compose.material3.InputChipDefaults.inputChipColors (Chip.kt:1568)");
        }
        SelectableChipColors selectableChipColorsN = n(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return selectableChipColorsN;
    }

    public final Shape t(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1052444143, i2, -1, "androidx.compose.material3.InputChipDefaults.<get-shape> (Chip.kt:1721)");
        }
        Shape shapeO = ShapesKt.O(InputChipTokens.f29662n.O(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }
}
