package hw;

import gAe.Q;
import gAe.UGc;
import gAe.r;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: hw.fuX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class C2157fuX implements Q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final C2157fuX f68026n = new C2157fuX();

    /* JADX INFO: renamed from: hw.fuX$n */
    private static class n implements InterfaceC2151CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final UGc f68027n;

        private n(UGc uGc) {
            this.f68027n = uGc;
        }
    }

    static void nr() {
        r.ty(f68026n);
    }

    @Override // gAe.Q
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public InterfaceC2151CN3 rl(UGc uGc) throws GeneralSecurityException {
        if (uGc == null) {
            throw new GeneralSecurityException("primitive set must be non-null");
        }
        if (uGc.O() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = uGc.t().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new n(uGc);
    }

    @Override // gAe.Q
    public Class n() {
        return InterfaceC2151CN3.class;
    }

    @Override // gAe.Q
    public Class t() {
        return InterfaceC2151CN3.class;
    }

    private C2157fuX() {
    }
}
