package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@RestrictTo
public class ActionMenuItem implements SupportMenuItem {
    private CharSequence HI;
    private Intent J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private CharSequence f13794O;
    private char Uo;
    private MenuItem.OnMenuItemClickListener az;
    private Drawable gh;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f13796n;
    private CharSequence nr;
    private Context qie;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f13799t;
    private CharSequence ty;
    private char xMQ;
    private int KN = 4096;
    private int mUb = 4096;
    private ColorStateList ck = null;
    private PorterDuff.Mode Ik = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f13798r = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f13797o = false;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private int f13795Z = 16;

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public ActionProvider n() {
        return null;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.xMQ = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.gh = drawable;
        t();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.Uo = c2;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c4) {
        this.Uo = c2;
        this.xMQ = Character.toLowerCase(c4);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public void setShowAsAction(int i2) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.nr = charSequence;
        return this;
    }

    private void t() {
        Drawable drawable = this.gh;
        if (drawable != null) {
            if (this.f13798r || this.f13797o) {
                Drawable drawableR = DrawableCompat.r(drawable);
                this.gh = drawableR;
                Drawable drawableMutate = drawableR.mutate();
                this.gh = drawableMutate;
                if (this.f13798r) {
                    DrawableCompat.HI(drawableMutate, this.ck);
                }
                if (this.f13797o) {
                    DrawableCompat.ck(this.gh, this.Ik);
                }
            }
        }
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public SupportMenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.mUb;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.xMQ;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.ty;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.rl;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.gh;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.ck;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.Ik;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.J2;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f13796n;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public int getNumericModifiers() {
        return this.KN;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.Uo;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f13799t;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.nr;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f13794O;
        return charSequence != null ? charSequence : this.nr;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.HI;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f13795Z & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f13795Z & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f13795Z & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f13795Z & 8) == 0;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
    public SupportMenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public SupportMenuItem rl(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.xMQ = Character.toLowerCase(c2);
        this.mUb = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z2) {
        this.f13795Z = (z2 ? 1 : 0) | (this.f13795Z & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z2) {
        this.f13795Z = (z2 ? 2 : 0) | (this.f13795Z & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.ty = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z2) {
        this.f13795Z = (z2 ? 16 : 0) | (this.f13795Z & (-17));
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.ck = colorStateList;
        this.f13798r = true;
        t();
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.Ik = mode;
        this.f13797o = true;
        t();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.J2 = intent;
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        this.Uo = c2;
        this.KN = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.az = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.nr = this.qie.getResources().getString(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13794O = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.HI = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z2) {
        this.f13795Z = (this.f13795Z & 8) | (z2 ? 0 : 8);
        return this;
    }

    public ActionMenuItem(Context context, int i2, int i3, int i5, int i7, CharSequence charSequence) {
        this.qie = context;
        this.f13796n = i3;
        this.rl = i2;
        this.f13799t = i7;
        this.nr = charSequence;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public SupportMenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.gh = ContextCompat.getDrawable(this.qie, i2);
        t();
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c4, int i2, int i3) {
        this.Uo = c2;
        this.KN = KeyEvent.normalizeMetaState(i2);
        this.xMQ = Character.toLowerCase(c4);
        this.mUb = KeyEvent.normalizeMetaState(i3);
        return this;
    }
}
