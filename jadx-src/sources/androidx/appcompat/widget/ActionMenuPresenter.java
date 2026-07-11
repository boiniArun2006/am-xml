package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.BaseMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ActionProvider;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class ActionMenuPresenter extends BaseMenuPresenter implements ActionProvider.SubUiVisibilityListener {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    ActionButtonSubmenu f13972B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private ActionMenuPopupCallback f13973D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f13974E;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    OverflowPopup f13975FX;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    int f13976I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    OpenOverflowRunnable f13977J;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final SparseBooleanArray f13978M;
    private boolean M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f13979N;
    private boolean P5;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f13980T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f13981U;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private Drawable f13982X;
    private int Xw;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final PopupPresenterCallback f13983a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    OverflowMenuButton f13984e;
    private boolean eF;
    private int jB;
    private boolean p5;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f13985v;

    private class ActionButtonSubmenu extends MenuPopupHelper {
        public ActionButtonSubmenu(Context context, SubMenuBuilder subMenuBuilder, View view) {
            super(context, subMenuBuilder, view, false, R.attr.az);
            if (!((MenuItemImpl) subMenuBuilder.getItem()).qie()) {
                View view2 = ActionMenuPresenter.this.f13984e;
                J2(view2 == null ? (View) ((BaseMenuPresenter) ActionMenuPresenter.this).f13809g : view2);
            }
            mUb(ActionMenuPresenter.this.f13983a);
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        protected void O() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f13972B = null;
            actionMenuPresenter.f13976I = 0;
            super.O();
        }
    }

    private class ActionMenuPopupCallback extends ActionMenuItemView.PopupCallback {
        ActionMenuPopupCallback() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback
        public ShowableListMenu n() {
            ActionButtonSubmenu actionButtonSubmenu = ActionMenuPresenter.this.f13972B;
            if (actionButtonSubmenu != null) {
                return actionButtonSubmenu.t();
            }
            return null;
        }
    }

    private class OpenOverflowRunnable implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private OverflowPopup f13987n;

        public OpenOverflowRunnable(OverflowPopup overflowPopup) {
            this.f13987n = overflowPopup;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((BaseMenuPresenter) ActionMenuPresenter.this).f13806O != null) {
                ((BaseMenuPresenter) ActionMenuPresenter.this).f13806O.nr();
            }
            View view = (View) ((BaseMenuPresenter) ActionMenuPresenter.this).f13809g;
            if (view != null && view.getWindowToken() != null && this.f13987n.az()) {
                ActionMenuPresenter.this.f13975FX = this.f13987n;
            }
            ActionMenuPresenter.this.f13977J = null;
        }
    }

    private class OverflowMenuButton extends AppCompatImageView implements ActionMenuView.ActionMenuChildView {
        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public boolean n() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public boolean rl() {
            return false;
        }

        public OverflowMenuButton(Context context) {
            super(context, null, R.attr.qie);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            TooltipCompat.n(this, getContentDescription());
            setOnTouchListener(new ForwardingListener(this) { // from class: androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton.1
                @Override // androidx.appcompat.widget.ForwardingListener
                public boolean nr() {
                    ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                    if (actionMenuPresenter.f13977J != null) {
                        return false;
                    }
                    actionMenuPresenter.E2();
                    return true;
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                public ShowableListMenu rl() {
                    OverflowPopup overflowPopup = ActionMenuPresenter.this.f13975FX;
                    if (overflowPopup == null) {
                        return null;
                    }
                    return overflowPopup.t();
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                public boolean t() {
                    ActionMenuPresenter.this.rV9();
                    return true;
                }
            });
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.rV9();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i2, int i3, int i5, int i7) {
            boolean frame = super.setFrame(i2, i3, i5, i7);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                DrawableCompat.qie(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    private class OverflowPopup extends MenuPopupHelper {
        public OverflowPopup(Context context, MenuBuilder menuBuilder, View view, boolean z2) {
            super(context, menuBuilder, view, z2, R.attr.az);
            KN(8388613);
            mUb(ActionMenuPresenter.this.f13983a);
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        protected void O() {
            if (((BaseMenuPresenter) ActionMenuPresenter.this).f13806O != null) {
                ((BaseMenuPresenter) ActionMenuPresenter.this).f13806O.close();
            }
            ActionMenuPresenter.this.f13975FX = null;
            super.O();
        }
    }

    private class PopupPresenterCallback implements MenuPresenter.Callback {
        PopupPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void rl(MenuBuilder menuBuilder, boolean z2) {
            if (menuBuilder instanceof SubMenuBuilder) {
                menuBuilder.e().O(false);
            }
            MenuPresenter.Callback callbackCk = ActionMenuPresenter.this.ck();
            if (callbackCk != null) {
                callbackCk.rl(menuBuilder, z2);
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean t(MenuBuilder menuBuilder) {
            if (menuBuilder == ((BaseMenuPresenter) ActionMenuPresenter.this).f13806O) {
                return false;
            }
            ActionMenuPresenter.this.f13976I = ((SubMenuBuilder) menuBuilder).getItem().getItemId();
            MenuPresenter.Callback callbackCk = ActionMenuPresenter.this.ck();
            if (callbackCk != null) {
                return callbackCk.t(menuBuilder);
            }
            return false;
        }
    }

    private static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.appcompat.widget.ActionMenuPresenter.SavedState.1
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

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f13991n;

        SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        SavedState(Parcel parcel) {
            this.f13991n = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f13991n);
        }
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public void az(MenuItemImpl menuItemImpl, MenuView.ItemView itemView) {
        itemView.t(menuItemImpl, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) itemView;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f13809g);
        if (this.f13973D == null) {
            this.f13973D = new ActionMenuPopupCallback();
        }
        actionMenuItemView.setPopupCallback(this.f13973D);
    }

    public ActionMenuPresenter(Context context) {
        super(context, R.layout.f13484t, R.layout.rl);
        this.f13978M = new SparseBooleanArray();
        this.f13983a = new PopupPresenterCallback();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View iF(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f13809g;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof MenuView.ItemView) && ((MenuView.ItemView) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean E2() {
        Object obj;
        OpenOverflowRunnable openOverflowRunnable = this.f13977J;
        if (openOverflowRunnable != null && (obj = this.f13809g) != null) {
            ((View) obj).removeCallbacks(openOverflowRunnable);
            this.f13977J = null;
            return true;
        }
        OverflowPopup overflowPopup = this.f13975FX;
        if (overflowPopup == null) {
            return false;
        }
        overflowPopup.rl();
        return true;
    }

    public void N(Configuration configuration) {
        if (!this.P5) {
            this.f13981U = ActionBarPolicy.rl(this.f13813t).nr();
        }
        MenuBuilder menuBuilder = this.f13806O;
        if (menuBuilder != null) {
            menuBuilder.rV9(true);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void O(Parcelable parcelable) {
        int i2;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof SavedState) && (i2 = ((SavedState) parcelable).f13991n) > 0 && (menuItemFindItem = this.f13806O.findItem(i2)) != null) {
            J2((SubMenuBuilder) menuItemFindItem.getSubMenu());
        }
    }

    public boolean T() {
        OverflowPopup overflowPopup = this.f13975FX;
        return overflowPopup != null && overflowPopup.nr();
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public Parcelable Uo() {
        SavedState savedState = new SavedState();
        savedState.f13991n = this.f13976I;
        return savedState;
    }

    public boolean X() {
        return this.f13977J != null || T();
    }

    public boolean e() {
        ActionButtonSubmenu actionButtonSubmenu = this.f13972B;
        if (actionButtonSubmenu == null) {
            return false;
        }
        actionButtonSubmenu.rl();
        return true;
    }

    public Drawable fD() {
        OverflowMenuButton overflowMenuButton = this.f13984e;
        if (overflowMenuButton != null) {
            return overflowMenuButton.getDrawable();
        }
        if (this.f13980T) {
            return this.f13982X;
        }
        return null;
    }

    @Override // androidx.core.view.ActionProvider.SubUiVisibilityListener
    public void n(boolean z2) {
        if (z2) {
            super.J2(null);
            return;
        }
        MenuBuilder menuBuilder = this.f13806O;
        if (menuBuilder != null) {
            menuBuilder.O(false);
        }
    }

    public void nHg(boolean z2) {
        this.eF = z2;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public MenuView r(ViewGroup viewGroup) {
        MenuView menuView = this.f13809g;
        MenuView menuViewR = super.r(viewGroup);
        if (menuView != menuViewR) {
            ((ActionMenuView) menuViewR).setPresenter(this);
        }
        return menuViewR;
    }

    public boolean rV9() {
        MenuBuilder menuBuilder;
        if (!this.f13979N || T() || (menuBuilder = this.f13806O) == null || this.f13809g == null || this.f13977J != null || menuBuilder.te().isEmpty()) {
            return false;
        }
        OpenOverflowRunnable openOverflowRunnable = new OpenOverflowRunnable(new OverflowPopup(this.f13813t, this.f13806O, this.f13984e, true));
        this.f13977J = openOverflowRunnable;
        ((View) this.f13809g).post(openOverflowRunnable);
        return true;
    }

    public void s7N(ActionMenuView actionMenuView) {
        this.f13809g = actionMenuView;
        actionMenuView.n(this.f13806O);
    }

    public void v(boolean z2) {
        this.f13979N = z2;
        this.f13985v = true;
    }

    public void wTp(Drawable drawable) {
        OverflowMenuButton overflowMenuButton = this.f13984e;
        if (overflowMenuButton != null) {
            overflowMenuButton.setImageDrawable(drawable);
        } else {
            this.f13980T = true;
            this.f13982X = drawable;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.ActionMenuPresenter] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.appcompat.view.menu.MenuItemImpl] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public boolean xMQ() {
        ArrayList arrayListX;
        int size;
        int i2;
        int iRV9;
        ?? r02;
        int i3;
        ActionMenuPresenter actionMenuPresenter = this;
        MenuBuilder menuBuilder = actionMenuPresenter.f13806O;
        View view = null;
        ?? r3 = 0;
        if (menuBuilder != null) {
            arrayListX = menuBuilder.X();
            size = arrayListX.size();
        } else {
            arrayListX = null;
            size = 0;
        }
        int i5 = actionMenuPresenter.f13981U;
        int i7 = actionMenuPresenter.jB;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f13809g;
        boolean z2 = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayListX.get(i10);
            if (menuItemImpl.HI()) {
                i8++;
            } else if (menuItemImpl.ty()) {
                i9++;
            } else {
                z2 = true;
            }
            if (actionMenuPresenter.eF && menuItemImpl.isActionViewExpanded()) {
                i5 = 0;
            }
        }
        if (actionMenuPresenter.f13979N && (z2 || i9 + i8 > i5)) {
            i5--;
        }
        int i11 = i5 - i8;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f13978M;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.M7) {
            int i12 = actionMenuPresenter.f13974E;
            iRV9 = i7 / i12;
            i2 = i12 + ((i7 % i12) / iRV9);
        } else {
            i2 = 0;
            iRV9 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        ?? r03 = actionMenuPresenter;
        while (i13 < size) {
            ?? r15 = (MenuItemImpl) arrayListX.get(i13);
            if (r15.HI()) {
                View viewIk = r03.Ik(r15, view, viewGroup);
                if (r03.M7) {
                    iRV9 -= ActionMenuView.rV9(viewIk, i2, iRV9, iMakeMeasureSpec, r3);
                } else {
                    viewIk.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewIk.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                int groupId = r15.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                r15.XQ(true);
                r02 = r3;
                i3 = size;
            } else if (r15.ty()) {
                int groupId2 = r15.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i11 > 0 || z3) && i7 > 0 && (!r03.M7 || iRV9 > 0);
                boolean z5 = z4;
                i3 = size;
                if (z4) {
                    View viewIk2 = r03.Ik(r15, null, viewGroup);
                    if (r03.M7) {
                        int iRV92 = ActionMenuView.rV9(viewIk2, i2, iRV9, iMakeMeasureSpec, 0);
                        iRV9 -= iRV92;
                        if (iRV92 == 0) {
                            z5 = false;
                        }
                    } else {
                        viewIk2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z6 = z5;
                    int measuredWidth2 = viewIk2.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z4 = z6 & (!r03.M7 ? i7 + i14 <= 0 : i7 < 0);
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i15 = 0; i15 < i13; i15++) {
                        MenuItemImpl menuItemImpl2 = (MenuItemImpl) arrayListX.get(i15);
                        if (menuItemImpl2.getGroupId() == groupId2) {
                            if (menuItemImpl2.qie()) {
                                i11++;
                            }
                            menuItemImpl2.XQ(false);
                        }
                    }
                }
                if (z4) {
                    i11--;
                }
                r15.XQ(z4);
                r02 = 0;
            } else {
                r02 = r3;
                i3 = size;
                r15.XQ(r02);
            }
            i13++;
            r3 = r02;
            size = i3;
            view = null;
            r03 = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public boolean HI(ViewGroup viewGroup, int i2) {
        if (viewGroup.getChildAt(i2) == this.f13984e) {
            return false;
        }
        return super.HI(viewGroup, i2);
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public View Ik(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        int i2;
        View actionView = menuItemImpl.getActionView();
        if (actionView == null || menuItemImpl.mUb()) {
            actionView = super.Ik(menuItemImpl, view, viewGroup);
        }
        if (menuItemImpl.isActionViewExpanded()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        actionView.setVisibility(i2);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public boolean J2(SubMenuBuilder subMenuBuilder) {
        boolean z2 = false;
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        SubMenuBuilder subMenuBuilder2 = subMenuBuilder;
        while (subMenuBuilder2.z() != this.f13806O) {
            subMenuBuilder2 = (SubMenuBuilder) subMenuBuilder2.z();
        }
        View viewIF = iF(subMenuBuilder2.getItem());
        if (viewIF == null) {
            return false;
        }
        this.f13976I = subMenuBuilder.getItem().getItemId();
        int size = subMenuBuilder.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = subMenuBuilder.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        ActionButtonSubmenu actionButtonSubmenu = new ActionButtonSubmenu(this.f13813t, subMenuBuilder, viewIF);
        this.f13972B = actionButtonSubmenu;
        actionButtonSubmenu.Uo(z2);
        this.f13972B.gh();
        super.J2(subMenuBuilder);
        return true;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public void KN(boolean z2) {
        ArrayList arrayListTe;
        super.KN(z2);
        ((View) this.f13809g).requestLayout();
        MenuBuilder menuBuilder = this.f13806O;
        boolean z3 = false;
        if (menuBuilder != null) {
            ArrayList arrayListXQ = menuBuilder.XQ();
            int size = arrayListXQ.size();
            for (int i2 = 0; i2 < size; i2++) {
                ActionProvider actionProviderN = ((MenuItemImpl) arrayListXQ.get(i2)).n();
                if (actionProviderN != null) {
                    actionProviderN.xMQ(this);
                }
            }
        }
        MenuBuilder menuBuilder2 = this.f13806O;
        if (menuBuilder2 != null) {
            arrayListTe = menuBuilder2.te();
        } else {
            arrayListTe = null;
        }
        if (this.f13979N && arrayListTe != null) {
            int size2 = arrayListTe.size();
            if (size2 == 1) {
                z3 = !((MenuItemImpl) arrayListTe.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.f13984e == null) {
                this.f13984e = new OverflowMenuButton(this.f13810n);
            }
            ViewGroup viewGroup = (ViewGroup) this.f13984e.getParent();
            if (viewGroup != this.f13809g) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f13984e);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f13809g;
                actionMenuView.addView(this.f13984e, actionMenuView.T());
            }
        } else {
            OverflowMenuButton overflowMenuButton = this.f13984e;
            if (overflowMenuButton != null) {
                Object parent = overflowMenuButton.getParent();
                Object obj = this.f13809g;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f13984e);
                }
            }
        }
        ((ActionMenuView) this.f13809g).setOverflowReserved(this.f13979N);
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public boolean Z(int i2, MenuItemImpl menuItemImpl) {
        return menuItemImpl.qie();
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public void gh(Context context, MenuBuilder menuBuilder) {
        super.gh(context, menuBuilder);
        Resources resources = context.getResources();
        ActionBarPolicy actionBarPolicyRl = ActionBarPolicy.rl(context);
        if (!this.f13985v) {
            this.f13979N = actionBarPolicyRl.KN();
        }
        if (!this.p5) {
            this.Xw = actionBarPolicyRl.t();
        }
        if (!this.P5) {
            this.f13981U = actionBarPolicyRl.nr();
        }
        int measuredWidth = this.Xw;
        if (this.f13979N) {
            if (this.f13984e == null) {
                OverflowMenuButton overflowMenuButton = new OverflowMenuButton(this.f13810n);
                this.f13984e = overflowMenuButton;
                if (this.f13980T) {
                    overflowMenuButton.setImageDrawable(this.f13982X);
                    this.f13982X = null;
                    this.f13980T = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f13984e.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f13984e.getMeasuredWidth();
        } else {
            this.f13984e = null;
        }
        this.jB = measuredWidth;
        this.f13974E = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public void rl(MenuBuilder menuBuilder, boolean z2) {
        te();
        super.rl(menuBuilder, z2);
    }

    public boolean te() {
        return E2() | e();
    }
}
