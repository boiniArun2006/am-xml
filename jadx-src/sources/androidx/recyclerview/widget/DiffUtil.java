package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class DiffUtil {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Comparator f41035n = new Comparator<Diagonal>() { // from class: androidx.recyclerview.widget.DiffUtil.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compare(Diagonal diagonal, Diagonal diagonal2) {
            return diagonal.f41037n - diagonal2.f41037n;
        }
    };

    public static abstract class Callback {
        public abstract int O();

        public abstract boolean n(int i2, int i3);

        public abstract int nr();

        public abstract boolean rl(int i2, int i3);

        public Object t(int i2, int i3) {
            return null;
        }
    }

    static class CenteredArray {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int[] f41036n;
        private final int rl;

        int[] n() {
            return this.f41036n;
        }

        int rl(int i2) {
            return this.f41036n[i2 + this.rl];
        }

        void t(int i2, int i3) {
            this.f41036n[i2 + this.rl] = i3;
        }

        CenteredArray(int i2) {
            int[] iArr = new int[i2];
            this.f41036n = iArr;
            this.rl = iArr.length / 2;
        }
    }

    static class Diagonal {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f41037n;
        public final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f41038t;

        int n() {
            return this.f41037n + this.f41038t;
        }

        int rl() {
            return this.rl + this.f41038t;
        }

        Diagonal(int i2, int i3, int i5) {
            this.f41037n = i2;
            this.rl = i3;
            this.f41038t = i5;
        }
    }

    public static class DiffResult {
        private final int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final int f41039O;
        private final boolean Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f41040n;
        private final Callback nr;
        private final int[] rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int[] f41041t;

        private void J2() {
            int iN = 0;
            for (Diagonal diagonal : this.f41040n) {
                while (iN < diagonal.f41037n) {
                    if (this.rl[iN] == 0) {
                        nr(iN);
                    }
                    iN++;
                }
                iN = diagonal.n();
            }
        }

        private void O() {
            for (Diagonal diagonal : this.f41040n) {
                for (int i2 = 0; i2 < diagonal.f41038t; i2++) {
                    int i3 = diagonal.f41037n + i2;
                    int i5 = diagonal.rl + i2;
                    int i7 = this.nr.n(i3, i5) ? 1 : 2;
                    this.rl[i3] = (i5 << 4) | i7;
                    this.f41041t[i5] = (i3 << 4) | i7;
                }
            }
            if (this.Uo) {
                J2();
            }
        }

        private void n() {
            Diagonal diagonal = this.f41040n.isEmpty() ? null : (Diagonal) this.f41040n.get(0);
            if (diagonal == null || diagonal.f41037n != 0 || diagonal.rl != 0) {
                this.f41040n.add(0, new Diagonal(0, 0, 0));
            }
            this.f41040n.add(new Diagonal(this.f41039O, this.J2, 0));
        }

        private void nr(int i2) {
            int size = this.f41040n.size();
            int iRl = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Diagonal diagonal = (Diagonal) this.f41040n.get(i3);
                while (iRl < diagonal.rl) {
                    if (this.f41041t[iRl] == 0 && this.nr.rl(i2, iRl)) {
                        int i5 = this.nr.n(i2, iRl) ? 8 : 4;
                        this.rl[i2] = (iRl << 4) | i5;
                        this.f41041t[iRl] = (i2 << 4) | i5;
                        return;
                    }
                    iRl++;
                }
                iRl = diagonal.rl();
            }
        }

        public void rl(ListUpdateCallback listUpdateCallback) {
            int i2;
            BatchingListUpdateCallback batchingListUpdateCallback = listUpdateCallback instanceof BatchingListUpdateCallback ? (BatchingListUpdateCallback) listUpdateCallback : new BatchingListUpdateCallback(listUpdateCallback);
            int i3 = this.f41039O;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i5 = this.f41039O;
            int i7 = this.J2;
            for (int size = this.f41040n.size() - 1; size >= 0; size--) {
                Diagonal diagonal = (Diagonal) this.f41040n.get(size);
                int iN = diagonal.n();
                int iRl = diagonal.rl();
                while (true) {
                    if (i5 <= iN) {
                        break;
                    }
                    i5--;
                    int i8 = this.rl[i5];
                    if ((i8 & 12) != 0) {
                        int i9 = i8 >> 4;
                        PostponedUpdate postponedUpdateUo = Uo(arrayDeque, i9, false);
                        if (postponedUpdateUo != null) {
                            int i10 = (i3 - postponedUpdateUo.rl) - 1;
                            batchingListUpdateCallback.nr(i5, i10);
                            if ((i8 & 4) != 0) {
                                batchingListUpdateCallback.t(i10, 1, this.nr.t(i5, i9));
                            }
                        } else {
                            arrayDeque.add(new PostponedUpdate(i5, (i3 - i5) - 1, true));
                        }
                    } else {
                        batchingListUpdateCallback.rl(i5, 1);
                        i3--;
                    }
                }
                while (i7 > iRl) {
                    i7--;
                    int i11 = this.f41041t[i7];
                    if ((i11 & 12) != 0) {
                        int i12 = i11 >> 4;
                        PostponedUpdate postponedUpdateUo2 = Uo(arrayDeque, i12, true);
                        if (postponedUpdateUo2 == null) {
                            arrayDeque.add(new PostponedUpdate(i7, i3 - i5, false));
                        } else {
                            batchingListUpdateCallback.nr((i3 - postponedUpdateUo2.rl) - 1, i5);
                            if ((i11 & 4) != 0) {
                                batchingListUpdateCallback.t(i5, 1, this.nr.t(i12, i7));
                            }
                        }
                    } else {
                        batchingListUpdateCallback.n(i5, 1);
                        i3++;
                    }
                }
                int i13 = diagonal.f41037n;
                int i14 = diagonal.rl;
                for (i2 = 0; i2 < diagonal.f41038t; i2++) {
                    if ((this.rl[i13] & 15) == 2) {
                        batchingListUpdateCallback.t(i13, 1, this.nr.t(i13, i14));
                    }
                    i13++;
                    i14++;
                }
                i5 = diagonal.f41037n;
                i7 = diagonal.rl;
            }
            batchingListUpdateCallback.O();
        }

        public void t(RecyclerView.Adapter adapter) {
            rl(new AdapterListUpdateCallback(adapter));
        }

        DiffResult(Callback callback, List list, int[] iArr, int[] iArr2, boolean z2) {
            this.f41040n = list;
            this.rl = iArr;
            this.f41041t = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.nr = callback;
            this.f41039O = callback.O();
            this.J2 = callback.nr();
            this.Uo = z2;
            n();
            O();
        }

        private static PostponedUpdate Uo(Collection collection, int i2, boolean z2) {
            PostponedUpdate postponedUpdate;
            Iterator it = collection.iterator();
            while (true) {
                if (it.hasNext()) {
                    postponedUpdate = (PostponedUpdate) it.next();
                    if (postponedUpdate.f41042n == i2 && postponedUpdate.f41043t == z2) {
                        it.remove();
                        break;
                    }
                } else {
                    postponedUpdate = null;
                    break;
                }
            }
            while (it.hasNext()) {
                PostponedUpdate postponedUpdate2 = (PostponedUpdate) it.next();
                if (z2) {
                    postponedUpdate2.rl--;
                } else {
                    postponedUpdate2.rl++;
                }
            }
            return postponedUpdate;
        }
    }

    public static abstract class ItemCallback<T> {
        public abstract boolean n(Object obj, Object obj2);

        public abstract boolean rl(Object obj, Object obj2);

        public Object t(Object obj, Object obj2) {
            return null;
        }
    }

    static class Range {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f41044n;
        int nr;
        int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f41045t;

        public Range() {
        }

        public Range(int i2, int i3, int i5, int i7) {
            this.f41044n = i2;
            this.rl = i3;
            this.f41045t = i5;
            this.nr = i7;
        }

        int n() {
            return this.nr - this.f41045t;
        }

        int rl() {
            return this.rl - this.f41044n;
        }
    }

    static class Snake {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public boolean f41046O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f41047n;
        public int nr;
        public int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f41048t;

        int n() {
            return Math.min(this.f41048t - this.f41047n, this.nr - this.rl);
        }

        boolean rl() {
            return this.nr - this.rl != this.f41048t - this.f41047n;
        }

        boolean t() {
            return this.nr - this.rl > this.f41048t - this.f41047n;
        }

        Snake() {
        }

        Diagonal nr() {
            if (rl()) {
                if (this.f41046O) {
                    return new Diagonal(this.f41047n, this.rl, n());
                }
                if (t()) {
                    return new Diagonal(this.f41047n, this.rl + 1, n());
                }
                return new Diagonal(this.f41047n + 1, this.rl, n());
            }
            int i2 = this.f41047n;
            return new Diagonal(i2, this.rl, this.f41048t - i2);
        }
    }

    public static DiffResult rl(Callback callback) {
        return t(callback, true);
    }

    private static class PostponedUpdate {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f41042n;
        int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f41043t;

        PostponedUpdate(int i2, int i3, boolean z2) {
            this.f41042n = i2;
            this.rl = i3;
            this.f41043t = z2;
        }
    }

    private static Snake O(Range range, Callback callback, CenteredArray centeredArray, CenteredArray centeredArray2) {
        if (range.rl() >= 1 && range.n() >= 1) {
            int iRl = ((range.rl() + range.n()) + 1) / 2;
            centeredArray.t(1, range.f41044n);
            centeredArray2.t(1, range.rl);
            for (int i2 = 0; i2 < iRl; i2++) {
                Snake snakeNr = nr(range, callback, centeredArray, centeredArray2, i2);
                if (snakeNr != null) {
                    return snakeNr;
                }
                Snake snakeN = n(range, callback, centeredArray, centeredArray2, i2);
                if (snakeN != null) {
                    return snakeN;
                }
            }
        }
        return null;
    }

    private static Snake n(Range range, Callback callback, CenteredArray centeredArray, CenteredArray centeredArray2, int i2) {
        boolean z2;
        int iRl;
        int i3;
        int i5;
        int i7;
        if ((range.rl() - range.n()) % 2 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int iRl2 = range.rl() - range.n();
        int i8 = -i2;
        for (int i9 = i8; i9 <= i2; i9 += 2) {
            if (i9 != i8 && (i9 == i2 || centeredArray2.rl(i9 + 1) >= centeredArray2.rl(i9 - 1))) {
                iRl = centeredArray2.rl(i9 - 1);
                i3 = iRl - 1;
            } else {
                iRl = centeredArray2.rl(i9 + 1);
                i3 = iRl;
            }
            int i10 = range.nr - ((range.rl - i3) - i9);
            if (i2 != 0 && i3 == iRl) {
                i5 = i10 + 1;
            } else {
                i5 = i10;
            }
            while (i3 > range.f41044n && i10 > range.f41045t && callback.rl(i3 - 1, i10 - 1)) {
                i3--;
                i10--;
            }
            centeredArray2.t(i9, i3);
            if (z2 && (i7 = iRl2 - i9) >= i8 && i7 <= i2 && centeredArray.rl(i7) >= i3) {
                Snake snake = new Snake();
                snake.f41047n = i3;
                snake.rl = i10;
                snake.f41048t = iRl;
                snake.nr = i5;
                snake.f41046O = true;
                return snake;
            }
        }
        return null;
    }

    private static Snake nr(Range range, Callback callback, CenteredArray centeredArray, CenteredArray centeredArray2, int i2) {
        int iRl;
        int i3;
        int i5;
        boolean z2 = true;
        if (Math.abs(range.rl() - range.n()) % 2 != 1) {
            z2 = false;
        }
        int iRl2 = range.rl() - range.n();
        int i7 = -i2;
        for (int i8 = i7; i8 <= i2; i8 += 2) {
            if (i8 != i7 && (i8 == i2 || centeredArray.rl(i8 + 1) <= centeredArray.rl(i8 - 1))) {
                iRl = centeredArray.rl(i8 - 1);
                i3 = iRl + 1;
            } else {
                iRl = centeredArray.rl(i8 + 1);
                i3 = iRl;
            }
            int i9 = (range.f41045t + (i3 - range.f41044n)) - i8;
            int i10 = (i2 != 0 && i3 == iRl) ? i9 - 1 : i9;
            while (i3 < range.rl && i9 < range.nr && callback.rl(i3, i9)) {
                i3++;
                i9++;
            }
            centeredArray.t(i8, i3);
            if (z2 && (i5 = iRl2 - i8) >= i7 + 1 && i5 <= i2 - 1 && centeredArray2.rl(i5) <= i3) {
                Snake snake = new Snake();
                snake.f41047n = iRl;
                snake.rl = i10;
                snake.f41048t = i3;
                snake.nr = i9;
                snake.f41046O = false;
                return snake;
            }
        }
        return null;
    }

    public static DiffResult t(Callback callback, boolean z2) {
        Range range;
        int iO = callback.O();
        int iNr = callback.nr();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new Range(0, iO, 0, iNr));
        int i2 = ((((iO + iNr) + 1) / 2) * 2) + 1;
        CenteredArray centeredArray = new CenteredArray(i2);
        CenteredArray centeredArray2 = new CenteredArray(i2);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            Range range2 = (Range) arrayList2.remove(arrayList2.size() - 1);
            Snake snakeO = O(range2, callback, centeredArray, centeredArray2);
            if (snakeO != null) {
                if (snakeO.n() > 0) {
                    arrayList.add(snakeO.nr());
                }
                if (arrayList3.isEmpty()) {
                    range = new Range();
                } else {
                    range = (Range) arrayList3.remove(arrayList3.size() - 1);
                }
                range.f41044n = range2.f41044n;
                range.f41045t = range2.f41045t;
                range.rl = snakeO.f41047n;
                range.nr = snakeO.rl;
                arrayList2.add(range);
                range2.rl = range2.rl;
                range2.nr = range2.nr;
                range2.f41044n = snakeO.f41048t;
                range2.f41045t = snakeO.nr;
                arrayList2.add(range2);
            } else {
                arrayList3.add(range2);
            }
        }
        Collections.sort(arrayList, f41035n);
        return new DiffResult(callback, arrayList, centeredArray.n(), centeredArray2.n(), z2);
    }
}
