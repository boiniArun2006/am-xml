package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class LongArrayList extends AbstractProtobufList<Long> implements Internal.LongList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final LongArrayList J2 = new LongArrayList(new long[0], 0, false);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f38076O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long[] f38077t;

    LongArrayList() {
        this(new long[10], 0, true);
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LongArrayList)) {
            return super.equals(obj);
        }
        LongArrayList longArrayList = (LongArrayList) obj;
        if (this.f38076O != longArrayList.f38076O) {
            return false;
        }
        long[] jArr = longArrayList.f38077t;
        for (int i2 = 0; i2 < this.f38076O; i2++) {
            if (this.f38077t[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iJ2 = 1;
        for (int i2 = 0; i2 < this.f38076O; i2++) {
            iJ2 = (iJ2 * 31) + Internal.J2(this.f38077t[i2]);
        }
        return iJ2;
    }

    private LongArrayList(long[] jArr, int i2, boolean z2) {
        super(z2);
        this.f38077t = jArr;
        this.f38076O = i2;
    }

    private void J2(int i2) {
        if (i2 < 0 || i2 >= this.f38076O) {
            throw new IndexOutOfBoundsException(KN(i2));
        }
    }

    private String KN(int i2) {
        return "Index:" + i2 + ", Size:" + this.f38076O;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f38077t[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    public Internal.LongList mutableCopyWithCapacity(int i2) {
        if (i2 >= this.f38076O) {
            return new LongArrayList(Arrays.copyOf(this.f38077t, i2), this.f38076O, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f38076O;
    }

    private void O(int i2, long j2) {
        int i3;
        rl();
        if (i2 >= 0 && i2 <= (i3 = this.f38076O)) {
            long[] jArr = this.f38077t;
            if (i3 < jArr.length) {
                System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
            } else {
                long[] jArr2 = new long[((i3 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i2);
                System.arraycopy(this.f38077t, i2, jArr2, i2 + 1, this.f38076O - i2);
                this.f38077t = jArr2;
            }
            this.f38077t[i2] = j2;
            this.f38076O++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(KN(i2));
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
    public Long get(int i2) {
        return Long.valueOf(getLong(i2));
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        rl();
        Internal.n(collection);
        if (!(collection instanceof LongArrayList)) {
            return super.addAll(collection);
        }
        LongArrayList longArrayList = (LongArrayList) collection;
        int i2 = longArrayList.f38076O;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f38076O;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i5 = i3 + i2;
            long[] jArr = this.f38077t;
            if (i5 > jArr.length) {
                this.f38077t = Arrays.copyOf(jArr, i5);
            }
            System.arraycopy(longArrayList.f38077t, 0, this.f38077t, this.f38076O, longArrayList.f38076O);
            this.f38076O = i5;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public void addLong(long j2) {
        rl();
        int i2 = this.f38076O;
        long[] jArr = this.f38077t;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.f38077t = jArr2;
        }
        long[] jArr3 = this.f38077t;
        int i3 = this.f38076O;
        this.f38076O = i3 + 1;
        jArr3[i3] = j2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public long getLong(int i2) {
        J2(i2);
        return this.f38077t[i2];
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: mUb, reason: merged with bridge method [inline-methods] */
    public Long set(int i2, Long l2) {
        return Long.valueOf(setLong(i2, l2.longValue()));
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l2) {
        addLong(l2.longValue());
        return true;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i2, int i3) {
        rl();
        if (i3 >= i2) {
            long[] jArr = this.f38077t;
            System.arraycopy(jArr, i3, jArr, i2, this.f38076O - i3);
            this.f38076O -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public long setLong(int i2, long j2) {
        rl();
        J2(i2);
        long[] jArr = this.f38077t;
        long j3 = jArr[i2];
        jArr[i2] = j2;
        return j3;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void add(int i2, Long l2) {
        O(i2, l2.longValue());
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
    public Long remove(int i2) {
        rl();
        J2(i2);
        long[] jArr = this.f38077t;
        long j2 = jArr[i2];
        if (i2 < this.f38076O - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (r3 - i2) - 1);
        }
        this.f38076O--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }
}
