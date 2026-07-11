package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\t\u001a\u00028\u0000H\u0010¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/DynamicProvidableCompositionLocal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "policy", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Landroidx/compose/runtime/SnapshotMutationPolicy;Lkotlin/jvm/functions/Function0;)V", "value", "Landroidx/compose/runtime/ProvidedValue;", "t", "(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;", "rl", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DynamicProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final SnapshotMutationPolicy policy;

    @Override // androidx.compose.runtime.ProvidableCompositionLocal
    public ProvidedValue t(Object value) {
        return new ProvidedValue(this, value, value == null, this.policy, null, null, true);
    }

    public DynamicProvidableCompositionLocal(SnapshotMutationPolicy snapshotMutationPolicy, Function0 function0) {
        super(function0);
        this.policy = snapshotMutationPolicy;
    }
}
