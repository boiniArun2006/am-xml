package com.google.protobuf;

import com.google.protobuf.nKK;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class Ew extends w6 implements nKK.CN3, RandomAccess, Mf {
    private static final Ew EMPTY_LIST = new Ew(new int[0], 0, false);
    private int[] array;
    private int size;

    Ew() {
        this(new int[10], 0, true);
    }

    @Override // com.google.protobuf.nKK.CN3
    public void addInt(int i2) {
        ensureIsMutable();
        int i3 = this.size;
        int[] iArr = this.array;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.array = iArr2;
        }
        int[] iArr3 = this.array;
        int i5 = this.size;
        this.size = i5 + 1;
        iArr3[i5] = i2;
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ew)) {
            return super.equals(obj);
        }
        Ew ew = (Ew) obj;
        if (this.size != ew.size) {
            return false;
        }
        int[] iArr = ew.array;
        for (int i2 = 0; i2 < this.size; i2++) {
            if (this.array[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.size; i3++) {
            i2 = (i2 * 31) + this.array[i3];
        }
        return i2;
    }

    private Ew(int[] iArr, int i2, boolean z2) {
        super(z2);
        this.array = iArr;
        this.size = i2;
    }

    public static Ew emptyList() {
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
    public Integer get(int i2) {
        return Integer.valueOf(getInt(i2));
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.array[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.w6, com.google.protobuf.nKK.Dsr, com.google.protobuf.nKK.CN3
    public nKK.CN3 mutableCopyWithCapacity(int i2) {
        if (i2 >= this.size) {
            return new Ew(Arrays.copyOf(this.array, i2), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.List
    public Integer remove(int i2) {
        ensureIsMutable();
        ensureIndexInRange(i2);
        int[] iArr = this.array;
        int i3 = iArr[i2];
        if (i2 < this.size - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (r2 - i2) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.List
    public Integer set(int i2, Integer num) {
        return Integer.valueOf(setInt(i2, num.intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    @Override // com.google.protobuf.w6, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        ensureIsMutable();
        nKK.checkNotNull(collection);
        if (!(collection instanceof Ew)) {
            return super.addAll(collection);
        }
        Ew ew = (Ew) collection;
        int i2 = ew.size;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.size;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i5 = i3 + i2;
            int[] iArr = this.array;
            if (i5 > iArr.length) {
                this.array = Arrays.copyOf(iArr, i5);
            }
            System.arraycopy(ew.array, 0, this.array, this.size, ew.size);
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

    @Override // com.google.protobuf.nKK.CN3
    public int getInt(int i2) {
        ensureIndexInRange(i2);
        return this.array[i2];
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i2, int i3) {
        ensureIsMutable();
        if (i3 >= i2) {
            int[] iArr = this.array;
            System.arraycopy(iArr, i3, iArr, i2, this.size - i3);
            this.size -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.nKK.CN3
    public int setInt(int i2, int i3) {
        ensureIsMutable();
        ensureIndexInRange(i2);
        int[] iArr = this.array;
        int i5 = iArr[i2];
        iArr[i2] = i3;
        return i5;
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.List
    public void add(int i2, Integer num) {
        addInt(i2, num.intValue());
    }

    private void addInt(int i2, int i3) {
        int i5;
        ensureIsMutable();
        if (i2 >= 0 && i2 <= (i5 = this.size)) {
            int[] iArr = this.array;
            if (i5 < iArr.length) {
                System.arraycopy(iArr, i2, iArr, i2 + 1, i5 - i2);
            } else {
                int[] iArr2 = new int[((i5 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i2);
                System.arraycopy(this.array, i2, iArr2, i2 + 1, this.size - i2);
                this.array = iArr2;
            }
            this.array[i2] = i3;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i2));
    }
}
