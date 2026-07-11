package gq;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import pUk.C2331c;
import pUk.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class Md implements O {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private eZ.w6 f67708n = pUk.Dsr.n();
    private qz rl;

    private class n implements Iterable {

        class j implements Iterator {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Iterator f67710n;

            j(Iterator it) {
                this.f67710n = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f67710n.hasNext();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public pUk.fuX next() {
                return (pUk.fuX) ((Map.Entry) this.f67710n.next()).getValue();
            }
        }

        private n() {
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new j(Md.this.f67708n.iterator());
        }
    }

    @Override // gq.O
    public Map J2(String str, eO.j jVar, int i2) {
        throw new UnsupportedOperationException("getAll(String, IndexOffset, int) is not supported.");
    }

    long KN(eO eOVar) {
        Iterator it = new n().iterator();
        long serializedSize = 0;
        while (it.hasNext()) {
            serializedSize += (long) eOVar.gh((pUk.fuX) it.next()).getSerializedSize();
        }
        return serializedSize;
    }

    @Override // gq.O
    public Map O(uh.Ln ln2, eO.j jVar, Set set, pO pOVar) {
        HashMap map = new HashMap();
        Iterator itKN = this.f67708n.KN(pUk.C.Uo((C2331c) ln2.qie().n("")));
        while (itKN.hasNext()) {
            Map.Entry entry = (Map.Entry) itKN.next();
            pUk.fuX fux = (pUk.fuX) entry.getValue();
            pUk.C c2 = (pUk.C) entry.getKey();
            if (!ln2.qie().az(c2.qie())) {
                break;
            }
            if (c2.qie().ty() <= ln2.qie().ty() + 1 && eO.j.J2(fux).compareTo(jVar) > 0 && (set.contains(fux.getKey()) || ln2.r(fux))) {
                map.put(fux.getKey(), fux.n());
            }
        }
        return map;
    }

    @Override // gq.O
    public void n(pUk.QJ qj, pUk.UGc uGc) {
        wqP.n.t(this.rl != null, "setIndexManager() not called", new Object[0]);
        wqP.n.t(!uGc.equals(pUk.UGc.f72007t), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        this.f67708n = this.f67708n.Uo(qj.getKey(), qj.n().XQ(uGc));
        this.rl.J2(qj.getKey().mUb());
    }

    @Override // gq.O
    public pUk.QJ nr(pUk.C c2) {
        pUk.fuX fux = (pUk.fuX) this.f67708n.t(c2);
        return fux != null ? fux.n() : pUk.QJ.ck(c2);
    }

    @Override // gq.O
    public void removeAll(Collection collection) {
        wqP.n.t(this.rl != null, "setIndexManager() not called", new Object[0]);
        eZ.w6 w6VarN = pUk.Dsr.n();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            pUk.C c2 = (pUk.C) it.next();
            this.f67708n = this.f67708n.xMQ(c2);
            w6VarN = w6VarN.Uo(c2, pUk.QJ.Ik(c2, pUk.UGc.f72007t));
        }
        this.rl.n(w6VarN);
    }

    @Override // gq.O
    public Map rl(Iterable iterable) {
        HashMap map = new HashMap();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            pUk.C c2 = (pUk.C) it.next();
            map.put(c2, nr(c2));
        }
        return map;
    }

    @Override // gq.O
    public void t(qz qzVar) {
        this.rl = qzVar;
    }

    Iterable xMQ() {
        return new n();
    }

    Md() {
    }
}
