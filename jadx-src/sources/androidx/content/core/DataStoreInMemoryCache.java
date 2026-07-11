package androidx.content.core;

import TFv.Lu;
import TFv.SPz;
import TFv.Wre;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\t8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u0012\u0004\b\f\u0010\u0004R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000eR\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/datastore/core/DataStoreInMemoryCache;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "<init>", "()V", "Landroidx/datastore/core/State;", "newState", "t", "(Landroidx/datastore/core/State;)Landroidx/datastore/core/State;", "LTFv/SPz;", c.f62177j, "LTFv/SPz;", "getCachedValue$annotations", "cachedValue", "()Landroidx/datastore/core/State;", "currentState", "LTFv/Wre;", "rl", "()LTFv/Wre;", "flow", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDataStoreInMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreInMemoryCache.kt\nandroidx/datastore/core/DataStoreInMemoryCache\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,79:1\n198#2,5:80\n*S KotlinDebug\n*F\n+ 1 DataStoreInMemoryCache.kt\nandroidx/datastore/core/DataStoreInMemoryCache\n*L\n45#1:80,5\n*E\n"})
public final class DataStoreInMemoryCache<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SPz cachedValue;

    public final State n() {
        return (State) this.cachedValue.getValue();
    }

    public final Wre rl() {
        return this.cachedValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final State t(State newState) {
        Object value;
        State state;
        Intrinsics.checkNotNullParameter(newState, "newState");
        SPz sPz = this.cachedValue;
        do {
            value = sPz.getValue();
            state = (State) value;
            if (!(state instanceof ReadException ? true : Intrinsics.areEqual(state, UnInitialized.rl))) {
                if (state instanceof Data) {
                    if (newState.getVersion() > state.getVersion()) {
                        state = newState;
                    }
                } else if (!(state instanceof Final)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } while (!sPz.Uo(value, state));
        return state;
    }

    public DataStoreInMemoryCache() {
        UnInitialized unInitialized = UnInitialized.rl;
        Intrinsics.checkNotNull(unInitialized, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.cachedValue = Lu.n(unInitialized);
    }
}
