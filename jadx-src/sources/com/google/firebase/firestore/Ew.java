package com.google.firebase.firestore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import uh.Md;
import wqP.AbstractC2418c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Ew implements Iterable {
    private final DAz J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final FirebaseFirestore f60303O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final afx f60304n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Md f60305t;

    private class j implements Iterator {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Iterator f60306n;

        j(Iterator it) {
            this.f60306n = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f60306n.hasNext();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Z next() {
            return Ew.this.t((pUk.fuX) this.f60306n.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("QuerySnapshot does not support remove().");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ew)) {
            return false;
        }
        Ew ew = (Ew) obj;
        return this.f60303O.equals(ew.f60303O) && this.f60304n.equals(ew.f60304n) && this.f60305t.equals(ew.f60305t) && this.J2.equals(ew.J2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Z t(pUk.fuX fux) {
        return Z.ty(this.f60303O, fux, this.f60305t.gh(), this.f60305t.J2().contains(fux.getKey()));
    }

    public int hashCode() {
        return (((((this.f60303O.hashCode() * 31) + this.f60304n.hashCode()) * 31) + this.f60305t.hashCode()) * 31) + this.J2.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new j(this.f60305t.O().iterator());
    }

    public List nr() {
        ArrayList arrayList = new ArrayList(this.f60305t.O().size());
        Iterator it = this.f60305t.O().iterator();
        while (it.hasNext()) {
            arrayList.add(t((pUk.fuX) it.next()));
        }
        return arrayList;
    }

    Ew(afx afxVar, Md md, FirebaseFirestore firebaseFirestore) {
        this.f60304n = (afx) AbstractC2418c.rl(afxVar);
        this.f60305t = (Md) AbstractC2418c.rl(md);
        this.f60303O = (FirebaseFirestore) AbstractC2418c.rl(firebaseFirestore);
        this.J2 = new DAz(md.mUb(), md.gh());
    }
}
