package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.FilterChipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006JN\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J^\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u0006JN\u0010\u001f\u001a\u00020\u000e2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0010R\u001d\u0010#\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010%\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b$\u0010\"R\u0018\u0010)\u001a\u00020\u0004*\u00020&8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0018\u0010+\u001a\u00020\u0004*\u00020&8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0011\u0010/\u001a\u00020,8G¢\u0006\u0006\u001a\u0004\b-\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, d2 = {"Landroidx/compose/material3/FilterChipDefaults;", "", "<init>", "()V", "Landroidx/compose/material3/SelectableChipColors;", "nr", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SelectableChipColors;", "Landroidx/compose/ui/unit/Dp;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "Landroidx/compose/material3/SelectableChipElevation;", "O", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipElevation;", "", "enabled", "selected", "Landroidx/compose/ui/graphics/Color;", "borderColor", "selectedBorderColor", "disabledBorderColor", "disabledSelectedBorderColor", "borderWidth", "selectedBorderWidth", "Landroidx/compose/foundation/BorderStroke;", "t", "(ZZJJJJFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", c.f62177j, "rl", "F", "KN", "()F", "Height", "getIconSize-D9Ej5fM", "IconSize", "Landroidx/compose/material3/ColorScheme;", "Uo", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SelectableChipColors;", "defaultFilterChipColors", "J2", "defaultElevatedFilterChipColors", "Landroidx/compose/ui/graphics/Shape;", "xMQ", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/FilterChipDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2787:1\n1#2:2788\n*E\n"})
public final class FilterChipDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final FilterChipDefaults f25881n = new FilterChipDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float Height;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    static {
        FilterChipTokens filterChipTokens = FilterChipTokens.f29642n;
        Height = filterChipTokens.n();
        IconSize = filterChipTokens.iF();
    }

    public final SelectableChipColors J2(ColorScheme colorScheme) {
        SelectableChipColors defaultElevatedFilterChipColorsCached = colorScheme.getDefaultElevatedFilterChipColorsCached();
        if (defaultElevatedFilterChipColorsCached != null) {
            return defaultElevatedFilterChipColorsCached;
        }
        FilterChipTokens filterChipTokens = FilterChipTokens.f29642n;
        SelectableChipColors selectableChipColors = new SelectableChipColors(ColorSchemeKt.Uo(colorScheme, filterChipTokens.ck()), ColorSchemeKt.Uo(colorScheme, filterChipTokens.X()), ColorSchemeKt.Uo(colorScheme, filterChipTokens.T()), ColorSchemeKt.Uo(colorScheme, filterChipTokens.T()), Color.az(ColorSchemeKt.Uo(colorScheme, filterChipTokens.xMQ()), filterChipTokens.gh(), 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, filterChipTokens.t()), filterChipTokens.nr(), 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, filterChipTokens.O()), filterChipTokens.J2(), 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, filterChipTokens.O()), filterChipTokens.J2(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, filterChipTokens.HI()), Color.az(ColorSchemeKt.Uo(colorScheme, filterChipTokens.xMQ()), filterChipTokens.gh(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, filterChipTokens.E2()), ColorSchemeKt.Uo(colorScheme, filterChipTokens.e()), ColorSchemeKt.Uo(colorScheme, filterChipTokens.e()), null);
        colorScheme.hRu(selectableChipColors);
        return selectableChipColors;
    }

    public final float KN() {
        return Height;
    }

    public final SelectableChipElevation O(float f3, float f4, float f5, float f6, float f7, float f8, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f3 = FilterChipTokens.f29642n.Ik();
        }
        if ((i3 & 2) != 0) {
            f4 = FilterChipTokens.f29642n.nY();
        }
        if ((i3 & 4) != 0) {
            f5 = FilterChipTokens.f29642n.WPU();
        }
        if ((i3 & 8) != 0) {
            f6 = FilterChipTokens.f29642n.aYN();
        }
        if ((i3 & 16) != 0) {
            f7 = FilterChipTokens.f29642n.Uo();
        }
        float f9 = f7;
        if ((i3 & 32) != 0) {
            f8 = f3;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(-757972185, i2, -1, "androidx.compose.material3.FilterChipDefaults.filterChipElevation (Chip.kt:1378)");
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

    public final SelectableChipColors Uo(ColorScheme colorScheme) {
        SelectableChipColors defaultFilterChipColorsCached = colorScheme.getDefaultFilterChipColorsCached();
        if (defaultFilterChipColorsCached != null) {
            return defaultFilterChipColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        long jJ2 = companion.J2();
        FilterChipTokens filterChipTokens = FilterChipTokens.f29642n;
        SelectableChipColors selectableChipColors = new SelectableChipColors(jJ2, ColorSchemeKt.Uo(colorScheme, filterChipTokens.X()), ColorSchemeKt.Uo(colorScheme, filterChipTokens.T()), ColorSchemeKt.Uo(colorScheme, filterChipTokens.T()), companion.J2(), Color.az(ColorSchemeKt.Uo(colorScheme, filterChipTokens.t()), filterChipTokens.nr(), 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, filterChipTokens.O()), filterChipTokens.J2(), 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, filterChipTokens.O()), filterChipTokens.J2(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, filterChipTokens.S()), Color.az(ColorSchemeKt.Uo(colorScheme, filterChipTokens.r()), filterChipTokens.o(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, filterChipTokens.E2()), ColorSchemeKt.Uo(colorScheme, filterChipTokens.e()), ColorSchemeKt.Uo(colorScheme, filterChipTokens.e()), null);
        colorScheme.kSg(selectableChipColors);
        return selectableChipColors;
    }

    public final SelectableChipElevation rl(float f3, float f4, float f5, float f6, float f7, float f8, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f3 = FilterChipTokens.f29642n.KN();
        }
        if ((i3 & 2) != 0) {
            f4 = FilterChipTokens.f29642n.ty();
        }
        if ((i3 & 4) != 0) {
            f5 = FilterChipTokens.f29642n.qie();
        }
        if ((i3 & 8) != 0) {
            f6 = FilterChipTokens.f29642n.az();
        }
        if ((i3 & 16) != 0) {
            f7 = FilterChipTokens.f29642n.Uo();
        }
        float f9 = f7;
        if ((i3 & 32) != 0) {
            f8 = FilterChipTokens.f29642n.mUb();
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(684803697, i2, -1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipElevation (Chip.kt:1536)");
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

    public final BorderStroke t(boolean z2, boolean z3, long j2, long j3, long j4, long j5, float f3, float f4, Composer composer, int i2, int i3) {
        long jAz;
        long jXMQ = (i3 & 4) != 0 ? ColorSchemeKt.xMQ(FilterChipTokens.f29642n.g(), composer, 6) : j2;
        long jJ2 = (i3 & 8) != 0 ? Color.INSTANCE.J2() : j3;
        if ((i3 & 16) != 0) {
            FilterChipTokens filterChipTokens = FilterChipTokens.f29642n;
            jAz = Color.az(ColorSchemeKt.xMQ(filterChipTokens.Z(), composer, 6), filterChipTokens.XQ(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jAz = j4;
        }
        long jJ22 = (i3 & 32) != 0 ? Color.INSTANCE.J2() : j5;
        float fTe = (i3 & 64) != 0 ? FilterChipTokens.f29642n.te() : f3;
        float fViF = (i3 & 128) != 0 ? FilterChipTokens.f29642n.ViF() : f4;
        if (ComposerKt.v()) {
            ComposerKt.p5(-1138342447, i2, -1, "androidx.compose.material3.FilterChipDefaults.filterChipBorder (Chip.kt:1415)");
        }
        if (!z2) {
            jXMQ = z3 ? jJ22 : jAz;
        } else if (z3) {
            jXMQ = jJ2;
        }
        if (z3) {
            fTe = fViF;
        }
        BorderStroke borderStrokeN = BorderStrokeKt.n(fTe, jXMQ);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return borderStrokeN;
    }

    private FilterChipDefaults() {
    }

    public final SelectableChipColors n(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1082953289, i2, -1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipColors (Chip.kt:1430)");
        }
        SelectableChipColors selectableChipColorsJ2 = J2(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return selectableChipColorsJ2;
    }

    public final SelectableChipColors nr(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1743772077, i2, -1, "androidx.compose.material3.FilterChipDefaults.filterChipColors (Chip.kt:1273)");
        }
        SelectableChipColors selectableChipColorsUo = Uo(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return selectableChipColorsUo;
    }

    public final Shape xMQ(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1598643637, i2, -1, "androidx.compose.material3.FilterChipDefaults.<get-shape> (Chip.kt:1547)");
        }
        Shape shapeO = ShapesKt.O(FilterChipTokens.f29642n.rl(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }
}
