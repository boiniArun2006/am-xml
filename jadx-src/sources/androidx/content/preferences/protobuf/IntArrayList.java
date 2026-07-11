package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class IntArrayList extends AbstractProtobufList<Integer> implements Internal.IntList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final IntArrayList J2 = new IntArrayList(new int[0], 0, false);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f38017O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int[] f38018t;

    IntArrayList() {
        this(new int[10], 0, true);
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntArrayList)) {
            return super.equals(obj);
        }
        IntArrayList intArrayList = (IntArrayList) obj;
        if (this.f38017O != intArrayList.f38017O) {
            return false;
        }
        int[] iArr = intArrayList.f38018t;
        for (int i2 = 0; i2 < this.f38017O; i2++) {
            if (this.f38018t[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f38017O; i3++) {
            i2 = (i2 * 31) + this.f38018t[i3];
        }
        return i2;
    }

    private IntArrayList(int[] iArr, int i2, boolean z2) {
        super(z2);
        this.f38018t = iArr;
        this.f38017O = i2;
    }

    public static IntArrayList J2() {
        return J2;
    }

    private void Uo(int i2) {
        if (i2 < 0 || i2 >= this.f38017O) {
            throw new IndexOutOfBoundsException(xMQ(i2));
        }
    }

    private String xMQ(int i2) {
        return "Index:" + i2 + ", Size:" + this.f38017O;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f38018t[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    public Internal.IntList mutableCopyWithCapacity(int i2) {
        if (i2 >= this.f38017O) {
            return new IntArrayList(Arrays.copyOf(this.f38018t, i2), this.f38017O, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f38017O;
    }

    private void O(int i2, int i3) {
        int i5;
        rl();
        if (i2 >= 0 && i2 <= (i5 = this.f38017O)) {
            int[] iArr = this.f38018t;
            if (i5 < iArr.length) {
                System.arraycopy(iArr, i2, iArr, i2 + 1, i5 - i2);
            } else {
                int[] iArr2 = new int[((i5 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i2);
                System.arraycopy(this.f38018t, i2, iArr2, i2 + 1, this.f38017O - i2);
                this.f38018t = iArr2;
            }
            this.f38018t[i2] = i3;
            this.f38017O++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(xMQ(i2));
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
    public Integer get(int i2) {
        return Integer.valueOf(getInt(i2));
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        rl();
        Internal.n(collection);
        if (!(collection instanceof IntArrayList)) {
            return super.addAll(collection);
        }
        IntArrayList intArrayList = (IntArrayList) collection;
        int i2 = intArrayList.f38017O;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f38017O;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i5 = i3 + i2;
            int[] iArr = this.f38018t;
            if (i5 > iArr.length) {
                this.f38018t = Arrays.copyOf(iArr, i5);
            }
            System.arraycopy(intArrayList.f38018t, 0, this.f38018t, this.f38017O, intArrayList.f38017O);
            this.f38017O = i5;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public void addInt(int i2) {
        rl();
        int i3 = this.f38017O;
        int[] iArr = this.f38018t;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f38018t = iArr2;
        }
        int[] iArr3 = this.f38018t;
        int i5 = this.f38017O;
        this.f38017O = i5 + 1;
        iArr3[i5] = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.IntList
    public int getInt(int i2) {
        Uo(i2);
        return this.f38018t[i2];
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
    public Integer set(int i2, Integer num) {
        return Integer.valueOf(setInt(i2, num.intValue()));
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: mUb, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i2) {
        rl();
        Uo(i2);
        int[] iArr = this.f38018t;
        int i3 = iArr[i2];
        if (i2 < this.f38017O - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (r2 - i2) - 1);
        }
        this.f38017O--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i2, int i3) {
        rl();
        if (i3 >= i2) {
            int[] iArr = this.f38018t;
            System.arraycopy(iArr, i3, iArr, i2, this.f38017O - i3);
            this.f38017O -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int setInt(int i2, int i3) {
        rl();
        Uo(i2);
        int[] iArr = this.f38018t;
        int i5 = iArr[i2];
        iArr[i2] = i3;
        return i5;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void add(int i2, Integer num) {
        O(i2, num.intValue());
    }
}
