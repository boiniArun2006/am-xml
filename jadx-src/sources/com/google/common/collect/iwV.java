package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class iwV {

    private static final class Ml extends xZD {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object f59711n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f59712t;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f59712t;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f59712t) {
                throw new NoSuchElementException();
            }
            this.f59712t = true;
            return this.f59711n;
        }

        Ml(Object obj) {
            this.f59711n = obj;
        }
    }

    class j extends com.google.common.collect.n {
        final /* synthetic */ t1.eO J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Iterator f59713O;

        j(Iterator it, t1.eO eOVar) {
            this.f59713O = it;
            this.J2 = eOVar;
        }

        @Override // com.google.common.collect.n
        protected Object n() {
            while (this.f59713O.hasNext()) {
                Object next = this.f59713O.next();
                if (this.J2.apply(next)) {
                    return next;
                }
            }
            return rl();
        }
    }

    private static final class n extends com.google.common.collect.j {
        static final M5 J2 = new n(new Object[0], 0);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Object[] f59714O;

        n(Object[] objArr, int i2) {
            super(objArr.length, i2);
            this.f59714O = objArr;
        }

        @Override // com.google.common.collect.j
        protected Object n(int i2) {
            return this.f59714O[i2];
        }
    }

    private enum w6 implements Iterator {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            Pl.t(false);
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }
    }

    public static boolean nr(Iterator it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static int HI(Iterator it, t1.eO eOVar) {
        t1.Xo.ck(eOVar, "predicate");
        int i2 = 0;
        while (it.hasNext()) {
            if (eOVar.apply(it.next())) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    static Iterator KN() {
        return w6.INSTANCE;
    }

    static M5 Uo() {
        return n.J2;
    }

    public static xZD o(Object obj) {
        return new Ml(obj);
    }

    public static boolean Ik(Iterator it, Collection collection) {
        t1.Xo.HI(collection);
        boolean z2 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    static xZD J2() {
        return Uo();
    }

    public static boolean O(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !t1.C.n(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static Object az(Iterator it, Object obj) {
        if (it.hasNext()) {
            return it.next();
        }
        return obj;
    }

    static Object ck(Iterator it) {
        if (it.hasNext()) {
            Object next = it.next();
            it.remove();
            return next;
        }
        return null;
    }

    public static Object gh(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object mUb(Iterator it, t1.eO eOVar) {
        t1.Xo.HI(it);
        t1.Xo.HI(eOVar);
        while (it.hasNext()) {
            Object next = it.next();
            if (eOVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static boolean n(Collection collection, Iterator it) {
        t1.Xo.HI(collection);
        t1.Xo.HI(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static Object qie(Iterator it, Object obj) {
        if (it.hasNext()) {
            return gh(it);
        }
        return obj;
    }

    public static boolean r(Iterator it, t1.eO eOVar) {
        t1.Xo.HI(eOVar);
        boolean z2 = false;
        while (it.hasNext()) {
            if (eOVar.apply(it.next())) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static boolean rl(Iterator it, t1.eO eOVar) {
        if (HI(it, eOVar) != -1) {
            return true;
        }
        return false;
    }

    static void t(Iterator it) {
        t1.Xo.HI(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static Object ty(Iterator it) {
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("expected one element but was: <");
        sb.append(next);
        for (int i2 = 0; i2 < 4 && it.hasNext(); i2++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append(Typography.greater);
        throw new IllegalArgumentException(sb.toString());
    }

    public static xZD xMQ(Iterator it, t1.eO eOVar) {
        t1.Xo.HI(it);
        t1.Xo.HI(eOVar);
        return new j(it, eOVar);
    }
}
