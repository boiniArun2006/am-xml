package eZ;

import eZ.w6;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class I28 implements Iterable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w6 f63759n;

    private static class j implements Iterator {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Iterator f63760n;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f63760n.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return ((Map.Entry) this.f63760n.next()).getKey();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f63760n.remove();
        }

        public j(Iterator it) {
            this.f63760n = it;
        }
    }

    public I28(List list, Comparator comparator) {
        this.f63759n = w6.j.rl(list, Collections.EMPTY_MAP, w6.j.nr(), comparator);
    }

    public I28 J2(Object obj) {
        w6 w6VarXMQ = this.f63759n.xMQ(obj);
        return w6VarXMQ == this.f63759n ? this : new I28(w6VarXMQ);
    }

    public Iterator O(Object obj) {
        return new j(this.f63759n.KN(obj));
    }

    public boolean contains(Object obj) {
        return this.f63759n.rl(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof I28) {
            return this.f63759n.equals(((I28) obj).f63759n);
        }
        return false;
    }

    public int hashCode() {
        return this.f63759n.hashCode();
    }

    public boolean isEmpty() {
        return this.f63759n.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new j(this.f63759n.iterator());
    }

    public I28 nr(Object obj) {
        return new I28(this.f63759n.Uo(obj, null));
    }

    public Object rl() {
        return this.f63759n.O();
    }

    public int size() {
        return this.f63759n.size();
    }

    public Object t() {
        return this.f63759n.J2();
    }

    public I28 Uo(I28 i28) {
        I28 i28Nr;
        if (size() < i28.size()) {
            i28Nr = i28;
            i28 = this;
        } else {
            i28Nr = this;
        }
        Iterator it = i28.iterator();
        while (it.hasNext()) {
            i28Nr = i28Nr.nr(it.next());
        }
        return i28Nr;
    }

    private I28(w6 w6Var) {
        this.f63759n = w6Var;
    }
}
