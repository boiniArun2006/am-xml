package androidx.compose.material3.internal;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.Stable;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Stable
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/material3/internal/AnchoredDraggableDefaults;", "", "<init>", "()V", "Landroidx/compose/animation/core/SpringSpec;", "", "rl", "Landroidx/compose/animation/core/SpringSpec;", c.f62177j, "()Landroidx/compose/animation/core/SpringSpec;", "AnimationSpec", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AnchoredDraggableDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AnchoredDraggableDefaults f29004n = new AnchoredDraggableDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final SpringSpec AnimationSpec = new SpringSpec(0.0f, 0.0f, null, 7, null);

    public final SpringSpec n() {
        return AnimationSpec;
    }

    private AnchoredDraggableDefaults() {
    }
}
