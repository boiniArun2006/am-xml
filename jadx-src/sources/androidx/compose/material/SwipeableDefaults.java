package androidx.compose.material;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0015\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\r\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/material/SwipeableDefaults;", "", "<init>", "()V", "", "", "anchors", "factorAtMin", "factorAtMax", "Landroidx/compose/material/ResistanceConfig;", "t", "(Ljava/util/Set;FF)Landroidx/compose/material/ResistanceConfig;", "Landroidx/compose/animation/core/SpringSpec;", "rl", "Landroidx/compose/animation/core/SpringSpec;", c.f62177j, "()Landroidx/compose/animation/core/SpringSpec;", "AnimationSpec", "Landroidx/compose/ui/unit/Dp;", "F", "()F", "VelocityThreshold", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(message = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
@SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,881:1\n149#2:882\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableDefaults\n*L\n801#1:882\n*E\n"})
public final class SwipeableDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SwipeableDefaults f23201n = new SwipeableDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final SpringSpec AnimationSpec = new SpringSpec(0.0f, 0.0f, null, 7, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float VelocityThreshold = Dp.KN(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);

    public static /* synthetic */ ResistanceConfig nr(SwipeableDefaults swipeableDefaults, Set set, float f3, float f4, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = 10.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 10.0f;
        }
        return swipeableDefaults.t(set, f3, f4);
    }

    public final SpringSpec n() {
        return AnimationSpec;
    }

    public final float rl() {
        return VelocityThreshold;
    }

    private SwipeableDefaults() {
    }

    public final ResistanceConfig t(Set anchors, float factorAtMin, float factorAtMax) {
        if (anchors.size() <= 1) {
            return null;
        }
        Set set = anchors;
        Float fMaxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Float>) set);
        Intrinsics.checkNotNull(fMaxOrNull);
        float fFloatValue = fMaxOrNull.floatValue();
        Float fMinOrNull = CollectionsKt.minOrNull((Iterable<? extends Float>) set);
        Intrinsics.checkNotNull(fMinOrNull);
        return new ResistanceConfig(fFloatValue - fMinOrNull.floatValue(), factorAtMin, factorAtMax);
    }
}
