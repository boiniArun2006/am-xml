package com.google.common.collect;

import com.google.common.collect.Md;
import com.google.common.collect.fg;
import com.google.common.collect.psW;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract class s4 extends SPz implements gnv {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private transient Set f59783O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private transient Comparator f59784n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private transient NavigableSet f59785t;

    class j extends Md.Ml {
        j() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return s4.this.mUb();
        }

        @Override // com.google.common.collect.Md.Ml
        psW rl() {
            return s4.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return s4.this.gh().entrySet().size();
        }
    }

    abstract gnv gh();

    abstract Iterator mUb();

    @Override // java.util.Collection
    public Object[] toArray() {
        return J2();
    }

    @Override // com.google.common.collect.gnv
    public Comparator comparator() {
        Comparator comparator = this.f59784n;
        if (comparator != null) {
            return comparator;
        }
        iF iFVarO = iF.rl(gh().comparator()).O();
        this.f59784n = iFVarO;
        return iFVarO;
    }

    @Override // com.google.common.collect.psW
    public NavigableSet elementSet() {
        NavigableSet navigableSet = this.f59785t;
        if (navigableSet != null) {
            return navigableSet;
        }
        fg.n nVar = new fg.n(this);
        this.f59785t = nVar;
        return nVar;
    }

    @Override // com.google.common.collect.psW
    public Set entrySet() {
        Set set = this.f59783O;
        if (set != null) {
            return set;
        }
        Set setXMQ = xMQ();
        this.f59783O = setXMQ;
        return setXMQ;
    }

    @Override // com.google.common.collect.Q, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return Uo(objArr);
    }

    Set xMQ() {
        return new j();
    }

    s4() {
    }

    @Override // com.google.common.collect.gnv
    public gnv FX() {
        return gh();
    }

    @Override // com.google.common.collect.gnv
    public gnv GD(Object obj, EnumC1898o enumC1898o) {
        return gh().Mx(obj, enumC1898o).FX();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.Q
    /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
    public psW t() {
        return gh();
    }

    @Override // com.google.common.collect.gnv
    public gnv Mx(Object obj, EnumC1898o enumC1898o) {
        return gh().GD(obj, enumC1898o).FX();
    }

    @Override // com.google.common.collect.gnv
    public psW.j firstEntry() {
        return gh().lastEntry();
    }

    @Override // com.google.common.collect.gnv
    public psW.j lastEntry() {
        return gh().firstEntry();
    }

    @Override // com.google.common.collect.gnv
    public gnv p5(Object obj, EnumC1898o enumC1898o, Object obj2, EnumC1898o enumC1898o2) {
        return gh().p5(obj2, enumC1898o2, obj, enumC1898o).FX();
    }

    @Override // com.google.common.collect.gnv
    public psW.j pollFirstEntry() {
        return gh().pollLastEntry();
    }

    @Override // com.google.common.collect.gnv
    public psW.j pollLastEntry() {
        return gh().pollFirstEntry();
    }

    @Override // com.google.common.collect.ci
    public String toString() {
        return entrySet().toString();
    }
}
