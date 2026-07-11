package io.grpc;

import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j {
    private static final IdentityHashMap rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f68849t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final IdentityHashMap f68850n;

    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private j f68851n;
        private IdentityHashMap rl;

        public n nr(w6 w6Var, Object obj) {
            rl(1).put(w6Var, obj);
            return this;
        }

        private n(j jVar) {
            this.f68851n = jVar;
        }

        private IdentityHashMap rl(int i2) {
            if (this.rl == null) {
                this.rl = new IdentityHashMap(i2);
            }
            return this.rl;
        }

        public j n() {
            if (this.rl != null) {
                for (Map.Entry entry : this.f68851n.f68850n.entrySet()) {
                    if (!this.rl.containsKey(entry.getKey())) {
                        this.rl.put((w6) entry.getKey(), entry.getValue());
                    }
                }
                this.f68851n = new j(this.rl);
                this.rl = null;
            }
            return this.f68851n;
        }

        public n t(w6 w6Var) {
            if (this.f68851n.f68850n.containsKey(w6Var)) {
                IdentityHashMap identityHashMap = new IdentityHashMap(this.f68851n.f68850n);
                identityHashMap.remove(w6Var);
                this.f68851n = new j(identityHashMap);
            }
            IdentityHashMap identityHashMap2 = this.rl;
            if (identityHashMap2 != null) {
                identityHashMap2.remove(w6Var);
            }
            return this;
        }
    }

    public static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f68852n;

        public static w6 n(String str) {
            return new w6(str);
        }

        public String toString() {
            return this.f68852n;
        }

        private w6(String str) {
            this.f68852n = str;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f68850n.size() != jVar.f68850n.size()) {
            return false;
        }
        for (Map.Entry entry : this.f68850n.entrySet()) {
            if (!jVar.f68850n.containsKey(entry.getKey()) || !t1.C.n(entry.getValue(), jVar.f68850n.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    static {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        rl = identityHashMap;
        f68849t = new j(identityHashMap);
    }

    private j(IdentityHashMap identityHashMap) {
        this.f68850n = identityHashMap;
    }

    public static n t() {
        return new n();
    }

    public int hashCode() {
        int iRl = 0;
        for (Map.Entry entry : this.f68850n.entrySet()) {
            iRl += t1.C.rl(entry.getKey(), entry.getValue());
        }
        return iRl;
    }

    public n nr() {
        return new n();
    }

    public Object rl(w6 w6Var) {
        return this.f68850n.get(w6Var);
    }

    public String toString() {
        return this.f68850n.toString();
    }
}
