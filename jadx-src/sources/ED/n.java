package ED;

import SHQ.j;
import android.content.Context;
import com.google.firebase.abt.AbtException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final oSp.n f2261n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Integer f2262t = null;

    private void HI() throws AbtException {
        if (this.f2261n.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    private List J2() {
        return ((SHQ.j) this.f2261n.get()).J2(this.rl, "");
    }

    private ArrayList KN(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            if (!nr(list2, jVar)) {
                arrayList.add(jVar.J2(this.rl));
            }
        }
        return arrayList;
    }

    private ArrayList Uo(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            if (!nr(list2, jVar)) {
                arrayList.add(jVar);
            }
        }
        return arrayList;
    }

    private void gh(String str) {
        ((SHQ.j) this.f2261n.get()).clearConditionalUserProperty(str, null, null);
    }

    private void n(j.w6 w6Var) {
        ((SHQ.j) this.f2261n.get()).nr(w6Var);
    }

    private void rl(List list) {
        ArrayDeque arrayDeque = new ArrayDeque(J2());
        int iXMQ = xMQ();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            while (arrayDeque.size() >= iXMQ) {
                gh(((j.w6) arrayDeque.pollFirst()).rl);
            }
            j.w6 w6VarJ2 = jVar.J2(this.rl);
            n(w6VarJ2);
            arrayDeque.offer(w6VarJ2);
        }
    }

    private static List t(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(j.rl((Map) it.next()));
        }
        return arrayList;
    }

    private int xMQ() {
        if (this.f2262t == null) {
            this.f2262t = Integer.valueOf(((SHQ.j) this.f2261n.get()).O(this.rl));
        }
        return this.f2262t.intValue();
    }

    public n(Context context, oSp.n nVar, String str) {
        this.f2261n = nVar;
        this.rl = str;
    }

    private boolean nr(List list, j jVar) {
        String strT = jVar.t();
        String strO = jVar.O();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j jVar2 = (j) it.next();
            if (jVar2.t().equals(strT) && jVar2.O().equals(strO)) {
                return true;
            }
        }
        return false;
    }

    private void qie(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            gh(((j.w6) it.next()).rl);
        }
    }

    private void ty(List list) throws AbtException {
        if (list.isEmpty()) {
            mUb();
            return;
        }
        List listO = O();
        qie(KN(listO, list));
        rl(Uo(list, listO));
    }

    public List O() throws AbtException {
        HI();
        List listJ2 = J2();
        ArrayList arrayList = new ArrayList();
        Iterator it = listJ2.iterator();
        while (it.hasNext()) {
            arrayList.add(j.n((j.w6) it.next()));
        }
        return arrayList;
    }

    public void az(List list) throws AbtException {
        HI();
        if (list != null) {
            ty(t(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }

    public void mUb() throws AbtException {
        HI();
        qie(J2());
    }
}
