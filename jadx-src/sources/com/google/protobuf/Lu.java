package com.google.protobuf;

import com.google.protobuf.nKK;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class Lu extends w6 implements nKK.fuX, RandomAccess, Mf {
    private static final Lu EMPTY_LIST = new Lu(new long[0], 0, false);
    private long[] array;
    private int size;

    Lu() {
        this(new long[10], 0, true);
    }

    @Override // com.google.protobuf.nKK.fuX
    public void addLong(long j2) {
        ensureIsMutable();
        int i2 = this.size;
        long[] jArr = this.array;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.array = jArr2;
        }
        long[] jArr3 = this.array;
        int i3 = this.size;
        this.size = i3 + 1;
        jArr3[i3] = j2;
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Lu)) {
            return super.equals(obj);
        }
        Lu lu = (Lu) obj;
        if (this.size != lu.size) {
            return false;
        }
        long[] jArr = lu.array;
        for (int i2 = 0; i2 < this.size; i2++) {
            if (this.array[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            iHashLong = (iHashLong * 31) + nKK.hashLong(this.array[i2]);
        }
        return iHashLong;
    }

    private Lu(long[] jArr, int i2, boolean z2) {
        super(z2);
        this.array = jArr;
        this.size = i2;
    }

    public static Lu emptyList() {
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
    public Long get(int i2) {
        return Long.valueOf(getLong(i2));
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.array[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.w6, com.google.protobuf.nKK.Dsr, com.google.protobuf.nKK.CN3
    public nKK.fuX mutableCopyWithCapacity(int i2) {
        if (i2 >= this.size) {
            return new Lu(Arrays.copyOf(this.array, i2), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.List
    public Long remove(int i2) {
        ensureIsMutable();
        ensureIndexInRange(i2);
        long[] jArr = this.array;
        long j2 = jArr[i2];
        if (i2 < this.size - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (r3 - i2) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.List
    public Long set(int i2, Long l2) {
        return Long.valueOf(setLong(i2, l2.longValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Long l2) {
        addLong(l2.longValue());
        return true;
    }

    @Override // com.google.protobuf.w6, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        ensureIsMutable();
        nKK.checkNotNull(collection);
        if (!(collection instanceof Lu)) {
            return super.addAll(collection);
        }
        Lu lu = (Lu) collection;
        int i2 = lu.size;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.size;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i5 = i3 + i2;
            long[] jArr = this.array;
            if (i5 > jArr.length) {
                this.array = Arrays.copyOf(jArr, i5);
            }
            System.arraycopy(lu.array, 0, this.array, this.size, lu.size);
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

    @Override // com.google.protobuf.nKK.fuX
    public long getLong(int i2) {
        ensureIndexInRange(i2);
        return this.array[i2];
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i2, int i3) {
        ensureIsMutable();
        if (i3 >= i2) {
            long[] jArr = this.array;
            System.arraycopy(jArr, i3, jArr, i2, this.size - i3);
            this.size -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.nKK.fuX
    public long setLong(int i2, long j2) {
        ensureIsMutable();
        ensureIndexInRange(i2);
        long[] jArr = this.array;
        long j3 = jArr[i2];
        jArr[i2] = j2;
        return j3;
    }

    @Override // com.google.protobuf.w6, java.util.AbstractList, java.util.List
    public void add(int i2, Long l2) {
        addLong(i2, l2.longValue());
    }

    private void addLong(int i2, long j2) {
        int i3;
        ensureIsMutable();
        if (i2 >= 0 && i2 <= (i3 = this.size)) {
            long[] jArr = this.array;
            if (i3 < jArr.length) {
                System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
            } else {
                long[] jArr2 = new long[((i3 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i2);
                System.arraycopy(this.array, i2, jArr2, i2 + 1, this.size - i2);
                this.array = jArr2;
            }
            this.array[i2] = j2;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i2));
    }
}
