package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.DrawableWrapperCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.widget.ListViewAutoScrollHelper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class DropDownListView extends ListView {
    private boolean E2;
    private int J2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private ListViewAutoScrollHelper f14183N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f14184O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private GateKeeperDrawable f14185S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private ViewPropertyAnimatorCompat f14186T;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f14187e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f14188g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Rect f14189n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f14190o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f14191r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f14192t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    ResolveHoverRunnable f14193v;

    @RequiresApi
    static class Api30Impl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static Method f14194n;
        private static boolean nr;
        private static Method rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static Method f14195t;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f14194n = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                rl = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f14195t = declaredMethod3;
                declaredMethod3.setAccessible(true);
                nr = true;
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            }
        }

        static boolean n() {
            return nr;
        }

        static void rl(DropDownListView dropDownListView, int i2, View view) {
            try {
                f14194n.invoke(dropDownListView, Integer.valueOf(i2), view, Boolean.FALSE, -1, -1);
                rl.invoke(dropDownListView, Integer.valueOf(i2));
                f14195t.invoke(dropDownListView, Integer.valueOf(i2));
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
    }

    private static class GateKeeperDrawable extends DrawableWrapperCompat {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f14196t;

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f14196t) {
                super.draw(canvas);
            }
        }

        void rl(boolean z2) {
            this.f14196t = z2;
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void setHotspot(float f3, float f4) {
            if (this.f14196t) {
                super.setHotspot(f3, f4);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i2, int i3, int i5, int i7) {
            if (this.f14196t) {
                super.setHotspotBounds(i2, i3, i5, i7);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f14196t) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z2, boolean z3) {
            if (this.f14196t) {
                return super.setVisible(z2, z3);
            }
            return false;
        }

        GateKeeperDrawable(Drawable drawable) {
            super(drawable);
            this.f14196t = true;
        }
    }

    static class PreApi33Impl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final Field f14197n;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                e2.printStackTrace();
            }
            f14197n = declaredField;
        }

        static boolean n(AbsListView absListView) {
            Field field = f14197n;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return false;
            }
        }

        static void rl(AbsListView absListView, boolean z2) {
            Field field = f14197n;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z2));
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    private class ResolveHoverRunnable implements Runnable {
        ResolveHoverRunnable() {
        }

        public void n() {
            DropDownListView dropDownListView = DropDownListView.this;
            dropDownListView.f14193v = null;
            dropDownListView.removeCallbacks(this);
        }

        public void rl() {
            DropDownListView.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            DropDownListView dropDownListView = DropDownListView.this;
            dropDownListView.f14193v = null;
            dropDownListView.drawableStateChanged();
        }
    }

    DropDownListView(Context context, boolean z2) {
        super(context, null, R.attr.f13418FX);
        this.f14189n = new Rect();
        this.f14192t = 0;
        this.f14184O = 0;
        this.J2 = 0;
        this.f14191r = 0;
        this.E2 = z2;
        setCacheColorHint(0);
    }

    private void n() {
        this.f14187e = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f14190o - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f14186T;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.t();
            this.f14186T = null;
        }
    }

    private void xMQ(View view, int i2, float f3, float f4) {
        View childAt;
        this.f14187e = true;
        Api21Impl.n(this, f3, f4);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i3 = this.f14190o;
        if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f14190o = i2;
        Api21Impl.n(view, f3 - view.getLeft(), f4 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        KN(i2, view, f3, f4);
        mUb(false);
        refreshDrawableState();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f14193v = null;
        super.onDetachedFromWindow();
    }

    @RequiresApi
    static class Api21Impl {
        @DoNotInline
        static void n(View view, float f3, float f4) {
            view.drawableHotspotChanged(f3, f4);
        }
    }

    @RequiresApi
    static class Api33Impl {
        @DoNotInline
        static boolean n(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        @DoNotInline
        static void rl(AbsListView absListView, boolean z2) {
            absListView.setSelectedChildViewEnabled(z2);
        }
    }

    private void J2(int i2, View view) {
        Rect rect = this.f14189n;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f14192t;
        rect.top -= this.f14184O;
        rect.right += this.J2;
        rect.bottom += this.f14191r;
        boolean zGh = gh();
        if (view.isEnabled() != zGh) {
            qie(!zGh);
            if (i2 != -1) {
                refreshDrawableState();
            }
        }
    }

    private boolean az() {
        return this.f14187e;
    }

    private boolean gh() {
        return Build.VERSION.SDK_INT >= 33 ? Api33Impl.n(this) : PreApi33Impl.n(this);
    }

    private void mUb(boolean z2) {
        GateKeeperDrawable gateKeeperDrawable = this.f14185S;
        if (gateKeeperDrawable != null) {
            gateKeeperDrawable.rl(z2);
        }
    }

    private void qie(boolean z2) {
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.rl(this, z2);
        } else {
            PreApi33Impl.rl(this, z2);
        }
    }

    private void t(Canvas canvas) {
        Drawable selector;
        if (this.f14189n.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f14189n);
        selector.draw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f14193v != null) {
            return;
        }
        super.drawableStateChanged();
        mUb(true);
        ty();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.E2 || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.E2 || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.E2 || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.E2 && this.f14188g) || super.isInTouchMode();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f14193v == null) {
            ResolveHoverRunnable resolveHoverRunnable = new ResolveHoverRunnable();
            this.f14193v = resolveHoverRunnable;
            resolveHoverRunnable.rl();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i2 < 30 || !Api30Impl.n()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    Api30Impl.rl(this, iPointToPosition, childAt);
                }
            }
            ty();
        }
        return zOnHoverEvent;
    }

    void setListSelectionHidden(boolean z2) {
        this.f14188g = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        GateKeeperDrawable gateKeeperDrawable = drawable != null ? new GateKeeperDrawable(drawable) : null;
        this.f14185S = gateKeeperDrawable;
        super.setSelector(gateKeeperDrawable);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f14192t = rect.left;
        this.f14184O = rect.top;
        this.J2 = rect.right;
        this.f14191r = rect.bottom;
    }

    private void KN(int i2, View view, float f3, float f4) {
        Uo(i2, view);
        Drawable selector = getSelector();
        if (selector != null && i2 != -1) {
            DrawableCompat.gh(selector, f3, f4);
        }
    }

    private void Uo(int i2, View view) {
        boolean z2;
        Drawable selector = getSelector();
        boolean z3 = true;
        if (selector != null && i2 != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            selector.setVisible(false, false);
        }
        J2(i2, view);
        if (z2) {
            Rect rect = this.f14189n;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z3 = false;
            }
            selector.setVisible(z3, false);
            DrawableCompat.gh(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void rl(View view, int i2) {
        performItemClick(view, i2, getItemIdAtPosition(i2));
    }

    private void ty() {
        Drawable selector = getSelector();
        if (selector != null && az() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean O(MotionEvent motionEvent, int i2) {
        boolean z2;
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z2 = true;
                    z3 = false;
                } else {
                    z3 = false;
                    z2 = false;
                }
                if (z2 || z3) {
                    n();
                }
                if (!z2) {
                    if (this.f14183N == null) {
                        this.f14183N = new ListViewAutoScrollHelper(this);
                    }
                    this.f14183N.az(true);
                    this.f14183N.onTouch(this, motionEvent);
                    return z2;
                }
                ListViewAutoScrollHelper listViewAutoScrollHelper = this.f14183N;
                if (listViewAutoScrollHelper != null) {
                    listViewAutoScrollHelper.az(false);
                }
                return z2;
            }
            z2 = true;
        } else {
            z2 = false;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i2);
        if (iFindPointerIndex >= 0) {
            int x2 = (int) motionEvent.getX(iFindPointerIndex);
            int y2 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x2, y2);
            if (iPointToPosition == -1) {
                z3 = true;
            } else {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                xMQ(childAt, iPointToPosition, x2, y2);
                if (actionMasked == 1) {
                    rl(childAt, iPointToPosition);
                }
                z2 = true;
                z3 = false;
            }
        }
        if (z2) {
            n();
        }
        if (!z2) {
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        t(canvas);
        super.dispatchDraw(canvas);
    }

    public int nr(int i2, int i3, int i5, int i7, int i8) {
        int iMakeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i9 = 0;
        int i10 = 0;
        View view = null;
        for (int i11 = 0; i11 < count; i11++) {
            int itemViewType = adapter.getItemViewType(i11);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i11, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i12 = layoutParams.height;
            if (i12 > 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i2, iMakeMeasureSpec);
            view.forceLayout();
            if (i11 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i7) {
                if (i8 >= 0 && i11 > i8 && i10 > 0 && measuredHeight != i7) {
                    return i10;
                }
                return i7;
            }
            if (i8 >= 0 && i11 >= i8) {
                i10 = measuredHeight;
            }
        }
        return measuredHeight;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f14190o = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        ResolveHoverRunnable resolveHoverRunnable = this.f14193v;
        if (resolveHoverRunnable != null) {
            resolveHoverRunnable.n();
        }
        return super.onTouchEvent(motionEvent);
    }
}
