package gq;

import gq.qz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import pUk.C2331c;
import pUk.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class rv6 implements qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f67847n = new j();

    static class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final HashMap f67848n = new HashMap();

        List rl(String str) {
            HashSet hashSet = (HashSet) this.f67848n.get(str);
            return hashSet != null ? new ArrayList(hashSet) : Collections.EMPTY_LIST;
        }

        j() {
        }

        boolean n(C2331c c2331c) {
            boolean z2 = true;
            if (c2331c.ty() % 2 != 1) {
                z2 = false;
            }
            wqP.n.t(z2, "Expected a collection path.", new Object[0]);
            String strXMQ = c2331c.xMQ();
            C2331c c2331c2 = (C2331c) c2331c.ck();
            HashSet hashSet = (HashSet) this.f67848n.get(strXMQ);
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f67848n.put(strXMQ, hashSet);
            }
            return hashSet.add(c2331c2);
        }
    }

    @Override // gq.qz
    public void KN(uh.vd vdVar) {
    }

    @Override // gq.qz
    public List Uo(uh.vd vdVar) {
        return null;
    }

    @Override // gq.qz
    public void n(eZ.w6 w6Var) {
    }

    @Override // gq.qz
    public String rl() {
        return null;
    }

    @Override // gq.qz
    public void start() {
    }

    @Override // gq.qz
    public void t(String str, eO.j jVar) {
    }

    @Override // gq.qz
    public void J2(C2331c c2331c) {
        this.f67847n.n(c2331c);
    }

    @Override // gq.qz
    public qz.j O(uh.vd vdVar) {
        return qz.j.NONE;
    }

    @Override // gq.qz
    public eO.j mUb(uh.vd vdVar) {
        return eO.j.f72014n;
    }

    @Override // gq.qz
    public eO.j nr(String str) {
        return eO.j.f72014n;
    }

    @Override // gq.qz
    public List xMQ(String str) {
        return this.f67847n.rl(str);
    }
}
