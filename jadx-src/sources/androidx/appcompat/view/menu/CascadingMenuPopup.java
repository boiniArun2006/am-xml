package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.MenuItemHoverListener;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.GravityCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class CascadingMenuPopup extends MenuPopup implements MenuPresenter, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final int f13816D = R.layout.Uo;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private PopupWindow.OnDismissListener f13817B;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f13818E;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    ViewTreeObserver f13819FX;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    boolean f13820J;
    private final int J2;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private MenuPresenter.Callback f13821M;
    private int M7;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f13823O;
    private boolean P5;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f13826U;
    View Xw;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final Handler f13828Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f13831o;
    private int p5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f13832r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Context f13833t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private View f13834v;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final List f13824S = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final List f13830g = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener E2 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!CascadingMenuPopup.this.n() || CascadingMenuPopup.this.f13830g.size() <= 0 || ((CascadingMenuInfo) CascadingMenuPopup.this.f13830g.get(0)).f13841n.g()) {
                return;
            }
            View view = CascadingMenuPopup.this.Xw;
            if (view == null || !view.isShown()) {
                CascadingMenuPopup.this.dismiss();
                return;
            }
            Iterator it = CascadingMenuPopup.this.f13830g.iterator();
            while (it.hasNext()) {
                ((CascadingMenuInfo) it.next()).f13841n.show();
            }
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f13829e = new View.OnAttachStateChangeListener() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.2
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = CascadingMenuPopup.this.f13819FX;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    CascadingMenuPopup.this.f13819FX = view.getViewTreeObserver();
                }
                CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
                cascadingMenuPopup.f13819FX.removeGlobalOnLayoutListener(cascadingMenuPopup.E2);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final MenuItemHoverListener f13827X = new MenuItemHoverListener() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.3
        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public void az(MenuBuilder menuBuilder, MenuItem menuItem) {
            CascadingMenuPopup.this.f13828Z.removeCallbacksAndMessages(menuBuilder);
        }

        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public void t(final MenuBuilder menuBuilder, final MenuItem menuItem) {
            CascadingMenuPopup.this.f13828Z.removeCallbacksAndMessages(null);
            int size = CascadingMenuPopup.this.f13830g.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (menuBuilder == ((CascadingMenuInfo) CascadingMenuPopup.this.f13830g.get(i2)).rl) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return;
            }
            int i3 = i2 + 1;
            final CascadingMenuInfo cascadingMenuInfo = i3 < CascadingMenuPopup.this.f13830g.size() ? (CascadingMenuInfo) CascadingMenuPopup.this.f13830g.get(i3) : null;
            CascadingMenuPopup.this.f13828Z.postAtTime(new Runnable() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.3.1
                @Override // java.lang.Runnable
                public void run() {
                    CascadingMenuInfo cascadingMenuInfo2 = cascadingMenuInfo;
                    if (cascadingMenuInfo2 != null) {
                        CascadingMenuPopup.this.f13820J = true;
                        cascadingMenuInfo2.rl.O(false);
                        CascadingMenuPopup.this.f13820J = false;
                    }
                    if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                        menuBuilder.bzg(menuItem, 4);
                    }
                }
            }, menuBuilder, SystemClock.uptimeMillis() + 200);
        }
    };

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f13825T = 0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f13822N = 0;
    private boolean eF = false;
    private int jB = E2();

    private static class CascadingMenuInfo {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final MenuPopupWindow f13841n;
        public final MenuBuilder rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f13842t;

        public ListView n() {
            return this.f13841n.ty();
        }

        public CascadingMenuInfo(MenuPopupWindow menuPopupWindow, MenuBuilder menuBuilder, int i2) {
            this.f13841n = menuPopupWindow;
            this.rl = menuBuilder;
            this.f13842t = i2;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface HorizPosition {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void O(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public Parcelable Uo() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void XQ(int i2) {
        this.f13826U = true;
        this.M7 = i2;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void aYN(int i2) {
        this.P5 = true;
        this.p5 = i2;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    protected boolean az() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean xMQ() {
        return false;
    }

    private int E2() {
        return this.f13834v.getLayoutDirection() == 1 ? 0 : 1;
    }

    private void X(MenuBuilder menuBuilder) {
        CascadingMenuInfo cascadingMenuInfo;
        View viewFD;
        int i2;
        int i3;
        int i5;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f13833t);
        MenuAdapter menuAdapter = new MenuAdapter(menuBuilder, layoutInflaterFrom, this.f13831o, f13816D);
        if (!n() && this.eF) {
            menuAdapter.nr(true);
        } else if (n()) {
            menuAdapter.nr(MenuPopup.ViF(menuBuilder));
        }
        int iCk = MenuPopup.ck(menuAdapter, null, this.f13833t, this.f13823O);
        MenuPopupWindow menuPopupWindowG = g();
        menuPopupWindowG.qie(menuAdapter);
        menuPopupWindowG.E2(iCk);
        menuPopupWindowG.e(this.f13822N);
        if (this.f13830g.size() > 0) {
            List list = this.f13830g;
            cascadingMenuInfo = (CascadingMenuInfo) list.get(list.size() - 1);
            viewFD = fD(cascadingMenuInfo, menuBuilder);
        } else {
            cascadingMenuInfo = null;
            viewFD = null;
        }
        if (viewFD != null) {
            menuPopupWindowG.p5(false);
            menuPopupWindowG.U(null);
            int iE = e(iCk);
            boolean z2 = iE == 1;
            this.jB = iE;
            if (Build.VERSION.SDK_INT >= 26) {
                menuPopupWindowG.iF(viewFD);
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr = new int[2];
                this.f13834v.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewFD.getLocationOnScreen(iArr2);
                if ((this.f13822N & 7) == 5) {
                    iArr[0] = iArr[0] + this.f13834v.getWidth();
                    iArr2[0] = iArr2[0] + viewFD.getWidth();
                }
                i2 = iArr2[0] - iArr[0];
                i3 = iArr2[1] - iArr[1];
            }
            if ((this.f13822N & 5) == 5) {
                if (!z2) {
                    iCk = viewFD.getWidth();
                    i5 = i2 - iCk;
                }
                i5 = i2 + iCk;
            } else {
                if (z2) {
                    iCk = viewFD.getWidth();
                    i5 = i2 + iCk;
                }
                i5 = i2 - iCk;
            }
            menuPopupWindowG.nr(i5);
            menuPopupWindowG.v(true);
            menuPopupWindowG.KN(i3);
        } else {
            if (this.f13826U) {
                menuPopupWindowG.nr(this.M7);
            }
            if (this.P5) {
                menuPopupWindowG.KN(this.p5);
            }
            menuPopupWindowG.X(HI());
        }
        this.f13830g.add(new CascadingMenuInfo(menuPopupWindowG, menuBuilder, this.jB));
        menuPopupWindowG.show();
        ListView listViewTy = menuPopupWindowG.ty();
        listViewTy.setOnKeyListener(this);
        if (cascadingMenuInfo == null && this.f13818E && menuBuilder.nY() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.ty, (ViewGroup) listViewTy, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuBuilder.nY());
            listViewTy.addHeaderView(frameLayout, null, false);
            menuPopupWindowG.show();
        }
    }

    private int e(int i2) {
        List list = this.f13830g;
        ListView listViewN = ((CascadingMenuInfo) list.get(list.size() - 1)).n();
        int[] iArr = new int[2];
        listViewN.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.Xw.getWindowVisibleDisplayFrame(rect);
        return this.jB == 1 ? (iArr[0] + listViewN.getWidth()) + i2 > rect.right ? 0 : 1 : iArr[0] - i2 < 0 ? 1 : 0;
    }

    private View fD(CascadingMenuInfo cascadingMenuInfo, MenuBuilder menuBuilder) {
        MenuAdapter menuAdapter;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemIF = iF(cascadingMenuInfo.rl, menuBuilder);
        if (menuItemIF == null) {
            return null;
        }
        ListView listViewN = cascadingMenuInfo.n();
        ListAdapter adapter = listViewN.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            menuAdapter = (MenuAdapter) headerViewListAdapter.getWrappedAdapter();
        } else {
            menuAdapter = (MenuAdapter) adapter;
            headersCount = 0;
        }
        int count = menuAdapter.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            }
            if (menuItemIF == menuAdapter.getItem(i2)) {
                break;
            }
            i2++;
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + headersCount) - listViewN.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewN.getChildCount()) {
            return listViewN.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private MenuPopupWindow g() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f13833t, null, this.J2, this.f13832r);
        menuPopupWindow.M7(this.f13827X);
        menuPopupWindow.s7N(this);
        menuPopupWindow.nHg(this);
        menuPopupWindow.iF(this.f13834v);
        menuPopupWindow.e(this.f13822N);
        menuPopupWindow.N(true);
        menuPopupWindow.T(2);
        return menuPopupWindow;
    }

    private int te(MenuBuilder menuBuilder) {
        int size = this.f13830g.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (menuBuilder == ((CascadingMenuInfo) this.f13830g.get(i2)).rl) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void Ik(View view) {
        if (this.f13834v != view) {
            this.f13834v = view;
            this.f13822N = GravityCompat.rl(this.f13825T, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean J2(SubMenuBuilder subMenuBuilder) {
        for (CascadingMenuInfo cascadingMenuInfo : this.f13830g) {
            if (subMenuBuilder == cascadingMenuInfo.rl) {
                cascadingMenuInfo.n().requestFocus();
                return true;
            }
        }
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        qie(subMenuBuilder);
        MenuPresenter.Callback callback = this.f13821M;
        if (callback != null) {
            callback.t(subMenuBuilder);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void KN(boolean z2) {
        Iterator it = this.f13830g.iterator();
        while (it.hasNext()) {
            MenuPopup.nY(((CascadingMenuInfo) it.next()).n().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void S(PopupWindow.OnDismissListener onDismissListener) {
        this.f13817B = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void WPU(boolean z2) {
        this.f13818E = z2;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void Z(int i2) {
        if (this.f13825T != i2) {
            this.f13825T = i2;
            this.f13822N = GravityCompat.rl(i2, this.f13834v.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
        int size = this.f13830g.size();
        if (size > 0) {
            CascadingMenuInfo[] cascadingMenuInfoArr = (CascadingMenuInfo[]) this.f13830g.toArray(new CascadingMenuInfo[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                CascadingMenuInfo cascadingMenuInfo = cascadingMenuInfoArr[i2];
                if (cascadingMenuInfo.f13841n.n()) {
                    cascadingMenuInfo.f13841n.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean n() {
        return this.f13830g.size() > 0 && ((CascadingMenuInfo) this.f13830g.get(0)).f13841n.n();
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void nr(MenuPresenter.Callback callback) {
        this.f13821M = callback;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void o(boolean z2) {
        this.eF = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        CascadingMenuInfo cascadingMenuInfo;
        int size = this.f13830g.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                cascadingMenuInfo = null;
                break;
            }
            cascadingMenuInfo = (CascadingMenuInfo) this.f13830g.get(i2);
            if (!cascadingMenuInfo.f13841n.n()) {
                break;
            } else {
                i2++;
            }
        }
        if (cascadingMenuInfo != null) {
            cascadingMenuInfo.rl.O(false);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void qie(MenuBuilder menuBuilder) {
        menuBuilder.t(this, this.f13833t);
        if (n()) {
            X(menuBuilder);
        } else {
            this.f13824S.add(menuBuilder);
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public ListView ty() {
        if (this.f13830g.isEmpty()) {
            return null;
        }
        return ((CascadingMenuInfo) this.f13830g.get(r0.size() - 1)).n();
    }

    public CascadingMenuPopup(Context context, View view, int i2, int i3, boolean z2) {
        this.f13833t = context;
        this.f13834v = view;
        this.J2 = i2;
        this.f13832r = i3;
        this.f13831o = z2;
        Resources resources = context.getResources();
        this.f13823O = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.nr));
        this.f13828Z = new Handler();
    }

    private MenuItem iF(MenuBuilder menuBuilder, MenuBuilder menuBuilder2) {
        int size = menuBuilder.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = menuBuilder.getItem(i2);
            if (item.hasSubMenu() && menuBuilder2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i2 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void rl(MenuBuilder menuBuilder, boolean z2) {
        int iTe = te(menuBuilder);
        if (iTe >= 0) {
            int i2 = iTe + 1;
            if (i2 < this.f13830g.size()) {
                ((CascadingMenuInfo) this.f13830g.get(i2)).rl.O(false);
            }
            CascadingMenuInfo cascadingMenuInfo = (CascadingMenuInfo) this.f13830g.remove(iTe);
            cascadingMenuInfo.rl.U(this);
            if (this.f13820J) {
                cascadingMenuInfo.f13841n.P5(null);
                cascadingMenuInfo.f13841n.fD(0);
            }
            cascadingMenuInfo.f13841n.dismiss();
            int size = this.f13830g.size();
            if (size > 0) {
                this.jB = ((CascadingMenuInfo) this.f13830g.get(size - 1)).f13842t;
            } else {
                this.jB = E2();
            }
            if (size == 0) {
                dismiss();
                MenuPresenter.Callback callback = this.f13821M;
                if (callback != null) {
                    callback.rl(menuBuilder, true);
                }
                ViewTreeObserver viewTreeObserver = this.f13819FX;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f13819FX.removeGlobalOnLayoutListener(this.E2);
                    }
                    this.f13819FX = null;
                }
                this.Xw.removeOnAttachStateChangeListener(this.f13829e);
                this.f13817B.onDismiss();
                return;
            }
            if (z2) {
                ((CascadingMenuInfo) this.f13830g.get(0)).rl.O(false);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void show() {
        boolean z2;
        if (!n()) {
            Iterator it = this.f13824S.iterator();
            while (it.hasNext()) {
                X((MenuBuilder) it.next());
            }
            this.f13824S.clear();
            View view = this.f13834v;
            this.Xw = view;
            if (view != null) {
                if (this.f13819FX == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f13819FX = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.E2);
                }
                this.Xw.addOnAttachStateChangeListener(this.f13829e);
            }
        }
    }
}
