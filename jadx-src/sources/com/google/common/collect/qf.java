package com.google.common.collect;

import com.google.common.collect.AbstractC1899p;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class qf extends C implements Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final transient int f59764o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final transient u f59765r;

    private static final class I28 extends Z {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final transient qf f59766t;

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* JADX INFO: renamed from: KN */
        public xZD iterator() {
            return this.f59766t.qie();
        }

        @Override // com.google.common.collect.Z, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f59766t.nr(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f59766t.size();
        }

        @Override // com.google.common.collect.Z
        int t(Object[] objArr, int i2) {
            xZD it = this.f59766t.f59765r.values().iterator();
            while (it.hasNext()) {
                i2 = ((Z) it.next()).t(objArr, i2);
            }
            return i2;
        }

        I28(qf qfVar) {
            this.f59766t = qfVar;
        }

        @Override // com.google.common.collect.Z
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    static class Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final AbstractC1899p.n f59767n = AbstractC1899p.n(qf.class, "map");
        static final AbstractC1899p.n rl = AbstractC1899p.n(qf.class, "size");
    }

    class j extends xZD {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Iterator f59769n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f59770t = null;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Iterator f59768O = iwV.J2();

        j() {
            this.f59769n = qf.this.f59765r.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f59768O.hasNext() || this.f59769n.hasNext();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!this.f59768O.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f59769n.next();
                this.f59770t = entry.getKey();
                this.f59768O = ((Z) entry.getValue()).iterator();
            }
            Object obj = this.f59770t;
            Objects.requireNonNull(obj);
            return vd.O(obj, this.f59768O.next());
        }
    }

    class n extends xZD {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Iterator f59772n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Iterator f59773t = iwV.J2();

        n() {
            this.f59772n = qf.this.f59765r.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f59773t.hasNext() || this.f59772n.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f59773t.hasNext()) {
                this.f59773t = ((Z) this.f59772n.next()).iterator();
            }
            return this.f59773t.next();
        }
    }

    private static class w6 extends Z {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final qf f59774t;

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* JADX INFO: renamed from: KN */
        public xZD iterator() {
            return this.f59774t.xMQ();
        }

        @Override // com.google.common.collect.Z, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f59774t.t(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f59774t.size();
        }

        w6(qf qfVar) {
            this.f59774t = qfVar;
        }

        @Override // com.google.common.collect.Z
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.Wre
    /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
    public Z J2() {
        return new w6(this);
    }

    @Override // com.google.common.collect.Wre
    Map O() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.Wre
    Set Uo() {
        throw new AssertionError("unreachable");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.Wre
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public xZD qie() {
        return new n();
    }

    /* JADX INFO: renamed from: az */
    public u rl() {
        return this.f59765r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.Wre
    /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
    public Z KN() {
        return new I28(this);
    }

    @Override // com.google.common.collect.Lu
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Wre
    public boolean nr(Object obj) {
        return obj != null && super.nr(obj);
    }

    public Ln o() {
        return this.f59765r.keySet();
    }

    @Override // com.google.common.collect.Lu
    public final boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.Wre
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public xZD xMQ() {
        return new j();
    }

    @Override // com.google.common.collect.Wre, com.google.common.collect.Lu
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Lu
    public int size() {
        return this.f59764o;
    }

    public boolean ty(Object obj) {
        return this.f59765r.containsKey(obj);
    }

    qf(u uVar, int i2) {
        this.f59765r = uVar;
        this.f59764o = i2;
    }

    @Override // com.google.common.collect.Wre, com.google.common.collect.Lu
    /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
    public Z n() {
        return (Z) super.n();
    }

    @Override // com.google.common.collect.Wre, com.google.common.collect.Lu
    /* JADX INFO: renamed from: XQ, reason: merged with bridge method [inline-methods] */
    public Z values() {
        return (Z) super.values();
    }

    @Override // com.google.common.collect.Wre
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.Wre
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.Wre, com.google.common.collect.Lu
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.Wre, com.google.common.collect.Lu
    public /* bridge */ /* synthetic */ boolean t(Object obj, Object obj2) {
        return super.t(obj, obj2);
    }

    @Override // com.google.common.collect.Wre
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
