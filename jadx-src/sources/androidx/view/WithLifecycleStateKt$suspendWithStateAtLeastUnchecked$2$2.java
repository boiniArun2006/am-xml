package androidx.view;

import GJW.lej;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2 implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 f39019O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ lej f39020n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Lifecycle f39021t;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        n(th);
        return Unit.INSTANCE;
    }

    public final void n(Throwable th) {
        lej lejVar = this.f39020n;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        if (!lejVar.Org(emptyCoroutineContext)) {
            this.f39021t.nr(this.f39019O);
            return;
        }
        lej lejVar2 = this.f39020n;
        final Lifecycle lifecycle = this.f39021t;
        final WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = this.f39019O;
        lejVar2.n1(emptyCoroutineContext, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2.1
            @Override // java.lang.Runnable
            public final void run() {
                lifecycle.nr(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1);
            }
        });
    }
}
