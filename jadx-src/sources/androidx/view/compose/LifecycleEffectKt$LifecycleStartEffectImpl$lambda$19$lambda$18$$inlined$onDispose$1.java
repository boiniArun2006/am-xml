package androidx.view.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.view.LifecycleEventObserver;
import androidx.view.LifecycleOwner;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/DisposableEffectResult;", "", c.f62177j, "()V", "runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt\n*L\n1#1,490:1\n358#2,3:491\n*E\n"})
public final class LifecycleEffectKt$LifecycleStartEffectImpl$lambda$19$lambda$18$$inlined$onDispose$1 implements DisposableEffectResult {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ LifecycleOwner f39047n;
    final /* synthetic */ LifecycleEventObserver rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef f39048t;

    @Override // androidx.compose.runtime.DisposableEffectResult
    public void n() {
        this.f39047n.getLifecycle().nr(this.rl);
        LifecycleStopOrDisposeEffectResult lifecycleStopOrDisposeEffectResult = (LifecycleStopOrDisposeEffectResult) this.f39048t.element;
        if (lifecycleStopOrDisposeEffectResult != null) {
            lifecycleStopOrDisposeEffectResult.n();
        }
    }
}
