package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;", "", "value", "<init>", "(Ljava/lang/Object;)V", c.f62177j, "Ljava/lang/Object;", "()Ljava/lang/Object;", "rl", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ObjectRef {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Object value;

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    public final void rl(Object obj) {
        this.value = obj;
    }

    public ObjectRef(Object obj) {
        this.value = obj;
    }
}
