package com.google.common.collect;

import com.caoccao.javet.exceptions.JavetError;
import com.google.common.collect.O;
import com.google.common.collect.psW;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Md {

    static class I28 extends n implements Serializable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object f59609n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f59610t;

        @Override // com.google.common.collect.psW.j
        public final int getCount() {
            return this.f59610t;
        }

        @Override // com.google.common.collect.psW.j
        public final Object getElement() {
            return this.f59609n;
        }

        I28(Object obj, int i2) {
            this.f59609n = obj;
            this.f59610t = i2;
            Pl.rl(i2, JavetError.PARAMETER_COUNT);
        }
    }

    static abstract class Ml extends O.I28 {
        abstract psW rl();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof psW.j) {
                psW.j jVar = (psW.j) obj;
                if (jVar.getCount() > 0 && rl().count(jVar.getElement()) == jVar.getCount()) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof psW.j) {
                psW.j jVar = (psW.j) obj;
                Object element = jVar.getElement();
                int count = jVar.getCount();
                if (count != 0) {
                    return rl().z(element, count, 0);
                }
            }
            return false;
        }

        Ml() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            rl().clear();
        }
    }

    static final class Wre implements Iterator {
        private int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private psW.j f59611O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final psW f59612n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f59613o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f59614r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Iterator f59615t;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.J2 > 0 || this.f59615t.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            Pl.t(this.f59613o);
            if (this.f59614r == 1) {
                this.f59615t.remove();
            } else {
                psW psw = this.f59612n;
                psW.j jVar = this.f59611O;
                Objects.requireNonNull(jVar);
                psw.remove(jVar.getElement());
            }
            this.f59614r--;
            this.f59613o = false;
        }

        Wre(psW psw, Iterator it) {
            this.f59612n = psw;
            this.f59615t = it;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                if (this.J2 == 0) {
                    psW.j jVar = (psW.j) this.f59615t.next();
                    this.f59611O = jVar;
                    int count = jVar.getCount();
                    this.J2 = count;
                    this.f59614r = count;
                }
                this.J2--;
                this.f59613o = true;
                psW.j jVar2 = this.f59611O;
                Objects.requireNonNull(jVar2);
                return jVar2.getElement();
            }
            throw new NoSuchElementException();
        }
    }

    static abstract class n implements psW.j {
        public boolean equals(Object obj) {
            if (obj instanceof psW.j) {
                psW.j jVar = (psW.j) obj;
                if (getCount() == jVar.getCount() && t1.C.n(getElement(), jVar.getElement())) {
                    return true;
                }
            }
            return false;
        }

        n() {
        }

        public int hashCode() {
            int iHashCode;
            Object element = getElement();
            if (element == null) {
                iHashCode = 0;
            } else {
                iHashCode = element.hashCode();
            }
            return iHashCode ^ getCount();
        }

        @Override // com.google.common.collect.psW.j
        public String toString() {
            String strValueOf = String.valueOf(getElement());
            int count = getCount();
            if (count == 1) {
                return strValueOf;
            }
            return strValueOf + " x " + count;
        }
    }

    static boolean O(psW psw, Object obj) {
        if (obj == psw) {
            return true;
        }
        if (obj instanceof psW) {
            psW psw2 = (psW) obj;
            if (psw.size() == psw2.size() && psw.entrySet().size() == psw2.entrySet().size()) {
                for (psW.j jVar : psw2.entrySet()) {
                    if (psw.count(jVar.getElement()) != jVar.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    class j extends KH {
        j(Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.KH
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Object n(psW.j jVar) {
            return jVar.getElement();
        }
    }

    static abstract class w6 extends O.I28 {
        abstract psW rl();

        w6() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            rl().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return rl().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return rl().containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return rl().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (rl().eF(obj, Integer.MAX_VALUE) > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return rl().entrySet().size();
        }
    }

    public static psW.j J2(Object obj, int i2) {
        return new I28(obj, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean KN(psW psw, Collection collection) {
        if (collection instanceof psW) {
            collection = ((psW) collection).elementSet();
        }
        return psw.elementSet().removeAll(collection);
    }

    static Iterator Uo(psW psw) {
        return new Wre(psw, psw.entrySet().iterator());
    }

    static Iterator nr(Iterator it) {
        return new j(it);
    }

    static psW t(Iterable iterable) {
        return (psW) iterable;
    }

    private static boolean n(psW psw, psW psw2) {
        if (psw2.isEmpty()) {
            return false;
        }
        for (psW.j jVar : psw2.entrySet()) {
            psw.M(jVar.getElement(), jVar.getCount());
        }
        return true;
    }

    static boolean rl(psW psw, Collection collection) {
        t1.Xo.HI(psw);
        t1.Xo.HI(collection);
        if (collection instanceof psW) {
            return n(psw, t(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return iwV.n(psw, collection.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean xMQ(psW psw, Collection collection) {
        t1.Xo.HI(collection);
        if (collection instanceof psW) {
            collection = ((psW) collection).elementSet();
        }
        return psw.elementSet().retainAll(collection);
    }
}
