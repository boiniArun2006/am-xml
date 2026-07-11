package UnP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f10827n = new j();
    private final Map rl = new HashMap();

    private static class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Object f10828n;
        j nr;
        private List rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        j f10829t;

        j() {
            this(null);
        }

        j(Object obj) {
            this.nr = this;
            this.f10829t = this;
            this.f10828n = obj;
        }

        public void n(Object obj) {
            if (this.rl == null) {
                this.rl = new ArrayList();
            }
            this.rl.add(obj);
        }

        public int t() {
            List list = this.rl;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public Object rl() {
            int iT = t();
            if (iT > 0) {
                return this.rl.remove(iT - 1);
            }
            return null;
        }
    }

    private static void O(j jVar) {
        j jVar2 = jVar.nr;
        jVar2.f10829t = jVar.f10829t;
        jVar.f10829t.nr = jVar2;
    }

    private static void Uo(j jVar) {
        jVar.f10829t.nr = jVar;
        jVar.nr.f10829t = jVar;
    }

    public Object J2() {
        for (j jVar = this.f10827n.nr; !jVar.equals(this.f10827n); jVar = jVar.nr) {
            Object objRl = jVar.rl();
            if (objRl != null) {
                return objRl;
            }
            O(jVar);
            this.rl.remove(jVar.f10828n);
            ((CN3) jVar.f10828n).n();
        }
        return null;
    }

    public Object n(CN3 cn3) {
        j jVar = (j) this.rl.get(cn3);
        if (jVar == null) {
            jVar = new j(cn3);
            this.rl.put(cn3, jVar);
        } else {
            cn3.n();
        }
        rl(jVar);
        return jVar.rl();
    }

    public void nr(CN3 cn3, Object obj) {
        j jVar = (j) this.rl.get(cn3);
        if (jVar == null) {
            jVar = new j(cn3);
            t(jVar);
            this.rl.put(cn3, jVar);
        } else {
            cn3.n();
        }
        jVar.n(obj);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        j jVar = this.f10827n.f10829t;
        boolean z2 = false;
        while (!jVar.equals(this.f10827n)) {
            sb.append('{');
            sb.append(jVar.f10828n);
            sb.append(':');
            sb.append(jVar.t());
            sb.append("}, ");
            jVar = jVar.f10829t;
            z2 = true;
        }
        if (z2) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }

    Ml() {
    }

    private void rl(j jVar) {
        O(jVar);
        j jVar2 = this.f10827n;
        jVar.nr = jVar2;
        jVar.f10829t = jVar2.f10829t;
        Uo(jVar);
    }

    private void t(j jVar) {
        O(jVar);
        j jVar2 = this.f10827n;
        jVar.nr = jVar2.nr;
        jVar.f10829t = jVar2;
        Uo(jVar);
    }
}
