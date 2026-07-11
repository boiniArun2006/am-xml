package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J,\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0090\u0002¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0090\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0090\u0002¢\u0006\u0004\b\f\u0010\rR&\u0010\u0011\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/modifier/MultiLocalMap;", "Landroidx/compose/ui/modifier/ModifierLocalMap;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/modifier/ModifierLocal;", "key", "value", "", "t", "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V", "rl", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "", c.f62177j, "(Landroidx/compose/ui/modifier/ModifierLocal;)Z", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "map", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MultiLocalMap extends ModifierLocalMap {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SnapshotStateMap map;

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean n(ModifierLocal key) {
        return this.map.containsKey(key);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public Object rl(ModifierLocal key) {
        Object obj = this.map.get(key);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public void t(ModifierLocal key, Object value) {
        this.map.put(key, value);
    }
}
