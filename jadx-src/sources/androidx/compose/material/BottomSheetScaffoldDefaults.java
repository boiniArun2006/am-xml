package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.internal.d;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001d\u0010\n\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0007R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/material/BottomSheetScaffoldDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "rl", "F", "()F", "SheetElevation", "t", "SheetPeekHeight", "Landroidx/compose/animation/core/AnimationSpec;", "", "nr", "Landroidx/compose/animation/core/AnimationSpec;", c.f62177j, "()Landroidx/compose/animation/core/AnimationSpec;", "AnimationSpec", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,601:1\n149#2:602\n149#2:603\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldDefaults\n*L\n448#1:602\n451#1:603\n*E\n"})
public final class BottomSheetScaffoldDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final BottomSheetScaffoldDefaults f21484n = new BottomSheetScaffoldDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float SheetElevation = Dp.KN(8);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float SheetPeekHeight = Dp.KN(56);

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final AnimationSpec AnimationSpec = AnimationSpecKt.ty(d.f62986a, 0, EasingKt.nr(), 2, null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f21483O = 8;

    public final AnimationSpec n() {
        return AnimationSpec;
    }

    public final float rl() {
        return SheetElevation;
    }

    public final float t() {
        return SheetPeekHeight;
    }

    private BottomSheetScaffoldDefaults() {
    }
}
