package androidx.compose.material;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\u00020\u000b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00108Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00108Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/material/DrawerDefaults;", "", "<init>", "()V", "Landroidx/compose/animation/core/TweenSpec;", "", "rl", "Landroidx/compose/animation/core/TweenSpec;", c.f62177j, "()Landroidx/compose/animation/core/TweenSpec;", "AnimationSpec", "Landroidx/compose/ui/unit/Dp;", "t", "F", "()F", "Elevation", "Landroidx/compose/ui/graphics/Color;", "(Landroidx/compose/runtime/Composer;I)J", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Shape;", "O", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "nr", "scrimColor", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,842:1\n149#2:843\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerDefaults\n*L\n712#1:843\n*E\n"})
public final class DrawerDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final DrawerDefaults f21849n = new DrawerDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final TweenSpec AnimationSpec = new TweenSpec(256, 0, null, 6, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float Elevation = Dp.KN(16);

    public final TweenSpec n() {
        return AnimationSpec;
    }

    public final float t() {
        return Elevation;
    }

    private DrawerDefaults() {
    }

    public final Shape O(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(2041803618, i2, -1, "androidx.compose.material.DrawerDefaults.<get-shape> (Drawer.kt:715)");
        }
        CornerBasedShape large = MaterialTheme.f22169n.rl(composer, 6).getLarge();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return large;
    }

    public final long nr(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(617225966, i2, -1, "androidx.compose.material.DrawerDefaults.<get-scrimColor> (Drawer.kt:719)");
        }
        long jAz = Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jAz;
    }

    public final long rl(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-788676020, i2, -1, "androidx.compose.material.DrawerDefaults.<get-backgroundColor> (Drawer.kt:708)");
        }
        long jTy = MaterialTheme.f22169n.n(composer, 6).ty();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jTy;
    }
}
