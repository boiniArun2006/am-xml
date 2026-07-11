package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class DoubleArrayList extends AbstractProtobufList<Double> implements Internal.DoubleList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final DoubleArrayList J2 = new DoubleArrayList(new double[0], 0, false);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f37902O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private double[] f37903t;

    DoubleArrayList() {
        this(new double[10], 0, true);
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoubleArrayList)) {
            return super.equals(obj);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) obj;
        if (this.f37902O != doubleArrayList.f37902O) {
            return false;
        }
        double[] dArr = doubleArrayList.f37903t;
        for (int i2 = 0; i2 < this.f37902O; i2++) {
            if (Double.doubleToLongBits(this.f37903t[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iJ2 = 1;
        for (int i2 = 0; i2 < this.f37902O; i2++) {
            iJ2 = (iJ2 * 31) + Internal.J2(Double.doubleToLongBits(this.f37903t[i2]));
        }
        return iJ2;
    }

    private DoubleArrayList(double[] dArr, int i2, boolean z2) {
        super(z2);
        this.f37903t = dArr;
        this.f37902O = i2;
    }

    private void J2(int i2) {
        if (i2 < 0 || i2 >= this.f37902O) {
            throw new IndexOutOfBoundsException(KN(i2));
        }
    }

    private String KN(int i2) {
        return "Index:" + i2 + ", Size:" + this.f37902O;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f37903t[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    public Internal.DoubleList mutableCopyWithCapacity(int i2) {
        if (i2 >= this.f37902O) {
            return new DoubleArrayList(Arrays.copyOf(this.f37903t, i2), this.f37902O, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f37902O;
    }

    private void O(int i2, double d2) {
        int i3;
        rl();
        if (i2 >= 0 && i2 <= (i3 = this.f37902O)) {
            double[] dArr = this.f37903t;
            if (i3 < dArr.length) {
                System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
            } else {
                double[] dArr2 = new double[((i3 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i2);
                System.arraycopy(this.f37903t, i2, dArr2, i2 + 1, this.f37902O - i2);
                this.f37903t = dArr2;
            }
            this.f37903t[i2] = d2;
            this.f37902O++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(KN(i2));
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
    public Double get(int i2) {
        return Double.valueOf(getDouble(i2));
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        rl();
        Internal.n(collection);
        if (!(collection instanceof DoubleArrayList)) {
            return super.addAll(collection);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) collection;
        int i2 = doubleArrayList.f37902O;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f37902O;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i5 = i3 + i2;
            double[] dArr = this.f37903t;
            if (i5 > dArr.length) {
                this.f37903t = Arrays.copyOf(dArr, i5);
            }
            System.arraycopy(doubleArrayList.f37903t, 0, this.f37903t, this.f37902O, doubleArrayList.f37902O);
            this.f37902O = i5;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public void addDouble(double d2) {
        rl();
        int i2 = this.f37902O;
        double[] dArr = this.f37903t;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.f37903t = dArr2;
        }
        double[] dArr3 = this.f37903t;
        int i3 = this.f37902O;
        this.f37902O = i3 + 1;
        dArr3[i3] = d2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public double getDouble(int i2) {
        J2(i2);
        return this.f37903t[i2];
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: mUb, reason: merged with bridge method [inline-methods] */
    public Double set(int i2, Double d2) {
        return Double.valueOf(setDouble(i2, d2.doubleValue()));
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d2) {
        addDouble(d2.doubleValue());
        return true;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i2, int i3) {
        rl();
        if (i3 >= i2) {
            double[] dArr = this.f37903t;
            System.arraycopy(dArr, i3, dArr, i2, this.f37902O - i3);
            this.f37902O -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public double setDouble(int i2, double d2) {
        rl();
        J2(i2);
        double[] dArr = this.f37903t;
        double d4 = dArr[i2];
        dArr[i2] = d2;
        return d4;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void add(int i2, Double d2) {
        O(i2, d2.doubleValue());
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
    public Double remove(int i2) {
        rl();
        J2(i2);
        double[] dArr = this.f37903t;
        double d2 = dArr[i2];
        if (i2 < this.f37902O - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (r3 - i2) - 1);
        }
        this.f37902O--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d2);
    }
}
