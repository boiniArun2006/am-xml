package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RestrictTo
public class StandaloneActionMode extends ActionMode implements MenuBuilder.Callback {
    private ActionBarContextView J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Context f13764O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f13765S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private boolean f13766Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MenuBuilder f13767g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private WeakReference f13768o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ActionMode.Callback f13769r;

    @Override // androidx.appcompat.view.ActionMode
    public void HI(CharSequence charSequence) {
        this.J2.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public void Ik(int i2) {
        r(this.f13764O.getString(i2));
    }

    @Override // androidx.appcompat.view.ActionMode
    public MenuInflater J2() {
        return new SupportMenuInflater(this.J2.getContext());
    }

    @Override // androidx.appcompat.view.ActionMode
    public Menu O() {
        return this.f13767g;
    }

    @Override // androidx.appcompat.view.ActionMode
    public CharSequence Uo() {
        return this.J2.getSubtitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public void az(View view) {
        this.J2.setCustomView(view);
        this.f13768o = view != null ? new WeakReference(view) : null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public void gh() {
        this.f13769r.nr(this, this.f13767g);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public boolean n(MenuBuilder menuBuilder, MenuItem menuItem) {
        return this.f13769r.t(this, menuItem);
    }

    @Override // androidx.appcompat.view.ActionMode
    public View nr() {
        WeakReference weakReference = this.f13768o;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public boolean qie() {
        return this.J2.gh();
    }

    @Override // androidx.appcompat.view.ActionMode
    public void r(CharSequence charSequence) {
        this.J2.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public void t() {
        if (this.f13766Z) {
            return;
        }
        this.f13766Z = true;
        this.f13769r.n(this);
    }

    @Override // androidx.appcompat.view.ActionMode
    public void ty(int i2) {
        HI(this.f13764O.getString(i2));
    }

    @Override // androidx.appcompat.view.ActionMode
    public CharSequence xMQ() {
        return this.J2.getTitle();
    }

    public StandaloneActionMode(Context context, ActionBarContextView actionBarContextView, ActionMode.Callback callback, boolean z2) {
        this.f13764O = context;
        this.J2 = actionBarContextView;
        this.f13769r = callback;
        MenuBuilder menuBuilderM = new MenuBuilder(actionBarContextView.getContext()).M(1);
        this.f13767g = menuBuilderM;
        menuBuilderM.E(this);
        this.f13765S = z2;
    }

    @Override // androidx.appcompat.view.ActionMode
    public void o(boolean z2) {
        super.o(z2);
        this.J2.setTitleOptional(z2);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public void rl(MenuBuilder menuBuilder) {
        gh();
        this.J2.Uo();
    }
}
