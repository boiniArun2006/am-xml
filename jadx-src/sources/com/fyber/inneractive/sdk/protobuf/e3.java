package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class e3 extends AbstractMap {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f56551h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f56553b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f56554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f56555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile d3 f56556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f56557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile x2 f56558g;

    public final Object a(Comparable comparable, Object obj) {
        a();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((b3) this.f56553b.get(iA)).setValue(obj);
        }
        a();
        if (this.f56553b.isEmpty() && !(this.f56553b instanceof ArrayList)) {
            this.f56553b = new ArrayList(this.f56552a);
        }
        int i2 = -(iA + 1);
        if (i2 >= this.f56552a) {
            return c().put(comparable, obj);
        }
        int size = this.f56553b.size();
        int i3 = this.f56552a;
        if (size == i3) {
            b3 b3Var = (b3) this.f56553b.remove(i3 - 1);
            c().put(b3Var.f56534a, b3Var.f56535b);
        }
        this.f56553b.add(i2, new b3(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3)) {
            return super.equals(obj);
        }
        e3 e3Var = (e3) obj;
        int size = size();
        if (size != e3Var.size()) {
            return false;
        }
        int size2 = this.f56553b.size();
        if (size2 != e3Var.f56553b.size()) {
            return entrySet().equals(e3Var.entrySet());
        }
        for (int i2 = 0; i2 < size2; i2++) {
            if (!((Map.Entry) this.f56553b.get(i2)).equals((Map.Entry) e3Var.f56553b.get(i2))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f56554c.equals(e3Var.f56554c);
        }
        return true;
    }

    public final Iterable b() {
        return this.f56554c.isEmpty() ? a3.f56530b : this.f56554c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f56554c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f56556e == null) {
            this.f56556e = new d3(this);
        }
        return this.f56556e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((b3) this.f56553b.get(iA)).f56535b : this.f56554c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f56553b.size();
        int iHashCode = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iHashCode += ((b3) this.f56553b.get(i2)).hashCode();
        }
        return this.f56554c.size() > 0 ? this.f56554c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f56554c.size() + this.f56553b.size();
    }

    public e3(int i2) {
        this.f56552a = i2;
        Map map = Collections.EMPTY_MAP;
        this.f56554c = map;
        this.f56557f = map;
    }

    public final SortedMap c() {
        a();
        if (this.f56554c.isEmpty() && !(this.f56554c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f56554c = treeMap;
            this.f56557f = treeMap.descendingMap();
        }
        return (SortedMap) this.f56554c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        a();
        if (!this.f56553b.isEmpty()) {
            this.f56553b.clear();
        }
        if (!this.f56554c.isEmpty()) {
            this.f56554c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        a();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            a();
            Object obj2 = ((b3) this.f56553b.remove(iA)).f56535b;
            if (!this.f56554c.isEmpty()) {
                Iterator it = c().entrySet().iterator();
                this.f56553b.add(new b3(this, (Map.Entry) it.next()));
                it.remove();
            }
            return obj2;
        }
        if (this.f56554c.isEmpty()) {
            return null;
        }
        return this.f56554c.remove(comparable);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(Comparable comparable) {
        int i2;
        int i3;
        int size = this.f56553b.size();
        int i5 = size - 1;
        if (i5 < 0) {
            i2 = 0;
            while (i2 <= i5) {
                int i7 = (i2 + i5) / 2;
                int iCompareTo = comparable.compareTo(((b3) this.f56553b.get(i7)).f56534a);
                if (iCompareTo < 0) {
                    i5 = i7 - 1;
                } else {
                    if (iCompareTo <= 0) {
                        return i7;
                    }
                    i2 = i7 + 1;
                }
            }
            i3 = i2 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((b3) this.f56553b.get(i5)).f56534a);
            if (iCompareTo2 > 0) {
                i3 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i5;
                }
                i2 = 0;
                while (i2 <= i5) {
                }
                i3 = i2 + 1;
            }
        }
        return -i3;
    }

    public final void a() {
        if (this.f56555d) {
            throw new UnsupportedOperationException();
        }
    }
}
