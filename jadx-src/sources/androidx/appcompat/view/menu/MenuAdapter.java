package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuView;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public class MenuAdapter extends BaseAdapter {
    private final boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f13868O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    MenuBuilder f13869n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f13870o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final LayoutInflater f13871r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f13872t = -1;

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f13871r.inflate(this.f13870o, viewGroup, false);
        }
        int groupId = getItem(i2).getGroupId();
        int i3 = i2 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f13869n.N() && groupId != (i3 >= 0 ? getItem(i3).getGroupId() : groupId));
        MenuView.ItemView itemView = (MenuView.ItemView) view;
        if (this.f13868O) {
            listMenuItemView.setForceShowIcon(true);
        }
        itemView.t(getItem(i2), 0);
        return view;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f13872t < 0 ? (this.J2 ? this.f13869n.te() : this.f13869n.X()).size() : r0.size() - 1;
    }

    void n() {
        MenuItemImpl menuItemImplAYN = this.f13869n.aYN();
        if (menuItemImplAYN != null) {
            ArrayList arrayListTe = this.f13869n.te();
            int size = arrayListTe.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((MenuItemImpl) arrayListTe.get(i2)) == menuItemImplAYN) {
                    this.f13872t = i2;
                    return;
                }
            }
        }
        this.f13872t = -1;
    }

    public void nr(boolean z2) {
        this.f13868O = z2;
    }

    public MenuBuilder rl() {
        return this.f13869n;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public MenuItemImpl getItem(int i2) {
        ArrayList arrayListTe = this.J2 ? this.f13869n.te() : this.f13869n.X();
        int i3 = this.f13872t;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (MenuItemImpl) arrayListTe.get(i2);
    }

    public MenuAdapter(MenuBuilder menuBuilder, LayoutInflater layoutInflater, boolean z2, int i2) {
        this.J2 = z2;
        this.f13871r = layoutInflater;
        this.f13869n = menuBuilder;
        this.f13870o = i2;
        n();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        n();
        super.notifyDataSetChanged();
    }
}
