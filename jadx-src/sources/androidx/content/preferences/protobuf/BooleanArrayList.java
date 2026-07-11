package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class BooleanArrayList extends AbstractProtobufList<Boolean> implements Internal.BooleanList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final BooleanArrayList J2 = new BooleanArrayList(new boolean[0], 0, false);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f37734O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean[] f37735t;

    BooleanArrayList() {
        this(new boolean[10], 0, true);
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BooleanArrayList)) {
            return super.equals(obj);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) obj;
        if (this.f37734O != booleanArrayList.f37734O) {
            return false;
        }
        boolean[] zArr = booleanArrayList.f37735t;
        for (int i2 = 0; i2 < this.f37734O; i2++) {
            if (this.f37735t[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iT = 1;
        for (int i2 = 0; i2 < this.f37734O; i2++) {
            iT = (iT * 31) + Internal.t(this.f37735t[i2]);
        }
        return iT;
    }

    private BooleanArrayList(boolean[] zArr, int i2, boolean z2) {
        super(z2);
        this.f37735t = zArr;
        this.f37734O = i2;
    }

    private void J2(int i2) {
        if (i2 < 0 || i2 >= this.f37734O) {
            throw new IndexOutOfBoundsException(KN(i2));
        }
    }

    private String KN(int i2) {
        return "Index:" + i2 + ", Size:" + this.f37734O;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f37735t[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    public Internal.BooleanList mutableCopyWithCapacity(int i2) {
        if (i2 >= this.f37734O) {
            return new BooleanArrayList(Arrays.copyOf(this.f37735t, i2), this.f37734O, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f37734O;
    }

    private void O(int i2, boolean z2) {
        int i3;
        rl();
        if (i2 >= 0 && i2 <= (i3 = this.f37734O)) {
            boolean[] zArr = this.f37735t;
            if (i3 < zArr.length) {
                System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
            } else {
                boolean[] zArr2 = new boolean[((i3 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i2);
                System.arraycopy(this.f37735t, i2, zArr2, i2 + 1, this.f37734O - i2);
                this.f37735t = zArr2;
            }
            this.f37735t[i2] = z2;
            this.f37734O++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(KN(i2));
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i2) {
        return Boolean.valueOf(getBoolean(i2));
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        rl();
        Internal.n(collection);
        if (!(collection instanceof BooleanArrayList)) {
            return super.addAll(collection);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) collection;
        int i2 = booleanArrayList.f37734O;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f37734O;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i5 = i3 + i2;
            boolean[] zArr = this.f37735t;
            if (i5 > zArr.length) {
                this.f37735t = Arrays.copyOf(zArr, i5);
            }
            System.arraycopy(booleanArrayList.f37735t, 0, this.f37735t, this.f37734O, booleanArrayList.f37734O);
            this.f37734O = i5;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public void addBoolean(boolean z2) {
        rl();
        int i2 = this.f37734O;
        boolean[] zArr = this.f37735t;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.f37735t = zArr2;
        }
        boolean[] zArr3 = this.f37735t;
        int i3 = this.f37734O;
        this.f37734O = i3 + 1;
        zArr3[i3] = z2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public boolean getBoolean(int i2) {
        J2(i2);
        return this.f37735t[i2];
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: mUb, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i2, Boolean bool) {
        return Boolean.valueOf(setBoolean(i2, bool.booleanValue()));
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        addBoolean(bool.booleanValue());
        return true;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i2, int i3) {
        rl();
        if (i3 >= i2) {
            boolean[] zArr = this.f37735t;
            System.arraycopy(zArr, i3, zArr, i2, this.f37734O - i3);
            this.f37734O -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public boolean setBoolean(int i2, boolean z2) {
        rl();
        J2(i2);
        boolean[] zArr = this.f37735t;
        boolean z3 = zArr[i2];
        zArr[i2] = z2;
        return z3;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void add(int i2, Boolean bool) {
        O(i2, bool.booleanValue());
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i2) {
        rl();
        J2(i2);
        boolean[] zArr = this.f37735t;
        boolean z2 = zArr[i2];
        if (i2 < this.f37734O - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (r2 - i2) - 1);
        }
        this.f37734O--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z2);
    }
}
