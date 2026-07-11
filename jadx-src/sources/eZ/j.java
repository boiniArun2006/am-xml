package eZ;

import eZ.w6;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class j extends w6 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Comparator f63769O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object[] f63770n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Object[] f63771t;

    /* JADX INFO: renamed from: eZ.j$j, reason: collision with other inner class name */
    class C0852j implements Iterator {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ boolean f63772O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f63773n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f63774t;

        C0852j(int i2, boolean z2) {
            this.f63774t = i2;
            this.f63772O = z2;
            this.f63773n = i2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f63772O ? this.f63773n >= 0 : this.f63773n < j.this.f63770n.length;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            Object obj = j.this.f63770n[this.f63773n];
            Object[] objArr = j.this.f63771t;
            int i2 = this.f63773n;
            Object obj2 = objArr[i2];
            this.f63773n = this.f63772O ? i2 - 1 : i2 + 1;
            return new AbstractMap.SimpleImmutableEntry(obj, obj2);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
        }
    }

    public j(Comparator comparator) {
        this.f63770n = new Object[0];
        this.f63771t = new Object[0];
        this.f63769O = comparator;
    }

    private int HI(Object obj) {
        int i2 = 0;
        while (true) {
            Object[] objArr = this.f63770n;
            if (i2 >= objArr.length || this.f63769O.compare(objArr[i2], obj) >= 0) {
                break;
            }
            i2++;
        }
        return i2;
    }

    private static Object[] Ik(Object[] objArr, int i2) {
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        System.arraycopy(objArr, i2 + 1, objArr2, i2, length - i2);
        return objArr2;
    }

    private static Object[] qie(Object[] objArr, int i2, Object obj) {
        Object[] objArr2 = new Object[objArr.length + 1];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        objArr2[i2] = obj;
        System.arraycopy(objArr, i2, objArr2, i2 + 1, (r0 - i2) - 1);
        return objArr2;
    }

    private static Object[] r(Object[] objArr, int i2, Object obj) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        objArr2[i2] = obj;
        return objArr2;
    }

    @Override // eZ.w6, java.lang.Iterable
    public Iterator iterator() {
        return ck(0, false);
    }

    private Iterator ck(int i2, boolean z2) {
        return new C0852j(i2, z2);
    }

    private int ty(Object obj) {
        int i2 = 0;
        for (Object obj2 : this.f63770n) {
            if (this.f63769O.compare(obj, obj2) == 0) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // eZ.w6
    public Object J2() {
        Object[] objArr = this.f63770n;
        if (objArr.length > 0) {
            return objArr[0];
        }
        return null;
    }

    @Override // eZ.w6
    public Object O() {
        Object[] objArr = this.f63770n;
        if (objArr.length > 0) {
            return objArr[objArr.length - 1];
        }
        return null;
    }

    @Override // eZ.w6
    public boolean isEmpty() {
        return this.f63770n.length == 0;
    }

    @Override // eZ.w6
    public Comparator nr() {
        return this.f63769O;
    }

    @Override // eZ.w6
    public int size() {
        return this.f63770n.length;
    }

    public static j az(List list, Map map, w6.j.InterfaceC0853j interfaceC0853j, Comparator comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        int i2 = 0;
        for (Object obj : list) {
            objArr[i2] = obj;
            objArr2[i2] = map.get(interfaceC0853j.n(obj));
            i2++;
        }
        return new j(comparator, objArr, objArr2);
    }

    @Override // eZ.w6
    public Iterator KN(Object obj) {
        return ck(HI(obj), false);
    }

    @Override // eZ.w6
    public w6 Uo(Object obj, Object obj2) {
        int iTy = ty(obj);
        if (iTy != -1) {
            Object[] objArr = this.f63770n;
            if (objArr[iTy] == obj && this.f63771t[iTy] == obj2) {
                return this;
            }
            return new j(this.f63769O, r(objArr, iTy, obj), r(this.f63771t, iTy, obj2));
        }
        if (this.f63770n.length > 25) {
            HashMap map = new HashMap(this.f63770n.length + 1);
            int i2 = 0;
            while (true) {
                Object[] objArr2 = this.f63770n;
                if (i2 < objArr2.length) {
                    map.put(objArr2[i2], this.f63771t[i2]);
                    i2++;
                } else {
                    map.put(obj, obj2);
                    return C.gh(map, this.f63769O);
                }
            }
        } else {
            int iHI = HI(obj);
            return new j(this.f63769O, qie(this.f63770n, iHI, obj), qie(this.f63771t, iHI, obj2));
        }
    }

    @Override // eZ.w6
    public boolean rl(Object obj) {
        if (ty(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // eZ.w6
    public Object t(Object obj) {
        int iTy = ty(obj);
        if (iTy != -1) {
            return this.f63771t[iTy];
        }
        return null;
    }

    @Override // eZ.w6
    public w6 xMQ(Object obj) {
        int iTy = ty(obj);
        if (iTy == -1) {
            return this;
        }
        return new j(this.f63769O, Ik(this.f63770n, iTy), Ik(this.f63771t, iTy));
    }

    private j(Comparator comparator, Object[] objArr, Object[] objArr2) {
        this.f63770n = objArr;
        this.f63771t = objArr2;
        this.f63769O = comparator;
    }
}
