package com.google.protobuf;

import com.google.protobuf.nKK;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class fuX extends w6 implements nKK.j, RandomAccess, Mf {
    private static final fuX EMPTY_LIST = new fuX(new boolean[0], 0, false);
    private boolean[] array;
    private int size;

    fuX() {
        this(new boolean[10], 0, true);
    }

    @Override // com.google.protobuf.nKK.j
    public void addBoolean(boolean z2) {
        ensureIsMutable();
        int i2 = this.size;
        boolean[] zArr = this.array;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.array = zArr2;
        }
        boolean[] zArr3 = this.array;
        int i3 = this.size;
        this.size = i3 + 1;
        zArr3[i3] = z2;
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuX)) {
            return super.equals(obj);
        }
        fuX fux = (fuX) obj;
        if (this.size != fux.size) {
            return false;
        }
        boolean[] zArr = fux.array;
        for (int i2 = 0; i2 < this.size; i2++) {
            if (this.array[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashBoolean = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            iHashBoolean = (iHashBoolean * 31) + nKK.hashBoolean(this.array[i2]);
        }
        return iHashBoolean;
    }

    private fuX(boolean[] zArr, int i2, boolean z2) {
        super(z2);
        this.array = zArr;
        this.size = i2;
    }

    public static fuX emptyList() {
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

    @Override // java.util.AbstractList, java.util.List
    public Boolean get(int i2) {
        return Boolean.valueOf(getBoolean(i2));
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.array[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.w6, com.google.protobuf.nKK.Dsr, com.google.protobuf.nKK.CN3
    public nKK.j mutableCopyWithCapacity(int i2) {
        if (i2 >= this.size) {
            return new fuX(Arrays.copyOf(this.array, i2), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.List
    public Boolean remove(int i2) {
        ensureIsMutable();
        ensureIndexInRange(i2);
        boolean[] zArr = this.array;
        boolean z2 = zArr[i2];
        if (i2 < this.size - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (r2 - i2) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z2);
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.List
    public Boolean set(int i2, Boolean bool) {
        return Boolean.valueOf(setBoolean(i2, bool.booleanValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Boolean bool) {
        addBoolean(bool.booleanValue());
        return true;
    }

    @Override // com.google.protobuf.w6, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        ensureIsMutable();
        nKK.checkNotNull(collection);
        if (!(collection instanceof fuX)) {
            return super.addAll(collection);
        }
        fuX fux = (fuX) collection;
        int i2 = fux.size;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.size;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i5 = i3 + i2;
            boolean[] zArr = this.array;
            if (i5 > zArr.length) {
                this.array = Arrays.copyOf(zArr, i5);
            }
            System.arraycopy(fux.array, 0, this.array, this.size, fux.size);
            this.size = i5;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.nKK.j
    public boolean getBoolean(int i2) {
        ensureIndexInRange(i2);
        return this.array[i2];
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i2, int i3) {
        ensureIsMutable();
        if (i3 >= i2) {
            boolean[] zArr = this.array;
            System.arraycopy(zArr, i3, zArr, i2, this.size - i3);
            this.size -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.nKK.j
    public boolean setBoolean(int i2, boolean z2) {
        ensureIsMutable();
        ensureIndexInRange(i2);
        boolean[] zArr = this.array;
        boolean z3 = zArr[i2];
        zArr[i2] = z2;
        return z3;
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.List
    public void add(int i2, Boolean bool) {
        addBoolean(i2, bool.booleanValue());
    }

    private void addBoolean(int i2, boolean z2) {
        int i3;
        ensureIsMutable();
        if (i2 >= 0 && i2 <= (i3 = this.size)) {
            boolean[] zArr = this.array;
            if (i3 < zArr.length) {
                System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
            } else {
                boolean[] zArr2 = new boolean[((i3 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i2);
                System.arraycopy(this.array, i2, zArr2, i2 + 1, this.size - i2);
                this.array = zArr2;
            }
            this.array[i2] = z2;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i2));
    }
}
