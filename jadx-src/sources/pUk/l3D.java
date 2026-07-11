package pUk;

import java.util.HashMap;
import java.util.Map;
import uB.eO;
import uB.s4;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class l3D implements Cloneable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private uB.s4 f72022n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f72023t;

    public l3D(uB.s4 s4Var) {
        this.f72023t = new HashMap();
        wqP.n.t(s4Var.E2() == s4.w6.MAP_VALUE, "ObjectValues should be backed by a MapValue", new Object[0]);
        wqP.n.t(!s4.t(s4Var), "ServerTimestamps should not be used as an ObjectValue", new Object[0]);
        this.f72022n = s4Var;
    }

    public static l3D J2(Map map) {
        return new l3D((uB.s4) uB.s4.X().ck(uB.eO.r().mUb(map)).build());
    }

    private uB.eO n(z zVar, Map map) {
        uB.s4 s4VarO = O(this.f72022n, zVar);
        eO.n nVarR = SPz.aYN(s4VarO) ? (eO.n) s4VarO.g().toBuilder() : uB.eO.r();
        boolean z2 = false;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                uB.eO eOVarN = n((z) zVar.n(str), (Map) value);
                if (eOVarN != null) {
                    nVarR.gh(str, (uB.s4) uB.s4.X().Ik(eOVarN).build());
                    z2 = true;
                }
            } else {
                if (value instanceof uB.s4) {
                    nVarR.gh(str, (uB.s4) value);
                } else if (nVarR.xMQ(str)) {
                    wqP.n.t(value == null, "Expected entry to be a Map, a Value or null", new Object[0]);
                    nVarR.qie(str);
                }
                z2 = true;
            }
        }
        if (z2) {
            return (uB.eO) nVarR.build();
        }
        return null;
    }

    private void qie(z zVar, uB.s4 s4Var) {
        Map map;
        Map map2 = this.f72023t;
        for (int i2 = 0; i2 < zVar.ty() - 1; i2++) {
            String strMUb = zVar.mUb(i2);
            Object obj = map2.get(strMUb);
            if (obj instanceof Map) {
                map = (Map) obj;
            } else {
                if (obj instanceof uB.s4) {
                    uB.s4 s4Var2 = (uB.s4) obj;
                    if (s4Var2.E2() == s4.w6.MAP_VALUE) {
                        HashMap map3 = new HashMap(s4Var2.g().qie());
                        map2.put(strMUb, map3);
                        map2 = map3;
                    }
                }
                map = new HashMap();
                map2.put(strMUb, map);
            }
            map2 = map;
        }
        map2.put(zVar.xMQ(), s4Var);
    }

    private uB.s4 rl() {
        synchronized (this.f72023t) {
            try {
                uB.eO eOVarN = n(z.f72032O, this.f72023t);
                if (eOVarN != null) {
                    this.f72022n = (uB.s4) uB.s4.X().Ik(eOVarN).build();
                    this.f72023t.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f72022n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l3D) {
            return SPz.r(rl(), ((l3D) obj).rl());
        }
        return false;
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public l3D clone() {
        return new l3D(rl());
    }

    public String toString() {
        return "ObjectValue{internalValue=" + SPz.rl(rl()) + '}';
    }

    private uB.s4 O(uB.s4 s4Var, z zVar) {
        if (zVar.gh()) {
            return s4Var;
        }
        for (int i2 = 0; i2 < zVar.ty() - 1; i2++) {
            s4Var = s4Var.g().az(zVar.mUb(i2), null);
            if (!SPz.aYN(s4Var)) {
                return null;
            }
        }
        return s4Var.g().az(zVar.xMQ(), null);
    }

    public uB.s4 KN(z zVar) {
        return O(rl(), zVar);
    }

    public void gh(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            z zVar = (z) entry.getKey();
            if (entry.getValue() == null) {
                nr(zVar);
            } else {
                mUb(zVar, (uB.s4) entry.getValue());
            }
        }
    }

    public int hashCode() {
        return rl().hashCode();
    }

    public void mUb(z zVar, uB.s4 s4Var) {
        wqP.n.t(!zVar.gh(), "Cannot set field for empty path on ObjectValue", new Object[0]);
        qie(zVar, s4Var);
    }

    public void nr(z zVar) {
        wqP.n.t(!zVar.gh(), "Cannot delete field for empty path on ObjectValue", new Object[0]);
        qie(zVar, null);
    }

    public Map xMQ() {
        return rl().g().qie();
    }

    public l3D() {
        this((uB.s4) uB.s4.X().Ik(uB.eO.mUb()).build());
    }
}
