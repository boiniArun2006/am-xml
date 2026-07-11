package D23;

import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class I28 {

    class j implements Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC2342j f1173n;

        j(InterfaceC2342j interfaceC2342j) {
            this.f1173n = interfaceC2342j;
        }

        @Override // qp.InterfaceC2342j
        public Object get() {
            return this.f1173n.get();
        }
    }

    public static Ml n(InterfaceC2342j interfaceC2342j) {
        w6.rl(interfaceC2342j);
        if (interfaceC2342j instanceof Ml) {
            return (Ml) interfaceC2342j;
        }
        return new j(interfaceC2342j);
    }
}
