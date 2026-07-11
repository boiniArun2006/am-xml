package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.widget.PopupWindowCompat;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class ListPopupWindow implements ShowableListMenu {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static Method f14227Y;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Method f14228k;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final ListSelectorHider f14229B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final Handler f14230D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final ResizePopupRunnable f14231E;
    private boolean E2;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private final PopupScrollListener f14232FX;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private boolean f14233GR;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private Rect f14234I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private Runnable f14235J;
    private int J2;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final PopupTouchInterceptor f14236M;
    private Drawable M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f14237N;
    PopupWindow Nxk;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    DropDownListView f14238O;
    private View P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f14239S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f14240T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private DataSetObserver f14241U;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private int f14242X;
    private View Xw;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private int f14243Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f14244a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f14245e;
    private AdapterView.OnItemSelectedListener eF;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f14246g;
    private int jB;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Context f14247n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f14248o;
    private AdapterView.OnItemClickListener p5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f14249r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ListAdapter f14250t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f14251v;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ListPopupWindow$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    class AnonymousClass1 extends ForwardingListener {
        final /* synthetic */ ListPopupWindow E2;

        @Override // androidx.appcompat.widget.ForwardingListener
        /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
        public ListPopupWindow rl() {
            return this.E2;
        }
    }

    private class ListSelectorHider implements Runnable {
        ListSelectorHider() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListPopupWindow.this.Ik();
        }
    }

    private class PopupDataSetObserver extends DataSetObserver {
        PopupDataSetObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (ListPopupWindow.this.n()) {
                ListPopupWindow.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    private class PopupScrollListener implements AbsListView.OnScrollListener {
        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i5) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
            if (i2 != 1 || ListPopupWindow.this.nY() || ListPopupWindow.this.Nxk.getContentView() == null) {
                return;
            }
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            listPopupWindow.f14230D.removeCallbacks(listPopupWindow.f14231E);
            ListPopupWindow.this.f14231E.run();
        }

        PopupScrollListener() {
        }
    }

    private class PopupTouchInterceptor implements View.OnTouchListener {
        PopupTouchInterceptor() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.Nxk) != null && popupWindow.isShowing() && x2 >= 0 && x2 < ListPopupWindow.this.Nxk.getWidth() && y2 >= 0 && y2 < ListPopupWindow.this.Nxk.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.f14230D.postDelayed(listPopupWindow.f14231E, 250L);
                return false;
            }
            if (action == 1) {
                ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
                listPopupWindow2.f14230D.removeCallbacks(listPopupWindow2.f14231E);
                return false;
            }
            return false;
        }
    }

    private class ResizePopupRunnable implements Runnable {
        ResizePopupRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DropDownListView dropDownListView = ListPopupWindow.this.f14238O;
            if (dropDownListView == null || !dropDownListView.isAttachedToWindow() || ListPopupWindow.this.f14238O.getCount() <= ListPopupWindow.this.f14238O.getChildCount()) {
                return;
            }
            int childCount = ListPopupWindow.this.f14238O.getChildCount();
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (childCount <= listPopupWindow.f14251v) {
                listPopupWindow.Nxk.setInputMethodMode(2);
                ListPopupWindow.this.show();
            }
        }
    }

    public ListPopupWindow(Context context) {
        this(context, null, R.attr.f13421I);
    }

    public void v(boolean z2) {
        this.f14245e = true;
        this.E2 = z2;
    }

    @RequiresApi
    static class Api24Impl {
        @DoNotInline
        static int n(PopupWindow popupWindow, View view, int i2, boolean z2) {
            return popupWindow.getMaxAvailableHeight(view, i2, z2);
        }
    }

    @RequiresApi
    static class Api29Impl {
        @DoNotInline
        static void n(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        @DoNotInline
        static void rl(PopupWindow popupWindow, boolean z2) {
            popupWindow.setIsClippedToScreen(z2);
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f14227Y = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f14228k = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    private int Z(View view, int i2, boolean z2) {
        return Api24Impl.n(this.Nxk, view, i2, z2);
    }

    private int ck() {
        int measuredHeight;
        int i2;
        int iMakeMeasureSpec;
        View view;
        int i3;
        if (this.f14238O == null) {
            Context context = this.f14247n;
            this.f14235J = new Runnable() { // from class: androidx.appcompat.widget.ListPopupWindow.2
                @Override // java.lang.Runnable
                public void run() {
                    View viewO = ListPopupWindow.this.o();
                    if (viewO == null || viewO.getWindowToken() == null) {
                        return;
                    }
                    ListPopupWindow.this.show();
                }
            };
            DropDownListView dropDownListViewR = r(context, !this.f14233GR);
            this.f14238O = dropDownListViewR;
            Drawable drawable = this.M7;
            if (drawable != null) {
                dropDownListViewR.setSelector(drawable);
            }
            this.f14238O.setAdapter(this.f14250t);
            this.f14238O.setOnItemClickListener(this.p5);
            this.f14238O.setFocusable(true);
            this.f14238O.setFocusableInTouchMode(true);
            this.f14238O.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: androidx.appcompat.widget.ListPopupWindow.3
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onItemSelected(AdapterView adapterView, View view2, int i5, long j2) {
                    DropDownListView dropDownListView;
                    if (i5 == -1 || (dropDownListView = ListPopupWindow.this.f14238O) == null) {
                        return;
                    }
                    dropDownListView.setListSelectionHidden(false);
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onNothingSelected(AdapterView adapterView) {
                }
            });
            this.f14238O.setOnScrollListener(this.f14232FX);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.eF;
            if (onItemSelectedListener != null) {
                this.f14238O.setOnItemSelectedListener(onItemSelectedListener);
            }
            DropDownListView dropDownListView = this.f14238O;
            View view2 = this.Xw;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i5 = this.jB;
                if (i5 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(dropDownListView, layoutParams);
                } else if (i5 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.jB);
                } else {
                    linearLayout.addView(dropDownListView, layoutParams);
                    linearLayout.addView(view2);
                }
                int i7 = this.f14249r;
                if (i7 >= 0) {
                    i3 = Integer.MIN_VALUE;
                } else {
                    i7 = 0;
                    i3 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i7, i3), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = dropDownListView;
            }
            this.Nxk.setContentView(view);
        } else {
            View view3 = this.Xw;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.Nxk.getBackground();
        if (background != null) {
            background.getPadding(this.f14244a);
            Rect rect = this.f14244a;
            int i8 = rect.top;
            i2 = rect.bottom + i8;
            if (!this.f14246g) {
                this.f14243Z = -i8;
            }
        } else {
            this.f14244a.setEmpty();
            i2 = 0;
        }
        int iZ = Z(o(), this.f14243Z, this.Nxk.getInputMethodMode() == 2);
        if (this.f14240T || this.J2 == -1) {
            return iZ + i2;
        }
        int i9 = this.f14249r;
        if (i9 == -2) {
            int i10 = this.f14247n.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f14244a;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i9 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
        } else {
            int i11 = this.f14247n.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f14244a;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11 - (rect3.left + rect3.right), 1073741824);
        }
        int iNr = this.f14238O.nr(iMakeMeasureSpec, 0, -1, iZ - measuredHeight, -1);
        if (iNr > 0) {
            measuredHeight += i2 + this.f14238O.getPaddingTop() + this.f14238O.getPaddingBottom();
        }
        return iNr + measuredHeight;
    }

    private void rV9(boolean z2) {
        if (Build.VERSION.SDK_INT > 28) {
            Api29Impl.rl(this.Nxk, z2);
            return;
        }
        Method method = f14227Y;
        if (method != null) {
            try {
                method.invoke(this.Nxk, Boolean.valueOf(z2));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    private void te() {
        View view = this.Xw;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.Xw);
            }
        }
    }

    public void E2(int i2) {
        Drawable background = this.Nxk.getBackground();
        if (background == null) {
            jB(i2);
            return;
        }
        background.getPadding(this.f14244a);
        Rect rect = this.f14244a;
        this.f14249r = rect.left + rect.right + i2;
    }

    public void HI(Drawable drawable) {
        this.Nxk.setBackgroundDrawable(drawable);
    }

    public void Ik() {
        DropDownListView dropDownListView = this.f14238O;
        if (dropDownListView != null) {
            dropDownListView.setListSelectionHidden(true);
            dropDownListView.requestLayout();
        }
    }

    public Drawable J2() {
        return this.Nxk.getBackground();
    }

    public void KN(int i2) {
        this.f14243Z = i2;
        this.f14246g = true;
    }

    public void N(boolean z2) {
        this.f14233GR = z2;
        this.Nxk.setFocusable(z2);
    }

    public void T(int i2) {
        this.Nxk.setInputMethodMode(i2);
    }

    public int ViF() {
        return this.f14249r;
    }

    public void X(Rect rect) {
        this.f14234I = rect != null ? new Rect(rect) : null;
    }

    public void Xw(int i2) {
        DropDownListView dropDownListView = this.f14238O;
        if (!n() || dropDownListView == null) {
            return;
        }
        dropDownListView.setListSelectionHidden(false);
        dropDownListView.setSelection(i2);
        if (dropDownListView.getChoiceMode() != 0) {
            dropDownListView.setItemChecked(i2, true);
        }
    }

    public void bzg(int i2) {
        this.jB = i2;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
        this.Nxk.dismiss();
        te();
        this.Nxk.setContentView(null);
        this.f14238O = null;
        this.f14230D.removeCallbacks(this.f14231E);
    }

    public void e(int i2) {
        this.f14242X = i2;
    }

    public void fD(int i2) {
        this.Nxk.setAnimationStyle(i2);
    }

    public boolean g() {
        return this.f14233GR;
    }

    public int gh() {
        if (this.f14246g) {
            return this.f14243Z;
        }
        return 0;
    }

    public void iF(View view) {
        this.P5 = view;
    }

    public void jB(int i2) {
        this.f14249r = i2;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean n() {
        return this.Nxk.isShowing();
    }

    public void nHg(PopupWindow.OnDismissListener onDismissListener) {
        this.Nxk.setOnDismissListener(onDismissListener);
    }

    public boolean nY() {
        return this.Nxk.getInputMethodMode() == 2;
    }

    public void nr(int i2) {
        this.f14248o = i2;
    }

    public View o() {
        return this.P5;
    }

    public void qie(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f14241U;
        if (dataSetObserver == null) {
            this.f14241U = new PopupDataSetObserver();
        } else {
            ListAdapter listAdapter2 = this.f14250t;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f14250t = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f14241U);
        }
        DropDownListView dropDownListView = this.f14238O;
        if (dropDownListView != null) {
            dropDownListView.setAdapter(this.f14250t);
        }
    }

    DropDownListView r(Context context, boolean z2) {
        return new DropDownListView(context, z2);
    }

    public int rl() {
        return this.f14248o;
    }

    public void s7N(AdapterView.OnItemClickListener onItemClickListener) {
        this.p5 = onItemClickListener;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public ListView ty() {
        return this.f14238O;
    }

    public void wTp(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.eF = onItemSelectedListener;
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.J2 = -2;
        this.f14249r = -2;
        this.f14239S = 1002;
        this.f14242X = 0;
        this.f14240T = false;
        this.f14237N = false;
        this.f14251v = Integer.MAX_VALUE;
        this.jB = 0;
        this.f14231E = new ResizePopupRunnable();
        this.f14236M = new PopupTouchInterceptor();
        this.f14232FX = new PopupScrollListener();
        this.f14229B = new ListSelectorHider();
        this.f14244a = new Rect();
        this.f14247n = context;
        this.f14230D = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Vvq, i2, i3);
        this.f14248o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.f13539y, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.Zn, 0);
        this.f14243Z = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f14246g = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i2, i3);
        this.Nxk = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }

    public long S() {
        if (!n()) {
            return Long.MIN_VALUE;
        }
        return this.f14238O.getSelectedItemId();
    }

    public int WPU() {
        if (!n()) {
            return -1;
        }
        return this.f14238O.getSelectedItemPosition();
    }

    public Object XQ() {
        if (!n()) {
            return null;
        }
        return this.f14238O.getSelectedItem();
    }

    public View aYN() {
        if (!n()) {
            return null;
        }
        return this.f14238O.getSelectedView();
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void show() {
        int i2;
        int i3;
        int i5;
        int i7;
        int iCk = ck();
        boolean zNY = nY();
        PopupWindowCompat.rl(this.Nxk, this.f14239S);
        boolean z2 = true;
        if (this.Nxk.isShowing()) {
            if (o().isAttachedToWindow()) {
                int width = this.f14249r;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = o().getWidth();
                }
                int i8 = this.J2;
                if (i8 == -1) {
                    if (!zNY) {
                        iCk = -1;
                    }
                    if (zNY) {
                        PopupWindow popupWindow = this.Nxk;
                        if (this.f14249r == -1) {
                            i7 = -1;
                        } else {
                            i7 = 0;
                        }
                        popupWindow.setWidth(i7);
                        this.Nxk.setHeight(0);
                    } else {
                        PopupWindow popupWindow2 = this.Nxk;
                        if (this.f14249r == -1) {
                            i5 = -1;
                        } else {
                            i5 = 0;
                        }
                        popupWindow2.setWidth(i5);
                        this.Nxk.setHeight(-1);
                    }
                } else if (i8 != -2) {
                    iCk = i8;
                }
                PopupWindow popupWindow3 = this.Nxk;
                if (this.f14237N || this.f14240T) {
                    z2 = false;
                }
                popupWindow3.setOutsideTouchable(z2);
                PopupWindow popupWindow4 = this.Nxk;
                View viewO = o();
                int i9 = this.f14248o;
                int i10 = this.f14243Z;
                if (width < 0) {
                    i2 = -1;
                } else {
                    i2 = width;
                }
                if (iCk < 0) {
                    i3 = -1;
                } else {
                    i3 = iCk;
                }
                popupWindow4.update(viewO, i9, i10, i2, i3);
                return;
            }
            return;
        }
        int width2 = this.f14249r;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = o().getWidth();
        }
        int i11 = this.J2;
        if (i11 == -1) {
            iCk = -1;
        } else if (i11 != -2) {
            iCk = i11;
        }
        this.Nxk.setWidth(width2);
        this.Nxk.setHeight(iCk);
        rV9(true);
        PopupWindow popupWindow5 = this.Nxk;
        if (this.f14237N || this.f14240T) {
            z2 = false;
        }
        popupWindow5.setOutsideTouchable(z2);
        this.Nxk.setTouchInterceptor(this.f14236M);
        if (this.f14245e) {
            PopupWindowCompat.n(this.Nxk, this.E2);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f14228k;
            if (method != null) {
                try {
                    method.invoke(this.Nxk, this.f14234I);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            Api29Impl.n(this.Nxk, this.f14234I);
        }
        PopupWindowCompat.t(this.Nxk, o(), this.f14248o, this.f14243Z, this.f14242X);
        this.f14238O.setSelection(-1);
        if (!this.f14233GR || this.f14238O.isInTouchMode()) {
            Ik();
        }
        if (!this.f14233GR) {
            this.f14230D.post(this.f14229B);
        }
    }
}
