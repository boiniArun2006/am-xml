package uh;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import uh.qz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final TreeMap f74464n = new TreeMap();

    List rl() {
        return new ArrayList(this.f74464n.values());
    }

    public void n(qz qzVar) {
        pUk.C key = qzVar.rl().getKey();
        qz qzVar2 = (qz) this.f74464n.get(key);
        if (qzVar2 == null) {
            this.f74464n.put(key, qzVar);
            return;
        }
        qz.j jVarT = qzVar2.t();
        qz.j jVarT2 = qzVar.t();
        qz.j jVar = qz.j.ADDED;
        if (jVarT2 != jVar && jVarT == qz.j.METADATA) {
            this.f74464n.put(key, qzVar);
            return;
        }
        if (jVarT2 == qz.j.METADATA && jVarT != qz.j.REMOVED) {
            this.f74464n.put(key, qz.n(jVarT, qzVar.rl()));
            return;
        }
        qz.j jVar2 = qz.j.MODIFIED;
        if (jVarT2 == jVar2 && jVarT == jVar2) {
            this.f74464n.put(key, qz.n(jVar2, qzVar.rl()));
            return;
        }
        if (jVarT2 == jVar2 && jVarT == jVar) {
            this.f74464n.put(key, qz.n(jVar, qzVar.rl()));
            return;
        }
        qz.j jVar3 = qz.j.REMOVED;
        if (jVarT2 == jVar3 && jVarT == jVar) {
            this.f74464n.remove(key);
            return;
        }
        if (jVarT2 == jVar3 && jVarT == jVar2) {
            this.f74464n.put(key, qz.n(jVar3, qzVar2.rl()));
        } else {
            if (jVarT2 == jVar && jVarT == jVar3) {
                this.f74464n.put(key, qz.n(jVar2, qzVar.rl()));
                return;
            }
            throw wqP.n.n("Unsupported combination of changes %s after %s", jVarT2, jVarT);
        }
    }
}
