package com.google.common.collect;

import com.google.common.collect.fg;
import com.google.common.collect.psW;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
abstract class fuX extends CN3 implements gnv {
    private transient gnv J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final Comparator f59700O;

    class j extends s4 {
        j() {
        }

        @Override // com.google.common.collect.s4
        gnv gh() {
            return fuX.this;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return fuX.this.descendingIterator();
        }

        @Override // com.google.common.collect.s4
        Iterator mUb() {
            return fuX.this.KN();
        }
    }

    fuX() {
        this(iF.t());
    }

    abstract Iterator KN();

    fuX(Comparator comparator) {
        this.f59700O = (Comparator) t1.Xo.HI(comparator);
    }

    @Override // com.google.common.collect.gnv
    public gnv FX() {
        gnv gnvVar = this.J2;
        if (gnvVar != null) {
            return gnvVar;
        }
        gnv gnvVarJ2 = J2();
        this.J2 = gnvVarJ2;
        return gnvVarJ2;
    }

    gnv J2() {
        return new j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.CN3
    /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
    public NavigableSet rl() {
        return new fg.n(this);
    }

    @Override // com.google.common.collect.gnv
    public Comparator comparator() {
        return this.f59700O;
    }

    @Override // com.google.common.collect.CN3, com.google.common.collect.psW
    public NavigableSet elementSet() {
        return (NavigableSet) super.elementSet();
    }

    Iterator descendingIterator() {
        return Md.Uo(FX());
    }

    @Override // com.google.common.collect.gnv
    public psW.j firstEntry() {
        Iterator itO = O();
        if (itO.hasNext()) {
            return (psW.j) itO.next();
        }
        return null;
    }

    @Override // com.google.common.collect.gnv
    public psW.j lastEntry() {
        Iterator itKN = KN();
        if (itKN.hasNext()) {
            return (psW.j) itKN.next();
        }
        return null;
    }

    @Override // com.google.common.collect.gnv
    public gnv p5(Object obj, EnumC1898o enumC1898o, Object obj2, EnumC1898o enumC1898o2) {
        t1.Xo.HI(enumC1898o);
        t1.Xo.HI(enumC1898o2);
        return GD(obj, enumC1898o).Mx(obj2, enumC1898o2);
    }

    @Override // com.google.common.collect.gnv
    public psW.j pollFirstEntry() {
        Iterator itO = O();
        if (itO.hasNext()) {
            psW.j jVar = (psW.j) itO.next();
            psW.j jVarJ2 = Md.J2(jVar.getElement(), jVar.getCount());
            itO.remove();
            return jVarJ2;
        }
        return null;
    }

    @Override // com.google.common.collect.gnv
    public psW.j pollLastEntry() {
        Iterator itKN = KN();
        if (itKN.hasNext()) {
            psW.j jVar = (psW.j) itKN.next();
            psW.j jVarJ2 = Md.J2(jVar.getElement(), jVar.getCount());
            itKN.remove();
            return jVarJ2;
        }
        return null;
    }
}
