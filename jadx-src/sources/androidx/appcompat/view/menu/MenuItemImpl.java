package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.MenuView;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@RestrictTo
public final class MenuItemImpl implements SupportMenuItem {
    private ContextMenu.ContextMenuInfo E2;
    private SubMenuBuilder HI;
    private MenuItem.OnMenuItemClickListener Ik;
    private CharSequence J2;
    private char KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private CharSequence f13884O;
    private Intent Uo;
    private Runnable ck;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View f13887g;
    private MenuItem.OnActionExpandListener iF;
    private char mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f13888n;
    private int nY;
    private final int nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f13889o;
    private Drawable qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f13890r;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f13891t;
    private ActionProvider te;
    MenuBuilder ty;
    private int xMQ = 4096;
    private int gh = 4096;
    private int az = 0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private ColorStateList f13886Z = null;
    private PorterDuff.Mode XQ = null;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f13885S = false;
    private boolean WPU = false;
    private boolean aYN = false;
    private int ViF = 16;
    private boolean fD = false;

    private static void nr(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.mUb == c2) {
            return this;
        }
        this.mUb = Character.toLowerCase(c2);
        this.ty.rV9(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.az = 0;
        this.qie = drawable;
        this.aYN = true;
        this.ty.rV9(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        if (this.KN == c2) {
            return this;
        }
        this.KN = c2;
        this.ty.rV9(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c4) {
        this.KN = c2;
        this.mUb = Character.toLowerCase(c4);
        this.ty.rV9(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f13884O = charSequence;
        this.ty.rV9(false);
        SubMenuBuilder subMenuBuilder = this.HI;
        if (subMenuBuilder != null) {
            subMenuBuilder.setHeaderTitle(charSequence);
        }
        return this;
    }

    private Drawable O(Drawable drawable) {
        if (drawable != null && this.aYN && (this.f13885S || this.WPU)) {
            drawable = DrawableCompat.r(drawable).mutate();
            if (this.f13885S) {
                DrawableCompat.HI(drawable, this.f13886Z);
            }
            if (this.WPU) {
                DrawableCompat.ck(drawable, this.XQ);
            }
            this.aYN = false;
        }
        return drawable;
    }

    public boolean HI() {
        return (this.nY & 2) == 2;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
    public SupportMenuItem setActionView(View view) {
        int i2;
        this.f13887g = view;
        this.te = null;
        if (view != null && view.getId() == -1 && (i2 = this.f13888n) > 0) {
            view.setId(i2);
        }
        this.ty.wTp(this);
        return this;
    }

    public int J2() {
        return this.nr;
    }

    void S(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E2 = contextMenuInfo;
    }

    char Uo() {
        return this.ty.nHg() ? this.mUb : this.KN;
    }

    boolean ViF(boolean z2) {
        int i2 = this.ViF;
        int i3 = (z2 ? 0 : 8) | (i2 & (-9));
        this.ViF = i3;
        return i2 != i3;
    }

    public void XQ(boolean z2) {
        if (z2) {
            this.ViF |= 32;
        } else {
            this.ViF &= -33;
        }
    }

    public void Z(boolean z2) {
        this.ViF = (z2 ? 4 : 0) | (this.ViF & (-5));
    }

    public void aYN(SubMenuBuilder subMenuBuilder) {
        this.HI = subMenuBuilder;
        subMenuBuilder.setHeaderTitle(getTitle());
    }

    public boolean az() {
        return (this.ViF & 4) != 0;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
    public SupportMenuItem setActionView(int i2) {
        Context contextWPU = this.ty.WPU();
        setActionView(LayoutInflater.from(contextWPU).inflate(i2, (ViewGroup) new LinearLayout(contextWPU), false));
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.nY & 8) == 0) {
            return false;
        }
        if (this.f13887g == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.iF;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.ty.J2(this);
        }
        return false;
    }

    boolean g() {
        return this.ty.s7N() && Uo() != 0;
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public View getActionView() {
        View view = this.f13887g;
        if (view != null) {
            return view;
        }
        ActionProvider actionProvider = this.te;
        if (actionProvider == null) {
            return null;
        }
        View viewNr = actionProvider.nr(this);
        this.f13887g = viewNr;
        return viewNr;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.gh;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.mUb;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f13890r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.rl;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.qie;
        if (drawable != null) {
            return O(drawable);
        }
        if (this.az == 0) {
            return null;
        }
        Drawable drawableRl = AppCompatResources.rl(this.ty.WPU(), this.az);
        this.az = 0;
        this.qie = drawableRl;
        return O(drawableRl);
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f13886Z;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.XQ;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.Uo;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f13888n;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E2;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public int getNumericModifiers() {
        return this.xMQ;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.KN;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f13891t;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.HI;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f13884O;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.J2;
        return charSequence != null ? charSequence : this.f13884O;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f13889o;
    }

    public boolean gh() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.Ik;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        MenuBuilder menuBuilder = this.ty;
        if (menuBuilder.KN(menuBuilder, this)) {
            return true;
        }
        Runnable runnable = this.ck;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.Uo != null) {
            try {
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.ty.WPU(), this.Uo);
                return true;
            } catch (ActivityNotFoundException e2) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
            }
        }
        ActionProvider actionProvider = this.te;
        return actionProvider != null && actionProvider.O();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.HI != null;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.fD;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.ViF & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.ViF & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.ViF & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        ActionProvider actionProvider = this.te;
        return (actionProvider == null || !actionProvider.Uo()) ? (this.ViF & 8) == 0 : (this.ViF & 8) == 0 && this.te.rl();
    }

    public boolean mUb() {
        ActionProvider actionProvider;
        if ((this.nY & 8) != 0) {
            if (this.f13887g == null && (actionProvider = this.te) != null) {
                this.f13887g = actionProvider.nr(this);
            }
            if (this.f13887g != null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public ActionProvider n() {
        return this.te;
    }

    public boolean nY() {
        return this.ty.iF();
    }

    void o(boolean z2) {
        int i2 = this.ViF;
        int i3 = (z2 ? 2 : 0) | (i2 & (-3));
        this.ViF = i3;
        if (i2 != i3) {
            this.ty.rV9(false);
        }
    }

    public boolean qie() {
        return (this.ViF & 32) == 32;
    }

    public void r(boolean z2) {
        this.fD = z2;
        this.ty.rV9(false);
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public SupportMenuItem rl(ActionProvider actionProvider) {
        ActionProvider actionProvider2 = this.te;
        if (actionProvider2 != null) {
            actionProvider2.KN();
        }
        this.f13887g = null;
        this.te = actionProvider;
        this.ty.rV9(true);
        ActionProvider actionProvider3 = this.te;
        if (actionProvider3 != null) {
            actionProvider3.mUb(new ActionProvider.VisibilityListener() { // from class: androidx.appcompat.view.menu.MenuItemImpl.1
                @Override // androidx.core.view.ActionProvider.VisibilityListener
                public void onActionProviderVisibilityChanged(boolean z2) {
                    MenuItemImpl menuItemImpl = MenuItemImpl.this;
                    menuItemImpl.ty.v(menuItemImpl);
                }
            });
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z2) {
        int i2 = this.ViF;
        int i3 = (z2 ? 1 : 0) | (i2 & (-2));
        this.ViF = i3;
        if (i2 != i3) {
            this.ty.rV9(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z2) {
        if ((this.ViF & 4) != 0) {
            this.ty.FX(this);
            return this;
        }
        o(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.f13890r = charSequence;
        this.ty.rV9(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.ViF |= 16;
        } else {
            this.ViF &= -17;
        }
        this.ty.rV9(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f13886Z = colorStateList;
        this.f13885S = true;
        this.aYN = true;
        this.ty.rV9(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.XQ = mode;
        this.WPU = true;
        this.aYN = true;
        this.ty.rV9(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.Uo = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.iF = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.Ik = onMenuItemClickListener;
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.nY = i2;
        this.ty.wTp(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.J2 = charSequence;
        this.ty.rV9(false);
        return this;
    }

    @Override // android.view.MenuItem
    public SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.f13889o = charSequence;
        this.ty.rV9(false);
        return this;
    }

    public void t() {
        this.ty.wTp(this);
    }

    public boolean te() {
        return (this.nY & 4) == 4;
    }

    public String toString() {
        CharSequence charSequence = this.f13884O;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public boolean ty() {
        return (this.nY & 1) == 1;
    }

    CharSequence xMQ(MenuView.ItemView itemView) {
        return (itemView == null || !itemView.O()) ? getTitle() : getTitleCondensed();
    }

    MenuItemImpl(MenuBuilder menuBuilder, int i2, int i3, int i5, int i7, CharSequence charSequence, int i8) {
        this.ty = menuBuilder;
        this.f13888n = i3;
        this.rl = i2;
        this.f13891t = i5;
        this.nr = i7;
        this.f13884O = charSequence;
        this.nY = i8;
    }

    String KN() {
        int i2;
        char cUo = Uo();
        if (cUo == 0) {
            return "";
        }
        Resources resources = this.ty.WPU().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.ty.WPU()).hasPermanentMenuKey()) {
            sb.append(resources.getString(R.string.HI));
        }
        if (this.ty.nHg()) {
            i2 = this.gh;
        } else {
            i2 = this.xMQ;
        }
        nr(sb, i2, 65536, resources.getString(R.string.gh));
        nr(sb, i2, 4096, resources.getString(R.string.Uo));
        nr(sb, i2, 2, resources.getString(R.string.J2));
        nr(sb, i2, 1, resources.getString(R.string.qie));
        nr(sb, i2, 4, resources.getString(R.string.ty));
        nr(sb, i2, 8, resources.getString(R.string.mUb));
        if (cUo != '\b') {
            if (cUo != '\n') {
                if (cUo != ' ') {
                    sb.append(cUo);
                } else {
                    sb.append(resources.getString(R.string.az));
                }
            } else {
                sb.append(resources.getString(R.string.xMQ));
            }
        } else {
            sb.append(resources.getString(R.string.KN));
        }
        return sb.toString();
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    /* JADX INFO: renamed from: WPU, reason: merged with bridge method [inline-methods] */
    public SupportMenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean expandActionView() {
        if (!mUb()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.iF;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.ty.az(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z2) {
        if (ViF(z2)) {
            this.ty.v(this);
        }
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.mUb == c2 && this.gh == i2) {
            return this;
        }
        this.mUb = Character.toLowerCase(c2);
        this.gh = KeyEvent.normalizeMetaState(i2);
        this.ty.rV9(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        if (this.KN == c2 && this.xMQ == i2) {
            return this;
        }
        this.KN = c2;
        this.xMQ = KeyEvent.normalizeMetaState(i2);
        this.ty.rV9(false);
        return this;
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c4, int i2, int i3) {
        this.KN = c2;
        this.xMQ = KeyEvent.normalizeMetaState(i2);
        this.mUb = Character.toLowerCase(c4);
        this.gh = KeyEvent.normalizeMetaState(i3);
        this.ty.rV9(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.qie = null;
        this.az = i2;
        this.aYN = true;
        this.ty.rV9(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        return setTitle(this.ty.WPU().getString(i2));
    }
}
