package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class q0 extends c implements f1, RandomAccess, n2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q0 f56640d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f56641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56642c;

    public q0() {
        this.f56641b = new float[10];
        this.f56642c = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        float fFloatValue = ((Float) obj).floatValue();
        c();
        if (i2 < 0 || i2 > (i3 = this.f56642c)) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i2, ", Size:");
            sbA.append(this.f56642c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        float[] fArr = this.f56641b;
        if (i3 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
        } else {
            float[] fArr2 = new float[((i3 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.f56641b, i2, fArr2, i2 + 1, this.f56642c - i2);
            this.f56641b = fArr2;
        }
        this.f56641b[i2] = fFloatValue;
        this.f56642c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return super.equals(obj);
        }
        q0 q0Var = (q0) obj;
        if (this.f56642c != q0Var.f56642c) {
            return false;
        }
        float[] fArr = q0Var.f56641b;
        for (int i2 = 0; i2 < this.f56642c; i2++) {
            if (Float.floatToIntBits(this.f56641b[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i2 = 0; i2 < this.f56642c; i2++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f56641b[i2]);
        }
        return iFloatToIntBits;
    }

    static {
        q0 q0Var = new q0(new float[0], 0);
        f56640d = q0Var;
        q0Var.f56537a = false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final q0 b(int i2) {
        if (i2 >= this.f56642c) {
            return new q0(Arrays.copyOf(this.f56641b, i2), this.f56642c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        if (i2 >= 0 && i2 < this.f56642c) {
            return Float.valueOf(this.f56641b[i2]);
        }
        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i2, ", Size:");
        sbA.append(this.f56642c);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i2 = this.f56642c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f56641b[i3] == fFloatValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        c();
        if (i2 < 0 || i2 >= this.f56642c) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i2, ", Size:");
            sbA.append(this.f56642c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        float[] fArr = this.f56641b;
        float f3 = fArr[i2];
        fArr[i2] = fFloatValue;
        return Float.valueOf(f3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f56642c;
    }

    public final void a(float f3) {
        c();
        int i2 = this.f56642c;
        float[] fArr = this.f56641b;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.f56641b = fArr2;
        }
        float[] fArr3 = this.f56641b;
        int i3 = this.f56642c;
        this.f56642c = i3 + 1;
        fArr3[i3] = f3;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = l1.f56612a;
        collection.getClass();
        if (!(collection instanceof q0)) {
            return super.addAll(collection);
        }
        q0 q0Var = (q0) collection;
        int i2 = q0Var.f56642c;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f56642c;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i5 = i3 + i2;
            float[] fArr = this.f56641b;
            if (i5 > fArr.length) {
                this.f56641b = Arrays.copyOf(fArr, i5);
            }
            System.arraycopy(q0Var.f56641b, 0, this.f56641b, this.f56642c, q0Var.f56642c);
            this.f56642c = i5;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        int i3;
        c();
        if (i2 >= 0 && i2 < (i3 = this.f56642c)) {
            float[] fArr = this.f56641b;
            float f3 = fArr[i2];
            if (i2 < i3 - 1) {
                System.arraycopy(fArr, i2 + 1, fArr, i2, (i3 - i2) - 1);
            }
            this.f56642c--;
            ((AbstractList) this).modCount++;
            return Float.valueOf(f3);
        }
        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i2, ", Size:");
        sbA.append(this.f56642c);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        c();
        if (i3 >= i2) {
            float[] fArr = this.f56641b;
            System.arraycopy(fArr, i3, fArr, i2, this.f56642c - i3);
            this.f56642c -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public q0(float[] fArr, int i2) {
        this.f56641b = fArr;
        this.f56642c = i2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a(((Float) obj).floatValue());
        return true;
    }
}
