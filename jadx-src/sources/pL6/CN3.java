package pL6;

import JP.qz;
import com.google.common.collect.nKK;
import com.google.common.collect.xZD;
import io.grpc.Pl;
import io.grpc.SPz;
import io.grpc.Xo;
import io.grpc.internal.kO4;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class CN3 extends Pl {
    private static final Logger qie = Logger.getLogger(CN3.class.getName());
    private final Pl.I28 KN;
    protected qz gh;
    protected boolean xMQ;
    private final Map Uo = new LinkedHashMap();
    protected final Xo mUb = new kO4();

    protected static class Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final String[] f71841n;
        final int rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof Ml)) {
                return false;
            }
            Ml ml = (Ml) obj;
            if (ml.rl == this.rl) {
                String[] strArr = ml.f71841n;
                int length = strArr.length;
                String[] strArr2 = this.f71841n;
                if (length == strArr2.length) {
                    return Arrays.equals(strArr, strArr2);
                }
            }
            return false;
        }

        public int hashCode() {
            return this.rl;
        }

        public String toString() {
            return Arrays.toString(this.f71841n);
        }

        public Ml(io.grpc.I28 i28) {
            t1.Xo.ck(i28, "eag");
            this.f71841n = new String[i28.n().size()];
            Iterator it = i28.n().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                this.f71841n[i2] = ((SocketAddress) it.next()).toString();
                i2++;
            }
            Arrays.sort(this.f71841n);
            this.rl = Arrays.hashCode(this.f71841n);
        }
    }

    public class w6 {
        private qz J2;
        private boolean KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Xo f71843O;
        private Pl.aC Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object f71844n;
        private final I28 nr;
        private Pl.fuX rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Object f71845t;

        private final class j extends pL6.w6 {
            private j() {
            }

            @Override // pL6.w6, io.grpc.Pl.I28
            public void J2(qz qzVar, Pl.aC aCVar) {
                if (CN3.this.Uo.containsKey(w6.this.f71844n)) {
                    w6.this.J2 = qzVar;
                    w6.this.Uo = aCVar;
                    if (w6.this.KN) {
                        return;
                    }
                    CN3 cn3 = CN3.this;
                    if (cn3.xMQ) {
                        return;
                    }
                    if (qzVar == qz.IDLE && cn3.Z()) {
                        w6.this.nr.O();
                    }
                    CN3.this.S();
                }
            }

            @Override // pL6.w6
            protected Pl.I28 Uo() {
                return CN3.this.KN;
            }
        }

        public w6(CN3 cn3, Object obj, Xo xo, Object obj2, Pl.aC aCVar) {
            this(obj, xo, obj2, aCVar, null, false);
        }

        protected void qie(Xo xo) {
            this.KN = false;
        }

        public w6(Object obj, Xo xo, Object obj2, Pl.aC aCVar, Pl.fuX fux, boolean z2) {
            this.f71844n = obj;
            this.f71843O = xo;
            this.KN = z2;
            this.Uo = aCVar;
            this.f71845t = obj2;
            I28 i28 = new I28(new j());
            this.nr = i28;
            this.J2 = z2 ? qz.IDLE : qz.CONNECTING;
            this.rl = fux;
            if (z2) {
                return;
            }
            i28.r(xo);
        }

        protected void J2() {
            if (this.KN) {
                return;
            }
            CN3.this.Uo.remove(this.f71844n);
            this.KN = true;
            CN3.qie.log(Level.FINE, "Child balancer {0} deactivated", this.f71844n);
        }

        public Pl.aC KN() {
            return this.Uo;
        }

        Object Uo() {
            return this.f71845t;
        }

        protected void az(Pl.fuX fux) {
            t1.Xo.ck(fux, "Missing address list for child");
            this.rl = fux;
        }

        public boolean gh() {
            return this.KN;
        }

        public Xo mUb() {
            return this.f71843O;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Address = ");
            sb.append(this.f71844n);
            sb.append(", state = ");
            sb.append(this.J2);
            sb.append(", picker type: ");
            sb.append(this.Uo.getClass());
            sb.append(", lb: ");
            sb.append(this.nr.Uo().getClass());
            sb.append(this.KN ? ", deactivated" : "");
            return sb.toString();
        }

        protected void ty() {
            this.nr.J2();
            this.J2 = qz.SHUTDOWN;
            CN3.qie.log(Level.FINE, "Child balancer {0} deleted", this.f71844n);
        }

        public qz xMQ() {
            return this.J2;
        }
    }

    protected abstract void S();

    protected boolean Z() {
        return true;
    }

    @Override // io.grpc.Pl
    public SPz n(Pl.fuX fux) {
        try {
            this.xMQ = true;
            n nVarUo = Uo(fux);
            if (!nVarUo.f71842n.HI()) {
                return nVarUo.f71842n;
            }
            S();
            XQ(nVarUo.rl);
            return nVarUo.f71842n;
        } finally {
            this.xMQ = false;
        }
    }

    protected boolean o() {
        return true;
    }

    protected static class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final SPz f71842n;
        public final List rl;

        public n(SPz sPz, List list) {
            this.f71842n = sPz;
            this.rl = list;
        }
    }

    protected Pl.aC HI(SPz sPz) {
        return new Pl.Ml(Pl.Wre.J2(sPz));
    }

    protected Pl.aC Ik() {
        return new Pl.Ml(Pl.Wre.Uo());
    }

    @Override // io.grpc.Pl
    public void J2() {
        qie.log(Level.FINE, "Shutdown");
        Iterator it = this.Uo.values().iterator();
        while (it.hasNext()) {
            ((w6) it.next()).ty();
        }
        this.Uo.clear();
    }

    protected n Uo(Pl.fuX fux) {
        qie.log(Level.FINE, "Received resolution result: {0}", fux);
        Map mapGh = gh(fux);
        if (mapGh.isEmpty()) {
            SPz sPzIk = SPz.f68186Z.Ik("NameResolver returned no usable address. " + fux);
            t(sPzIk);
            return new n(sPzIk, null);
        }
        for (Map.Entry entry : mapGh.entrySet()) {
            Object key = entry.getKey();
            Xo xoMUb = ((w6) entry.getValue()).mUb();
            Object objUo = ((w6) entry.getValue()).Uo();
            if (this.Uo.containsKey(key)) {
                w6 w6Var = (w6) this.Uo.get(key);
                if (w6Var.gh() && o()) {
                    w6Var.qie(xoMUb);
                }
            } else {
                this.Uo.put(key, (w6) entry.getValue());
            }
            w6 w6Var2 = (w6) this.Uo.get(key);
            Pl.fuX fuxAz = az(key, fux, objUo);
            ((w6) this.Uo.get(key)).az(fuxAz);
            if (!w6Var2.KN) {
                w6Var2.nr.nr(fuxAz);
            }
        }
        ArrayList arrayList = new ArrayList();
        xZD it = nKK.ty(this.Uo.keySet()).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!mapGh.containsKey(next)) {
                w6 w6Var3 = (w6) this.Uo.get(next);
                w6Var3.J2();
                arrayList.add(w6Var3);
            }
        }
        return new n(SPz.f68184O, arrayList);
    }

    protected Pl.fuX az(Object obj, Pl.fuX fux, Object obj2) {
        Ml ml;
        io.grpc.I28 i28;
        if (obj instanceof io.grpc.I28) {
            ml = new Ml((io.grpc.I28) obj);
        } else {
            t1.Xo.O(obj instanceof Ml, "key is wrong type");
            ml = (Ml) obj;
        }
        Iterator it = fux.n().iterator();
        while (true) {
            if (!it.hasNext()) {
                i28 = null;
                break;
            }
            i28 = (io.grpc.I28) it.next();
            if (ml.equals(new Ml(i28))) {
                break;
            }
        }
        t1.Xo.ck(i28, obj + " no longer present in load balancer children");
        return fux.O().rl(Collections.singletonList(i28)).t(io.grpc.j.t().nr(Pl.f68161O, Boolean.TRUE).n()).nr(obj2).n();
    }

    protected Pl.I28 ck() {
        return this.KN;
    }

    protected Map gh(Pl.fuX fux) {
        HashMap map = new HashMap();
        Iterator it = fux.n().iterator();
        while (it.hasNext()) {
            Ml ml = new Ml((io.grpc.I28) it.next());
            w6 w6Var = (w6) this.Uo.get(ml);
            if (w6Var != null) {
                map.put(ml, w6Var);
            } else {
                map.put(ml, qie(ml, null, Ik(), fux));
            }
        }
        return map;
    }

    protected w6 qie(Object obj, Object obj2, Pl.aC aCVar, Pl.fuX fux) {
        return new w6(this, obj, this.mUb, obj2, aCVar);
    }

    protected List r() {
        ArrayList arrayList = new ArrayList();
        for (w6 w6Var : ty()) {
            if (!w6Var.gh() && w6Var.xMQ() == qz.READY) {
                arrayList.add(w6Var);
            }
        }
        return arrayList;
    }

    @Override // io.grpc.Pl
    public void t(SPz sPz) {
        if (this.gh != qz.READY) {
            this.KN.J2(qz.TRANSIENT_FAILURE, HI(sPz));
        }
    }

    protected Collection ty() {
        return this.Uo.values();
    }

    protected CN3(Pl.I28 i28) {
        this.KN = (Pl.I28) t1.Xo.ck(i28, "helper");
        qie.log(Level.FINE, "Created");
    }

    protected void XQ(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((w6) it.next()).ty();
        }
    }
}
