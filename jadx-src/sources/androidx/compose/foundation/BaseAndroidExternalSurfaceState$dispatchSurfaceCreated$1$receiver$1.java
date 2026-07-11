package androidx.compose.foundation;

import GJW.vd;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/foundation/BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1", "Landroidx/compose/foundation/SurfaceCoroutineScope;", "Landroidx/compose/foundation/SurfaceScope;", "LGJW/vd;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 implements SurfaceCoroutineScope, SurfaceScope, vd {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ BaseAndroidExternalSurfaceState f15894n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ vd f15895t;

    @Override // GJW.vd
    public CoroutineContext getCoroutineContext() {
        return this.f15895t.getCoroutineContext();
    }

    BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1(BaseAndroidExternalSurfaceState baseAndroidExternalSurfaceState, vd vdVar) {
        this.f15894n = baseAndroidExternalSurfaceState;
        this.f15895t = vdVar;
    }
}
