package h1M;

import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import oSp.j;
import tq6.DAz;
import tq6.u;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Ml implements h1M.j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final fuX f67941t = new n();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final oSp.j f67942n;
    private final AtomicReference rl = new AtomicReference(null);

    private static final class n implements fuX {
        private n() {
        }

        @Override // h1M.fuX
        public File J2() {
            return null;
        }

        @Override // h1M.fuX
        public File O() {
            return null;
        }

        @Override // h1M.fuX
        public File Uo() {
            return null;
        }

        @Override // h1M.fuX
        public File n() {
            return null;
        }

        @Override // h1M.fuX
        public File nr() {
            return null;
        }

        @Override // h1M.fuX
        public DAz.j rl() {
            return null;
        }

        @Override // h1M.fuX
        public File t() {
            return null;
        }
    }

    @Override // h1M.j
    public fuX n(String str) {
        h1M.j jVar = (h1M.j) this.rl.get();
        return jVar == null ? f67941t : jVar.n(str);
    }

    @Override // h1M.j
    public boolean rl() {
        h1M.j jVar = (h1M.j) this.rl.get();
        return jVar != null && jVar.rl();
    }

    @Override // h1M.j
    public boolean t(String str) {
        h1M.j jVar = (h1M.j) this.rl.get();
        return jVar != null && jVar.t(str);
    }

    public Ml(oSp.j jVar) {
        this.f67942n = jVar;
        jVar.n(new j.InterfaceC1084j() { // from class: h1M.n
            @Override // oSp.j.InterfaceC1084j
            public final void n(oSp.n nVar) {
                Ml.J2(this.f67947n, nVar);
            }
        });
    }

    public static /* synthetic */ void J2(Ml ml, oSp.n nVar) {
        ml.getClass();
        CN3.J2().rl("Crashlytics native component now available.");
        ml.rl.set((h1M.j) nVar.get());
    }

    @Override // h1M.j
    public void nr(final String str, final String str2, final long j2, final u uVar) {
        CN3.J2().xMQ("Deferring native open session: " + str);
        this.f67942n.n(new j.InterfaceC1084j() { // from class: h1M.w6
            @Override // oSp.j.InterfaceC1084j
            public final void n(oSp.n nVar) {
                ((j) nVar.get()).nr(str, str2, j2, uVar);
            }
        });
    }
}
