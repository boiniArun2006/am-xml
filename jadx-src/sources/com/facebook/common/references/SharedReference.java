package com.facebook.common.references;

import Dzy.j;
import Hh.C;
import Pj0.fuX;
import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class SharedReference {
    private static final Map nr = new IdentityHashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Object f52362n;
    private int rl = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final fuX f52363t;

    public static class NullReferenceException extends RuntimeException {
        public NullReferenceException() {
            super("Null shared reference");
        }
    }

    private synchronized int t() {
        int i2;
        O();
        C.rl(Boolean.valueOf(this.rl > 0));
        i2 = this.rl - 1;
        this.rl = i2;
        return i2;
    }

    public synchronized Object J2() {
        return this.f52362n;
    }

    public synchronized boolean Uo() {
        return this.rl > 0;
    }

    public synchronized void rl() {
        O();
        this.rl++;
    }

    public static boolean KN(SharedReference sharedReference) {
        return sharedReference != null && sharedReference.Uo();
    }

    private static void n(Object obj) {
        Map map = nr;
        synchronized (map) {
            try {
                Integer num = (Integer) map.get(obj);
                if (num == null) {
                    map.put(obj, 1);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() + 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void xMQ(Object obj) {
        Map map = nr;
        synchronized (map) {
            try {
                Integer num = (Integer) map.get(obj);
                if (num == null) {
                    j.g("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
                } else if (num.intValue() == 1) {
                    map.remove(obj);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public SharedReference(Object obj, fuX fux, boolean z2) {
        this.f52362n = C.Uo(obj);
        this.f52363t = fux;
        if (z2) {
            n(obj);
        }
    }

    private void O() {
        if (KN(this)) {
        } else {
            throw new NullReferenceException();
        }
    }

    public void nr() {
        Object obj;
        if (t() == 0) {
            synchronized (this) {
                obj = this.f52362n;
                this.f52362n = null;
            }
            if (obj != null) {
                fuX fux = this.f52363t;
                if (fux != null) {
                    fux.n(obj);
                }
                xMQ(obj);
            }
        }
    }
}
