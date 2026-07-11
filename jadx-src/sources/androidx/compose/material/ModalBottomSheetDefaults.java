package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.internal.d;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00108Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/ModalBottomSheetDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "rl", "F", "()F", "Elevation", "Landroidx/compose/animation/core/AnimationSpec;", "", "t", "Landroidx/compose/animation/core/AnimationSpec;", c.f62177j, "()Landroidx/compose/animation/core/AnimationSpec;", "AnimationSpec", "Landroidx/compose/ui/graphics/Color;", "(Landroidx/compose/runtime/Composer;I)J", "scrimColor", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,590:1\n149#2:591\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetDefaults\n*L\n519#1:591\n*E\n"})
public final class ModalBottomSheetDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ModalBottomSheetDefaults f22218n = new ModalBottomSheetDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float Elevation = Dp.KN(16);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final AnimationSpec AnimationSpec = AnimationSpecKt.ty(d.f62986a, 0, EasingKt.nr(), 2, null);
    public static final int nr = 8;

    public final AnimationSpec n() {
        return AnimationSpec;
    }

    public final float rl() {
        return Elevation;
    }

    private ModalBottomSheetDefaults() {
    }

    public final long t(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-112572414, i2, -1, "androidx.compose.material.ModalBottomSheetDefaults.<get-scrimColor> (ModalBottomSheet.kt:522)");
        }
        long jAz = Color.az(MaterialTheme.f22169n.n(composer, 6).xMQ(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jAz;
    }
}
