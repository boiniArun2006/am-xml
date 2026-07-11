package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/material3/internal/BasicTooltipDefaults;", "", "<init>", "()V", "Landroidx/compose/foundation/MutatorMutex;", "rl", "Landroidx/compose/foundation/MutatorMutex;", c.f62177j, "()Landroidx/compose/foundation/MutatorMutex;", "GlobalMutatorMutex", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BasicTooltipDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final BasicTooltipDefaults f29077n = new BasicTooltipDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final MutatorMutex GlobalMutatorMutex = new MutatorMutex();

    public final MutatorMutex n() {
        return GlobalMutatorMutex;
    }

    private BasicTooltipDefaults() {
    }
}
