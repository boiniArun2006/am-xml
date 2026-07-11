package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class FloatArrayList extends AbstractProtobufList<Float> implements Internal.FloatList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final FloatArrayList J2 = new FloatArrayList(new float[0], 0, false);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f37992O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float[] f37993t;

    FloatArrayList() {
        this(new float[10], 0, true);
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FloatArrayList)) {
            return super.equals(obj);
        }
        FloatArrayList floatArrayList = (FloatArrayList) obj;
        if (this.f37992O != floatArrayList.f37992O) {
            return false;
        }
        float[] fArr = floatArrayList.f37993t;
        for (int i2 = 0; i2 < this.f37992O; i2++) {
            if (Float.floatToIntBits(this.f37993t[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i2 = 0; i2 < this.f37992O; i2++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f37993t[i2]);
        }
        return iFloatToIntBits;
    }

    private FloatArrayList(float[] fArr, int i2, boolean z2) {
        super(z2);
        this.f37993t = fArr;
        this.f37992O = i2;
    }

    private void J2(int i2) {
        if (i2 < 0 || i2 >= this.f37992O) {
            throw new IndexOutOfBoundsException(KN(i2));
        }
    }

    private String KN(int i2) {
        return "Index:" + i2 + ", Size:" + this.f37992O;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f37993t[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    public Internal.FloatList mutableCopyWithCapacity(int i2) {
        if (i2 >= this.f37992O) {
            return new FloatArrayList(Arrays.copyOf(this.f37993t, i2), this.f37992O, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f37992O;
    }

    private void O(int i2, float f3) {
        int i3;
        rl();
        if (i2 >= 0 && i2 <= (i3 = this.f37992O)) {
            float[] fArr = this.f37993t;
            if (i3 < fArr.length) {
                System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
            } else {
                float[] fArr2 = new float[((i3 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i2);
                System.arraycopy(this.f37993t, i2, fArr2, i2 + 1, this.f37992O - i2);
                this.f37993t = fArr2;
            }
            this.f37993t[i2] = f3;
            this.f37992O++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(KN(i2));
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
    public Float get(int i2) {
        return Float.valueOf(getFloat(i2));
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        rl();
        Internal.n(collection);
        if (!(collection instanceof FloatArrayList)) {
            return super.addAll(collection);
        }
        FloatArrayList floatArrayList = (FloatArrayList) collection;
        int i2 = floatArrayList.f37992O;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f37992O;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i5 = i3 + i2;
            float[] fArr = this.f37993t;
            if (i5 > fArr.length) {
                this.f37993t = Arrays.copyOf(fArr, i5);
            }
            System.arraycopy(floatArrayList.f37993t, 0, this.f37993t, this.f37992O, floatArrayList.f37992O);
            this.f37992O = i5;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public void addFloat(float f3) {
        rl();
        int i2 = this.f37992O;
        float[] fArr = this.f37993t;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.f37993t = fArr2;
        }
        float[] fArr3 = this.f37993t;
        int i3 = this.f37992O;
        this.f37992O = i3 + 1;
        fArr3[i3] = f3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public float getFloat(int i2) {
        J2(i2);
        return this.f37993t[i2];
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: mUb, reason: merged with bridge method [inline-methods] */
    public Float set(int i2, Float f3) {
        return Float.valueOf(setFloat(i2, f3.floatValue()));
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f3) {
        addFloat(f3.floatValue());
        return true;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i2, int i3) {
        rl();
        if (i3 >= i2) {
            float[] fArr = this.f37993t;
            System.arraycopy(fArr, i3, fArr, i2, this.f37992O - i3);
            this.f37992O -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public float setFloat(int i2, float f3) {
        rl();
        J2(i2);
        float[] fArr = this.f37993t;
        float f4 = fArr[i2];
        fArr[i2] = f3;
        return f4;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void add(int i2, Float f3) {
        O(i2, f3.floatValue());
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
    public Float remove(int i2) {
        rl();
        J2(i2);
        float[] fArr = this.f37993t;
        float f3 = fArr[i2];
        if (i2 < this.f37992O - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (r2 - i2) - 1);
        }
        this.f37992O--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f3);
    }
}
