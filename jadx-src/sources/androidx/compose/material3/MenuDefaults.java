package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.material3.tokens.MenuTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\f\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u000f\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\r\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\u00188Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u00020\u0004*\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/material3/MenuDefaults;", "", "<init>", "()V", "Landroidx/compose/material3/MenuItemColors;", "Uo", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/MenuItemColors;", "Landroidx/compose/ui/unit/Dp;", "rl", "F", "J2", "()F", "TonalElevation", "t", "nr", "ShadowElevation", "Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/foundation/layout/PaddingValues;", "()Landroidx/compose/foundation/layout/PaddingValues;", "DropdownMenuItemContentPadding", "Landroidx/compose/ui/graphics/Shape;", "O", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", c.f62177j, "(Landroidx/compose/runtime/Composer;I)J", "containerColor", "Landroidx/compose/material3/ColorScheme;", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/MenuItemColors;", "defaultMenuItemColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,560:1\n1#2:561\n148#3:562\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuDefaults\n*L\n261#1:562\n*E\n"})
public final class MenuDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final MenuDefaults f26185n = new MenuDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float TonalElevation = ElevationTokens.f29511n.n();

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float ShadowElevation = MenuTokens.f29691n.rl();

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final PaddingValues DropdownMenuItemContentPadding = PaddingKt.rl(MenuKt.f26192t, Dp.KN(0));

    public final float J2() {
        return TonalElevation;
    }

    public final float nr() {
        return ShadowElevation;
    }

    public final MenuItemColors rl(ColorScheme colorScheme) {
        MenuItemColors menuItemColorsViF = colorScheme.getDefaultMenuItemColorsCached();
        if (menuItemColorsViF != null) {
            return menuItemColorsViF;
        }
        ListTokens listTokens = ListTokens.f29685n;
        MenuItemColors menuItemColors = new MenuItemColors(ColorSchemeKt.Uo(colorScheme, listTokens.mUb()), ColorSchemeKt.Uo(colorScheme, listTokens.qie()), ColorSchemeKt.Uo(colorScheme, listTokens.Z()), Color.az(ColorSchemeKt.Uo(colorScheme, listTokens.nr()), listTokens.O(), 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, listTokens.J2()), listTokens.Uo(), 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, listTokens.KN()), listTokens.xMQ(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.tFV(menuItemColors);
        return menuItemColors;
    }

    public final PaddingValues t() {
        return DropdownMenuItemContentPadding;
    }

    private MenuDefaults() {
    }

    public final Shape O(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(218702739, i2, -1, "androidx.compose.material3.MenuDefaults.<get-shape> (Menu.kt:194)");
        }
        Shape shapeO = ShapesKt.O(MenuTokens.f29691n.t(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }

    public final MenuItemColors Uo(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1326531516, i2, -1, "androidx.compose.material3.MenuDefaults.itemColors (Menu.kt:204)");
        }
        MenuItemColors menuItemColorsRl = rl(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return menuItemColorsRl;
    }

    public final long n(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1787427929, i2, -1, QiDPjiOCZHDS.cyGwUrRKP);
        }
        long jXMQ = ColorSchemeKt.xMQ(MenuTokens.f29691n.n(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jXMQ;
    }
}
