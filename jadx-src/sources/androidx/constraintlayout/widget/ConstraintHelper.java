package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class ConstraintHelper extends View {
    protected HashMap E2;
    protected Helper J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected Context f35894O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    protected String f35895S;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View[] f35896g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int[] f35897n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected String f35898o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected boolean f35899r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected int f35900t;

    public ConstraintHelper(Context context) {
        super(context);
        this.f35897n = new int[32];
        this.f35899r = false;
        this.f35896g = null;
        this.E2 = new HashMap();
        this.f35894O = context;
        HI(null);
    }

    private int qie(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f35894O.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void Ik(ConstraintWidget constraintWidget, boolean z2) {
    }

    public void Z(ConstraintLayout constraintLayout) {
    }

    protected void mUb(ConstraintLayout constraintLayout) {
    }

    public void o(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    public void r(ConstraintLayout constraintLayout) {
    }

    public void setReferencedIds(int[] iArr) {
        this.f35898o = null;
        this.f35900t = 0;
        for (int i2 : iArr) {
            J2(i2);
        }
    }

    private void O(String str) {
        if (str == null || str.length() == 0 || this.f35894O == null) {
            return;
        }
        String strTrim = str.trim();
        int iAz = az(strTrim);
        if (iAz != 0) {
            this.E2.put(Integer.valueOf(iAz), strTrim);
            J2(iAz);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    private void Uo(String str) {
        if (str == null || str.length() == 0 || this.f35894O == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.LayoutParams) && strTrim.equals(((ConstraintLayout.LayoutParams) layoutParams).f35938a)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    J2(childAt.getId());
                }
            }
        }
    }

    private int[] gh(String str) {
        String[] strArrSplit = str.split(",");
        int[] iArr = new int[strArrSplit.length];
        int i2 = 0;
        for (String str2 : strArrSplit) {
            int iAz = az(str2.trim());
            if (iAz != 0) {
                iArr[i2] = iAz;
                i2++;
            }
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    protected void HI(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.tFV);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.o9) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f35898o = string;
                    setIds(string);
                } else if (index == R.styleable.n7b) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f35895S = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void WPU() {
        if (this.J2 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).eWT = (ConstraintWidget) this.J2;
        }
    }

    public void ck(ConstraintSet.Constraint constraint, HelperWidget helperWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray sparseArray) {
        ConstraintSet.Layout layout = constraint.f35965O;
        int[] iArr = layout.piY;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = layout.ijL;
            if (str != null) {
                if (str.length() > 0) {
                    ConstraintSet.Layout layout2 = constraint.f35965O;
                    layout2.piY = gh(layout2.ijL);
                } else {
                    constraint.f35965O.piY = null;
                }
            }
        }
        if (helperWidget == null) {
            return;
        }
        helperWidget.rl();
        if (constraint.f35965O.piY == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            int[] iArr2 = constraint.f35965O.piY;
            if (i2 >= iArr2.length) {
                return;
            }
            ConstraintWidget constraintWidget = (ConstraintWidget) sparseArray.get(iArr2[i2]);
            if (constraintWidget != null) {
                helperWidget.n(constraintWidget);
            }
            i2++;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f35897n, this.f35900t);
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.f35899r) {
            super.onMeasure(i2, i3);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) {
        this.f35898o = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f35900t = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i2);
            if (iIndexOf == -1) {
                O(str.substring(i2));
                return;
            } else {
                O(str.substring(i2, iIndexOf));
                i2 = iIndexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f35895S = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f35900t = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i2);
            if (iIndexOf == -1) {
                Uo(str.substring(i2));
                return;
            } else {
                Uo(str.substring(i2, iIndexOf));
                i2 = iIndexOf + 1;
            }
        }
    }

    protected View[] ty(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f35896g;
        if (viewArr == null || viewArr.length != this.f35900t) {
            this.f35896g = new View[this.f35900t];
        }
        for (int i2 = 0; i2 < this.f35900t; i2++) {
            this.f35896g[i2] = constraintLayout.Ik(this.f35897n[i2]);
        }
        return this.f35896g;
    }

    private void J2(int i2) {
        if (i2 == getId()) {
            return;
        }
        int i3 = this.f35900t + 1;
        int[] iArr = this.f35897n;
        if (i3 > iArr.length) {
            this.f35897n = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f35897n;
        int i5 = this.f35900t;
        iArr2[i5] = i2;
        this.f35900t = i5 + 1;
    }

    private int az(String str) {
        ConstraintLayout constraintLayout;
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        int iQie = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objQie = constraintLayout.qie(0, str);
            if (objQie instanceof Integer) {
                iQie = ((Integer) objQie).intValue();
            }
        }
        if (iQie == 0 && constraintLayout != null) {
            iQie = qie(constraintLayout, str);
        }
        if (iQie == 0) {
            try {
                iQie = R.id.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (iQie == 0) {
            return this.f35894O.getResources().getIdentifier(str, "id", this.f35894O.getPackageName());
        }
        return iQie;
    }

    protected void KN() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            xMQ((ConstraintLayout) parent);
        }
    }

    public void S(ConstraintLayout constraintLayout) {
        String str;
        int iQie;
        if (isInEditMode()) {
            setIds(this.f35898o);
        }
        Helper helper = this.J2;
        if (helper == null) {
            return;
        }
        helper.rl();
        for (int i2 = 0; i2 < this.f35900t; i2++) {
            int i3 = this.f35897n[i2];
            View viewIk = constraintLayout.Ik(i3);
            if (viewIk == null && (iQie = qie(constraintLayout, (str = (String) this.E2.get(Integer.valueOf(i3))))) != 0) {
                this.f35897n[i2] = iQie;
                this.E2.put(Integer.valueOf(iQie), str);
                viewIk = constraintLayout.Ik(iQie);
            }
            if (viewIk != null) {
                this.J2.n(constraintLayout.r(viewIk));
            }
        }
        this.J2.t(constraintLayout.f35908O);
    }

    public void XQ(ConstraintWidgetContainer constraintWidgetContainer, Helper helper, SparseArray sparseArray) {
        helper.rl();
        for (int i2 = 0; i2 < this.f35900t; i2++) {
            helper.n((ConstraintWidget) sparseArray.get(this.f35897n[i2]));
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f35898o;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f35895S;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void setTag(int i2, Object obj) {
        super.setTag(i2, obj);
        if (obj == null && this.f35898o == null) {
            J2(i2);
        }
    }

    protected void xMQ(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i2 = 0; i2 < this.f35900t; i2++) {
            View viewIk = constraintLayout.Ik(this.f35897n[i2]);
            if (viewIk != null) {
                viewIk.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewIk.setTranslationZ(viewIk.getTranslationZ() + elevation);
                }
            }
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35897n = new int[32];
        this.f35899r = false;
        this.f35896g = null;
        this.E2 = new HashMap();
        this.f35894O = context;
        HI(attributeSet);
    }
}
