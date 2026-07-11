package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class pO extends w6 implements RandomAccess {
    private static final pO J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f60030O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Object[] f60031t;

    @Override // com.google.crypto.tink.shaded.protobuf.w6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        rl();
        int i2 = this.f60030O;
        Object[] objArr = this.f60031t;
        if (i2 == objArr.length) {
            this.f60031t = Arrays.copyOf(objArr, ((i2 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f60031t;
        int i3 = this.f60030O;
        this.f60030O = i3 + 1;
        objArr2[i3] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    static {
        pO pOVar = new pO(new Object[0], 0);
        J2 = pOVar;
        pOVar.makeImmutable();
    }

    private String J2(int i2) {
        return "Index:" + i2 + ", Size:" + this.f60030O;
    }

    private void O(int i2) {
        if (i2 < 0 || i2 >= this.f60030O) {
            throw new IndexOutOfBoundsException(J2(i2));
        }
    }

    public static pO nr() {
        return J2;
    }

    private static Object[] t(int i2) {
        return new Object[i2];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.SPz.Ml
    /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
    public pO mutableCopyWithCapacity(int i2) {
        if (i2 >= this.f60030O) {
            return new pO(Arrays.copyOf(this.f60031t, i2), this.f60030O);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f60030O;
    }

    private pO(Object[] objArr, int i2) {
        this.f60031t = objArr;
        this.f60030O = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i2) {
        O(i2);
        return this.f60031t[i2];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w6, java.util.AbstractList, java.util.List
    public Object remove(int i2) {
        rl();
        O(i2);
        Object[] objArr = this.f60031t;
        Object obj = objArr[i2];
        if (i2 < this.f60030O - 1) {
            System.arraycopy(objArr, i2 + 1, objArr, i2, (r2 - i2) - 1);
        }
        this.f60030O--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i2, Object obj) {
        rl();
        O(i2);
        Object[] objArr = this.f60031t;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i2, Object obj) {
        int i3;
        rl();
        if (i2 >= 0 && i2 <= (i3 = this.f60030O)) {
            Object[] objArr = this.f60031t;
            if (i3 < objArr.length) {
                System.arraycopy(objArr, i2, objArr, i2 + 1, i3 - i2);
            } else {
                Object[] objArrT = t(((i3 * 3) / 2) + 1);
                System.arraycopy(this.f60031t, 0, objArrT, 0, i2);
                System.arraycopy(this.f60031t, i2, objArrT, i2 + 1, this.f60030O - i2);
                this.f60031t = objArrT;
            }
            this.f60031t[i2] = obj;
            this.f60030O++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(J2(i2));
    }
}
