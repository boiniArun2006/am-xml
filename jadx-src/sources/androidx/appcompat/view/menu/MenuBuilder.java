package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ActionProvider;
import androidx.core.view.ViewConfigurationCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class MenuBuilder implements SupportMenu {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f13873g = {1, 4, 5, 3, 2, 0};
    Drawable HI;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Callback f13874O;
    private MenuItemImpl aYN;
    private ContextMenu.ContextMenuInfo az;
    View ck;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f13877n;
    private boolean nY;
    private boolean nr;
    private final Resources rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f13880t;
    CharSequence ty;
    private int qie = 0;
    private boolean Ik = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f13879r = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f13878o = false;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private boolean f13876Z = false;
    private boolean XQ = false;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private ArrayList f13875S = new ArrayList();
    private CopyOnWriteArrayList WPU = new CopyOnWriteArrayList();
    private boolean ViF = false;
    private ArrayList J2 = new ArrayList();
    private ArrayList Uo = new ArrayList();
    private boolean KN = true;
    private ArrayList xMQ = new ArrayList();
    private ArrayList mUb = new ArrayList();
    private boolean gh = true;

    @RestrictTo
    public interface Callback {
        boolean n(MenuBuilder menuBuilder, MenuItem menuItem);

        void rl(MenuBuilder menuBuilder);
    }

    @RestrictTo
    public interface ItemInvoker {
        boolean nr(MenuItemImpl menuItemImpl);
    }

    protected MenuBuilder B(int i2) {
        D(0, null, i2, null, null);
        return this;
    }

    protected MenuBuilder GR(View view) {
        D(0, null, 0, null, view);
        return this;
    }

    protected MenuBuilder I(CharSequence charSequence) {
        D(0, charSequence, 0, null, null);
        return this;
    }

    protected MenuBuilder J(Drawable drawable) {
        D(0, null, 0, drawable, null);
        return this;
    }

    protected MenuBuilder a(int i2) {
        D(i2, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return n(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public boolean bzg(MenuItem menuItem, int i2) {
        return Xw(menuItem, null, i2);
    }

    public void clearHeader() {
        this.HI = null;
        this.ty = null;
        this.ck = null;
        rV9(false);
    }

    @Override // android.view.Menu
    public void close() {
        O(true);
    }

    public MenuBuilder e() {
        return this;
    }

    public void k() {
        this.Ik = false;
        if (this.f13879r) {
            this.f13879r = false;
            rV9(this.f13878o);
        }
    }

    public int ty(int i2) {
        return HI(i2, 0);
    }

    void v(MenuItemImpl menuItemImpl) {
        this.KN = true;
        rV9(true);
    }

    void wTp(MenuItemImpl menuItemImpl) {
        this.gh = true;
        rV9(true);
    }

    private MenuItemImpl Uo(int i2, int i3, int i5, int i7, CharSequence charSequence, int i8) {
        return new MenuItemImpl(this, i2, i3, i5, i7, charSequence, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void Y(boolean z2) {
        boolean z3;
        if (z2) {
            z3 = this.rl.getConfiguration().keyboard != 1 && ViewConfigurationCompat.qie(ViewConfiguration.get(this.f13877n), this.f13877n);
        }
        this.nr = z3;
    }

    private static int fD(int i2) {
        int i3 = ((-65536) & i2) >> 16;
        if (i3 >= 0) {
            int[] iArr = f13873g;
            if (i3 < iArr.length) {
                return (i2 & 65535) | (iArr[i3] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void gh(Bundle bundle) {
        Parcelable parcelableUo;
        if (this.WPU.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference weakReference : this.WPU) {
            MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
            if (menuPresenter == null) {
                this.WPU.remove(weakReference);
            } else {
                int id = menuPresenter.getId();
                if (id > 0 && (parcelableUo = menuPresenter.Uo()) != null) {
                    sparseArray.put(id, parcelableUo);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    private void jB(int i2, boolean z2) {
        if (i2 < 0 || i2 >= this.J2.size()) {
            return;
        }
        this.J2.remove(i2);
        if (z2) {
            rV9(true);
        }
    }

    private void mUb(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.WPU.isEmpty()) {
            return;
        }
        for (WeakReference weakReference : this.WPU) {
            MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
            if (menuPresenter == null) {
                this.WPU.remove(weakReference);
            } else {
                int id = menuPresenter.getId();
                if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    menuPresenter.O(parcelable);
                }
            }
        }
    }

    private boolean qie(SubMenuBuilder subMenuBuilder, MenuPresenter menuPresenter) {
        if (this.WPU.isEmpty()) {
            return false;
        }
        boolean zJ2 = menuPresenter != null ? menuPresenter.J2(subMenuBuilder) : false;
        for (WeakReference weakReference : this.WPU) {
            MenuPresenter menuPresenter2 = (MenuPresenter) weakReference.get();
            if (menuPresenter2 == null) {
                this.WPU.remove(weakReference);
            } else if (!zJ2) {
                zJ2 = menuPresenter2.J2(subMenuBuilder);
            }
        }
        return zJ2;
    }

    private void xMQ(boolean z2) {
        if (this.WPU.isEmpty()) {
            return;
        }
        dR0();
        for (WeakReference weakReference : this.WPU) {
            MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
            if (menuPresenter == null) {
                this.WPU.remove(weakReference);
            } else {
                menuPresenter.KN(z2);
            }
        }
        k();
    }

    public void E(Callback callback) {
        this.f13874O = callback;
    }

    Resources E2() {
        return this.rl;
    }

    public boolean J2(MenuItemImpl menuItemImpl) {
        boolean zMUb = false;
        if (!this.WPU.isEmpty() && this.aYN == menuItemImpl) {
            dR0();
            for (WeakReference weakReference : this.WPU) {
                MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
                if (menuPresenter != null) {
                    zMUb = menuPresenter.mUb(this, menuItemImpl);
                    if (zMUb) {
                        break;
                    }
                } else {
                    this.WPU.remove(weakReference);
                }
            }
            k();
            if (zMUb) {
                this.aYN = null;
            }
        }
        return zMUb;
    }

    boolean KN(MenuBuilder menuBuilder, MenuItem menuItem) {
        Callback callback = this.f13874O;
        return callback != null && callback.n(menuBuilder, menuItem);
    }

    public MenuBuilder M(int i2) {
        this.qie = i2;
        return this;
    }

    public boolean N() {
        return this.ViF;
    }

    public void Nxk(boolean z2) {
        this.nY = z2;
    }

    public final void O(boolean z2) {
        if (this.XQ) {
            return;
        }
        this.XQ = true;
        for (WeakReference weakReference : this.WPU) {
            MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
            if (menuPresenter == null) {
                this.WPU.remove(weakReference);
            } else {
                menuPresenter.rl(this, z2);
            }
        }
        this.XQ = false;
    }

    public void P5(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(S());
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).P5(bundle);
            }
        }
        int i3 = bundle.getInt("android:menu:expandedactionview");
        if (i3 <= 0 || (menuItemFindItem = findItem(i3)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    protected String S() {
        return "android:menu:actionviewstates";
    }

    public boolean T() {
        return !this.Ik;
    }

    public void U(MenuPresenter menuPresenter) {
        for (WeakReference weakReference : this.WPU) {
            MenuPresenter menuPresenter2 = (MenuPresenter) weakReference.get();
            if (menuPresenter2 == null || menuPresenter2 == menuPresenter) {
                this.WPU.remove(weakReference);
            }
        }
    }

    public Drawable ViF() {
        return this.HI;
    }

    public Context WPU() {
        return this.f13877n;
    }

    public ArrayList X() {
        if (!this.KN) {
            return this.Uo;
        }
        this.Uo.clear();
        int size = this.J2.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.J2.get(i2);
            if (menuItemImpl.isVisible()) {
                this.Uo.add(menuItemImpl);
            }
        }
        this.KN = false;
        this.gh = true;
        return this.Uo;
    }

    public boolean Xw(MenuItem menuItem, MenuPresenter menuPresenter, int i2) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) menuItem;
        if (menuItemImpl == null || !menuItemImpl.isEnabled()) {
            return false;
        }
        boolean zGh = menuItemImpl.gh();
        ActionProvider actionProviderN = menuItemImpl.n();
        boolean z2 = actionProviderN != null && actionProviderN.n();
        if (menuItemImpl.mUb()) {
            boolean zExpandActionView = menuItemImpl.expandActionView() | zGh;
            if (zExpandActionView) {
                O(true);
            }
            return zExpandActionView;
        }
        if (!menuItemImpl.hasSubMenu() && !z2) {
            if ((i2 & 1) == 0) {
                O(true);
            }
            return zGh;
        }
        if ((i2 & 4) == 0) {
            O(false);
        }
        if (!menuItemImpl.hasSubMenu()) {
            menuItemImpl.aYN(new SubMenuBuilder(WPU(), this, menuItemImpl));
        }
        SubMenuBuilder subMenuBuilder = (SubMenuBuilder) menuItemImpl.getSubMenu();
        if (z2) {
            actionProviderN.J2(subMenuBuilder);
        }
        boolean zQie = qie(subMenuBuilder, menuPresenter) | zGh;
        if (!zQie) {
            O(true);
        }
        return zQie;
    }

    public MenuItemImpl aYN() {
        return this.aYN;
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
        return n(0, 0, 0, this.rl.getString(i2));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i2, int i3, int i5, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        int i8;
        PackageManager packageManager = this.f13877n.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i7 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i9 = 0; i9 < size; i9++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i9);
            int i10 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i10 < 0 ? intent : intentArr[i10]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i2, i3, i5, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i8 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i8] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.rl.getString(i2));
    }

    public boolean az(MenuItemImpl menuItemImpl) {
        boolean zT2 = false;
        if (this.WPU.isEmpty()) {
            return false;
        }
        dR0();
        for (WeakReference weakReference : this.WPU) {
            MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
            if (menuPresenter != null) {
                zT2 = menuPresenter.t(this, menuItemImpl);
                if (zT2) {
                    break;
                }
            } else {
                this.WPU.remove(weakReference);
            }
        }
        k();
        if (zT2) {
            this.aYN = menuItemImpl;
        }
        return zT2;
    }

    @Override // android.view.Menu
    public void clear() {
        MenuItemImpl menuItemImpl = this.aYN;
        if (menuItemImpl != null) {
            J2(menuItemImpl);
        }
        this.J2.clear();
        rV9(true);
    }

    public void dR0() {
        if (this.Ik) {
            return;
        }
        this.Ik = true;
        this.f13879r = false;
        this.f13878o = false;
    }

    public View g() {
        return this.ck;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i2) {
        return (MenuItem) this.J2.get(i2);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.nY) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((MenuItemImpl) this.J2.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    boolean iF() {
        return this.f13876Z;
    }

    boolean nHg() {
        return this.f13880t;
    }

    public CharSequence nY() {
        return this.ty;
    }

    public void nr() {
        Callback callback = this.f13874O;
        if (callback != null) {
            callback.rl(this);
        }
    }

    MenuItemImpl r(int i2, KeyEvent keyEvent) {
        ArrayList arrayList = this.f13875S;
        arrayList.clear();
        o(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (MenuItemImpl) arrayList.get(0);
        }
        boolean zNHg = nHg();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i3);
            char alphabeticShortcut = zNHg ? menuItemImpl.getAlphabeticShortcut() : menuItemImpl.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zNHg && alphabeticShortcut == '\b' && i2 == 67))) {
                return menuItemImpl;
            }
        }
        return null;
    }

    public void rV9(boolean z2) {
        if (this.Ik) {
            this.f13879r = true;
            if (z2) {
                this.f13878o = true;
                return;
            }
            return;
        }
        if (z2) {
            this.KN = true;
            this.gh = true;
        }
        xMQ(z2);
    }

    public void rl(MenuPresenter menuPresenter) {
        t(menuPresenter, this.f13877n);
    }

    public boolean s7N() {
        return this.nr;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i2, boolean z2, boolean z3) {
        int size = this.J2.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.J2.get(i3);
            if (menuItemImpl.getGroupId() == i2) {
                menuItemImpl.Z(z3);
                menuItemImpl.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.ViF = z2;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i2, boolean z2) {
        int size = this.J2.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.J2.get(i3);
            if (menuItemImpl.getGroupId() == i2) {
                menuItemImpl.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i2, boolean z2) {
        int size = this.J2.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.J2.get(i3);
            if (menuItemImpl.getGroupId() == i2 && menuItemImpl.ViF(z2)) {
                z3 = true;
            }
        }
        if (z3) {
            rV9(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f13880t = z2;
        rV9(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.J2.size();
    }

    public void t(MenuPresenter menuPresenter, Context context) {
        this.WPU.add(new WeakReference(menuPresenter));
        menuPresenter.gh(context, this);
        this.gh = true;
    }

    public MenuBuilder(Context context) {
        this.f13877n = context;
        this.rl = context.getResources();
        Y(true);
    }

    private void D(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources resourcesE2 = E2();
        if (view != null) {
            this.ck = view;
            this.ty = null;
            this.HI = null;
        } else {
            if (i2 > 0) {
                this.ty = resourcesE2.getText(i2);
            } else if (charSequence != null) {
                this.ty = charSequence;
            }
            if (i3 > 0) {
                this.HI = ContextCompat.getDrawable(WPU(), i3);
            } else if (drawable != null) {
                this.HI = drawable;
            }
            this.ck = null;
        }
        rV9(false);
    }

    private static int ck(ArrayList arrayList, int i2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((MenuItemImpl) arrayList.get(size)).J2() <= i2) {
                return size + 1;
            }
        }
        return 0;
    }

    void FX(MenuItem menuItem) {
        boolean z2;
        int groupId = menuItem.getGroupId();
        int size = this.J2.size();
        dR0();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.J2.get(i2);
            if (menuItemImpl.getGroupId() == groupId && menuItemImpl.az() && menuItemImpl.isCheckable()) {
                if (menuItemImpl == menuItem) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                menuItemImpl.o(z2);
            }
        }
        k();
    }

    public int HI(int i2, int i3) {
        int size = size();
        if (i3 < 0) {
            i3 = 0;
        }
        while (i3 < size) {
            if (((MenuItemImpl) this.J2.get(i3)).getGroupId() == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public int Ik(int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((MenuItemImpl) this.J2.get(i3)).getItemId() == i2) {
                return i3;
            }
        }
        return -1;
    }

    public void M7(Bundle bundle) {
        mUb(bundle);
    }

    public ArrayList XQ() {
        Z();
        return this.xMQ;
    }

    public void Z() {
        ArrayList arrayListX = X();
        if (!this.gh) {
            return;
        }
        boolean zXMQ = false;
        for (WeakReference weakReference : this.WPU) {
            MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
            if (menuPresenter == null) {
                this.WPU.remove(weakReference);
            } else {
                zXMQ |= menuPresenter.xMQ();
            }
        }
        if (zXMQ) {
            this.xMQ.clear();
            this.mUb.clear();
            int size = arrayListX.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItemImpl menuItemImpl = (MenuItemImpl) arrayListX.get(i2);
                if (menuItemImpl.qie()) {
                    this.xMQ.add(menuItemImpl);
                } else {
                    this.mUb.add(menuItemImpl);
                }
            }
        } else {
            this.xMQ.clear();
            this.mUb.clear();
            this.mUb.addAll(X());
        }
        this.gh = false;
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i5, CharSequence charSequence) {
        return n(i2, i3, i5, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i5, CharSequence charSequence) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) n(i2, i3, i5, charSequence);
        SubMenuBuilder subMenuBuilder = new SubMenuBuilder(this.f13877n, this, menuItemImpl);
        menuItemImpl.aYN(subMenuBuilder);
        return subMenuBuilder;
    }

    public void eF(Bundle bundle) {
        gh(bundle);
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i2) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.J2.get(i3);
            if (menuItemImpl.getItemId() == i2) {
                return menuItemImpl;
            }
            if (menuItemImpl.hasSubMenu() && (menuItemFindItem = menuItemImpl.getSubMenu().findItem(i2)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        if (r(i2, keyEvent) != null) {
            return true;
        }
        return false;
    }

    protected MenuItem n(int i2, int i3, int i5, CharSequence charSequence) {
        int iFD = fD(i5);
        MenuItemImpl menuItemImplUo = Uo(i2, i3, i5, iFD, charSequence, this.qie);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.az;
        if (contextMenuInfo != null) {
            menuItemImplUo.S(contextMenuInfo);
        }
        ArrayList arrayList = this.J2;
        arrayList.add(ck(arrayList, iFD), menuItemImplUo);
        rV9(true);
        return menuItemImplUo;
    }

    void o(List list, int i2, KeyEvent keyEvent) {
        char numericShortcut;
        int numericModifiers;
        boolean zNHg = nHg();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.J2.size();
            for (int i3 = 0; i3 < size; i3++) {
                MenuItemImpl menuItemImpl = (MenuItemImpl) this.J2.get(i3);
                if (menuItemImpl.hasSubMenu()) {
                    ((MenuBuilder) menuItemImpl.getSubMenu()).o(list, i2, keyEvent);
                }
                if (zNHg) {
                    numericShortcut = menuItemImpl.getAlphabeticShortcut();
                } else {
                    numericShortcut = menuItemImpl.getNumericShortcut();
                }
                if (zNHg) {
                    numericModifiers = menuItemImpl.getAlphabeticModifiers();
                } else {
                    numericModifiers = menuItemImpl.getNumericModifiers();
                }
                if ((modifiers & 69647) == (numericModifiers & 69647) && numericShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((numericShortcut == cArr[0] || numericShortcut == cArr[2] || (zNHg && numericShortcut == '\b' && i2 == 67)) && menuItemImpl.isEnabled()) {
                        list.add(menuItemImpl);
                    }
                }
            }
        }
    }

    public void p5(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).p5(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(S(), sparseArray);
        }
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i2, int i3) {
        return bzg(findItem(i2), i3);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        boolean zBzg;
        MenuItemImpl menuItemImplR = r(i2, keyEvent);
        if (menuItemImplR != null) {
            zBzg = bzg(menuItemImplR, i3);
        } else {
            zBzg = false;
        }
        if ((i3 & 2) != 0) {
            O(true);
        }
        return zBzg;
    }

    @Override // android.view.Menu
    public void removeGroup(int i2) {
        int iTy = ty(i2);
        if (iTy >= 0) {
            int size = this.J2.size() - iTy;
            int i3 = 0;
            while (true) {
                int i5 = i3 + 1;
                if (i3 >= size || ((MenuItemImpl) this.J2.get(iTy)).getGroupId() != i2) {
                    break;
                }
                jB(iTy, false);
                i3 = i5;
            }
            rV9(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i2) {
        jB(Ik(i2), true);
    }

    public ArrayList te() {
        Z();
        return this.mUb;
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i5, int i7) {
        return n(i2, i3, i5, this.rl.getString(i7));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i5, int i7) {
        return addSubMenu(i2, i3, i5, this.rl.getString(i7));
    }
}
