package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.TintTypedArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RestrictTo
public final class ExpandedMenuView extends ListView implements MenuBuilder.ItemInvoker, MenuView, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final int[] f13843O = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private MenuBuilder f13844n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f13845t;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        TintTypedArray tintTypedArrayS = TintTypedArray.S(context, attributeSet, f13843O, i2, 0);
        if (tintTypedArrayS.o(0)) {
            setBackgroundDrawable(tintTypedArrayS.Uo(0));
        }
        if (tintTypedArrayS.o(1)) {
            setDivider(tintTypedArrayS.Uo(1));
        }
        tintTypedArrayS.aYN();
    }

    public int getWindowAnimations() {
        return this.f13845t;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public void n(MenuBuilder menuBuilder) {
        this.f13844n = menuBuilder;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.ItemInvoker
    public boolean nr(MenuItemImpl menuItemImpl) {
        return this.f13844n.bzg(menuItemImpl, 0);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        nr((MenuItemImpl) getAdapter().getItem(i2));
    }
}
