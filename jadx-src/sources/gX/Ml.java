package gX;

import com.google.crypto.tink.shaded.protobuf.rv6;
import gAe.o;
import gVA.n;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import uBO.SPz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Class f67578n;
    private final Map rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Class f67579t;

    public static abstract class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Class f67580n;

        public abstract void O(rv6 rv6Var);

        public abstract rv6 n(rv6 rv6Var);

        public abstract rv6 nr(com.google.crypto.tink.shaded.protobuf.fuX fux);

        /* JADX INFO: renamed from: gX.Ml$j$j, reason: collision with other inner class name */
        public static final class C0947j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public Object f67581n;
            public o.n rl;

            public C0947j(Object obj, o.n nVar) {
                this.f67581n = obj;
                this.rl = nVar;
            }
        }

        public final Class rl() {
            return this.f67580n;
        }

        public Map t() {
            return Collections.EMPTY_MAP;
        }

        public j(Class cls) {
            this.f67580n = cls;
        }
    }

    public abstract j J2();

    public abstract rv6 KN(com.google.crypto.tink.shaded.protobuf.fuX fux);

    public abstract SPz.w6 Uo();

    public abstract void mUb(rv6 rv6Var);

    public abstract String nr();

    public final Object O(rv6 rv6Var, Class cls) {
        qz qzVar = (qz) this.rl.get(cls);
        if (qzVar != null) {
            return qzVar.n(rv6Var);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public n.EnumC0945n n() {
        return n.EnumC0945n.f67569n;
    }

    public final Class rl() {
        return this.f67579t;
    }

    public final Class t() {
        return this.f67578n;
    }

    public final Set xMQ() {
        return this.rl.keySet();
    }

    protected Ml(Class cls, qz... qzVarArr) {
        this.f67578n = cls;
        HashMap map = new HashMap();
        for (qz qzVar : qzVarArr) {
            if (!map.containsKey(qzVar.rl())) {
                map.put(qzVar.rl(), qzVar);
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + qzVar.rl().getCanonicalName());
            }
        }
        if (qzVarArr.length > 0) {
            this.f67579t = qzVarArr[0].rl();
        } else {
            this.f67579t = Void.class;
        }
        this.rl = Collections.unmodifiableMap(map);
    }
}
