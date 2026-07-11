package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class M5 extends w6 implements RandomAccess {
    private static final M5 EMPTY_LIST = new M5(new Object[0], 0, false);
    private Object[] array;
    private int size;

    M5() {
        this(new Object[10], 0, true);
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        ensureIsMutable();
        int i2 = this.size;
        Object[] objArr = this.array;
        if (i2 == objArr.length) {
            this.array = Arrays.copyOf(objArr, ((i2 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.array;
        int i3 = this.size;
        this.size = i3 + 1;
        objArr2[i3] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    private M5(Object[] objArr, int i2, boolean z2) {
        super(z2);
        this.array = objArr;
        this.size = i2;
    }

    private static <E> E[] createArray(int i2) {
        return (E[]) new Object[i2];
    }

    public static <E> M5 emptyList() {
        return EMPTY_LIST;
    }

    private void ensureIndexInRange(int i2) {
        if (i2 < 0 || i2 >= this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i2));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int i2) {
        return "Index:" + i2 + ", Size:" + this.size;
    }

    @Override // com.google.protobuf.w6, com.google.protobuf.nKK.Dsr, com.google.protobuf.nKK.CN3
    public M5 mutableCopyWithCapacity(int i2) {
        if (i2 >= this.size) {
            return new M5(Arrays.copyOf(this.array, i2), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i2) {
        ensureIndexInRange(i2);
        return this.array[i2];
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.List
    public Object remove(int i2) {
        ensureIsMutable();
        ensureIndexInRange(i2);
        Object[] objArr = this.array;
        Object obj = objArr[i2];
        if (i2 < this.size - 1) {
            System.arraycopy(objArr, i2 + 1, objArr, i2, (r2 - i2) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.List
    public Object set(int i2, Object obj) {
        ensureIsMutable();
        ensureIndexInRange(i2);
        Object[] objArr = this.array;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.List
    public void add(int i2, Object obj) {
        int i3;
        ensureIsMutable();
        if (i2 >= 0 && i2 <= (i3 = this.size)) {
            Object[] objArr = this.array;
            if (i3 < objArr.length) {
                System.arraycopy(objArr, i2, objArr, i2 + 1, i3 - i2);
            } else {
                Object[] objArrCreateArray = createArray(((i3 * 3) / 2) + 1);
                System.arraycopy(this.array, 0, objArrCreateArray, 0, i2);
                System.arraycopy(this.array, i2, objArrCreateArray, i2 + 1, this.size - i2);
                this.array = objArrCreateArray;
            }
            this.array[i2] = obj;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i2));
    }
}
