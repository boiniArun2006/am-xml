package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.RestrictTo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.ScrollVectorProvider {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private SavedState f41205N;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    OrientationHelper f41206S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f41207T;
    private final LayoutState ViF;
    private int WPU;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private boolean f41208X;
    OrientationHelper XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    Span[] f41209Z;
    private int aYN;
    private int[] bzg;
    private int nHg;
    private BitSet te;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f41212o = -1;
    boolean nY = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f41211g = false;
    int iF = -1;
    int fD = Integer.MIN_VALUE;
    LazySpanLookup E2 = new LazySpanLookup();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f41210e = 2;
    private final Rect s7N = new Rect();
    private final AnchorInfo wTp = new AnchorInfo();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f41213v = false;
    private boolean rV9 = true;
    private final Runnable Xw = new Runnable() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.1
        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.WH();
        }
    };

    class AnchorInfo {
        int[] J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        boolean f41215O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f41216n;
        boolean nr;
        int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f41217t;

        void nr(Span[] spanArr) {
            int length = spanArr.length;
            int[] iArr = this.J2;
            if (iArr == null || iArr.length < length) {
                this.J2 = new int[StaggeredGridLayoutManager.this.f41209Z.length];
            }
            for (int i2 = 0; i2 < length; i2++) {
                this.J2[i2] = spanArr[i2].ck(Integer.MIN_VALUE);
            }
        }

        void t() {
            this.f41216n = -1;
            this.rl = Integer.MIN_VALUE;
            this.f41217t = false;
            this.nr = false;
            this.f41215O = false;
            int[] iArr = this.J2;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        AnchorInfo() {
            t();
        }

        void n() {
            this.rl = this.f41217t ? StaggeredGridLayoutManager.this.XQ.xMQ() : StaggeredGridLayoutManager.this.XQ.az();
        }

        void rl(int i2) {
            if (this.f41217t) {
                this.rl = StaggeredGridLayoutManager.this.XQ.xMQ() - i2;
            } else {
                this.rl = StaggeredGridLayoutManager.this.XQ.az() + i2;
            }
        }
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {
        boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Span f41218O;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
        }

        public boolean J2() {
            return this.J2;
        }

        public final int O() {
            Span span = this.f41218O;
            if (span == null) {
                return -1;
            }
            return span.f41231O;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    static class LazySpanLookup {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int[] f41219n;
        List rl;

        static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new Parcelable.Creator<FullSpanItem>() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.1
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
                public FullSpanItem[] newArray(int i2) {
                    return new FullSpanItem[i2];
                }
            };
            boolean J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            int[] f41220O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f41221n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f41222t;

            FullSpanItem(Parcel parcel) {
                this.f41221n = parcel.readInt();
                this.f41222t = parcel.readInt();
                this.J2 = parcel.readInt() == 1;
                int i2 = parcel.readInt();
                if (i2 > 0) {
                    int[] iArr = new int[i2];
                    this.f41220O = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            int n(int i2) {
                int[] iArr = this.f41220O;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i2];
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f41221n + ", mGapDir=" + this.f41222t + ", mHasUnwantedGapAfter=" + this.J2 + ", mGapPerSpan=" + Arrays.toString(this.f41220O) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i2) {
                parcel.writeInt(this.f41221n);
                parcel.writeInt(this.f41222t);
                parcel.writeInt(this.J2 ? 1 : 0);
                int[] iArr = this.f41220O;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f41220O);
                }
            }

            FullSpanItem() {
            }
        }

        private void az(int i2, int i3) {
            List list = this.rl;
            if (list == null) {
                return;
            }
            int i5 = i2 + i3;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.rl.get(size);
                int i7 = fullSpanItem.f41221n;
                if (i7 >= i2) {
                    if (i7 < i5) {
                        this.rl.remove(size);
                    } else {
                        fullSpanItem.f41221n = i7 - i3;
                    }
                }
            }
        }

        private void qie(int i2, int i3) {
            List list = this.rl;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.rl.get(size);
                int i5 = fullSpanItem.f41221n;
                if (i5 >= i2) {
                    fullSpanItem.f41221n = i5 + i3;
                }
            }
        }

        private int xMQ(int i2) {
            if (this.rl == null) {
                return -1;
            }
            FullSpanItem fullSpanItemJ2 = J2(i2);
            if (fullSpanItemJ2 != null) {
                this.rl.remove(fullSpanItemJ2);
            }
            int size = this.rl.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i3 = -1;
                    break;
                }
                if (((FullSpanItem) this.rl.get(i3)).f41221n >= i2) {
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = (FullSpanItem) this.rl.get(i3);
            this.rl.remove(i3);
            return fullSpanItem.f41221n;
        }

        int HI(int i2) {
            int length = this.f41219n.length;
            while (length <= i2) {
                length *= 2;
            }
            return length;
        }

        public FullSpanItem J2(int i2) {
            List list = this.rl;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.rl.get(size);
                if (fullSpanItem.f41221n == i2) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        int KN(int i2) {
            int[] iArr = this.f41219n;
            if (iArr == null || i2 >= iArr.length) {
                return -1;
            }
            int iXMQ = xMQ(i2);
            if (iXMQ == -1) {
                int[] iArr2 = this.f41219n;
                Arrays.fill(iArr2, i2, iArr2.length, -1);
                return this.f41219n.length;
            }
            int iMin = Math.min(iXMQ + 1, this.f41219n.length);
            Arrays.fill(this.f41219n, i2, iMin, -1);
            return iMin;
        }

        public FullSpanItem O(int i2, int i3, int i5, boolean z2) {
            List list = this.rl;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.rl.get(i7);
                int i8 = fullSpanItem.f41221n;
                if (i8 >= i3) {
                    return null;
                }
                if (i8 >= i2 && (i5 == 0 || fullSpanItem.f41222t == i5 || (z2 && fullSpanItem.J2))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        int Uo(int i2) {
            int[] iArr = this.f41219n;
            if (iArr == null || i2 >= iArr.length) {
                return -1;
            }
            return iArr[i2];
        }

        void gh(int i2, int i3) {
            int[] iArr = this.f41219n;
            if (iArr == null || i2 >= iArr.length) {
                return;
            }
            int i5 = i2 + i3;
            t(i5);
            int[] iArr2 = this.f41219n;
            System.arraycopy(iArr2, i5, iArr2, i2, (iArr2.length - i2) - i3);
            int[] iArr3 = this.f41219n;
            Arrays.fill(iArr3, iArr3.length - i3, iArr3.length, -1);
            az(i2, i3);
        }

        void mUb(int i2, int i3) {
            int[] iArr = this.f41219n;
            if (iArr == null || i2 >= iArr.length) {
                return;
            }
            int i5 = i2 + i3;
            t(i5);
            int[] iArr2 = this.f41219n;
            System.arraycopy(iArr2, i2, iArr2, i5, (iArr2.length - i2) - i3);
            Arrays.fill(this.f41219n, i2, i5, -1);
            qie(i2, i3);
        }

        public void n(FullSpanItem fullSpanItem) {
            if (this.rl == null) {
                this.rl = new ArrayList();
            }
            int size = this.rl.size();
            for (int i2 = 0; i2 < size; i2++) {
                FullSpanItem fullSpanItem2 = (FullSpanItem) this.rl.get(i2);
                if (fullSpanItem2.f41221n == fullSpanItem.f41221n) {
                    this.rl.remove(i2);
                }
                if (fullSpanItem2.f41221n >= fullSpanItem.f41221n) {
                    this.rl.add(i2, fullSpanItem);
                    return;
                }
            }
            this.rl.add(fullSpanItem);
        }

        int nr(int i2) {
            List list = this.rl;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((FullSpanItem) this.rl.get(size)).f41221n >= i2) {
                        this.rl.remove(size);
                    }
                }
            }
            return KN(i2);
        }

        void rl() {
            int[] iArr = this.f41219n;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.rl = null;
        }

        void t(int i2) {
            int[] iArr = this.f41219n;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i2, 10) + 1];
                this.f41219n = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i2 >= iArr.length) {
                int[] iArr3 = new int[HI(i2)];
                this.f41219n = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f41219n;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        LazySpanLookup() {
        }

        void ty(int i2, Span span) {
            t(i2);
            this.f41219n[i2] = span.f41231O;
        }
    }

    @RestrictTo
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };
        boolean E2;
        int[] J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f41223O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        boolean f41224S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        List f41225Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f41226g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f41227n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int[] f41228o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f41229r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f41230t;

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        void n() {
            this.J2 = null;
            this.f41223O = 0;
            this.f41227n = -1;
            this.f41230t = -1;
        }

        void rl() {
            this.J2 = null;
            this.f41223O = 0;
            this.f41229r = 0;
            this.f41228o = null;
            this.f41225Z = null;
        }

        SavedState(Parcel parcel) {
            this.f41227n = parcel.readInt();
            this.f41230t = parcel.readInt();
            int i2 = parcel.readInt();
            this.f41223O = i2;
            if (i2 > 0) {
                int[] iArr = new int[i2];
                this.J2 = iArr;
                parcel.readIntArray(iArr);
            }
            int i3 = parcel.readInt();
            this.f41229r = i3;
            if (i3 > 0) {
                int[] iArr2 = new int[i3];
                this.f41228o = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f41224S = parcel.readInt() == 1;
            this.f41226g = parcel.readInt() == 1;
            this.E2 = parcel.readInt() == 1;
            this.f41225Z = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f41227n);
            parcel.writeInt(this.f41230t);
            parcel.writeInt(this.f41223O);
            if (this.f41223O > 0) {
                parcel.writeIntArray(this.J2);
            }
            parcel.writeInt(this.f41229r);
            if (this.f41229r > 0) {
                parcel.writeIntArray(this.f41228o);
            }
            parcel.writeInt(this.f41224S ? 1 : 0);
            parcel.writeInt(this.f41226g ? 1 : 0);
            parcel.writeInt(this.E2 ? 1 : 0);
            parcel.writeList(this.f41225Z);
        }

        public SavedState(SavedState savedState) {
            this.f41223O = savedState.f41223O;
            this.f41227n = savedState.f41227n;
            this.f41230t = savedState.f41230t;
            this.J2 = savedState.J2;
            this.f41229r = savedState.f41229r;
            this.f41228o = savedState.f41228o;
            this.f41224S = savedState.f41224S;
            this.f41226g = savedState.f41226g;
            this.E2 = savedState.E2;
            this.f41225Z = savedState.f41225Z;
        }
    }

    class Span {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final int f41231O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        ArrayList f41232n = new ArrayList();
        int rl = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f41233t = Integer.MIN_VALUE;
        int nr = 0;

        public View az(int i2, int i3) {
            View view = null;
            if (i3 != -1) {
                int size = this.f41232n.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f41232n.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.nY && staggeredGridLayoutManager.fcU(view2) >= i2) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.nY && staggeredGridLayoutManager2.fcU(view2) <= i2) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = this.f41232n.size();
            int i5 = 0;
            while (i5 < size2) {
                View view3 = (View) this.f41232n.get(i5);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                if (staggeredGridLayoutManager3.nY && staggeredGridLayoutManager3.fcU(view3) <= i2) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                if ((!staggeredGridLayoutManager4.nY && staggeredGridLayoutManager4.fcU(view3) >= i2) || !view3.hasFocusable()) {
                    break;
                }
                i5++;
                view = view3;
            }
            return view;
        }

        int xMQ(int i2, int i3, boolean z2) {
            return KN(i2, i3, false, false, z2);
        }

        Span(int i2) {
            this.f41231O = i2;
        }

        int HI() {
            int i2 = this.rl;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            nr();
            return this.rl;
        }

        void Ik() {
            this.rl = Integer.MIN_VALUE;
            this.f41233t = Integer.MIN_VALUE;
        }

        public int J2() {
            return StaggeredGridLayoutManager.this.nY ? xMQ(this.f41232n.size() - 1, -1, true) : xMQ(0, this.f41232n.size(), true);
        }

        int KN(int i2, int i3, boolean z2, boolean z3, boolean z4) {
            int iAz = StaggeredGridLayoutManager.this.XQ.az();
            int iXMQ = StaggeredGridLayoutManager.this.XQ.xMQ();
            int i5 = i3 > i2 ? 1 : -1;
            while (i2 != i3) {
                View view = (View) this.f41232n.get(i2);
                int iUo = StaggeredGridLayoutManager.this.XQ.Uo(view);
                int iNr = StaggeredGridLayoutManager.this.XQ.nr(view);
                boolean z5 = false;
                boolean z6 = !z4 ? iUo >= iXMQ : iUo > iXMQ;
                if (!z4 ? iNr > iAz : iNr >= iAz) {
                    z5 = true;
                }
                if (z6 && z5) {
                    if (z2 && z3) {
                        if (iUo >= iAz && iNr <= iXMQ) {
                            return StaggeredGridLayoutManager.this.fcU(view);
                        }
                    } else {
                        if (z3) {
                            return StaggeredGridLayoutManager.this.fcU(view);
                        }
                        if (iUo < iAz || iNr > iXMQ) {
                            return StaggeredGridLayoutManager.this.fcU(view);
                        }
                    }
                }
                i2 += i5;
            }
            return -1;
        }

        void O() {
            this.f41232n.clear();
            Ik();
            this.nr = 0;
        }

        void S(int i2) {
            this.rl = i2;
            this.f41233t = i2;
        }

        public int Uo() {
            return StaggeredGridLayoutManager.this.nY ? xMQ(0, this.f41232n.size(), true) : xMQ(this.f41232n.size() - 1, -1, true);
        }

        void Z() {
            View view = (View) this.f41232n.remove(0);
            LayoutParams layoutParamsTy = ty(view);
            layoutParamsTy.f41218O = null;
            if (this.f41232n.size() == 0) {
                this.f41233t = Integer.MIN_VALUE;
            }
            if (layoutParamsTy.t() || layoutParamsTy.rl()) {
                this.nr -= StaggeredGridLayoutManager.this.XQ.O(view);
            }
            this.rl = Integer.MIN_VALUE;
        }

        int ck(int i2) {
            int i3 = this.rl;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.f41232n.size() == 0) {
                return i2;
            }
            nr();
            return this.rl;
        }

        int gh() {
            int i2 = this.f41233t;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            t();
            return this.f41233t;
        }

        public int mUb() {
            return this.nr;
        }

        void nr() {
            LazySpanLookup.FullSpanItem fullSpanItemJ2;
            View view = (View) this.f41232n.get(0);
            LayoutParams layoutParamsTy = ty(view);
            this.rl = StaggeredGridLayoutManager.this.XQ.Uo(view);
            if (layoutParamsTy.J2 && (fullSpanItemJ2 = StaggeredGridLayoutManager.this.E2.J2(layoutParamsTy.n())) != null && fullSpanItemJ2.f41222t == -1) {
                this.rl -= fullSpanItemJ2.n(this.f41231O);
            }
        }

        void o() {
            int size = this.f41232n.size();
            View view = (View) this.f41232n.remove(size - 1);
            LayoutParams layoutParamsTy = ty(view);
            layoutParamsTy.f41218O = null;
            if (layoutParamsTy.t() || layoutParamsTy.rl()) {
                this.nr -= StaggeredGridLayoutManager.this.XQ.O(view);
            }
            if (size == 1) {
                this.rl = Integer.MIN_VALUE;
            }
            this.f41233t = Integer.MIN_VALUE;
        }

        int qie(int i2) {
            int i3 = this.f41233t;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.f41232n.size() == 0) {
                return i2;
            }
            t();
            return this.f41233t;
        }

        void r(int i2) {
            int i3 = this.rl;
            if (i3 != Integer.MIN_VALUE) {
                this.rl = i3 + i2;
            }
            int i5 = this.f41233t;
            if (i5 != Integer.MIN_VALUE) {
                this.f41233t = i5 + i2;
            }
        }

        void rl(boolean z2, int i2) {
            int iQie = z2 ? qie(Integer.MIN_VALUE) : ck(Integer.MIN_VALUE);
            O();
            if (iQie == Integer.MIN_VALUE) {
                return;
            }
            if (!z2 || iQie >= StaggeredGridLayoutManager.this.XQ.xMQ()) {
                if (z2 || iQie <= StaggeredGridLayoutManager.this.XQ.az()) {
                    if (i2 != Integer.MIN_VALUE) {
                        iQie += i2;
                    }
                    this.f41233t = iQie;
                    this.rl = iQie;
                }
            }
        }

        void t() {
            LazySpanLookup.FullSpanItem fullSpanItemJ2;
            ArrayList arrayList = this.f41232n;
            View view = (View) arrayList.get(arrayList.size() - 1);
            LayoutParams layoutParamsTy = ty(view);
            this.f41233t = StaggeredGridLayoutManager.this.XQ.nr(view);
            if (layoutParamsTy.J2 && (fullSpanItemJ2 = StaggeredGridLayoutManager.this.E2.J2(layoutParamsTy.n())) != null && fullSpanItemJ2.f41222t == 1) {
                this.f41233t += fullSpanItemJ2.n(this.f41231O);
            }
        }

        void XQ(View view) {
            LayoutParams layoutParamsTy = ty(view);
            layoutParamsTy.f41218O = this;
            this.f41232n.add(0, view);
            this.rl = Integer.MIN_VALUE;
            if (this.f41232n.size() == 1) {
                this.f41233t = Integer.MIN_VALUE;
            }
            if (!layoutParamsTy.t() && !layoutParamsTy.rl()) {
                return;
            }
            this.nr += StaggeredGridLayoutManager.this.XQ.O(view);
        }

        void n(View view) {
            LayoutParams layoutParamsTy = ty(view);
            layoutParamsTy.f41218O = this;
            this.f41232n.add(view);
            this.f41233t = Integer.MIN_VALUE;
            if (this.f41232n.size() == 1) {
                this.rl = Integer.MIN_VALUE;
            }
            if (!layoutParamsTy.t() && !layoutParamsTy.rl()) {
                return;
            }
            this.nr += StaggeredGridLayoutManager.this.XQ.O(view);
        }

        LayoutParams ty(View view) {
            return (LayoutParams) view.getLayoutParams();
        }
    }

    private int L(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 17 ? i2 != 33 ? i2 != 66 ? (i2 == 130 && this.WPU == 1) ? 1 : Integer.MIN_VALUE : this.WPU == 0 ? 1 : Integer.MIN_VALUE : this.WPU == 1 ? -1 : Integer.MIN_VALUE : this.WPU == 0 ? -1 : Integer.MIN_VALUE : (this.WPU != 1 && c()) ? -1 : 1 : (this.WPU != 1 && c()) ? 1 : -1;
    }

    private void UR(int i2, int i3) {
        for (int i5 = 0; i5 < this.f41212o; i5++) {
            if (!this.f41209Z[i5].f41232n.isEmpty()) {
                pr(this.f41209Z[i5], i2, i3);
            }
        }
    }

    public void GRh(boolean z2) {
        XQ(null);
        SavedState savedState = this.f41205N;
        if (savedState != null && savedState.f41224S != z2) {
            savedState.f41224S = z2;
        }
        this.nY = z2;
        QgZ();
    }

    public void Rc(int i2) {
        XQ(null);
        if (i2 != this.f41212o) {
            YiW();
            this.f41212o = i2;
            this.te = new BitSet(this.f41212o);
            this.f41209Z = new Span[this.f41212o];
            for (int i3 = 0; i3 < this.f41212o; i3++) {
                this.f41209Z[i3] = new Span(i3);
            }
            QgZ();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void Vvq(RecyclerView.Recycler recycler, RecyclerView.State state) {
        x(recycler, state, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void X4T(RecyclerView recyclerView, int i2, int i3) {
        yA(i2, i3, 1);
    }

    void rR(int i2, RecyclerView.State state) {
        int iXli;
        int i3;
        if (i2 > 0) {
            iXli = fq();
            i3 = 1;
        } else {
            iXli = Xli();
            i3 = -1;
        }
        this.ViF.f41104n = true;
        poH(iXli, state);
        Qg8(i3);
        LayoutState layoutState = this.ViF;
        layoutState.f41105t = iXli + layoutState.nr;
        layoutState.rl = Math.abs(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void uG(RecyclerView recyclerView, int i2, int i3, Object obj) {
        yA(i2, i3, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void xVH(RecyclerView recyclerView, int i2, int i3) {
        yA(i2, i3, 2);
    }

    private int C7B(int i2) {
        int iQie = this.f41209Z[0].qie(i2);
        for (int i3 = 1; i3 < this.f41212o; i3++) {
            int iQie2 = this.f41209Z[i3].qie(i2);
            if (iQie2 > iQie) {
                iQie = iQie2;
            }
        }
        return iQie;
    }

    private LazySpanLookup.FullSpanItem HE(int i2) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f41220O = new int[this.f41212o];
        for (int i3 = 0; i3 < this.f41212o; i3++) {
            fullSpanItem.f41220O[i3] = this.f41209Z[i3].ck(i2) - i2;
        }
        return fullSpanItem;
    }

    private void HFS(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z2) {
        int iXMQ;
        int iC7B = C7B(Integer.MIN_VALUE);
        if (iC7B != Integer.MIN_VALUE && (iXMQ = this.XQ.xMQ() - iC7B) > 0) {
            int i2 = iXMQ - (-iu(-iXMQ, recycler, state));
            if (!z2 || i2 <= 0) {
                return;
            }
            this.XQ.r(i2);
        }
    }

    private void I4p(AnchorInfo anchorInfo) {
        SavedState savedState = this.f41205N;
        int i2 = savedState.f41223O;
        if (i2 > 0) {
            if (i2 == this.f41212o) {
                for (int i3 = 0; i3 < this.f41212o; i3++) {
                    this.f41209Z[i3].O();
                    SavedState savedState2 = this.f41205N;
                    int iXMQ = savedState2.J2[i3];
                    if (iXMQ != Integer.MIN_VALUE) {
                        iXMQ += savedState2.f41226g ? this.XQ.xMQ() : this.XQ.az();
                    }
                    this.f41209Z[i3].S(iXMQ);
                }
            } else {
                savedState.rl();
                SavedState savedState3 = this.f41205N;
                savedState3.f41227n = savedState3.f41230t;
            }
        }
        SavedState savedState4 = this.f41205N;
        this.f41207T = savedState4.E2;
        GRh(savedState4.f41224S);
        jX();
        SavedState savedState5 = this.f41205N;
        int i5 = savedState5.f41227n;
        if (i5 != -1) {
            this.iF = i5;
            anchorInfo.f41217t = savedState5.f41226g;
        } else {
            anchorInfo.f41217t = this.f41211g;
        }
        if (savedState5.f41229r > 1) {
            LazySpanLookup lazySpanLookup = this.E2;
            lazySpanLookup.f41219n = savedState5.f41228o;
            lazySpanLookup.rl = savedState5.f41225Z;
        }
    }

    private LazySpanLookup.FullSpanItem Lu(int i2) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f41220O = new int[this.f41212o];
        for (int i3 = 0; i3 < this.f41212o; i3++) {
            fullSpanItem.f41220O[i3] = i2 - this.f41209Z[i3].qie(i2);
        }
        return fullSpanItem;
    }

    private void MPw(View view) {
        for (int i2 = this.f41212o - 1; i2 >= 0; i2--) {
            this.f41209Z[i2].XQ(view);
        }
    }

    private void Of6() {
        if (this.f41206S.gh() == 1073741824) {
            return;
        }
        int iM = M();
        float fMax = 0.0f;
        for (int i2 = 0; i2 < iM; i2++) {
            View viewE = E(i2);
            float fO = this.f41206S.O(viewE);
            if (fO >= fMax) {
                if (((LayoutParams) viewE.getLayoutParams()).J2()) {
                    fO = (fO * 1.0f) / this.f41212o;
                }
                fMax = Math.max(fMax, fO);
            }
        }
        int i3 = this.aYN;
        int iRound = Math.round(fMax * this.f41212o);
        if (this.f41206S.gh() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f41206S.ty());
        }
        W1c(iRound);
        if (this.aYN == i3) {
            return;
        }
        for (int i5 = 0; i5 < iM; i5++) {
            View viewE2 = E(i5);
            LayoutParams layoutParams = (LayoutParams) viewE2.getLayoutParams();
            if (!layoutParams.J2) {
                if (c() && this.WPU == 1) {
                    int i7 = this.f41212o;
                    int i8 = layoutParams.f41218O.f41231O;
                    viewE2.offsetLeftAndRight(((-((i7 - 1) - i8)) * this.aYN) - ((-((i7 - 1) - i8)) * i3));
                } else {
                    int i9 = layoutParams.f41218O.f41231O;
                    int i10 = this.aYN * i9;
                    int i11 = i9 * i3;
                    if (this.WPU == 1) {
                        viewE2.offsetLeftAndRight(i10 - i11);
                    } else {
                        viewE2.offsetTopAndBottom(i10 - i11);
                    }
                }
            }
        }
    }

    private void Qg8(int i2) {
        LayoutState layoutState = this.ViF;
        layoutState.f41103O = i2;
        layoutState.nr = this.f41211g != (i2 == -1) ? -1 : 1;
    }

    private void Sax(View view, int i2, int i3, boolean z2) {
        aYN(view, this.s7N);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        Rect rect = this.s7N;
        int iNi = ni(i2, i5 + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        Rect rect2 = this.s7N;
        int iNi2 = ni(i3, i7 + rect2.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect2.bottom);
        if (z2 ? eo(view, iNi, iNi2, layoutParams) : h(view, iNi, iNi2, layoutParams)) {
            view.measure(iNi, iNi2);
        }
    }

    private int TVk(int i2) {
        int iQie = this.f41209Z[0].qie(i2);
        for (int i3 = 1; i3 < this.f41212o; i3++) {
            int iQie2 = this.f41209Z[i3].qie(i2);
            if (iQie2 < iQie) {
                iQie = iQie2;
            }
        }
        return iQie;
    }

    private void V5F(RecyclerView.Recycler recycler, LayoutState layoutState) {
        if (!layoutState.f41104n || layoutState.xMQ) {
            return;
        }
        if (layoutState.rl == 0) {
            if (layoutState.f41103O == -1) {
                sFO(recycler, layoutState.Uo);
                return;
            } else {
                JI(recycler, layoutState.J2);
                return;
            }
        }
        if (layoutState.f41103O != -1) {
            int iTVk = TVk(layoutState.Uo) - layoutState.Uo;
            JI(recycler, iTVk < 0 ? layoutState.J2 : Math.min(iTVk, layoutState.rl) + layoutState.J2);
        } else {
            int i2 = layoutState.J2;
            int iWYi = i2 - wYi(i2);
            sFO(recycler, iWYi < 0 ? layoutState.Uo : layoutState.Uo - Math.min(iWYi, layoutState.rl));
        }
    }

    private boolean W5k(RecyclerView.State state, AnchorInfo anchorInfo) {
        anchorInfo.f41216n = this.f41208X ? w(state.rl()) : l2(state.rl());
        anchorInfo.rl = Integer.MIN_VALUE;
        return true;
    }

    private boolean XUb(int i2) {
        if (this.WPU == 0) {
            return (i2 == -1) != this.f41211g;
        }
        return ((i2 == -1) == this.f41211g) == c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView$LayoutManager, androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    private int c32(RecyclerView.Recycler recycler, LayoutState layoutState, RecyclerView.State state) {
        Span spanN7u;
        int iLRt;
        int iO;
        int iAz;
        int iO2;
        ?? r02;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        ?? r8 = 0;
        staggeredGridLayoutManager.te.set(0, staggeredGridLayoutManager.f41212o, true);
        int i2 = staggeredGridLayoutManager.ViF.xMQ ? layoutState.f41103O == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : layoutState.f41103O == 1 ? layoutState.Uo + layoutState.rl : layoutState.J2 - layoutState.rl;
        staggeredGridLayoutManager.UR(layoutState.f41103O, i2);
        int iXMQ = staggeredGridLayoutManager.f41211g ? staggeredGridLayoutManager.XQ.xMQ() : staggeredGridLayoutManager.XQ.az();
        boolean z2 = false;
        ?? r03 = staggeredGridLayoutManager;
        while (layoutState.n(state) && (r03.ViF.xMQ || !r03.te.isEmpty())) {
            View viewRl = layoutState.rl(recycler);
            LayoutParams layoutParams = (LayoutParams) viewRl.getLayoutParams();
            int iN = layoutParams.n();
            int iUo = r03.E2.Uo(iN);
            ?? r52 = iUo == -1 ? 1 : r8;
            if (r52 != 0) {
                spanN7u = layoutParams.J2 ? r03.f41209Z[r8] : r03.n7u(layoutState);
                r03.E2.ty(iN, spanN7u);
            } else {
                spanN7u = r03.f41209Z[iUo];
            }
            Span span = spanN7u;
            layoutParams.f41218O = span;
            if (layoutState.f41103O == 1) {
                r03.r(viewRl);
            } else {
                r03.o(viewRl, r8);
            }
            r03.kQ(viewRl, layoutParams, r8);
            if (layoutState.f41103O == 1) {
                iO = layoutParams.J2 ? r03.C7B(iXMQ) : span.qie(iXMQ);
                iLRt = r03.XQ.O(viewRl) + iO;
                if (r52 != 0 && layoutParams.J2) {
                    LazySpanLookup.FullSpanItem fullSpanItemLu = r03.Lu(iO);
                    fullSpanItemLu.f41222t = -1;
                    fullSpanItemLu.f41221n = iN;
                    r03.E2.n(fullSpanItemLu);
                }
            } else {
                iLRt = layoutParams.J2 ? r03.lRt(iXMQ) : span.ck(iXMQ);
                iO = iLRt - r03.XQ.O(viewRl);
                if (r52 != 0 && layoutParams.J2) {
                    LazySpanLookup.FullSpanItem fullSpanItemHE = r03.HE(iLRt);
                    fullSpanItemHE.f41222t = 1;
                    fullSpanItemHE.f41221n = iN;
                    r03.E2.n(fullSpanItemHE);
                }
            }
            if (layoutParams.J2 && layoutState.nr == -1) {
                if (r52 != 0) {
                    r03.f41213v = true;
                } else {
                    if (!(layoutState.f41103O == 1 ? r03.bZm() : r03.Co())) {
                        LazySpanLookup.FullSpanItem fullSpanItemJ2 = r03.E2.J2(iN);
                        if (fullSpanItemJ2 != null) {
                            fullSpanItemJ2.J2 = true;
                        }
                        r03.f41213v = true;
                    }
                }
            }
            r03.q9(viewRl, layoutParams, layoutState);
            if (r03.c() && r03.WPU == 1) {
                iO2 = layoutParams.J2 ? r03.f41206S.xMQ() : r03.f41206S.xMQ() - (((r03.f41212o - 1) - span.f41231O) * r03.aYN);
                iAz = iO2 - r03.f41206S.O(viewRl);
            } else {
                iAz = layoutParams.J2 ? r03.f41206S.az() : (span.f41231O * r03.aYN) + r03.f41206S.az();
                iO2 = r03.f41206S.O(viewRl) + iAz;
            }
            int i3 = iO2;
            int i5 = iAz;
            if (r03.WPU == 1) {
                r03.lLA(viewRl, i5, iO, i3, iLRt);
                r02 = this;
            } else {
                r03.lLA(viewRl, iO, i5, iLRt, i3);
                r02 = r03;
            }
            if (layoutParams.J2) {
                r02.UR(r02.ViF.f41103O, i2);
            } else {
                r02.pr(span, r02.ViF.f41103O, i2);
            }
            r02.V5F(recycler, r02.ViF);
            if (r02.ViF.KN && viewRl.hasFocusable()) {
                if (layoutParams.J2) {
                    r02.te.clear();
                } else {
                    r02.te.set(span.f41231O, false);
                }
            }
            z2 = true;
            r8 = 0;
            r03 = r02;
        }
        if (!z2) {
            r03.V5F(recycler, r03.ViF);
        }
        int iAz2 = r03.ViF.f41103O == -1 ? r03.XQ.az() - r03.lRt(r03.XQ.az()) : r03.C7B(r03.XQ.xMQ()) - r03.XQ.xMQ();
        if (iAz2 > 0) {
            return Math.min(layoutState.rl, iAz2);
        }
        return 0;
    }

    private void fW() {
        this.XQ = OrientationHelper.rl(this, this.WPU);
        this.f41206S = OrientationHelper.rl(this, 1 - this.WPU);
    }

    private void iV(View view) {
        for (int i2 = this.f41212o - 1; i2 >= 0; i2--) {
            this.f41209Z[i2].n(view);
        }
    }

    private void jX() {
        if (this.WPU == 1 || !c()) {
            this.f41211g = this.nY;
        } else {
            this.f41211g = !this.nY;
        }
    }

    private void kQ(View view, LayoutParams layoutParams, boolean z2) {
        if (layoutParams.J2) {
            if (this.WPU == 1) {
                Sax(view, this.nHg, RecyclerView.LayoutManager.FX(piY(), ijL(), G7() + ofS(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), z2);
                return;
            } else {
                Sax(view, RecyclerView.LayoutManager.FX(mYa(), Org(), C() + Mx(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), this.nHg, z2);
                return;
            }
        }
        if (this.WPU == 1) {
            Sax(view, RecyclerView.LayoutManager.FX(this.aYN, Org(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).width, false), RecyclerView.LayoutManager.FX(piY(), ijL(), G7() + ofS(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), z2);
        } else {
            Sax(view, RecyclerView.LayoutManager.FX(mYa(), Org(), C() + Mx(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), RecyclerView.LayoutManager.FX(this.aYN, ijL(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).height, false), z2);
        }
    }

    private int lRt(int i2) {
        int iCk = this.f41209Z[0].ck(i2);
        for (int i3 = 1; i3 < this.f41212o; i3++) {
            int iCk2 = this.f41209Z[i3].ck(i2);
            if (iCk2 < iCk) {
                iCk = iCk2;
            }
        }
        return iCk;
    }

    private Span n7u(LayoutState layoutState) {
        int i2;
        int i3;
        int i5;
        if (XUb(layoutState.f41103O)) {
            i3 = this.f41212o - 1;
            i2 = -1;
            i5 = -1;
        } else {
            i2 = this.f41212o;
            i3 = 0;
            i5 = 1;
        }
        Span span = null;
        if (layoutState.f41103O == 1) {
            int iAz = this.XQ.az();
            int i7 = Integer.MAX_VALUE;
            while (i3 != i2) {
                Span span2 = this.f41209Z[i3];
                int iQie = span2.qie(iAz);
                if (iQie < i7) {
                    span = span2;
                    i7 = iQie;
                }
                i3 += i5;
            }
            return span;
        }
        int iXMQ = this.XQ.xMQ();
        int i8 = Integer.MIN_VALUE;
        while (i3 != i2) {
            Span span3 = this.f41209Z[i3];
            int iCk = span3.ck(iXMQ);
            if (iCk > i8) {
                span = span3;
                i8 = iCk;
            }
            i3 += i5;
        }
        return span;
    }

    private int ni(int i2, int i3, int i5) {
        int mode;
        return (!(i3 == 0 && i5 == 0) && ((mode = View.MeasureSpec.getMode(i2)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - i3) - i5), mode) : i2;
    }

    private boolean oz(Span span) {
        if (this.f41211g) {
            if (span.gh() < this.XQ.xMQ()) {
                ArrayList arrayList = span.f41232n;
                return !span.ty((View) arrayList.get(arrayList.size() - 1)).J2;
            }
        } else if (span.HI() > this.XQ.az()) {
            return !span.ty((View) span.f41232n.get(0)).J2;
        }
        return false;
    }

    private void poH(int i2, RecyclerView.State state) {
        int iTy;
        int iTy2;
        int iT;
        LayoutState layoutState = this.ViF;
        boolean z2 = false;
        layoutState.rl = 0;
        layoutState.f41105t = i2;
        if (!How() || (iT = state.t()) == -1) {
            iTy = 0;
            iTy2 = 0;
        } else {
            if (this.f41211g == (iT < i2)) {
                iTy = this.XQ.ty();
                iTy2 = 0;
            } else {
                iTy2 = this.XQ.ty();
                iTy = 0;
            }
        }
        if (J()) {
            this.ViF.J2 = this.XQ.az() - iTy2;
            this.ViF.Uo = this.XQ.xMQ() + iTy;
        } else {
            this.ViF.Uo = this.XQ.KN() + iTy;
            this.ViF.J2 = -iTy2;
        }
        LayoutState layoutState2 = this.ViF;
        layoutState2.KN = false;
        layoutState2.f41104n = true;
        if (this.XQ.gh() == 0 && this.XQ.KN() == 0) {
            z2 = true;
        }
        layoutState2.xMQ = z2;
    }

    private void q9(View view, LayoutParams layoutParams, LayoutState layoutState) {
        if (layoutState.f41103O == 1) {
            if (layoutParams.J2) {
                iV(view);
                return;
            } else {
                layoutParams.f41218O.n(view);
                return;
            }
        }
        if (layoutParams.J2) {
            MPw(view);
        } else {
            layoutParams.f41218O.XQ(view);
        }
    }

    private int wYi(int i2) {
        int iCk = this.f41209Z[0].ck(i2);
        for (int i3 = 1; i3 < this.f41212o; i3++) {
            int iCk2 = this.f41209Z[i3].ck(i2);
            if (iCk2 > iCk) {
                iCk = iCk2;
            }
        }
        return iCk;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void x(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z2) {
        SavedState savedState;
        AnchorInfo anchorInfo = this.wTp;
        if (!(this.f41205N == null && this.iF == -1) && state.rl() == 0) {
            jO(recycler);
            anchorInfo.t();
            return;
        }
        boolean z3 = true;
        boolean z4 = (anchorInfo.f41215O && this.iF == -1 && this.f41205N == null) ? false : true;
        if (z4) {
            anchorInfo.t();
            if (this.f41205N != null) {
                I4p(anchorInfo);
            } else {
                jX();
                anchorInfo.f41217t = this.f41211g;
            }
            ex(state, anchorInfo);
            anchorInfo.f41215O = true;
        }
        if (this.f41205N == null && this.iF == -1 && (anchorInfo.f41217t != this.f41208X || c() != this.f41207T)) {
            this.E2.rl();
            anchorInfo.nr = true;
        }
        if (M() > 0 && ((savedState = this.f41205N) == null || savedState.f41223O < 1)) {
            if (anchorInfo.nr) {
                for (int i2 = 0; i2 < this.f41212o; i2++) {
                    this.f41209Z[i2].O();
                    int i3 = anchorInfo.rl;
                    if (i3 != Integer.MIN_VALUE) {
                        this.f41209Z[i2].S(i3);
                    }
                }
            } else if (z4 || this.wTp.J2 == null) {
                for (int i5 = 0; i5 < this.f41212o; i5++) {
                    this.f41209Z[i5].rl(this.f41211g, anchorInfo.rl);
                }
                this.wTp.nr(this.f41209Z);
            } else {
                for (int i7 = 0; i7 < this.f41212o; i7++) {
                    Span span = this.f41209Z[i7];
                    span.O();
                    span.S(this.wTp.J2[i7]);
                }
            }
        }
        s7N(recycler);
        this.ViF.f41104n = false;
        this.f41213v = false;
        W1c(this.f41206S.ty());
        poH(anchorInfo.f41216n, state);
        if (anchorInfo.f41217t) {
            Qg8(-1);
            c32(recycler, this.ViF, state);
            Qg8(1);
            LayoutState layoutState = this.ViF;
            layoutState.f41105t = anchorInfo.f41216n + layoutState.nr;
            c32(recycler, layoutState, state);
        } else {
            Qg8(1);
            c32(recycler, this.ViF, state);
            Qg8(-1);
            LayoutState layoutState2 = this.ViF;
            layoutState2.f41105t = anchorInfo.f41216n + layoutState2.nr;
            c32(recycler, layoutState2, state);
        }
        Of6();
        if (M() > 0) {
            if (this.f41211g) {
                HFS(recycler, state, true);
                eb(recycler, state, false);
            } else {
                eb(recycler, state, true);
                HFS(recycler, state, false);
            }
        }
        if (!z2 || state.O() || this.f41210e == 0 || M() <= 0 || (!this.f41213v && gxH() == null)) {
            z3 = false;
        } else {
            xzo(this.Xw);
            if (!WH()) {
            }
        }
        if (state.O()) {
            this.wTp.t();
        }
        this.f41208X = anchorInfo.f41217t;
        this.f41207T = c();
        if (z3) {
            this.wTp.t();
            x(recycler, state, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void yA(int i2, int i3, int i5) {
        int i7;
        int i8;
        int iFq = this.f41211g ? fq() : Xli();
        if (i5 != 8) {
            i7 = i2 + i3;
        } else {
            if (i2 >= i3) {
                i7 = i2 + 1;
                i8 = i3;
                this.E2.KN(i8);
                if (i5 != 1) {
                    this.E2.mUb(i2, i3);
                } else if (i5 == 2) {
                    this.E2.gh(i2, i3);
                } else if (i5 == 8) {
                    this.E2.gh(i2, 1);
                    this.E2.mUb(i3, 1);
                }
                if (i7 > iFq) {
                    return;
                }
                if (i8 <= (this.f41211g ? Xli() : fq())) {
                    QgZ();
                    return;
                }
                return;
            }
            i7 = i3 + 1;
        }
        i8 = i2;
        this.E2.KN(i8);
        if (i5 != 1) {
        }
        if (i7 > iFq) {
        }
    }

    boolean Co() {
        int iCk = this.f41209Z[0].ck(Integer.MIN_VALUE);
        for (int i2 = 1; i2 < this.f41212o; i2++) {
            if (this.f41209Z[i2].ck(Integer.MIN_VALUE) != iCk) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int D(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.WPU == 1) {
            return Math.min(this.f41212o, state.rl());
        }
        return -1;
    }

    int GH3() {
        View viewOm = this.f41211g ? Om(true) : t1J(true);
        if (viewOm == null) {
            return -1;
        }
        return fcU(viewOm);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void JVN(RecyclerView recyclerView, int i2, int i3, int i5) {
        yA(i2, i3, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void LPV(int i2) {
        SavedState savedState = this.f41205N;
        if (savedState != null && savedState.f41227n != i2) {
            savedState.n();
        }
        this.iF = i2;
        this.fD = Integer.MIN_VALUE;
        QgZ();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams M7(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    View Om(boolean z2) {
        int iAz = this.XQ.az();
        int iXMQ = this.XQ.xMQ();
        View view = null;
        for (int iM = M() - 1; iM >= 0; iM--) {
            View viewE = E(iM);
            int iUo = this.XQ.Uo(viewE);
            int iNr = this.XQ.nr(viewE);
            if (iNr > iAz && iUo < iXMQ) {
                if (iNr <= iXMQ || !z2) {
                    return viewE;
                }
                if (view == null) {
                    view = viewE;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams P5(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean Po6() {
        return this.f41210e != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void QZ6(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        this.E2.rl();
        for (int i2 = 0; i2 < this.f41212o; i2++) {
            this.f41209Z[i2].O();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams U() {
        return this.WPU == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean ViF() {
        return this.WPU == 0;
    }

    void W1c(int i2) {
        this.aYN = i2 / this.f41212o;
        this.nHg = View.MeasureSpec.makeMeasureSpec(i2, this.f41206S.gh());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void XQ(String str) {
        if (this.f41205N == null) {
            super.XQ(str);
        }
    }

    public void YiW() {
        this.E2.rl();
        QgZ();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void Zmq(RecyclerView recyclerView) {
        this.E2.rl();
        QgZ();
    }

    boolean bZm() {
        int iQie = this.f41209Z[0].qie(Integer.MIN_VALUE);
        for (int i2 = 1; i2 < this.f41212o; i2++) {
            if (this.f41209Z[i2].qie(Integer.MIN_VALUE) != iQie) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean g(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean i() {
        return this.nY;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void iF(int i2, int i3, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int iQie;
        int iCk;
        if (this.WPU != 0) {
            i2 = i3;
        }
        if (M() == 0 || i2 == 0) {
            return;
        }
        rR(i2, state);
        int[] iArr = this.bzg;
        if (iArr == null || iArr.length < this.f41212o) {
            this.bzg = new int[this.f41212o];
        }
        int i5 = 0;
        for (int i7 = 0; i7 < this.f41212o; i7++) {
            LayoutState layoutState = this.ViF;
            if (layoutState.nr == -1) {
                iQie = layoutState.J2;
                iCk = this.f41209Z[i7].ck(iQie);
            } else {
                iQie = this.f41209Z[i7].qie(layoutState.Uo);
                iCk = this.ViF.Uo;
            }
            int i8 = iQie - iCk;
            if (i8 >= 0) {
                this.bzg[i5] = i8;
                i5++;
            }
        }
        Arrays.sort(this.bzg, 0, i5);
        for (int i9 = 0; i9 < i5 && this.ViF.n(state); i9++) {
            layoutPrefetchRegistry.n(this.ViF.f41105t, this.bzg[i9]);
            LayoutState layoutState2 = this.ViF;
            layoutState2.f41105t += layoutState2.nr;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean lS() {
        return this.f41205N == null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int n1(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.WPU == 0) {
            return Math.min(this.f41212o, state.rl());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void n7b(int i2) {
        if (i2 == 0) {
            WH();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean nY() {
        return this.WPU == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable o9() {
        int iCk;
        int iAz;
        int[] iArr;
        if (this.f41205N != null) {
            return new SavedState(this.f41205N);
        }
        SavedState savedState = new SavedState();
        savedState.f41224S = this.nY;
        savedState.f41226g = this.f41208X;
        savedState.E2 = this.f41207T;
        LazySpanLookup lazySpanLookup = this.E2;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f41219n) == null) {
            savedState.f41229r = 0;
        } else {
            savedState.f41228o = iArr;
            savedState.f41229r = iArr.length;
            savedState.f41225Z = lazySpanLookup.rl;
        }
        if (M() <= 0) {
            savedState.f41227n = -1;
            savedState.f41230t = -1;
            savedState.f41223O = 0;
            return savedState;
        }
        savedState.f41227n = this.f41208X ? fq() : Xli();
        savedState.f41230t = GH3();
        int i2 = this.f41212o;
        savedState.f41223O = i2;
        savedState.J2 = new int[i2];
        for (int i3 = 0; i3 < this.f41212o; i3++) {
            if (this.f41208X) {
                iCk = this.f41209Z[i3].qie(Integer.MIN_VALUE);
                if (iCk != Integer.MIN_VALUE) {
                    iAz = this.XQ.xMQ();
                    iCk -= iAz;
                }
            } else {
                iCk = this.f41209Z[i3].ck(Integer.MIN_VALUE);
                if (iCk != Integer.MIN_VALUE) {
                    iAz = this.XQ.az();
                    iCk -= iAz;
                }
            }
            savedState.J2[i3] = iCk;
        }
        return savedState;
    }

    View t1J(boolean z2) {
        int iAz = this.XQ.az();
        int iXMQ = this.XQ.xMQ();
        int iM = M();
        View view = null;
        for (int i2 = 0; i2 < iM; i2++) {
            View viewE = E(i2);
            int iUo = this.XQ.Uo(viewE);
            if (this.XQ.nr(viewE) > iAz && iUo < iXMQ) {
                if (iUo >= iAz || !z2) {
                    return viewE;
                }
                if (view == null) {
                    view = viewE;
                }
            }
        }
        return view;
    }

    public void tdZ(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        XQ(null);
        if (i2 == this.WPU) {
            return;
        }
        this.WPU = i2;
        OrientationHelper orientationHelper = this.XQ;
        this.XQ = this.f41206S;
        this.f41206S = orientationHelper;
        QgZ();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void uQ(RecyclerView recyclerView, RecyclerView.State state, int i2) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.ck(i2);
        wKY(linearSmoothScroller);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void v0j(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f41205N = savedState;
            if (this.iF != -1) {
                savedState.n();
                this.f41205N.rl();
            }
            QgZ();
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        RecyclerView.LayoutManager.Properties propertiesEWT = RecyclerView.LayoutManager.eWT(context, attributeSet, i2, i3);
        tdZ(propertiesEWT.f41167n);
        Rc(propertiesEWT.rl);
        GRh(propertiesEWT.f41168t);
        this.ViF = new LayoutState();
        fW();
    }

    private int A(int i2) {
        boolean z2;
        if (M() == 0) {
            if (!this.f41211g) {
                return -1;
            }
            return 1;
        }
        if (i2 < Xli()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != this.f41211g) {
            return -1;
        }
        return 1;
    }

    private void JI(RecyclerView.Recycler recycler, int i2) {
        while (M() > 0) {
            View viewE = E(0);
            if (this.XQ.nr(viewE) <= i2 && this.XQ.ck(viewE) <= i2) {
                LayoutParams layoutParams = (LayoutParams) viewE.getLayoutParams();
                if (layoutParams.J2) {
                    for (int i3 = 0; i3 < this.f41212o; i3++) {
                        if (this.f41209Z[i3].f41232n.size() == 1) {
                            return;
                        }
                    }
                    for (int i5 = 0; i5 < this.f41212o; i5++) {
                        this.f41209Z[i5].Z();
                    }
                } else if (layoutParams.f41218O.f41232n.size() != 1) {
                    layoutParams.f41218O.Z();
                } else {
                    return;
                }
                wKp(viewE, recycler);
            } else {
                return;
            }
        }
    }

    private int d(RecyclerView.State state) {
        if (M() == 0) {
            return 0;
        }
        return ScrollbarHelper.rl(state, this.XQ, t1J(!this.rV9), Om(!this.rV9), this, this.rV9, this.f41211g);
    }

    private void eb(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z2) {
        int iAz;
        int iLRt = lRt(Integer.MAX_VALUE);
        if (iLRt != Integer.MAX_VALUE && (iAz = iLRt - this.XQ.az()) > 0) {
            int iIu = iAz - iu(iAz, recycler, state);
            if (z2 && iIu > 0) {
                this.XQ.r(-iIu);
            }
        }
    }

    private int l2(int i2) {
        int iM = M();
        for (int i3 = 0; i3 < iM; i3++) {
            int iFcU = fcU(E(i3));
            if (iFcU >= 0 && iFcU < i2) {
                return iFcU;
            }
        }
        return 0;
    }

    private void pr(Span span, int i2, int i3) {
        int iMUb = span.mUb();
        if (i2 == -1) {
            if (span.HI() + iMUb <= i3) {
                this.te.set(span.f41231O, false);
            }
        } else if (span.gh() - iMUb >= i3) {
            this.te.set(span.f41231O, false);
        }
    }

    private int qva(RecyclerView.State state) {
        if (M() == 0) {
            return 0;
        }
        return ScrollbarHelper.n(state, this.XQ, t1J(!this.rV9), Om(!this.rV9), this, this.rV9);
    }

    private int rT(RecyclerView.State state) {
        if (M() == 0) {
            return 0;
        }
        return ScrollbarHelper.t(state, this.XQ, t1J(!this.rV9), Om(!this.rV9), this, this.rV9);
    }

    private void sFO(RecyclerView.Recycler recycler, int i2) {
        for (int iM = M() - 1; iM >= 0; iM--) {
            View viewE = E(iM);
            if (this.XQ.Uo(viewE) >= i2 && this.XQ.Ik(viewE) >= i2) {
                LayoutParams layoutParams = (LayoutParams) viewE.getLayoutParams();
                if (layoutParams.J2) {
                    for (int i3 = 0; i3 < this.f41212o; i3++) {
                        if (this.f41209Z[i3].f41232n.size() == 1) {
                            return;
                        }
                    }
                    for (int i5 = 0; i5 < this.f41212o; i5++) {
                        this.f41209Z[i5].o();
                    }
                } else if (layoutParams.f41218O.f41232n.size() != 1) {
                    layoutParams.f41218O.o();
                } else {
                    return;
                }
                wKp(viewE, recycler);
            } else {
                return;
            }
        }
    }

    private int w(int i2) {
        for (int iM = M() - 1; iM >= 0; iM--) {
            int iFcU = fcU(E(iM));
            if (iFcU >= 0 && iFcU < i2) {
                return iFcU;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View Bu(View view, int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        View viewXw;
        int iXli;
        boolean z2;
        boolean z3;
        int iUo;
        int iUo2;
        int iUo3;
        View viewAz;
        if (M() == 0 || (viewXw = Xw(view)) == null) {
            return null;
        }
        jX();
        int iL = L(i2);
        if (iL == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) viewXw.getLayoutParams();
        boolean z4 = layoutParams.J2;
        Span span = layoutParams.f41218O;
        if (iL == 1) {
            iXli = fq();
        } else {
            iXli = Xli();
        }
        poH(iXli, state);
        Qg8(iL);
        LayoutState layoutState = this.ViF;
        layoutState.f41105t = layoutState.nr + iXli;
        layoutState.rl = (int) (this.XQ.ty() * 0.33333334f);
        LayoutState layoutState2 = this.ViF;
        layoutState2.KN = true;
        layoutState2.f41104n = false;
        c32(recycler, layoutState2, state);
        this.f41208X = this.f41211g;
        if (!z4 && (viewAz = span.az(iXli, iL)) != null && viewAz != viewXw) {
            return viewAz;
        }
        if (XUb(iL)) {
            for (int i3 = this.f41212o - 1; i3 >= 0; i3--) {
                View viewAz2 = this.f41209Z[i3].az(iXli, iL);
                if (viewAz2 != null && viewAz2 != viewXw) {
                    return viewAz2;
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f41212o; i5++) {
                View viewAz3 = this.f41209Z[i5].az(iXli, iL);
                if (viewAz3 != null && viewAz3 != viewXw) {
                    return viewAz3;
                }
            }
        }
        boolean z5 = !this.nY;
        if (iL == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z5 == z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z4) {
            if (z3) {
                iUo3 = span.J2();
            } else {
                iUo3 = span.Uo();
            }
            View viewJB = jB(iUo3);
            if (viewJB != null && viewJB != viewXw) {
                return viewJB;
            }
        }
        if (XUb(iL)) {
            for (int i7 = this.f41212o - 1; i7 >= 0; i7--) {
                if (i7 != span.f41231O) {
                    if (z3) {
                        iUo2 = this.f41209Z[i7].J2();
                    } else {
                        iUo2 = this.f41209Z[i7].Uo();
                    }
                    View viewJB2 = jB(iUo2);
                    if (viewJB2 != null && viewJB2 != viewXw) {
                        return viewJB2;
                    }
                }
            }
        } else {
            for (int i8 = 0; i8 < this.f41212o; i8++) {
                if (z3) {
                    iUo = this.f41209Z[i8].J2();
                } else {
                    iUo = this.f41209Z[i8].Uo();
                }
                View viewJB3 = jB(iUo);
                if (viewJB3 != null && viewJB3 != viewXw) {
                    return viewJB3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int E2(RecyclerView.State state) {
        return qva(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void F(int i2) {
        super.F(i2);
        for (int i3 = 0; i3 < this.f41212o; i3++) {
            this.f41209Z[i3].r(i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void HBN(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.Qu(view, accessibilityNodeInfoCompat);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int i2 = 1;
        if (this.WPU == 0) {
            int iO = layoutParams2.O();
            if (layoutParams2.J2) {
                i2 = this.f41212o;
            }
            accessibilityNodeInfoCompat.G7(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.n(iO, i2, -1, -1, false, false));
            return;
        }
        int iO2 = layoutParams2.O();
        if (layoutParams2.J2) {
            i2 = this.f41212o;
        }
        accessibilityNodeInfoCompat.G7(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.n(-1, -1, iO2, i2, false, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF KN(int i2) {
        int iA = A(i2);
        PointF pointF = new PointF();
        if (iA == 0) {
            return null;
        }
        if (this.WPU == 0) {
            pointF.x = iA;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = iA;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int N(RecyclerView.State state) {
        return d(state);
    }

    boolean NC9(RecyclerView.State state, AnchorInfo anchorInfo) {
        int i2;
        int iXli;
        int iAz;
        boolean z2 = false;
        if (!state.O() && (i2 = this.iF) != -1) {
            if (i2 >= 0 && i2 < state.rl()) {
                SavedState savedState = this.f41205N;
                if (savedState != null && savedState.f41227n != -1 && savedState.f41223O >= 1) {
                    anchorInfo.rl = Integer.MIN_VALUE;
                    anchorInfo.f41216n = this.iF;
                } else {
                    View viewJB = jB(this.iF);
                    if (viewJB != null) {
                        if (this.f41211g) {
                            iXli = fq();
                        } else {
                            iXli = Xli();
                        }
                        anchorInfo.f41216n = iXli;
                        if (this.fD != Integer.MIN_VALUE) {
                            if (anchorInfo.f41217t) {
                                anchorInfo.rl = (this.XQ.xMQ() - this.fD) - this.XQ.nr(viewJB);
                            } else {
                                anchorInfo.rl = (this.XQ.az() + this.fD) - this.XQ.Uo(viewJB);
                            }
                            return true;
                        }
                        if (this.XQ.O(viewJB) > this.XQ.ty()) {
                            if (anchorInfo.f41217t) {
                                iAz = this.XQ.xMQ();
                            } else {
                                iAz = this.XQ.az();
                            }
                            anchorInfo.rl = iAz;
                            return true;
                        }
                        int iUo = this.XQ.Uo(viewJB) - this.XQ.az();
                        if (iUo < 0) {
                            anchorInfo.rl = -iUo;
                            return true;
                        }
                        int iXMQ = this.XQ.xMQ() - this.XQ.nr(viewJB);
                        if (iXMQ < 0) {
                            anchorInfo.rl = iXMQ;
                            return true;
                        }
                        anchorInfo.rl = Integer.MIN_VALUE;
                    } else {
                        int i3 = this.iF;
                        anchorInfo.f41216n = i3;
                        int i5 = this.fD;
                        if (i5 == Integer.MIN_VALUE) {
                            if (A(i3) == 1) {
                                z2 = true;
                            }
                            anchorInfo.f41217t = z2;
                            anchorInfo.n();
                        } else {
                            anchorInfo.rl(i5);
                        }
                        anchorInfo.nr = true;
                    }
                }
                return true;
            }
            this.iF = -1;
            this.fD = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int T(RecyclerView.State state) {
        return qva(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void T3L(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.T3L(recyclerView, recycler);
        xzo(this.Xw);
        for (int i2 = 0; i2 < this.f41212o; i2++) {
            this.f41209Z[i2].O();
        }
        recyclerView.requestLayout();
    }

    boolean WH() {
        int iXli;
        int iFq;
        int i2;
        if (M() == 0 || this.f41210e == 0 || !GD()) {
            return false;
        }
        if (this.f41211g) {
            iXli = fq();
            iFq = Xli();
        } else {
            iXli = Xli();
            iFq = fq();
        }
        if (iXli == 0 && gxH() != null) {
            this.E2.rl();
            j();
            QgZ();
            return true;
        }
        if (!this.f41213v) {
            return false;
        }
        if (this.f41211g) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        int i3 = iFq + 1;
        LazySpanLookup.FullSpanItem fullSpanItemO = this.E2.O(iXli, i3, i2, true);
        if (fullSpanItemO == null) {
            this.f41213v = false;
            this.E2.nr(i3);
            return false;
        }
        LazySpanLookup.FullSpanItem fullSpanItemO2 = this.E2.O(iXli, fullSpanItemO.f41221n, i2 * (-1), true);
        if (fullSpanItemO2 == null) {
            this.E2.nr(fullSpanItemO.f41221n);
        } else {
            this.E2.nr(fullSpanItemO2.f41221n + 1);
        }
        j();
        QgZ();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int X(RecyclerView.State state) {
        return rT(state);
    }

    int Xli() {
        if (M() == 0) {
            return 0;
        }
        return fcU(E(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void a63(int i2) {
        super.a63(i2);
        for (int i3 = 0; i3 < this.f41212o; i3++) {
            this.f41209Z[i3].r(i2);
        }
    }

    boolean c() {
        if (m() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int e(RecyclerView.State state) {
        return d(state);
    }

    void ex(RecyclerView.State state, AnchorInfo anchorInfo) {
        if (NC9(state, anchorInfo) || W5k(state, anchorInfo)) {
            return;
        }
        anchorInfo.n();
        anchorInfo.f41216n = 0;
    }

    int fq() {
        int iM = M();
        if (iM == 0) {
            return 0;
        }
        return fcU(E(iM - 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    View gxH() {
        byte b2;
        int i2;
        boolean z2;
        boolean z3;
        int iM = M();
        int i3 = iM - 1;
        BitSet bitSet = new BitSet(this.f41212o);
        bitSet.set(0, this.f41212o, true);
        int i5 = -1;
        if (this.WPU == 1 && c()) {
            b2 = 1;
        } else {
            b2 = -1;
        }
        if (this.f41211g) {
            iM = -1;
        } else {
            i3 = 0;
        }
        if (i3 < iM) {
            i5 = 1;
        }
        while (i3 != iM) {
            View viewE = E(i3);
            LayoutParams layoutParams = (LayoutParams) viewE.getLayoutParams();
            if (bitSet.get(layoutParams.f41218O.f41231O)) {
                if (!oz(layoutParams.f41218O)) {
                    bitSet.clear(layoutParams.f41218O.f41231O);
                    if (!layoutParams.J2) {
                        View viewE2 = E(i2);
                        if (!this.f41211g) {
                        }
                    }
                    i3 += i5;
                }
            } else {
                if (!layoutParams.J2 && (i2 = i3 + i5) != iM) {
                    View viewE22 = E(i2);
                    if (!this.f41211g) {
                        int iNr = this.XQ.nr(viewE);
                        int iNr2 = this.XQ.nr(viewE22);
                        if (iNr >= iNr2) {
                            if (iNr == iNr2) {
                                if (layoutParams.f41218O.f41231O - ((LayoutParams) viewE22.getLayoutParams()).f41218O.f41231O < 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (b2 < 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z2 != z3) {
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        int iUo = this.XQ.Uo(viewE);
                        int iUo2 = this.XQ.Uo(viewE22);
                        if (iUo <= iUo2) {
                            if (iUo != iUo2) {
                                continue;
                            }
                        }
                    }
                }
                i3 += i5;
            }
            return viewE;
        }
        return null;
    }

    int iu(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (M() == 0 || i2 == 0) {
            return 0;
        }
        rR(i2, state);
        int iC32 = c32(recycler, this.ViF, state);
        if (this.ViF.rl >= iC32) {
            if (i2 < 0) {
                i2 = -iC32;
            } else {
                i2 = iC32;
            }
        }
        this.XQ.r(-i2);
        this.f41208X = this.f41211g;
        LayoutState layoutState = this.ViF;
        layoutState.rl = 0;
        V5F(recycler, layoutState);
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int nHg(RecyclerView.State state) {
        return rT(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void p0N(AccessibilityEvent accessibilityEvent) {
        super.p0N(accessibilityEvent);
        if (M() > 0) {
            View viewT1J = t1J(false);
            View viewOm = Om(false);
            if (viewT1J != null && viewOm != null) {
                int iFcU = fcU(viewT1J);
                int iFcU2 = fcU(viewOm);
                if (iFcU < iFcU2) {
                    accessibilityEvent.setFromIndex(iFcU);
                    accessibilityEvent.setToIndex(iFcU2);
                } else {
                    accessibilityEvent.setFromIndex(iFcU2);
                    accessibilityEvent.setToIndex(iFcU);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void pS(Rect rect, int i2, int i3) {
        int iTe;
        int iTe2;
        int iC = C() + Mx();
        int iG7 = G7() + ofS();
        if (this.WPU == 1) {
            iTe2 = RecyclerView.LayoutManager.te(i3, rect.height() + iG7, xg());
            iTe = RecyclerView.LayoutManager.te(i2, (this.aYN * this.f41212o) + iC, pJg());
        } else {
            iTe = RecyclerView.LayoutManager.te(i2, rect.width() + iC, pJg());
            iTe2 = RecyclerView.LayoutManager.te(i3, (this.aYN * this.f41212o) + iG7, xg());
        }
        EN(iTe, iTe2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int rxp(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return iu(i2, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void ub(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.ub(recycler, state, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.ofS("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int waP(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return iu(i2, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void y(RecyclerView.State state) {
        super.y(state);
        this.iF = -1;
        this.fD = Integer.MIN_VALUE;
        this.f41205N = null;
        this.wTp.t();
    }
}
