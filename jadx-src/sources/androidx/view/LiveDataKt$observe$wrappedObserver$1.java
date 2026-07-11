package androidx.view;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
public final class LiveDataKt$observe$wrappedObserver$1<T> implements Observer {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Function1 f38922n;

    @Override // androidx.view.Observer
    public final void onChanged(Object obj) {
        this.f38922n.invoke(obj);
    }
}
