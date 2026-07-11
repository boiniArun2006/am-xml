package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.annotation.RequiresApi;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.media3.common.C;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class GridLayoutManager extends LinearLayoutManager {
    private static final Set p5 = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    int M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    boolean f41073N;
    int P5;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f41074U;
    final Rect Xw;
    SpanSizeLookup bzg;
    private boolean jB;
    int nHg;
    final SparseIntArray rV9;
    int[] s7N;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final SparseIntArray f41075v;
    View[] wTp;

    public static final class DefaultSpanSizeLookup extends SpanSizeLookup {
        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int J2(int i2) {
            return 1;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int O(int i2, int i3) {
            return i2 % i3;
        }
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f41076O;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f41076O = -1;
            this.J2 = 0;
        }

        public int J2() {
            return this.J2;
        }

        public int O() {
            return this.f41076O;
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.f41076O = -1;
            this.J2 = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f41076O = -1;
            this.J2 = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f41076O = -1;
            this.J2 = 0;
        }
    }

    public static abstract class SpanSizeLookup {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final SparseIntArray f41077n = new SparseIntArray();
        final SparseIntArray rl = new SparseIntArray();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f41078t = false;
        private boolean nr = false;

        public abstract int J2(int i2);

        public void KN() {
            this.f41077n.clear();
        }

        public void Uo() {
            this.rl.clear();
        }

        public int nr(int i2, int i3) {
            int i5;
            int i7;
            int iT;
            int iN;
            if (!this.nr || (iN = n(this.rl, i2)) == -1) {
                i5 = 0;
                i7 = 0;
                iT = 0;
            } else {
                i5 = this.rl.get(iN);
                i7 = iN + 1;
                iT = t(iN, i3) + J2(iN);
                if (iT == i3) {
                    i5++;
                    iT = 0;
                }
            }
            int iJ2 = J2(i2);
            while (i7 < i2) {
                int iJ22 = J2(i7);
                iT += iJ22;
                if (iT == i3) {
                    i5++;
                    iT = 0;
                } else if (iT > i3) {
                    i5++;
                    iT = iJ22;
                }
                i7++;
            }
            return iT + iJ2 > i3 ? i5 + 1 : i5;
        }

        int rl(int i2, int i3) {
            if (!this.nr) {
                return nr(i2, i3);
            }
            int i5 = this.rl.get(i2, -1);
            if (i5 != -1) {
                return i5;
            }
            int iNr = nr(i2, i3);
            this.rl.put(i2, iNr);
            return iNr;
        }

        int t(int i2, int i3) {
            if (!this.f41078t) {
                return O(i2, i3);
            }
            int i5 = this.f41077n.get(i2, -1);
            if (i5 != -1) {
                return i5;
            }
            int iO = O(i2, i3);
            this.f41077n.put(i2, iO);
            return iO;
        }

        static int n(SparseIntArray sparseIntArray, int i2) {
            int size = sparseIntArray.size() - 1;
            int i3 = 0;
            while (i3 <= size) {
                int i5 = (i3 + size) >>> 1;
                if (sparseIntArray.keyAt(i5) < i2) {
                    i3 = i5 + 1;
                } else {
                    size = i5 - 1;
                }
            }
            int i7 = i3 - 1;
            if (i7 >= 0 && i7 < sparseIntArray.size()) {
                return sparseIntArray.keyAt(i7);
            }
            return -1;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:17:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int O(int i2, int i3) {
            int iN;
            int iJ2;
            int iJ22 = J2(i2);
            if (iJ22 == i3) {
                return 0;
            }
            if (this.f41078t && (iN = n(this.f41077n, i2)) >= 0) {
                iJ2 = this.f41077n.get(iN) + J2(iN);
                iN++;
                if (iN >= i2) {
                }
            } else {
                iN = 0;
                iJ2 = 0;
                if (iN >= i2) {
                    int iJ23 = J2(iN);
                    iJ2 += iJ23;
                    if (iJ2 == i3) {
                        iJ2 = 0;
                    } else if (iJ2 > i3) {
                        iJ2 = iJ23;
                    }
                    iN++;
                    if (iN >= i2) {
                        if (iJ22 + iJ2 > i3) {
                            return 0;
                        }
                        return iJ2;
                    }
                }
            }
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f41073N = false;
        this.nHg = -1;
        this.f41075v = new SparseIntArray();
        this.rV9 = new SparseIntArray();
        this.bzg = new DefaultSpanSizeLookup();
        this.Xw = new Rect();
        this.f41074U = -1;
        this.P5 = -1;
        this.M7 = -1;
        Ai(RecyclerView.LayoutManager.eWT(context, attributeSet, i2, i3).rl);
    }

    private void GT(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.AnchorInfo anchorInfo, int i2) {
        boolean z2 = i2 == 1;
        int iYUZ = yUZ(recycler, state, anchorInfo.rl);
        if (z2) {
            while (iYUZ > 0) {
                int i3 = anchorInfo.rl;
                if (i3 <= 0) {
                    return;
                }
                int i5 = i3 - 1;
                anchorInfo.rl = i5;
                iYUZ = yUZ(recycler, state, i5);
            }
            return;
        }
        int iRl = state.rl() - 1;
        int i7 = anchorInfo.rl;
        while (i7 < iRl) {
            int i8 = i7 + 1;
            int iYUZ2 = yUZ(recycler, state, i8);
            if (iYUZ2 <= iYUZ) {
                break;
            }
            i7 = i8;
            iYUZ = iYUZ2;
        }
        anchorInfo.rl = i7;
    }

    private void W5k(RecyclerView.Recycler recycler, RecyclerView.State state, int i2, boolean z2) {
        int i3;
        int i5;
        int i7;
        int i8 = 0;
        if (z2) {
            i7 = 1;
            i5 = i2;
            i3 = 0;
        } else {
            i3 = i2 - 1;
            i5 = -1;
            i7 = -1;
        }
        while (i3 != i5) {
            View view = this.wTp[i3];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int iBha = Bha(recycler, state, fcU(view));
            layoutParams.J2 = iBha;
            layoutParams.f41076O = i8;
            i8 += iBha;
            i3 += i7;
        }
    }

    private View b() {
        for (int i2 = 0; i2 < M(); i2++) {
            View viewE = E(i2);
            Objects.requireNonNull(viewE);
            if (Api21Impl.n(viewE)) {
                return E(i2);
            }
        }
        return null;
    }

    private int eOa(int i2, int i3, int i5) {
        for (int i7 = i5 - 1; i7 >= 0; i7--) {
            int iYq = Yq(i7);
            int iVK2 = VK2(i7);
            if (iYq < 0 || iVK2 < 0) {
                break;
            }
            if (this.f41112o == 1) {
                if ((iYq == i2 && iVK2 < i3) || iYq < i2) {
                    this.P5 = iYq;
                    this.M7 = iVK2;
                    return i7;
                }
            } else if (G(i7).contains(Integer.valueOf(i2)) && iVK2 < i3) {
                this.M7 = iVK2;
                return i7;
            }
        }
        return -1;
    }

    private int i7(int i2, int i3, int i5) {
        for (int i7 = i5 + 1; i7 < n(); i7++) {
            int iYq = Yq(i7);
            int iVK2 = VK2(i7);
            if (iYq < 0 || iVK2 < 0) {
                break;
            }
            if (this.f41112o == 1) {
                if ((iYq == i2 && iVK2 > i3) || iYq > i2) {
                    this.P5 = iYq;
                    this.M7 = iVK2;
                    return i7;
                }
            } else if (iVK2 > i3 && G(i7).contains(Integer.valueOf(i2))) {
                this.M7 = iVK2;
                return i7;
            }
        }
        return -1;
    }

    private int jE(int i2, int i3, int i5) {
        for (int i7 = i5 - 1; i7 >= 0; i7--) {
            int iYq = Yq(i7);
            int iVK2 = VK2(i7);
            if (iYq < 0 || iVK2 < 0) {
                break;
            }
            if (this.f41112o == 1) {
                if (iYq < i2 && R3E(i7).contains(Integer.valueOf(i3))) {
                    this.P5 = iYq;
                    return i7;
                }
            } else if (iYq < i2 && iVK2 == i3) {
                this.P5 = ((Integer) Collections.max(G(i7))).intValue();
                return i7;
            }
        }
        return -1;
    }

    private int kC(int i2, int i3, int i5) {
        for (int i7 = i5 + 1; i7 < n(); i7++) {
            int iYq = Yq(i7);
            int iVK2 = VK2(i7);
            if (iYq < 0 || iVK2 < 0) {
                break;
            }
            if (this.f41112o == 1) {
                if (iYq > i2 && (iVK2 == i3 || R3E(i7).contains(Integer.valueOf(i3)))) {
                    this.P5 = iYq;
                    return i7;
                }
            } else if (iYq > i2 && iVK2 == i3) {
                this.P5 = Yq(i7);
                return i7;
            }
        }
        return -1;
    }

    static int[] poH(int[] iArr, int i2, int i3) {
        int i5;
        if (iArr == null || iArr.length != i2 + 1 || iArr[iArr.length - 1] != i3) {
            iArr = new int[i2 + 1];
        }
        int i7 = 0;
        iArr[0] = 0;
        int i8 = i3 / i2;
        int i9 = i3 % i2;
        int i10 = 0;
        for (int i11 = 1; i11 <= i2; i11++) {
            i7 += i9;
            if (i7 <= 0 || i2 - i7 >= i9) {
                i5 = i8;
            } else {
                i5 = i8 + 1;
                i7 -= i2;
            }
            i10 += i5;
            iArr[i11] = i10;
        }
        return iArr;
    }

    int WKb(int i2) {
        if (i2 < 0 || this.f41112o == 1) {
            return -1;
        }
        TreeMap treeMap = new TreeMap();
        for (int i3 = 0; i3 < n(); i3++) {
            for (Integer num : G(i3)) {
                if (num.intValue() < 0) {
                    return -1;
                }
                if (!treeMap.containsKey(num)) {
                    treeMap.put(num, Integer.valueOf(i3));
                }
            }
        }
        for (Integer num2 : treeMap.keySet()) {
            int iIntValue = num2.intValue();
            if (iIntValue > i2) {
                int iIntValue2 = ((Integer) treeMap.get(num2)).intValue();
                this.P5 = iIntValue;
                this.M7 = 0;
                return iIntValue2;
            }
        }
        return -1;
    }

    int ZwA(int i2) {
        if (i2 < 0 || this.f41112o == 1) {
            return -1;
        }
        TreeMap treeMap = new TreeMap(Collections.reverseOrder());
        for (int i3 = 0; i3 < n(); i3++) {
            for (Integer num : G(i3)) {
                if (num.intValue() < 0) {
                    return -1;
                }
                treeMap.put(num, Integer.valueOf(i3));
            }
        }
        for (Integer num2 : treeMap.keySet()) {
            int iIntValue = num2.intValue();
            if (iIntValue < i2) {
                int iIntValue2 = ((Integer) treeMap.get(num2)).intValue();
                this.P5 = iIntValue;
                this.M7 = VK2(iIntValue2);
                return iIntValue2;
            }
        }
        return -1;
    }

    @RequiresApi
    private static class Api21Impl {
        static boolean n(View view) {
            return view.isAccessibilityFocused();
        }
    }

    private void H6M(float f3, int i2) {
        ex(Math.max(Math.round(f3 * this.nHg), i2));
    }

    private int VK2(int i2) {
        if (this.f41112o == 0) {
            RecyclerView recyclerView = this.rl;
            return kR(recyclerView.mRecycler, recyclerView.mState, i2);
        }
        RecyclerView recyclerView2 = this.rl;
        return yUZ(recyclerView2.mRecycler, recyclerView2.mState, i2);
    }

    private void Vd() {
        View[] viewArr = this.wTp;
        if (viewArr == null || viewArr.length != this.nHg) {
            this.wTp = new View[this.nHg];
        }
    }

    private void W1c() {
        this.f41075v.clear();
        this.rV9.clear();
    }

    private int Yq(int i2) {
        if (this.f41112o == 1) {
            RecyclerView recyclerView = this.rl;
            return kR(recyclerView.mRecycler, recyclerView.mState, i2);
        }
        RecyclerView recyclerView2 = this.rl;
        return yUZ(recyclerView2.mRecycler, recyclerView2.mState, i2);
    }

    private void ex(int i2) {
        this.s7N = poH(this.s7N, this.nHg, i2);
    }

    private Set f11(int i2, int i3) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.rl;
        int iBha = Bha(recyclerView.mRecycler, recyclerView.mState, i3);
        for (int i5 = i2; i5 < i2 + iBha; i5++) {
            hashSet.add(Integer.valueOf(i5));
        }
        return hashSet;
    }

    public void Ai(int i2) {
        if (i2 == this.nHg) {
            return;
        }
        this.f41073N = true;
        if (i2 >= 1) {
            this.nHg = i2;
            this.bzg.KN();
            QgZ();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0111  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View Bu(View view, int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int iM;
        int i3;
        int iM2;
        View view2;
        View view3;
        View view4;
        int i5;
        int i7;
        int i8;
        RecyclerView.Recycler recycler2 = recycler;
        RecyclerView.State state2 = state;
        View viewXw = Xw(view);
        View view5 = null;
        if (viewXw == null) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) viewXw.getLayoutParams();
        int i9 = layoutParams.f41076O;
        int i10 = layoutParams.J2 + i9;
        if (super.Bu(view, i2, recycler, state) == null) {
            return null;
        }
        if ((A(i2) == 1) != this.aYN) {
            iM2 = M() - 1;
            iM = -1;
            i3 = -1;
        } else {
            iM = M();
            i3 = 1;
            iM2 = 0;
        }
        boolean z2 = this.f41112o == 1 && wYi();
        int iKR = kR(recycler2, state2, iM2);
        int i11 = -1;
        int i12 = -1;
        int iMin = 0;
        int iMin2 = 0;
        int i13 = iM2;
        View view6 = null;
        while (i13 != iM) {
            int iKR2 = kR(recycler2, state2, i13);
            View viewE = E(i13);
            if (viewE == viewXw) {
                break;
            }
            if (!viewE.hasFocusable() || iKR2 == iKR) {
                LayoutParams layoutParams2 = (LayoutParams) viewE.getLayoutParams();
                int i14 = layoutParams2.f41076O;
                view2 = viewXw;
                int i15 = layoutParams2.J2 + i14;
                if (viewE.hasFocusable() && i14 == i9 && i15 == i10) {
                    return viewE;
                }
                if (!(viewE.hasFocusable() && view5 == null) && (viewE.hasFocusable() || view6 != null)) {
                    view3 = view5;
                    int iMin3 = Math.min(i15, i10) - Math.max(i14, i9);
                    if (!viewE.hasFocusable()) {
                        if (view3 == null) {
                            view4 = view6;
                            i5 = iMin;
                            if (tUK(viewE, false, true)) {
                                i7 = iMin2;
                                if (iMin3 > i7) {
                                    i8 = i12;
                                } else if (iMin3 == i7) {
                                    i8 = i12;
                                    if (z2 == (i14 > i8)) {
                                    }
                                    iMin = i5;
                                    view5 = view3;
                                    i13 += i3;
                                    recycler2 = recycler;
                                    state2 = state;
                                    viewXw = view2;
                                } else {
                                    i8 = i12;
                                }
                                if (viewE.hasFocusable()) {
                                    int i16 = layoutParams2.f41076O;
                                    iMin2 = Math.min(i15, i10) - Math.max(i14, i9);
                                    view6 = viewE;
                                    i12 = i16;
                                    iMin = i5;
                                    view5 = view3;
                                    i13 += i3;
                                    recycler2 = recycler;
                                    state2 = state;
                                    viewXw = view2;
                                } else {
                                    i12 = i8;
                                    iMin2 = i7;
                                    i11 = layoutParams2.f41076O;
                                    view6 = view4;
                                    view5 = viewE;
                                    iMin = Math.min(i15, i10) - Math.max(i14, i9);
                                    i13 += i3;
                                    recycler2 = recycler;
                                    state2 = state;
                                    viewXw = view2;
                                }
                            }
                            i12 = i8;
                            iMin2 = i7;
                            view6 = view4;
                            iMin = i5;
                            view5 = view3;
                            i13 += i3;
                            recycler2 = recycler;
                            state2 = state;
                            viewXw = view2;
                        }
                        i8 = i12;
                        i7 = iMin2;
                        i12 = i8;
                        iMin2 = i7;
                        view6 = view4;
                        iMin = i5;
                        view5 = view3;
                        i13 += i3;
                        recycler2 = recycler;
                        state2 = state;
                        viewXw = view2;
                    } else if (iMin3 <= iMin) {
                        if (iMin3 == iMin) {
                        }
                    }
                } else {
                    view3 = view5;
                }
                view4 = view6;
                i5 = iMin;
                i8 = i12;
                i7 = iMin2;
                if (viewE.hasFocusable()) {
                }
            } else {
                if (view5 != null) {
                    break;
                }
                view2 = viewXw;
                view3 = view5;
            }
            view4 = view6;
            i5 = iMin;
            i8 = i12;
            i7 = iMin2;
            i12 = i8;
            iMin2 = i7;
            view6 = view4;
            iMin = i5;
            view5 = view3;
            i13 += i3;
            recycler2 = recycler;
            state2 = state;
            viewXw = view2;
        }
        View view7 = view5;
        return view7 != null ? view7 : view6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int D(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f41112o == 1) {
            return Math.min(this.nHg, n());
        }
        if (state.rl() < 1) {
            return 0;
        }
        return kR(recycler, state, state.rl() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void I4p(RecyclerView.State state, LinearLayoutManager.LayoutState layoutState, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int iJ2 = this.nHg;
        for (int i2 = 0; i2 < this.nHg && layoutState.t(state) && iJ2 > 0; i2++) {
            int i3 = layoutState.nr;
            layoutPrefetchRegistry.n(i3, Math.max(0, layoutState.Uo));
            iJ2 -= this.bzg.J2(i3);
            layoutState.nr += layoutState.f41118O;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void JI(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.JI(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void JVN(RecyclerView recyclerView, int i2, int i3, int i5) {
        this.bzg.KN();
        this.bzg.Uo();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams M7(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int N(RecyclerView.State state) {
        return this.jB ? pr(state) : super.N(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams P5(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams U() {
        return this.f41112o == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int X(RecyclerView.State state) {
        return this.jB ? ni(state) : super.X(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void X4T(RecyclerView recyclerView, int i2, int i3) {
        this.bzg.KN();
        this.bzg.Uo();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void Zmq(RecyclerView recyclerView) {
        this.bzg.KN();
        this.bzg.Uo();
    }

    int cAB(int i2, int i3) {
        if (this.f41112o != 1 || !wYi()) {
            int[] iArr = this.s7N;
            return iArr[i3 + i2] - iArr[i2];
        }
        int[] iArr2 = this.s7N;
        int i5 = this.nHg;
        return iArr2[i5 - i2] - iArr2[(i5 - i2) - i3];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int e(RecyclerView.State state) {
        return this.jB ? pr(state) : super.e(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean g(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void lRt(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.LayoutState layoutState, LinearLayoutManager.LayoutChunkResult layoutChunkResult) {
        int i2;
        int i3;
        int iC;
        int iG7;
        int iJ2;
        int iJ22;
        int i5;
        int iFX;
        int iFX2;
        View viewNr;
        int iQie = this.XQ.qie();
        boolean z2 = iQie != 1073741824;
        int i7 = M() > 0 ? this.s7N[this.nHg] : 0;
        if (z2) {
            lvn();
        }
        boolean z3 = layoutState.f41118O == 1;
        int iYUZ = this.nHg;
        if (!z3) {
            iYUZ = yUZ(recycler, state, layoutState.nr) + Bha(recycler, state, layoutState.nr);
        }
        int i8 = 0;
        while (i8 < this.nHg && layoutState.t(state) && iYUZ > 0) {
            int i9 = layoutState.nr;
            int iBha = Bha(recycler, state, i9);
            if (iBha > this.nHg) {
                throw new IllegalArgumentException("Item at position " + i9 + " requires " + iBha + " spans but GridLayoutManager has only " + this.nHg + " spans.");
            }
            iYUZ -= iBha;
            if (iYUZ < 0 || (viewNr = layoutState.nr(recycler)) == null) {
                break;
            }
            this.wTp[i8] = viewNr;
            i8++;
        }
        if (i8 == 0) {
            layoutChunkResult.rl = true;
            return;
        }
        W5k(recycler, state, i8, z3);
        float f3 = 0.0f;
        int i10 = 0;
        for (int i11 = 0; i11 < i8; i11++) {
            View view = this.wTp[i11];
            if (layoutState.qie == null) {
                if (z3) {
                    r(view);
                } else {
                    o(view, 0);
                }
            } else if (z3) {
                ck(view);
            } else {
                Ik(view, 0);
            }
            aYN(view, this.Xw);
            hu(view, iQie, false);
            int iO = this.XQ.O(view);
            if (iO > i10) {
                i10 = iO;
            }
            float fJ2 = (this.XQ.J2(view) * 1.0f) / ((LayoutParams) view.getLayoutParams()).J2;
            if (fJ2 > f3) {
                f3 = fJ2;
            }
        }
        if (z2) {
            H6M(f3, i7);
            i10 = 0;
            for (int i12 = 0; i12 < i8; i12++) {
                View view2 = this.wTp[i12];
                hu(view2, 1073741824, true);
                int iO2 = this.XQ.O(view2);
                if (iO2 > i10) {
                    i10 = iO2;
                }
            }
        }
        for (int i13 = 0; i13 < i8; i13++) {
            View view3 = this.wTp[i13];
            if (this.XQ.O(view3) != i10) {
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                Rect rect = layoutParams.rl;
                int i14 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                int i15 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                int iCAB = cAB(layoutParams.f41076O, layoutParams.J2);
                if (this.f41112o == 1) {
                    iFX2 = RecyclerView.LayoutManager.FX(iCAB, 1073741824, i15, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
                    iFX = View.MeasureSpec.makeMeasureSpec(i10 - i14, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - i15, 1073741824);
                    iFX = RecyclerView.LayoutManager.FX(iCAB, 1073741824, i14, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
                    iFX2 = iMakeMeasureSpec;
                }
                ENe(view3, iFX2, iFX, true);
            }
        }
        layoutChunkResult.f41116n = i10;
        if (this.f41112o == 1) {
            if (layoutState.J2 == -1) {
                iJ22 = layoutState.rl;
                i5 = iJ22 - i10;
            } else {
                i5 = layoutState.rl;
                iJ22 = i5 + i10;
            }
            iG7 = i5;
            iJ2 = 0;
            iC = 0;
        } else {
            if (layoutState.J2 == -1) {
                i3 = layoutState.rl;
                i2 = i3 - i10;
            } else {
                i2 = layoutState.rl;
                i3 = i2 + i10;
            }
            iC = i2;
            iG7 = 0;
            iJ2 = i3;
            iJ22 = 0;
        }
        for (int i16 = 0; i16 < i8; i16++) {
            View view4 = this.wTp[i16];
            LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
            if (this.f41112o != 1) {
                iG7 = this.s7N[layoutParams2.f41076O] + G7();
                iJ22 = this.XQ.J2(view4) + iG7;
            } else if (wYi()) {
                iJ2 = C() + this.s7N[this.nHg - layoutParams2.f41076O];
                iC = iJ2 - this.XQ.J2(view4);
            } else {
                iC = this.s7N[layoutParams2.f41076O] + C();
                iJ2 = this.XQ.J2(view4) + iC;
            }
            int i17 = iJ22;
            int i18 = iG7;
            int i19 = iJ2;
            int i20 = iC;
            lLA(view4, i20, i18, i19, i17);
            iJ22 = i17;
            iC = i20;
            iJ2 = i19;
            iG7 = i18;
            if (layoutParams2.t() || layoutParams2.rl()) {
                layoutChunkResult.f41117t = true;
            }
            layoutChunkResult.nr = view4.hasFocusable() | layoutChunkResult.nr;
        }
        Arrays.fill(this.wTp, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean lS() {
        return this.fD == null && !this.f41073N;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int n1(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f41112o == 0) {
            return Math.min(this.nHg, n());
        }
        if (state.rl() < 1) {
            return 0;
        }
        return kR(recycler, state, state.rl() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int nHg(RecyclerView.State state) {
        return this.jB ? ni(state) : super.nHg(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void pS(Rect rect, int i2, int i3) {
        int iTe;
        int iTe2;
        if (this.s7N == null) {
            super.pS(rect, i2, i3);
        }
        int iC = C() + Mx();
        int iG7 = G7() + ofS();
        if (this.f41112o == 1) {
            iTe2 = RecyclerView.LayoutManager.te(i3, rect.height() + iG7, xg());
            int[] iArr = this.s7N;
            iTe = RecyclerView.LayoutManager.te(i2, iArr[iArr.length - 1] + iC, pJg());
        } else {
            iTe = RecyclerView.LayoutManager.te(i2, rect.width() + iC, pJg());
            int[] iArr2 = this.s7N;
            iTe2 = RecyclerView.LayoutManager.te(i3, iArr2[iArr2.length - 1] + iG7, xg());
        }
        EN(iTe, iTe2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    boolean s(int i2, Bundle bundle) {
        RecyclerView.ViewHolder childViewHolder;
        int iEOa;
        if (i2 != AccessibilityNodeInfoCompat.AccessibilityActionCompat.eF.rl() || i2 == -1) {
            if (i2 != 16908343 || bundle == null) {
                return super.s(i2, bundle);
            }
            int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i5 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i3 != -1 && i5 != -1) {
                int itemCount = this.rl.mAdapter.getItemCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= itemCount) {
                        i7 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.rl;
                    int iYUZ = yUZ(recyclerView.mRecycler, recyclerView.mState, i7);
                    RecyclerView recyclerView2 = this.rl;
                    int iKR = kR(recyclerView2.mRecycler, recyclerView2.mState, i7);
                    if (this.f41112o != 1) {
                        if (iYUZ == i3 && iKR == i5) {
                            break;
                        }
                        i7++;
                    } else {
                        if (iYUZ == i5 && iKR == i3) {
                            break;
                        }
                        i7++;
                    }
                }
                if (i7 > -1) {
                    rR(i7, 0);
                    return true;
                }
            }
            return false;
        }
        View viewB = b();
        if (viewB == null || bundle == null) {
            return false;
        }
        int i8 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
        if (!p5.contains(Integer.valueOf(i8)) || (childViewHolder = this.rl.getChildViewHolder(viewB)) == null) {
            return false;
        }
        int absoluteAdapterPosition = childViewHolder.getAbsoluteAdapterPosition();
        int iYq = Yq(absoluteAdapterPosition);
        int iVK2 = VK2(absoluteAdapterPosition);
        if (iYq >= 0 && iVK2 >= 0) {
            if (YE(absoluteAdapterPosition)) {
                this.P5 = iYq;
                this.M7 = iVK2;
            }
            int i9 = this.P5;
            if (i9 == -1) {
                i9 = iYq;
            }
            int i10 = this.M7;
            if (i10 != -1) {
                iVK2 = i10;
            }
            if (i8 == 17) {
                iEOa = eOa(i9, iVK2, absoluteAdapterPosition);
            } else if (i8 == 33) {
                iEOa = jE(i9, iVK2, absoluteAdapterPosition);
            } else if (i8 == 66) {
                iEOa = i7(i9, iVK2, absoluteAdapterPosition);
            } else {
                if (i8 != 130) {
                    return false;
                }
                iEOa = kC(i9, iVK2, absoluteAdapterPosition);
            }
            if (iEOa == -1 && this.f41112o == 0) {
                if (i8 == 17) {
                    iEOa = ZwA(iYq);
                } else if (i8 == 66) {
                    iEOa = WKb(iYq);
                }
            }
            if (iEOa != -1) {
                LPV(iEOa);
                this.f41074U = iEOa;
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void uG(RecyclerView recyclerView, int i2, int i3, Object obj) {
        this.bzg.KN();
        this.bzg.Uo();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void xVH(RecyclerView recyclerView, int i2, int i3) {
        this.bzg.KN();
        this.bzg.Uo();
    }

    private int Bha(RecyclerView.Recycler recycler, RecyclerView.State state, int i2) {
        if (!state.O()) {
            return this.bzg.J2(i2);
        }
        int i3 = this.f41075v.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int iJ2 = recycler.J2(i2);
        if (iJ2 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
            return 1;
        }
        return this.bzg.J2(iJ2);
    }

    private void ENe(View view, int i2, int i3, boolean z2) {
        boolean zH;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z2) {
            zH = eo(view, i2, i3, layoutParams);
        } else {
            zH = h(view, i2, i3, layoutParams);
        }
        if (zH) {
            view.measure(i2, i3);
        }
    }

    private Set G(int i2) {
        return f11(Yq(i2), i2);
    }

    private void NC9() {
        int iM = M();
        for (int i2 = 0; i2 < iM; i2++) {
            LayoutParams layoutParams = (LayoutParams) E(i2).getLayoutParams();
            int iN = layoutParams.n();
            this.f41075v.put(iN, layoutParams.J2());
            this.rV9.put(iN, layoutParams.O());
        }
    }

    private Set R3E(int i2) {
        return f11(VK2(i2), i2);
    }

    private boolean YE(int i2) {
        if (G(i2).contains(Integer.valueOf(this.P5)) && R3E(i2).contains(Integer.valueOf(this.M7))) {
            return false;
        }
        return true;
    }

    private void hu(View view, int i2, boolean z2) {
        int iFX;
        int iFX2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.rl;
        int i3 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int iCAB = cAB(layoutParams.f41076O, layoutParams.J2);
        if (this.f41112o == 1) {
            iFX2 = RecyclerView.LayoutManager.FX(iCAB, i2, i5, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
            iFX = RecyclerView.LayoutManager.FX(this.XQ.ty(), ijL(), i3, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
        } else {
            int iFX3 = RecyclerView.LayoutManager.FX(iCAB, i2, i3, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
            int iFX4 = RecyclerView.LayoutManager.FX(this.XQ.ty(), Org(), i5, ((ViewGroup.MarginLayoutParams) layoutParams).width, true);
            iFX = iFX3;
            iFX2 = iFX4;
        }
        ENe(view, iFX2, iFX, z2);
    }

    private int kR(RecyclerView.Recycler recycler, RecyclerView.State state, int i2) {
        if (!state.O()) {
            return this.bzg.rl(i2, this.nHg);
        }
        int iJ2 = recycler.J2(i2);
        if (iJ2 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
            return 0;
        }
        return this.bzg.rl(iJ2, this.nHg);
    }

    private void lvn() {
        int iPiY;
        int iG7;
        if (C7B() == 1) {
            iPiY = mYa() - Mx();
            iG7 = C();
        } else {
            iPiY = piY() - ofS();
            iG7 = G7();
        }
        ex(iPiY - iG7);
    }

    private int ni(RecyclerView.State state) {
        if (M() != 0 && state.rl() != 0) {
            oz();
            View viewL = L(!TVk(), true);
            View viewRT = rT(!TVk(), true);
            if (viewL != null && viewRT != null) {
                if (!TVk()) {
                    return this.bzg.rl(state.rl() - 1, this.nHg) + 1;
                }
                int iNr = this.XQ.nr(viewRT) - this.XQ.Uo(viewL);
                int iRl = this.bzg.rl(fcU(viewL), this.nHg);
                return (int) ((iNr / ((this.bzg.rl(fcU(viewRT), this.nHg) - iRl) + 1)) * (this.bzg.rl(state.rl() - 1, this.nHg) + 1));
            }
        }
        return 0;
    }

    private int pr(RecyclerView.State state) {
        int iMax;
        if (M() != 0 && state.rl() != 0) {
            oz();
            boolean zTVk = TVk();
            View viewL = L(!zTVk, true);
            View viewRT = rT(!zTVk, true);
            if (viewL != null && viewRT != null) {
                int iRl = this.bzg.rl(fcU(viewL), this.nHg);
                int iRl2 = this.bzg.rl(fcU(viewRT), this.nHg);
                int iMin = Math.min(iRl, iRl2);
                int iMax2 = Math.max(iRl, iRl2);
                int iRl3 = this.bzg.rl(state.rl() - 1, this.nHg) + 1;
                if (this.aYN) {
                    iMax = Math.max(0, (iRl3 - iMax2) - 1);
                } else {
                    iMax = Math.max(0, iMin);
                }
                if (!zTVk) {
                    return iMax;
                }
                return Math.round((iMax * (Math.abs(this.XQ.nr(viewRT) - this.XQ.Uo(viewL)) / ((this.bzg.rl(fcU(viewRT), this.nHg) - this.bzg.rl(fcU(viewL), this.nHg)) + 1))) + (this.XQ.az() - this.XQ.Uo(viewL)));
            }
        }
        return 0;
    }

    private int yUZ(RecyclerView.Recycler recycler, RecyclerView.State state, int i2) {
        if (!state.O()) {
            return this.bzg.t(i2, this.nHg);
        }
        int i3 = this.rV9.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int iJ2 = recycler.J2(i2);
        if (iJ2 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
            return 0;
        }
        return this.bzg.t(iJ2, this.nHg);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View GH3(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z2, boolean z3) {
        int i2;
        int iM;
        int iM2 = M();
        int i3 = 1;
        if (z3) {
            iM = M() - 1;
            i2 = -1;
            i3 = -1;
        } else {
            i2 = iM2;
            iM = 0;
        }
        int iRl = state.rl();
        oz();
        int iAz = this.XQ.az();
        int iXMQ = this.XQ.xMQ();
        View view = null;
        View view2 = null;
        while (iM != i2) {
            View viewE = E(iM);
            int iFcU = fcU(viewE);
            if (iFcU >= 0 && iFcU < iRl && yUZ(recycler, state, iFcU) == 0) {
                if (((RecyclerView.LayoutParams) viewE.getLayoutParams()).t()) {
                    if (view2 == null) {
                        view2 = viewE;
                    }
                } else {
                    if (this.XQ.Uo(viewE) < iXMQ && this.XQ.nr(viewE) >= iAz) {
                        return viewE;
                    }
                    if (view == null) {
                        view = viewE;
                    }
                }
            }
            iM += i3;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void HBN(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.Qu(view, accessibilityNodeInfoCompat);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int iKR = kR(recycler, state, layoutParams2.n());
        if (this.f41112o == 0) {
            accessibilityNodeInfoCompat.G7(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.n(layoutParams2.O(), layoutParams2.J2(), iKR, 1, false, false));
        } else {
            accessibilityNodeInfoCompat.G7(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.n(iKR, 1, layoutParams2.O(), layoutParams2.J2(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void Vvq(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.O()) {
            NC9();
        }
        super.Vvq(recycler, state);
        W1c();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int rxp(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        lvn();
        Vd();
        return super.rxp(i2, recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void ub(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.ub(recycler, state, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.ofS(GridView.class.getName());
        RecyclerView.Adapter adapter = this.rl.mAdapter;
        if (adapter != null && adapter.getItemCount() > 1) {
            accessibilityNodeInfoCompat.rl(AccessibilityNodeInfoCompat.AccessibilityActionCompat.eF);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int waP(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        lvn();
        Vd();
        return super.waP(i2, recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void y(RecyclerView.State state) {
        View viewJB;
        super.y(state);
        this.f41073N = false;
        int i2 = this.f41074U;
        if (i2 != -1 && (viewJB = jB(i2)) != null) {
            viewJB.sendAccessibilityEvent(C.BUFFER_FLAG_NOT_DEPENDED_ON);
            this.f41074U = -1;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void yA(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.AnchorInfo anchorInfo, int i2) {
        super.yA(recycler, state, anchorInfo, i2);
        lvn();
        if (state.rl() > 0 && !state.O()) {
            GT(recycler, state, anchorInfo, i2);
        }
        Vd();
    }

    public GridLayoutManager(Context context, int i2) {
        super(context);
        this.f41073N = false;
        this.nHg = -1;
        this.f41075v = new SparseIntArray();
        this.rV9 = new SparseIntArray();
        this.bzg = new DefaultSpanSizeLookup();
        this.Xw = new Rect();
        this.f41074U = -1;
        this.P5 = -1;
        this.M7 = -1;
        Ai(i2);
    }

    public GridLayoutManager(Context context, int i2, int i3, boolean z2) {
        super(context, i3, z2);
        this.f41073N = false;
        this.nHg = -1;
        this.f41075v = new SparseIntArray();
        this.rV9 = new SparseIntArray();
        this.bzg = new DefaultSpanSizeLookup();
        this.Xw = new Rect();
        this.f41074U = -1;
        this.P5 = -1;
        this.M7 = -1;
        Ai(i2);
    }
}
