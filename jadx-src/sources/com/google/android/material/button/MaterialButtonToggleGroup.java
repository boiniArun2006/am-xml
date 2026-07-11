package com.google.android.material.button;

import Rxk.C;
import Rxk.o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.annotation.BoolRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.eO;
import com.google.android.material.internal.l3D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import mfo.C;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final int f58749T = C.aYN;
    private final int E2;
    private final Comparator J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final LinkedHashSet f58750O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f58751S;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Set f58752e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f58753g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f58754n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f58755o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Integer[] f58756r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final I28 f58757t;

    private class I28 implements MaterialButton.j {
        private I28() {
        }

        /* synthetic */ I28(MaterialButtonToggleGroup materialButtonToggleGroup, j jVar) {
            this();
        }

        @Override // com.google.android.material.button.MaterialButton.j
        public void n(MaterialButton materialButton, boolean z2) {
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    public interface Ml {
        void n(MaterialButtonToggleGroup materialButtonToggleGroup, int i2, boolean z2);
    }

    class j implements Comparator {
        j() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            return Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    class n extends AccessibilityDelegateCompat {
        n() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void Uo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.Uo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.G7(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.n(0, 1, MaterialButtonToggleGroup.this.xMQ(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    private static class w6 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final mfo.w6 f58760O = new mfo.j(0.0f);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        mfo.w6 f58761n;
        mfo.w6 nr;
        mfo.w6 rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        mfo.w6 f58762t;

        public static w6 J2(w6 w6Var) {
            mfo.w6 w6Var2 = w6Var.f58761n;
            mfo.w6 w6Var3 = f58760O;
            return new w6(w6Var2, w6Var3, w6Var.rl, w6Var3);
        }

        public static w6 n(w6 w6Var) {
            mfo.w6 w6Var2 = f58760O;
            return new w6(w6Var2, w6Var.nr, w6Var2, w6Var.f58762t);
        }

        public static w6 nr(w6 w6Var) {
            mfo.w6 w6Var2 = f58760O;
            return new w6(w6Var2, w6Var2, w6Var.rl, w6Var.f58762t);
        }

        public static w6 t(w6 w6Var) {
            mfo.w6 w6Var2 = w6Var.f58761n;
            mfo.w6 w6Var3 = w6Var.nr;
            mfo.w6 w6Var4 = f58760O;
            return new w6(w6Var2, w6Var3, w6Var4, w6Var4);
        }

        w6(mfo.w6 w6Var, mfo.w6 w6Var2, mfo.w6 w6Var3, mfo.w6 w6Var4) {
            this.f58761n = w6Var;
            this.rl = w6Var3;
            this.f58762t = w6Var4;
            this.nr = w6Var2;
        }

        public static w6 O(w6 w6Var, View view) {
            if (l3D.Uo(view)) {
                return nr(w6Var);
            }
            return t(w6Var);
        }

        public static w6 rl(w6 w6Var, View view) {
            if (l3D.Uo(view)) {
                return t(w6Var);
            }
            return nr(w6Var);
        }
    }

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, Rxk.n.aYN);
    }

    private void O(int i2, boolean z2) {
        if (i2 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i2);
            return;
        }
        HashSet hashSet = new HashSet(this.f58752e);
        if (z2 && !hashSet.contains(Integer.valueOf(i2))) {
            if (this.f58751S && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i2));
        } else {
            if (z2 || !hashSet.contains(Integer.valueOf(i2))) {
                return;
            }
            if (!this.f58753g || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i2));
            }
        }
        Ik(hashSet);
    }

    private void Z() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            KN(i2).setA11yClassName((this.f58751S ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    private int getVisibleButtonCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if ((getChildAt(i3) instanceof MaterialButton) && gh(i3)) {
                i2++;
            }
        }
        return i2;
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f58757t);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public void setSingleSelection(boolean z2) {
        if (this.f58751S != z2) {
            this.f58751S = z2;
            J2();
        }
        Z();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i2) {
        int i3 = f58749T;
        super(scw.j.t(context, attributeSet, i2, i3), attributeSet, i2);
        this.f58754n = new ArrayList();
        this.f58757t = new I28(this, null);
        this.f58750O = new LinkedHashSet();
        this.J2 = new j();
        this.f58755o = false;
        this.f58752e = new HashSet();
        TypedArray typedArrayXMQ = eO.xMQ(getContext(), attributeSet, o.kC, i2, i3, new int[0]);
        setSingleSelection(typedArrayXMQ.getBoolean(o.R3E, false));
        this.E2 = typedArrayXMQ.getResourceId(o.i7, -1);
        this.f58753g = typedArrayXMQ.getBoolean(o.VK2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayXMQ.getBoolean(o.eOa, true));
        typedArrayXMQ.recycle();
        ViewCompat.ul(this, 1);
    }

    private void Ik(Set set) {
        Set set2 = this.f58752e;
        this.f58752e = new HashSet(set);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = KN(i2).getId();
            HI(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                Uo(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    private void Uo(int i2, boolean z2) {
        Iterator it = this.f58750O.iterator();
        while (it.hasNext()) {
            ((Ml) it.next()).n(this, i2, z2);
        }
    }

    private static void ck(C.n nVar, w6 w6Var) {
        if (w6Var == null) {
            nVar.HI(0.0f);
        } else {
            nVar.te(w6Var.f58761n).Z(w6Var.nr).e(w6Var.rl).aYN(w6Var.f58762t);
        }
    }

    private w6 mUb(int i2, int i3, int i5) {
        w6 w6Var = (w6) this.f58754n.get(i2);
        if (i3 == i5) {
            return w6Var;
        }
        boolean z2 = getOrientation() == 0;
        if (i2 == i3) {
            return z2 ? w6.O(w6Var, this) : w6.J2(w6Var);
        }
        if (i2 == i5) {
            return z2 ? w6.rl(w6Var, this) : w6.n(w6Var);
        }
        return null;
    }

    private void r() {
        TreeMap treeMap = new TreeMap(this.J2);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            treeMap.put(KN(i2), Integer.valueOf(i2));
        }
        this.f58756r = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int xMQ(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == view) {
                return i2;
            }
            if ((getChildAt(i3) instanceof MaterialButton) && gh(i3)) {
                i2++;
            }
        }
        return -1;
    }

    public void J2() {
        Ik(new HashSet());
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i2, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        O(materialButton.getId(), materialButton.isChecked());
        mfo.C shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f58754n.add(new w6(shapeAppearanceModel.r(), shapeAppearanceModel.mUb(), shapeAppearanceModel.Z(), shapeAppearanceModel.qie()));
        materialButton.setEnabled(isEnabled());
        ViewCompat.eTf(materialButton, new n());
    }

    void az(MaterialButton materialButton, boolean z2) {
        if (this.f58755o) {
            return;
        }
        O(materialButton.getId(), z2);
    }

    @IdRes
    public int getCheckedButtonId() {
        if (!this.f58751S || this.f58752e.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f58752e.iterator().next()).intValue();
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = KN(i2).getId();
            if (this.f58752e.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        Integer[] numArr = this.f58756r;
        if (numArr != null && i3 < numArr.length) {
            return numArr[i3].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i3;
    }

    public boolean qie() {
        return this.f58751S;
    }

    public void rl(Ml ml) {
        this.f58750O.add(ml);
    }

    public void setSelectionRequired(boolean z2) {
        this.f58753g = z2;
    }

    private void HI(int i2, boolean z2) {
        View viewFindViewById = findViewById(i2);
        if (viewFindViewById instanceof MaterialButton) {
            this.f58755o = true;
            ((MaterialButton) viewFindViewById).setChecked(z2);
            this.f58755o = false;
        }
    }

    private MaterialButton KN(int i2) {
        return (MaterialButton) getChildAt(i2);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (gh(i2)) {
                return i2;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (gh(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private boolean gh(int i2) {
        if (getChildAt(i2).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    private LinearLayout.LayoutParams nr(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(ViewCompat.gh());
        }
    }

    private void t() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
            MaterialButton materialButtonKN = KN(i2);
            int iMin = Math.min(materialButtonKN.getStrokeWidth(), KN(i2 - 1).getStrokeWidth());
            LinearLayout.LayoutParams layoutParamsNr = nr(materialButtonKN);
            if (getOrientation() == 0) {
                MarginLayoutParamsCompat.t(layoutParamsNr, 0);
                MarginLayoutParamsCompat.nr(layoutParamsNr, -iMin);
                layoutParamsNr.topMargin = 0;
            } else {
                layoutParamsNr.bottomMargin = 0;
                layoutParamsNr.topMargin = -iMin;
                MarginLayoutParamsCompat.nr(layoutParamsNr, 0);
            }
            materialButtonKN.setLayoutParams(layoutParamsNr);
        }
        ty(firstVisibleChildIndex);
    }

    private void ty(int i2) {
        if (getChildCount() != 0 && i2 != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) KN(i2).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
            } else {
                MarginLayoutParamsCompat.t(layoutParams, 0);
                MarginLayoutParamsCompat.nr(layoutParams, 0);
                layoutParams.leftMargin = 0;
                layoutParams.rightMargin = 0;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        r();
        super.dispatchDraw(canvas);
    }

    void o() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i2 = 0; i2 < childCount; i2++) {
            MaterialButton materialButtonKN = KN(i2);
            if (materialButtonKN.getVisibility() != 8) {
                C.n nVarS = materialButtonKN.getShapeAppearanceModel().S();
                ck(nVarS, mUb(i2, firstVisibleChildIndex, lastVisibleChildIndex));
                materialButtonKN.setShapeAppearanceModel(nVarS.az());
            }
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.E2;
        if (i2 != -1) {
            Ik(Collections.singleton(Integer.valueOf(i2)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatZmq = AccessibilityNodeInfoCompat.Zmq(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (qie()) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        accessibilityNodeInfoCompatZmq.Mx(AccessibilityNodeInfoCompat.CollectionInfoCompat.rl(1, visibleButtonCount, false, i2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        o();
        t();
        super.onMeasure(i2, i3);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f58754n.remove(iIndexOfChild);
        }
        o();
        t();
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            KN(i2).setEnabled(z2);
        }
    }

    public void setSingleSelection(@BoolRes int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }
}
