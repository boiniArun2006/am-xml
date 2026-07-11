package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@RestrictTo
public abstract class BaseMenuPresenter implements MenuPresenter {
    private int E2;
    protected LayoutInflater J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected MenuBuilder f13806O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f13807S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private int f13808Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected MenuView f13809g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected Context f13810n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private MenuPresenter.Callback f13811o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected LayoutInflater f13812r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected Context f13813t;

    public boolean Z(int i2, MenuItemImpl menuItemImpl) {
        return true;
    }

    public abstract void az(MenuItemImpl menuItemImpl, MenuView.ItemView itemView);

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

    /* JADX WARN: Multi-variable type inference failed */
    public View Ik(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        MenuView.ItemView itemViewTy = view instanceof MenuView.ItemView ? (MenuView.ItemView) view : ty(viewGroup);
        az(menuItemImpl, itemViewTy);
        return (View) itemViewTy;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean J2(SubMenuBuilder subMenuBuilder) {
        MenuPresenter.Callback callback = this.f13811o;
        MenuBuilder menuBuilder = subMenuBuilder;
        if (callback == null) {
            return false;
        }
        if (subMenuBuilder == null) {
            menuBuilder = this.f13806O;
        }
        return callback.t(menuBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void KN(boolean z2) {
        ViewGroup viewGroup = (ViewGroup) this.f13809g;
        if (viewGroup == null) {
            return;
        }
        MenuBuilder menuBuilder = this.f13806O;
        int i2 = 0;
        if (menuBuilder != null) {
            menuBuilder.Z();
            ArrayList arrayListX = this.f13806O.X();
            int size = arrayListX.size();
            int i3 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                MenuItemImpl menuItemImpl = (MenuItemImpl) arrayListX.get(i5);
                if (Z(i3, menuItemImpl)) {
                    View childAt = viewGroup.getChildAt(i3);
                    MenuItemImpl itemData = childAt instanceof MenuView.ItemView ? ((MenuView.ItemView) childAt).getItemData() : null;
                    View viewIk = Ik(menuItemImpl, childAt, viewGroup);
                    if (menuItemImpl != itemData) {
                        viewIk.setPressed(false);
                        viewIk.jumpDrawablesToCurrentState();
                    }
                    if (viewIk != childAt) {
                        qie(viewIk, i3);
                    }
                    i3++;
                }
            }
            i2 = i3;
        }
        while (i2 < viewGroup.getChildCount()) {
            if (!HI(viewGroup, i2)) {
                i2++;
            }
        }
    }

    public MenuPresenter.Callback ck() {
        return this.f13811o;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return this.E2;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void gh(Context context, MenuBuilder menuBuilder) {
        this.f13813t = context;
        this.f13812r = LayoutInflater.from(context);
        this.f13806O = menuBuilder;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void nr(MenuPresenter.Callback callback) {
        this.f13811o = callback;
    }

    public void o(int i2) {
        this.E2 = i2;
    }

    public MenuView r(ViewGroup viewGroup) {
        if (this.f13809g == null) {
            MenuView menuView = (MenuView) this.J2.inflate(this.f13808Z, viewGroup, false);
            this.f13809g = menuView;
            menuView.n(this.f13806O);
            KN(true);
        }
        return this.f13809g;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void rl(MenuBuilder menuBuilder, boolean z2) {
        MenuPresenter.Callback callback = this.f13811o;
        if (callback != null) {
            callback.rl(menuBuilder, z2);
        }
    }

    public MenuView.ItemView ty(ViewGroup viewGroup) {
        return (MenuView.ItemView) this.J2.inflate(this.f13807S, viewGroup, false);
    }

    public BaseMenuPresenter(Context context, int i2, int i3) {
        this.f13810n = context;
        this.J2 = LayoutInflater.from(context);
        this.f13808Z = i2;
        this.f13807S = i3;
    }

    protected boolean HI(ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    protected void qie(View view, int i2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f13809g).addView(view, i2);
    }
}
