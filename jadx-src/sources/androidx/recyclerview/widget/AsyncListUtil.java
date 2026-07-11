package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.ThreadUtil;
import androidx.recyclerview.widget.TileList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class AsyncListUtil<T> {
    int HI;
    final ThreadUtil.MainThreadCallback J2;
    final int[] KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final TileList f40984O;
    final ThreadUtil.BackgroundCallback Uo;
    int az;
    final SparseIntArray ck;
    boolean gh;
    final int[] mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Class f40985n;
    final ViewCallback nr;
    private int qie;
    final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final DataCallback f40986t;
    int ty;
    final int[] xMQ;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.AsyncListUtil$1, reason: invalid class name */
    class AnonymousClass1 implements ThreadUtil.MainThreadCallback<T> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AsyncListUtil f40987n;

        private void O() {
            for (int i2 = 0; i2 < this.f40987n.f40984O.O(); i2++) {
                AsyncListUtil asyncListUtil = this.f40987n;
                asyncListUtil.Uo.nr(asyncListUtil.f40984O.t(i2));
            }
            this.f40987n.f40984O.rl();
        }

        private boolean nr(int i2) {
            return i2 == this.f40987n.HI;
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void n(int i2, int i3) {
            if (!nr(i2)) {
                return;
            }
            TileList.Tile tileNr = this.f40987n.f40984O.nr(i3);
            if (tileNr == null) {
                Log.e("AsyncListUtil", "tile not found @" + i3);
                return;
            }
            this.f40987n.Uo.nr(tileNr);
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void rl(int i2, TileList.Tile tile) {
            if (!nr(i2)) {
                this.f40987n.Uo.nr(tile);
                return;
            }
            TileList.Tile tileN = this.f40987n.f40984O.n(tile);
            if (tileN != null) {
                Log.e("AsyncListUtil", "duplicate tile @" + tileN.rl);
                this.f40987n.Uo.nr(tileN);
            }
            int i3 = tile.rl + tile.f41236t;
            int i5 = 0;
            while (i5 < this.f40987n.ck.size()) {
                int iKeyAt = this.f40987n.ck.keyAt(i5);
                if (tile.rl <= iKeyAt && iKeyAt < i3) {
                    this.f40987n.ck.removeAt(i5);
                    this.f40987n.nr.nr(iKeyAt);
                } else {
                    i5++;
                }
            }
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void t(int i2, int i3) {
            if (!nr(i2)) {
                return;
            }
            AsyncListUtil asyncListUtil = this.f40987n;
            asyncListUtil.az = i3;
            asyncListUtil.nr.t();
            AsyncListUtil asyncListUtil2 = this.f40987n;
            asyncListUtil2.ty = asyncListUtil2.HI;
            O();
            AsyncListUtil asyncListUtil3 = this.f40987n;
            asyncListUtil3.gh = false;
            asyncListUtil3.n();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.AsyncListUtil$2, reason: invalid class name */
    class AnonymousClass2 implements ThreadUtil.BackgroundCallback<T> {
        private int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f40988O;
        final /* synthetic */ AsyncListUtil Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private TileList.Tile f40989n;
        private int nr;
        final SparseBooleanArray rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f40990t;

        private void gh(int i2, int i3, int i5, boolean z2) {
            int i7 = i2;
            while (i7 <= i3) {
                this.Uo.Uo.rl(z2 ? (i3 + i2) - i7 : i7, i5);
                i7 += this.Uo.rl;
            }
        }

        private void J2(TileList.Tile tile) {
            this.rl.put(tile.rl, true);
            this.Uo.J2.rl(this.f40990t, tile);
        }

        private int KN(int i2) {
            return i2 - (i2 % this.Uo.rl);
        }

        private TileList.Tile O() {
            TileList.Tile tile = this.f40989n;
            if (tile != null) {
                this.f40989n = tile.nr;
                return tile;
            }
            AsyncListUtil asyncListUtil = this.Uo;
            return new TileList.Tile(asyncListUtil.f40985n, asyncListUtil.rl);
        }

        private void Uo(int i2) {
            int iRl = this.Uo.f40986t.rl();
            while (this.rl.size() >= iRl) {
                int iKeyAt = this.rl.keyAt(0);
                SparseBooleanArray sparseBooleanArray = this.rl;
                int iKeyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                int i3 = this.f40988O - iKeyAt;
                int i5 = iKeyAt2 - this.J2;
                if (i3 > 0 && (i3 >= i5 || i2 == 2)) {
                    mUb(iKeyAt);
                } else {
                    if (i5 <= 0) {
                        return;
                    }
                    if (i3 >= i5 && i2 != 1) {
                        return;
                    } else {
                        mUb(iKeyAt2);
                    }
                }
            }
        }

        private void mUb(int i2) {
            this.rl.delete(i2);
            this.Uo.J2.n(this.f40990t, i2);
        }

        private boolean xMQ(int i2) {
            return this.rl.get(i2);
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void n(int i2, int i3, int i5, int i7, int i8) {
            if (i2 > i3) {
                return;
            }
            int iKN = KN(i2);
            int iKN2 = KN(i3);
            this.f40988O = KN(i5);
            int iKN3 = KN(i7);
            this.J2 = iKN3;
            if (i8 == 1) {
                gh(this.f40988O, iKN2, i8, true);
                gh(iKN2 + this.Uo.rl, this.J2, i8, false);
            } else {
                gh(iKN, iKN3, i8, false);
                gh(this.f40988O, iKN - this.Uo.rl, i8, true);
            }
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void nr(TileList.Tile tile) {
            this.Uo.f40986t.t(tile.f41235n, tile.f41236t);
            tile.nr = this.f40989n;
            this.f40989n = tile;
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void t(int i2) {
            this.f40990t = i2;
            this.rl.clear();
            int iNr = this.Uo.f40986t.nr();
            this.nr = iNr;
            this.Uo.J2.t(this.f40990t, iNr);
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void rl(int i2, int i3) {
            if (xMQ(i2)) {
                return;
            }
            TileList.Tile tileO = O();
            tileO.rl = i2;
            int iMin = Math.min(this.Uo.rl, this.nr - i2);
            tileO.f41236t = iMin;
            this.Uo.f40986t.n(tileO.f41235n, tileO.rl, iMin);
            Uo(i3);
            J2(tileO);
        }
    }

    public static abstract class DataCallback<T> {
        public abstract void n(Object[] objArr, int i2, int i3);

        public abstract int nr();

        public int rl() {
            return 10;
        }

        public void t(Object[] objArr, int i2) {
        }
    }

    public static abstract class ViewCallback {
        public void n(int[] iArr, int[] iArr2, int i2) {
            int i3 = iArr[1];
            int i5 = iArr[0];
            int i7 = (i3 - i5) + 1;
            int i8 = i7 / 2;
            iArr2[0] = i5 - (i2 == 1 ? i7 : i8);
            if (i2 != 2) {
                i7 = i8;
            }
            iArr2[1] = i3 + i7;
        }

        public abstract void nr(int i2);

        public abstract void rl(int[] iArr);

        public abstract void t();
    }

    void n() {
        int i2;
        this.nr.rl(this.KN);
        int[] iArr = this.KN;
        int i3 = iArr[0];
        int i5 = iArr[1];
        if (i3 > i5 || i3 < 0 || i5 >= this.az) {
            return;
        }
        if (this.gh) {
            int[] iArr2 = this.xMQ;
            if (i3 > iArr2[1] || (i2 = iArr2[0]) > i5) {
                this.qie = 0;
            } else if (i3 < i2) {
                this.qie = 1;
            } else if (i3 > i2) {
                this.qie = 2;
            }
        } else {
            this.qie = 0;
        }
        int[] iArr3 = this.xMQ;
        iArr3[0] = i3;
        iArr3[1] = i5;
        this.nr.n(iArr, this.mUb, this.qie);
        int[] iArr4 = this.mUb;
        iArr4[0] = Math.min(this.KN[0], Math.max(iArr4[0], 0));
        int[] iArr5 = this.mUb;
        iArr5[1] = Math.max(this.KN[1], Math.min(iArr5[1], this.az - 1));
        ThreadUtil.BackgroundCallback backgroundCallback = this.Uo;
        int[] iArr6 = this.KN;
        int i7 = iArr6[0];
        int i8 = iArr6[1];
        int[] iArr7 = this.mUb;
        backgroundCallback.n(i7, i8, iArr7[0], iArr7[1], this.qie);
    }
}
