package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@RestrictTo
public class ListMenuPresenter implements MenuPresenter, AdapterView.OnItemClickListener {
    private int E2;
    ExpandedMenuView J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    MenuBuilder f13858O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private MenuPresenter.Callback f13859S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    int f13860Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    MenuAdapter f13861g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Context f13862n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f13863o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f13864r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    LayoutInflater f13865t;

    private class MenuAdapter extends BaseAdapter {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f13866n = -1;

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                ListMenuPresenter listMenuPresenter = ListMenuPresenter.this;
                view = listMenuPresenter.f13865t.inflate(listMenuPresenter.f13860Z, viewGroup, false);
            }
            ((MenuView.ItemView) view).t(getItem(i2), 0);
            return view;
        }

        public MenuAdapter() {
            n();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = ListMenuPresenter.this.f13858O.te().size() - ListMenuPresenter.this.f13864r;
            return this.f13866n < 0 ? size : size - 1;
        }

        void n() {
            MenuItemImpl menuItemImplAYN = ListMenuPresenter.this.f13858O.aYN();
            if (menuItemImplAYN != null) {
                ArrayList arrayListTe = ListMenuPresenter.this.f13858O.te();
                int size = arrayListTe.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (((MenuItemImpl) arrayListTe.get(i2)) == menuItemImplAYN) {
                        this.f13866n = i2;
                        return;
                    }
                }
            }
            this.f13866n = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public MenuItemImpl getItem(int i2) {
            ArrayList arrayListTe = ListMenuPresenter.this.f13858O.te();
            int i3 = i2 + ListMenuPresenter.this.f13864r;
            int i5 = this.f13866n;
            if (i5 >= 0 && i3 >= i5) {
                i3++;
            }
            return (MenuItemImpl) arrayListTe.get(i3);
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            n();
            super.notifyDataSetChanged();
        }
    }

    public ListMenuPresenter(Context context, int i2) {
        this(i2, 0);
        this.f13862n = context;
        this.f13865t = LayoutInflater.from(context);
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

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void KN(boolean z2) {
        MenuAdapter menuAdapter = this.f13861g;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void O(Parcelable parcelable) {
        az((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public Parcelable Uo() {
        if (this.J2 == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        ty(bundle);
        return bundle;
    }

    public void az(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.J2.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return this.E2;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void gh(Context context, MenuBuilder menuBuilder) {
        if (this.f13863o != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f13863o);
            this.f13862n = contextThemeWrapper;
            this.f13865t = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f13862n != null) {
            this.f13862n = context;
            if (this.f13865t == null) {
                this.f13865t = LayoutInflater.from(context);
            }
        }
        this.f13858O = menuBuilder;
        MenuAdapter menuAdapter = this.f13861g;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }

    public ListAdapter n() {
        if (this.f13861g == null) {
            this.f13861g = new MenuAdapter();
        }
        return this.f13861g;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void nr(MenuPresenter.Callback callback) {
        this.f13859S = callback;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        this.f13858O.Xw(this.f13861g.getItem(i2), this, 0);
    }

    public MenuView qie(ViewGroup viewGroup) {
        if (this.J2 == null) {
            this.J2 = (ExpandedMenuView) this.f13865t.inflate(R.layout.xMQ, viewGroup, false);
            if (this.f13861g == null) {
                this.f13861g = new MenuAdapter();
            }
            this.J2.setAdapter((ListAdapter) this.f13861g);
            this.J2.setOnItemClickListener(this);
        }
        return this.J2;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void rl(MenuBuilder menuBuilder, boolean z2) {
        MenuPresenter.Callback callback = this.f13859S;
        if (callback != null) {
            callback.rl(menuBuilder, z2);
        }
    }

    public void ty(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.J2;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean J2(SubMenuBuilder subMenuBuilder) {
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        new MenuDialogHelper(subMenuBuilder).nr(null);
        MenuPresenter.Callback callback = this.f13859S;
        if (callback != null) {
            callback.t(subMenuBuilder);
            return true;
        }
        return true;
    }

    public ListMenuPresenter(int i2, int i3) {
        this.f13860Z = i2;
        this.f13863o = i3;
    }
}
