package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.internal.d;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\u000e\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\r\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00188Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/material/BackdropScaffoldDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "rl", "F", "J2", "()F", "PeekHeight", "t", "O", "HeaderHeight", "nr", "FrontLayerElevation", "Landroidx/compose/animation/core/AnimationSpec;", "", "Landroidx/compose/animation/core/AnimationSpec;", c.f62177j, "()Landroidx/compose/animation/core/AnimationSpec;", "AnimationSpec", "Landroidx/compose/ui/graphics/Shape;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "frontLayerShape", "Landroidx/compose/ui/graphics/Color;", "(Landroidx/compose/runtime/Composer;I)J", "frontLayerScrimColor", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,696:1\n149#2:697\n149#2:698\n149#2:699\n149#2:700\n149#2:701\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldDefaults\n*L\n620#1:697\n621#1:698\n610#1:699\n613#1:700\n625#1:701\n*E\n"})
public final class BackdropScaffoldDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final BackdropScaffoldDefaults f21257n = new BackdropScaffoldDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float PeekHeight = Dp.KN(56);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float HeaderHeight = Dp.KN(48);

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final float FrontLayerElevation = Dp.KN(1);

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final AnimationSpec AnimationSpec = AnimationSpecKt.ty(d.f62986a, 0, EasingKt.nr(), 2, null);
    public static final int J2 = 8;

    public final float J2() {
        return PeekHeight;
    }

    public final float O() {
        return HeaderHeight;
    }

    public final AnimationSpec n() {
        return AnimationSpec;
    }

    public final float rl() {
        return FrontLayerElevation;
    }

    private BackdropScaffoldDefaults() {
    }

    public final Shape nr(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1580588700, i2, -1, "androidx.compose.material.BackdropScaffoldDefaults.<get-frontLayerShape> (BackdropScaffold.kt:618)");
        }
        CornerBasedShape large = MaterialTheme.f22169n.rl(composer, 6).getLarge();
        float f3 = 16;
        CornerBasedShape cornerBasedShapeNr = CornerBasedShape.nr(large, CornerSizeKt.rl(Dp.KN(f3)), CornerSizeKt.rl(Dp.KN(f3)), null, null, 12, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return cornerBasedShapeNr;
    }

    public final long t(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1806270648, i2, -1, "androidx.compose.material.BackdropScaffoldDefaults.<get-frontLayerScrimColor> (BackdropScaffold.kt:628)");
        }
        long jAz = Color.az(MaterialTheme.f22169n.n(composer, 6).ty(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jAz;
    }
}
