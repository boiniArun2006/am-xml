package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@RestrictTo
public class MenuItemWrapperICS extends BaseMenuWrapper implements MenuItem {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Method f13893O;
    private final SupportMenuItem nr;

    private class ActionProviderWrapper extends ActionProvider implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final android.view.ActionProvider f13894O;
        private ActionProvider.VisibilityListener nr;

        ActionProviderWrapper(Context context, android.view.ActionProvider actionProvider) {
            super(context);
            this.f13894O = actionProvider;
        }

        @Override // androidx.core.view.ActionProvider
        public void J2(SubMenu subMenu) {
            this.f13894O.onPrepareSubMenu(MenuItemWrapperICS.this.nr(subMenu));
        }

        @Override // androidx.core.view.ActionProvider
        public boolean O() {
            return this.f13894O.onPerformDefaultAction();
        }

        @Override // androidx.core.view.ActionProvider
        public boolean Uo() {
            return this.f13894O.overridesItemVisibility();
        }

        @Override // androidx.core.view.ActionProvider
        public void mUb(ActionProvider.VisibilityListener visibilityListener) {
            this.nr = visibilityListener;
            this.f13894O.setVisibilityListener(visibilityListener != null ? this : null);
        }

        @Override // androidx.core.view.ActionProvider
        public boolean n() {
            return this.f13894O.hasSubMenu();
        }

        @Override // androidx.core.view.ActionProvider
        public View nr(MenuItem menuItem) {
            return this.f13894O.onCreateActionView(menuItem);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z2) {
            ActionProvider.VisibilityListener visibilityListener = this.nr;
            if (visibilityListener != null) {
                visibilityListener.onActionProviderVisibilityChanged(z2);
            }
        }

        @Override // androidx.core.view.ActionProvider
        public boolean rl() {
            return this.f13894O.isVisible();
        }

        @Override // androidx.core.view.ActionProvider
        public View t() {
            return this.f13894O.onCreateActionView();
        }
    }

    static class CollapsibleActionViewWrapper extends FrameLayout implements CollapsibleActionView {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final android.view.CollapsibleActionView f13895n;

        @Override // androidx.appcompat.view.CollapsibleActionView
        public void J2() {
            this.f13895n.onActionViewCollapsed();
        }

        View n() {
            return (View) this.f13895n;
        }

        @Override // androidx.appcompat.view.CollapsibleActionView
        public void rl() {
            this.f13895n.onActionViewExpanded();
        }

        /* JADX WARN: Multi-variable type inference failed */
        CollapsibleActionViewWrapper(View view) {
            super(view.getContext());
            this.f13895n = (android.view.CollapsibleActionView) view;
            addView(view);
        }
    }

    private class OnActionExpandListenerWrapper implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f13896n;

        OnActionExpandListenerWrapper(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f13896n = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f13896n.onMenuItemActionCollapse(MenuItemWrapperICS.this.t(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f13896n.onMenuItemActionExpand(MenuItemWrapperICS.this.t(menuItem));
        }
    }

    private class OnMenuItemClickListenerWrapper implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f13897n;

        OnMenuItemClickListenerWrapper(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f13897n = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f13897n.onMenuItemClick(MenuItemWrapperICS.this.t(menuItem));
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof android.view.CollapsibleActionView) {
            view = new CollapsibleActionViewWrapper(view);
        }
        this.nr.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.nr.setAlphabeticShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.nr.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.nr.setNumericShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c4) {
        this.nr.setShortcut(c2, c4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.nr.setTitle(charSequence);
        return this;
    }

    public void KN(boolean z2) {
        try {
            if (this.f13893O == null) {
                this.f13893O = this.nr.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f13893O.invoke(this.nr, Boolean.valueOf(z2));
        } catch (Exception e2) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
        }
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.nr.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.nr.expandActionView();
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        androidx.core.view.ActionProvider actionProviderN = this.nr.n();
        if (actionProviderN instanceof ActionProviderWrapper) {
            return ((ActionProviderWrapper) actionProviderN).f13894O;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.nr.getActionView();
        return actionView instanceof CollapsibleActionViewWrapper ? ((CollapsibleActionViewWrapper) actionView).n() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.nr.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.nr.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.nr.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.nr.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.nr.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.nr.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.nr.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.nr.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.nr.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.nr.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.nr.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.nr.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.nr.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return nr(this.nr.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.nr.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.nr.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.nr.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.nr.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.nr.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.nr.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.nr.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.nr.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.nr.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        ActionProviderWrapper actionProviderWrapper = new ActionProviderWrapper(this.f13814n, actionProvider);
        SupportMenuItem supportMenuItem = this.nr;
        if (actionProvider == null) {
            actionProviderWrapper = null;
        }
        supportMenuItem.rl(actionProviderWrapper);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.nr.setAlphabeticShortcut(c2, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z2) {
        this.nr.setCheckable(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z2) {
        this.nr.setChecked(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.nr.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z2) {
        this.nr.setEnabled(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.nr.setIcon(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.nr.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.nr.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.nr.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        this.nr.setNumericShortcut(c2, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.nr.setOnActionExpandListener(onActionExpandListener != null ? new OnActionExpandListenerWrapper(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.nr.setOnMenuItemClickListener(onMenuItemClickListener != null ? new OnMenuItemClickListenerWrapper(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c4, int i2, int i3) {
        this.nr.setShortcut(c2, c4, i2, i3);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i2) {
        this.nr.setShowAsAction(i2);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i2) {
        this.nr.setShowAsActionFlags(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.nr.setTitle(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.nr.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.nr.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z2) {
        return this.nr.setVisible(z2);
    }

    public MenuItemWrapperICS(Context context, SupportMenuItem supportMenuItem) {
        super(context);
        if (supportMenuItem != null) {
            this.nr = supportMenuItem;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i2) {
        this.nr.setActionView(i2);
        View actionView = this.nr.getActionView();
        if (actionView instanceof android.view.CollapsibleActionView) {
            this.nr.setActionView(new CollapsibleActionViewWrapper(actionView));
        }
        return this;
    }
}
