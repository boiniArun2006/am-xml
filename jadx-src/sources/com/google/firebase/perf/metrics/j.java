package com.google.firebase.perf.metrics;

import com.google.firebase.perf.session.PerfSession;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import oK9.C;
import oK9.qz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Trace f60654n;

    j(Trace trace) {
        this.f60654n = trace;
    }

    qz n() {
        qz.n nVarR = qz.rV9().o(this.f60654n.J2()).Ik(this.f60654n.KN().O()).r(this.f60654n.KN().nr(this.f60654n.O()));
        for (Counter counter : this.f60654n.nr().values()) {
            nVarR.HI(counter.rl(), counter.n());
        }
        List listXMQ = this.f60654n.xMQ();
        if (!listXMQ.isEmpty()) {
            Iterator it = listXMQ.iterator();
            while (it.hasNext()) {
                nVarR.qie(new j((Trace) it.next()).n());
            }
        }
        nVarR.ty(this.f60654n.getAttributes());
        C[] cArrRl = PerfSession.rl(this.f60654n.Uo());
        if (cArrRl != null) {
            nVarR.xMQ(Arrays.asList(cArrRl));
        }
        return (qz) nVarR.build();
    }
}
