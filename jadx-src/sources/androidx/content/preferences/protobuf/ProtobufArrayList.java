package androidx.content.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class ProtobufArrayList<E> extends AbstractProtobufList<E> implements RandomAccess {
    private static final ProtobufArrayList J2 = new ProtobufArrayList(new Object[0], 0, false);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f38113O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Object[] f38114t;

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        rl();
        int i2 = this.f38113O;
        Object[] objArr = this.f38114t;
        if (i2 == objArr.length) {
            this.f38114t = Arrays.copyOf(objArr, ((i2 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f38114t;
        int i3 = this.f38113O;
        this.f38113O = i3 + 1;
        objArr2[i3] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    private String J2(int i2) {
        return "Index:" + i2 + ", Size:" + this.f38113O;
    }

    private void O(int i2) {
        if (i2 < 0 || i2 >= this.f38113O) {
            throw new IndexOutOfBoundsException(J2(i2));
        }
    }

    public static ProtobufArrayList nr() {
        return J2;
    }

    private static Object[] t(int i2) {
        return new Object[i2];
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
    public ProtobufArrayList mutableCopyWithCapacity(int i2) {
        if (i2 >= this.f38113O) {
            return new ProtobufArrayList(Arrays.copyOf(this.f38114t, i2), this.f38113O, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f38113O;
    }

    private ProtobufArrayList(Object[] objArr, int i2, boolean z2) {
        super(z2);
        this.f38114t = objArr;
        this.f38113O = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i2) {
        O(i2);
        return this.f38114t[i2];
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Object remove(int i2) {
        rl();
        O(i2);
        Object[] objArr = this.f38114t;
        Object obj = objArr[i2];
        if (i2 < this.f38113O - 1) {
            System.arraycopy(objArr, i2 + 1, objArr, i2, (r2 - i2) - 1);
        }
        this.f38113O--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Object set(int i2, Object obj) {
        rl();
        O(i2);
        Object[] objArr = this.f38114t;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // androidx.content.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i2, Object obj) {
        int i3;
        rl();
        if (i2 >= 0 && i2 <= (i3 = this.f38113O)) {
            Object[] objArr = this.f38114t;
            if (i3 < objArr.length) {
                System.arraycopy(objArr, i2, objArr, i2 + 1, i3 - i2);
            } else {
                Object[] objArrT = t(((i3 * 3) / 2) + 1);
                System.arraycopy(this.f38114t, 0, objArrT, 0, i2);
                System.arraycopy(this.f38114t, i2, objArrT, i2 + 1, this.f38113O - i2);
                this.f38114t = objArrT;
            }
            this.f38114t[i2] = obj;
            this.f38113O++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(J2(i2));
    }
}
