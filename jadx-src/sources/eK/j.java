package eK;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j {
    public static final C0844j nr = new C0844j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f63601n;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float[] f63602t;

    /* JADX INFO: renamed from: eK.j$j, reason: collision with other inner class name */
    public static final class C0844j {
        public /* synthetic */ C0844j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
        public final int rl(int[] iArr) {
            if (iArr.length == 0) {
                throw new UnsupportedOperationException("Empty array can't be reduced.");
            }
            int i2 = iArr[0];
            ?? it = new IntRange(1, ArraysKt.getLastIndex(iArr)).iterator();
            while (it.hasNext()) {
                i2 *= iArr[it.nextInt()];
            }
            return i2;
        }

        private C0844j() {
        }
    }

    public j(int[] shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f63601n = shape;
        int iRl = nr.rl(shape);
        this.rl = iRl;
        this.f63602t = new float[iRl];
    }

    public final float[] n() {
        return this.f63602t;
    }

    public final void nr(int[] shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f63601n = shape;
        int iRl = nr.rl(shape);
        float[] fArr = new float[iRl];
        System.arraycopy(this.f63602t, 0, fArr, 0, Math.min(this.rl, iRl));
        this.f63602t = fArr;
        this.rl = iRl;
    }

    public final int rl(int i2) {
        return this.f63601n[i2];
    }

    public final int t() {
        return this.f63601n.length;
    }
}
