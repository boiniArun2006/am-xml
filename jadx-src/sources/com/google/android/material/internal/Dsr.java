package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class Dsr implements MenuPresenter {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f58970B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    int f58971D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    int f58972E;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f58975J;
    MenuBuilder J2;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    boolean f58976M;
    int M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    Drawable f58977N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private MenuPresenter.Callback f58978O;
    int P5;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    ColorStateList f58980T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    int f58981U;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    ColorStateList f58982X;
    int Xw;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    LayoutInflater f58983Z;
    int eF;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ColorStateList f58986g;
    int jB;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private NavigationMenuView f58987n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    w6 f58988o;
    int p5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f58989r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    LinearLayout f58990t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    RippleDrawable f58991v;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    int f58979S = 0;
    int E2 = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f58985e = true;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    boolean f58973FX = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f58984a = -1;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    final View.OnClickListener f58974I = new j();

    private static class C extends o {
        public C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(Rxk.fuX.KN, viewGroup, false));
        }
    }

    private static class CN3 implements I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final MenuItemImpl f58992n;
        boolean rl;

        public MenuItemImpl n() {
            return this.f58992n;
        }

        CN3(MenuItemImpl menuItemImpl) {
            this.f58992n = menuItemImpl;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.Dsr$Dsr, reason: collision with other inner class name */
    private static class C0786Dsr extends o {
        public C0786Dsr(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(Rxk.fuX.f8783O, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    private interface I28 {
    }

    private static class Wre implements I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f58993n;
        private final int rl;

        public int n() {
            return this.rl;
        }

        public int rl() {
            return this.f58993n;
        }

        public Wre(int i2, int i3) {
            this.f58993n = i2;
            this.rl = i3;
        }
    }

    private static class aC extends o {
        public aC(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(Rxk.fuX.Uo, viewGroup, false));
        }
    }

    private class fuX extends RecyclerViewAccessibilityDelegate {
        fuX(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate, androidx.core.view.AccessibilityDelegateCompat
        public void Uo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.Uo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.Mx(AccessibilityNodeInfoCompat.CollectionInfoCompat.n(Dsr.this.f58988o.Ik(), 1, false));
        }
    }

    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z2 = true;
            Dsr.this.B(true);
            MenuItemImpl itemData = ((NavigationMenuItemView) view).getItemData();
            Dsr dsr = Dsr.this;
            boolean zXw = dsr.J2.Xw(itemData, dsr, 0);
            if (itemData != null && itemData.isCheckable() && zXw) {
                Dsr.this.f58988o.aYN(itemData);
            } else {
                z2 = false;
            }
            Dsr.this.B(false);
            if (z2) {
                Dsr.this.KN(false);
            }
        }
    }

    private class w6 extends RecyclerView.Adapter {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ArrayList f58995n = new ArrayList();
        private MenuItemImpl rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f58996t;

        class j extends AccessibilityDelegateCompat {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ boolean f58997O;
            final /* synthetic */ int nr;

            j(int i2, boolean z2) {
                this.nr = i2;
                this.f58997O = z2;
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void Uo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.Uo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.G7(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.n(w6.this.az(this.nr), 1, 1, 1, this.f58997O, view.isSelected()));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int az(int i2) {
            int i3 = i2;
            for (int i5 = 0; i5 < i2; i5++) {
                if (Dsr.this.f58988o.getItemViewType(i5) == 2 || Dsr.this.f58988o.getItemViewType(i5) == 3) {
                    i3--;
                }
            }
            return i3;
        }

        int Ik() {
            int i2 = 0;
            for (int i3 = 0; i3 < Dsr.this.f58988o.getItemCount(); i3++) {
                int itemViewType = Dsr.this.f58988o.getItemViewType(i3);
                if (itemViewType == 0 || itemViewType == 1) {
                    i2++;
                }
            }
            return i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        w6() {
            XQ();
        }

        private void WPU(View view, int i2, boolean z2) {
            ViewCompat.eTf(view, new j(i2, z2));
        }

        private void XQ() {
            if (this.f58996t) {
                return;
            }
            boolean z2 = true;
            this.f58996t = true;
            this.f58995n.clear();
            this.f58995n.add(new Ml());
            int size = Dsr.this.J2.X().size();
            int i2 = -1;
            int i3 = 0;
            boolean z3 = false;
            int size2 = 0;
            while (i3 < size) {
                MenuItemImpl menuItemImpl = (MenuItemImpl) Dsr.this.J2.X().get(i3);
                if (menuItemImpl.isChecked()) {
                    aYN(menuItemImpl);
                }
                if (menuItemImpl.isCheckable()) {
                    menuItemImpl.Z(false);
                }
                if (menuItemImpl.hasSubMenu()) {
                    SubMenu subMenu = menuItemImpl.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i3 != 0) {
                            this.f58995n.add(new Wre(Dsr.this.f58971D, 0));
                        }
                        this.f58995n.add(new CN3(menuItemImpl));
                        int size3 = this.f58995n.size();
                        int size4 = subMenu.size();
                        int i5 = 0;
                        boolean z4 = false;
                        while (i5 < size4) {
                            MenuItemImpl menuItemImpl2 = (MenuItemImpl) subMenu.getItem(i5);
                            if (menuItemImpl2.isVisible()) {
                                if (!z4 && menuItemImpl2.getIcon() != null) {
                                    z4 = z2;
                                }
                                if (menuItemImpl2.isCheckable()) {
                                    menuItemImpl2.Z(false);
                                }
                                if (menuItemImpl.isChecked()) {
                                    aYN(menuItemImpl);
                                }
                                this.f58995n.add(new CN3(menuItemImpl2));
                            }
                            i5++;
                            z2 = true;
                        }
                        if (z4) {
                            ty(size3, this.f58995n.size());
                        }
                    }
                } else {
                    int groupId = menuItemImpl.getGroupId();
                    if (groupId != i2) {
                        size2 = this.f58995n.size();
                        z3 = menuItemImpl.getIcon() != null;
                        if (i3 != 0) {
                            size2++;
                            ArrayList arrayList = this.f58995n;
                            int i7 = Dsr.this.f58971D;
                            arrayList.add(new Wre(i7, i7));
                        }
                    } else if (!z3 && menuItemImpl.getIcon() != null) {
                        ty(size2, this.f58995n.size());
                        z3 = true;
                    }
                    CN3 cn3 = new CN3(menuItemImpl);
                    cn3.rl = z3;
                    this.f58995n.add(cn3);
                    i2 = groupId;
                }
                i3++;
                z2 = true;
            }
            this.f58996t = false;
        }

        private void ty(int i2, int i3) {
            while (i2 < i3) {
                ((CN3) this.f58995n.get(i2)).rl = true;
                i2++;
            }
        }

        public Bundle HI() {
            Bundle bundle = new Bundle();
            MenuItemImpl menuItemImpl = this.rl;
            if (menuItemImpl != null) {
                bundle.putInt("android:menu:checked", menuItemImpl.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f58995n.size();
            for (int i2 = 0; i2 < size; i2++) {
                I28 i28 = (I28) this.f58995n.get(i2);
                if (i28 instanceof CN3) {
                    MenuItemImpl menuItemImplN = ((CN3) i28).n();
                    View actionView = menuItemImplN != null ? menuItemImplN.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(menuItemImplN.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        public void S(Bundle bundle) {
            MenuItemImpl menuItemImplN;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            MenuItemImpl menuItemImplN2;
            int i2 = bundle.getInt("android:menu:checked", 0);
            if (i2 != 0) {
                this.f58996t = true;
                int size = this.f58995n.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    I28 i28 = (I28) this.f58995n.get(i3);
                    if ((i28 instanceof CN3) && (menuItemImplN2 = ((CN3) i28).n()) != null && menuItemImplN2.getItemId() == i2) {
                        aYN(menuItemImplN2);
                        break;
                    }
                    i3++;
                }
                this.f58996t = false;
                XQ();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f58995n.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    I28 i282 = (I28) this.f58995n.get(i5);
                    if ((i282 instanceof CN3) && (menuItemImplN = ((CN3) i282).n()) != null && (actionView = menuItemImplN.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(menuItemImplN.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public void ViF(boolean z2) {
            this.f58996t = z2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
        public void onViewRecycled(o oVar) {
            if (oVar instanceof C0786Dsr) {
                ((NavigationMenuItemView) oVar.itemView).X();
            }
        }

        public void aYN(MenuItemImpl menuItemImpl) {
            if (this.rl == menuItemImpl || !menuItemImpl.isCheckable()) {
                return;
            }
            MenuItemImpl menuItemImpl2 = this.rl;
            if (menuItemImpl2 != null) {
                menuItemImpl2.setChecked(false);
            }
            this.rl = menuItemImpl;
            menuItemImpl.setChecked(true);
        }

        public MenuItemImpl ck() {
            return this.rl;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f58995n.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i2) {
            I28 i28 = (I28) this.f58995n.get(i2);
            if (i28 instanceof Wre) {
                return 2;
            }
            if (i28 instanceof Ml) {
                return 3;
            }
            if (i28 instanceof CN3) {
                return ((CN3) i28).n().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public o onCreateViewHolder(ViewGroup viewGroup, int i2) {
            if (i2 == 0) {
                Dsr dsr = Dsr.this;
                return new C0786Dsr(dsr.f58983Z, viewGroup, dsr.f58974I);
            }
            if (i2 == 1) {
                return new C(Dsr.this.f58983Z, viewGroup);
            }
            if (i2 == 2) {
                return new aC(Dsr.this.f58983Z, viewGroup);
            }
            if (i2 != 3) {
                return null;
            }
            return new n(Dsr.this.f58990t);
        }

        public void nY() {
            XQ();
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(o oVar, int i2) {
            Drawable drawableNewDrawable;
            int itemViewType = getItemViewType(i2);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        return;
                    }
                    Wre wre = (Wre) this.f58995n.get(i2);
                    oVar.itemView.setPadding(Dsr.this.M7, wre.rl(), Dsr.this.p5, wre.n());
                    return;
                }
                TextView textView = (TextView) oVar.itemView;
                textView.setText(((CN3) this.f58995n.get(i2)).n().getTitle());
                TextViewCompat.Ik(textView, Dsr.this.f58979S);
                textView.setPadding(Dsr.this.eF, textView.getPaddingTop(), Dsr.this.f58972E, textView.getPaddingBottom());
                ColorStateList colorStateList = Dsr.this.f58986g;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                WPU(textView, i2, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) oVar.itemView;
            navigationMenuItemView.setIconTintList(Dsr.this.f58980T);
            navigationMenuItemView.setTextAppearance(Dsr.this.E2);
            ColorStateList colorStateList2 = Dsr.this.f58982X;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = Dsr.this.f58977N;
            if (drawable != null) {
                drawableNewDrawable = drawable.getConstantState().newDrawable();
            } else {
                drawableNewDrawable = null;
            }
            ViewCompat.C(navigationMenuItemView, drawableNewDrawable);
            RippleDrawable rippleDrawable = Dsr.this.f58991v;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            CN3 cn3 = (CN3) this.f58995n.get(i2);
            navigationMenuItemView.setNeedsEmptyIcon(cn3.rl);
            Dsr dsr = Dsr.this;
            int i3 = dsr.Xw;
            int i5 = dsr.jB;
            navigationMenuItemView.setPadding(i3, i5, i3, i5);
            navigationMenuItemView.setIconPadding(Dsr.this.f58981U);
            Dsr dsr2 = Dsr.this;
            if (dsr2.f58976M) {
                navigationMenuItemView.setIconSize(dsr2.P5);
            }
            navigationMenuItemView.setMaxLines(Dsr.this.f58970B);
            navigationMenuItemView.e(cn3.n(), Dsr.this.f58985e);
            WPU(navigationMenuItemView, i2, false);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean J2(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean mUb(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean t(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean xMQ() {
        return false;
    }

    private static class Ml implements I28 {
        Ml() {
        }
    }

    private static class n extends o {
        public n(View view) {
            super(view);
        }
    }

    private static abstract class o extends RecyclerView.ViewHolder {
        public o(View view) {
            super(view);
        }
    }

    public void B(boolean z2) {
        w6 w6Var = this.f58988o;
        if (w6Var != null) {
            w6Var.ViF(z2);
        }
    }

    public void E(int i2) {
        this.f58972E = i2;
        KN(false);
    }

    public void E2(boolean z2) {
        if (this.f58973FX != z2) {
            this.f58973FX = z2;
            J();
        }
    }

    public void FX(int i2) {
        this.f58979S = i2;
        KN(false);
    }

    public int HI() {
        return this.p5;
    }

    public int Ik() {
        return this.f58990t.getChildCount();
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void KN(boolean z2) {
        w6 w6Var = this.f58988o;
        if (w6Var != null) {
            w6Var.nY();
        }
    }

    public void M(int i2) {
        this.eF = i2;
        KN(false);
    }

    public void M7(int i2) {
        this.jB = i2;
        KN(false);
    }

    public void N(int i2) {
        this.f58989r = i2;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void O(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f58987n.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f58988o.S(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f58990t.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    public void P5(ColorStateList colorStateList) {
        this.f58982X = colorStateList;
        KN(false);
    }

    public int S() {
        return this.f58970B;
    }

    public void T(int i2) {
        this.M7 = i2;
        KN(false);
    }

    public void U(boolean z2) {
        this.f58985e = z2;
        KN(false);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public Parcelable Uo() {
        Bundle bundle = new Bundle();
        if (this.f58987n != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f58987n.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        w6 w6Var = this.f58988o;
        if (w6Var != null) {
            bundle.putBundle("android:menu:adapter", w6Var.HI());
        }
        if (this.f58990t != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.f58990t.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    public int ViF() {
        return this.jB;
    }

    public ColorStateList WPU() {
        return this.f58982X;
    }

    public void X(int i2) {
        this.p5 = i2;
        KN(false);
    }

    public int XQ() {
        return this.f58981U;
    }

    public void Xw(int i2) {
        this.f58970B = i2;
        KN(false);
    }

    public int Z() {
        return this.Xw;
    }

    public ColorStateList aYN() {
        return this.f58980T;
    }

    public void bzg(ColorStateList colorStateList) {
        this.f58980T = colorStateList;
        KN(false);
    }

    public int ck() {
        return this.M7;
    }

    public void e(MenuItemImpl menuItemImpl) {
        this.f58988o.aYN(menuItemImpl);
    }

    public void eF(ColorStateList colorStateList) {
        this.f58986g = colorStateList;
        KN(false);
    }

    public View fD(int i2) {
        View viewInflate = this.f58983Z.inflate(i2, (ViewGroup) this.f58990t, false);
        qie(viewInflate);
        return viewInflate;
    }

    public int g() {
        return this.f58972E;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return this.f58989r;
    }

    public void jB(int i2) {
        this.E2 = i2;
        KN(false);
    }

    public void nHg(Drawable drawable) {
        this.f58977N = drawable;
        KN(false);
    }

    public MenuView nY(ViewGroup viewGroup) {
        if (this.f58987n == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f58983Z.inflate(Rxk.fuX.xMQ, viewGroup, false);
            this.f58987n = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new fuX(this.f58987n));
            if (this.f58988o == null) {
                w6 w6Var = new w6();
                this.f58988o = w6Var;
                w6Var.setHasStableIds(true);
            }
            int i2 = this.f58984a;
            if (i2 != -1) {
                this.f58987n.setOverScrollMode(i2);
            }
            LinearLayout linearLayout = (LinearLayout) this.f58983Z.inflate(Rxk.fuX.J2, (ViewGroup) this.f58987n, false);
            this.f58990t = linearLayout;
            ViewCompat.ul(linearLayout, 2);
            this.f58987n.setAdapter(this.f58988o);
        }
        return this.f58987n;
    }

    public Drawable o() {
        return this.f58977N;
    }

    public void p5(int i2) {
        this.f58984a = i2;
        NavigationMenuView navigationMenuView = this.f58987n;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i2);
        }
    }

    public void qie(View view) {
        this.f58990t.addView(view);
        NavigationMenuView navigationMenuView = this.f58987n;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    public View r(int i2) {
        return this.f58990t.getChildAt(i2);
    }

    public void rV9(int i2) {
        if (this.P5 != i2) {
            this.P5 = i2;
            this.f58976M = true;
            KN(false);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void rl(MenuBuilder menuBuilder, boolean z2) {
        MenuPresenter.Callback callback = this.f58978O;
        if (callback != null) {
            callback.rl(menuBuilder, z2);
        }
    }

    public void s7N(RippleDrawable rippleDrawable) {
        this.f58991v = rippleDrawable;
        KN(false);
    }

    public int te() {
        return this.eF;
    }

    public MenuItemImpl ty() {
        return this.f58988o.ck();
    }

    public void v(int i2) {
        this.f58981U = i2;
        KN(false);
    }

    public void wTp(int i2) {
        this.Xw = i2;
        KN(false);
    }

    private void J() {
        int i2;
        if (!iF() && this.f58973FX) {
            i2 = this.f58975J;
        } else {
            i2 = 0;
        }
        NavigationMenuView navigationMenuView = this.f58987n;
        navigationMenuView.setPadding(0, i2, 0, navigationMenuView.getPaddingBottom());
    }

    private boolean iF() {
        if (Ik() > 0) {
            return true;
        }
        return false;
    }

    public void az(WindowInsetsCompat windowInsetsCompat) {
        int iAz = windowInsetsCompat.az();
        if (this.f58975J != iAz) {
            this.f58975J = iAz;
            J();
        }
        NavigationMenuView navigationMenuView = this.f58987n;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, windowInsetsCompat.mUb());
        ViewCompat.Uo(this.f58990t, windowInsetsCompat);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void gh(Context context, MenuBuilder menuBuilder) {
        this.f58983Z = LayoutInflater.from(context);
        this.J2 = menuBuilder;
        this.f58971D = context.getResources().getDimensionPixelOffset(Rxk.Ml.f8759t);
    }
}
