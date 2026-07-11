package fJf;

import android.util.SparseArray;
import java.util.LinkedList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final SparseArray f66857n = new SparseArray();
    j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    j f66858t;

    static class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        j f66859n;
        j nr;
        int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        LinkedList f66860t;

        private j(j jVar, int i2, LinkedList linkedList, j jVar2) {
            this.f66859n = jVar;
            this.rl = i2;
            this.f66860t = linkedList;
            this.nr = jVar2;
        }

        public String toString() {
            return "LinkedEntry(key: " + this.rl + ")";
        }
    }

    private synchronized void nr(j jVar) {
        try {
            j jVar2 = jVar.f66859n;
            j jVar3 = jVar.nr;
            if (jVar2 != null) {
                jVar2.nr = jVar3;
            }
            if (jVar3 != null) {
                jVar3.f66859n = jVar2;
            }
            jVar.f66859n = null;
            jVar.nr = null;
            if (jVar == this.rl) {
                this.rl = jVar3;
            }
            if (jVar == this.f66858t) {
                this.f66858t = jVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Object J2() {
        j jVar = this.f66858t;
        if (jVar == null) {
            return null;
        }
        Object objPollLast = jVar.f66860t.pollLast();
        rl(jVar);
        return objPollLast;
    }

    public synchronized void O(int i2, Object obj) {
        try {
            j jVar = (j) this.f66857n.get(i2);
            if (jVar == null) {
                j jVar2 = new j(null, i2, new LinkedList(), null);
                this.f66857n.put(i2, jVar2);
                jVar = jVar2;
            }
            jVar.f66860t.addLast(obj);
            t(jVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Object n(int i2) {
        j jVar = (j) this.f66857n.get(i2);
        if (jVar == null) {
            return null;
        }
        Object objPollFirst = jVar.f66860t.pollFirst();
        t(jVar);
        return objPollFirst;
    }

    private void rl(j jVar) {
        if (jVar == null || !jVar.f66860t.isEmpty()) {
            return;
        }
        nr(jVar);
        this.f66857n.remove(jVar.rl);
    }

    private void t(j jVar) {
        if (this.rl == jVar) {
            return;
        }
        nr(jVar);
        j jVar2 = this.rl;
        if (jVar2 == null) {
            this.rl = jVar;
            this.f66858t = jVar;
        } else {
            jVar.nr = jVar2;
            jVar2.f66859n = jVar;
            this.rl = jVar;
        }
    }
}
