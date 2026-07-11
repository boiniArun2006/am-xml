package androidx.compose.material3;

import androidx.compose.material3.tokens.ExtendedFabPrimaryTokens;
import androidx.compose.material3.tokens.FabPrimaryLargeTokens;
import androidx.compose.material3.tokens.FabPrimarySmallTokens;
import androidx.compose.material3.tokens.FabPrimaryTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Shape;
import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0010\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u001a\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\u001d\u001a\u00020\u001b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\f\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/FloatingActionButtonDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "Landroidx/compose/material3/FloatingActionButtonElevation;", c.f62177j, "(FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/FloatingActionButtonElevation;", "rl", "F", "getLargeIconSize-D9Ej5fM", "()F", "LargeIconSize", "Landroidx/compose/ui/graphics/Shape;", "O", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "J2", "smallShape", "nr", "largeShape", "t", "extendedFabShape", "Landroidx/compose/ui/graphics/Color;", "(Landroidx/compose/runtime/Composer;I)J", "containerColor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,702:1\n148#2:703\n148#2:704\n148#2:705\n148#2:706\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonDefaults\n*L\n489#1:703\n490#1:704\n491#1:705\n492#1:706\n*E\n"})
public final class FloatingActionButtonDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final FloatingActionButtonDefaults f25883n = new FloatingActionButtonDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float LargeIconSize = FabPrimaryLargeTokens.f29521n.nr();

    public final FloatingActionButtonElevation n(float f3, float f4, float f5, float f6, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f3 = FabPrimaryTokens.f29529n.rl();
        }
        if ((i3 & 2) != 0) {
            f4 = FabPrimaryTokens.f29529n.KN();
        }
        if ((i3 & 4) != 0) {
            f5 = FabPrimaryTokens.f29529n.J2();
        }
        float f7 = f5;
        if ((i3 & 8) != 0) {
            f6 = FabPrimaryTokens.f29529n.Uo();
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(-241106249, i2, -1, "androidx.compose.material3.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:446)");
        }
        float f8 = f3;
        FloatingActionButtonElevation floatingActionButtonElevation = new FloatingActionButtonElevation(f8, f4, f7, f6, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return floatingActionButtonElevation;
    }

    private FloatingActionButtonDefaults() {
    }

    public final Shape J2(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(394933381, i2, -1, qfEYuUHwj.YdbqEG);
        }
        Shape shapeO = ShapesKt.O(FabPrimarySmallTokens.f29525n.rl(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }

    public final Shape O(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-53247565, i2, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-shape> (FloatingActionButton.kt:410)");
        }
        Shape shapeO = ShapesKt.O(FabPrimaryTokens.f29529n.nr(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }

    public final Shape nr(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1835912187, i2, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-largeShape> (FloatingActionButton.kt:418)");
        }
        Shape shapeO = ShapesKt.O(FabPrimaryLargeTokens.f29521n.rl(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }

    public final long rl(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1855656391, i2, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-containerColor> (FloatingActionButton.kt:426)");
        }
        long jXMQ = ColorSchemeKt.xMQ(FabPrimaryTokens.f29529n.n(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jXMQ;
    }

    public final Shape t(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-536021915, i2, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-extendedFabShape> (FloatingActionButton.kt:422)");
        }
        Shape shapeO = ShapesKt.O(ExtendedFabPrimaryTokens.f29516n.n(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }
}
