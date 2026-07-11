package JP;

import JP.I28;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final I28 f4543n = new j();

    private static class n extends JP.n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final JP.n f4544n;

        /* synthetic */ n(JP.n nVar, Wre wre, CN3 cn3) {
            this(nVar, wre);
        }

        @Override // JP.n
        public I28 KN(DAz dAz, io.grpc.n nVar) {
            throw null;
        }

        private n(JP.n nVar, Wre wre) {
            this.f4544n = nVar;
            android.support.v4.media.j.n(t1.Xo.ck(wre, "interceptor"));
        }

        @Override // JP.n
        public String n() {
            return this.f4544n.n();
        }
    }

    class j extends I28 {
        @Override // JP.I28
        public void O(I28.j jVar, io.grpc.QJ qj) {
        }

        @Override // JP.I28
        public void n(String str, Throwable th) {
        }

        @Override // JP.I28
        public void nr(Object obj) {
        }

        @Override // JP.I28
        public void rl() {
        }

        @Override // JP.I28
        public void t(int i2) {
        }

        j() {
        }
    }

    public static JP.n n(JP.n nVar, List list) {
        t1.Xo.ck(nVar, "channel");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            android.support.v4.media.j.n(it.next());
            CN3 cn3 = null;
            nVar = new n(nVar, cn3, cn3);
        }
        return nVar;
    }
}
