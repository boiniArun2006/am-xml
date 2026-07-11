package KfI;

import androidx.content.core.DataStore;
import kotlin.coroutines.CoroutineContext;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Q implements ep.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f5656n;
    private final InterfaceC2342j rl;

    public static Q n(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2) {
        return new Q(interfaceC2342j, interfaceC2342j2);
    }

    public static UGc t(CoroutineContext coroutineContext, DataStore dataStore) {
        return new UGc(coroutineContext, dataStore);
    }

    @Override // qp.InterfaceC2342j
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public UGc get() {
        return t((CoroutineContext) this.f5656n.get(), (DataStore) this.rl.get());
    }

    public Q(InterfaceC2342j interfaceC2342j, InterfaceC2342j interfaceC2342j2) {
        this.f5656n = interfaceC2342j;
        this.rl = interfaceC2342j2;
    }
}
