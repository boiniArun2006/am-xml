package androidx.appcompat.app;

import android.app.Activity;
import android.view.View;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class ActionBarDrawerToggle implements DrawerLayout.DrawerListener {
    private final int J2;
    View.OnClickListener KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    boolean f13542O;
    private final int Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Delegate f13543n;
    private boolean nr;
    private final DrawerLayout rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private DrawerArrowDrawable f13544t;

    /* JADX INFO: renamed from: androidx.appcompat.app.ActionBarDrawerToggle$1, reason: invalid class name */
    class AnonymousClass1 implements View.OnClickListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ActionBarDrawerToggle f13545n;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActionBarDrawerToggle actionBarDrawerToggle = this.f13545n;
            if (actionBarDrawerToggle.f13542O) {
                actionBarDrawerToggle.Uo();
                return;
            }
            View.OnClickListener onClickListener = actionBarDrawerToggle.KN;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public interface Delegate {
        void n(int i2);
    }

    public interface DelegateProvider {
    }

    private static class FrameworkActionBarDelegate implements Delegate {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Activity f13546n;

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void n(int i2) {
            android.app.ActionBar actionBar = this.f13546n.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i2);
            }
        }
    }

    static class ToolbarCompatDelegate implements Delegate {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Toolbar f13547n;
        final CharSequence rl;

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void n(int i2) {
            if (i2 == 0) {
                this.f13547n.setNavigationContentDescription(this.rl);
            } else {
                this.f13547n.setNavigationContentDescription(i2);
            }
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void rl(View view) {
        J2(0.0f);
        if (this.f13542O) {
            O(this.J2);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void t(int i2) {
    }

    private void J2(float f3) {
        if (f3 == 1.0f) {
            this.f13544t.t(true);
        } else if (f3 == 0.0f) {
            this.f13544t.t(false);
        }
        this.f13544t.rl(f3);
    }

    void O(int i2) {
        this.f13543n.n(i2);
    }

    void Uo() {
        int iIk = this.rl.Ik(8388611);
        if (this.rl.e(8388611) && iIk != 2) {
            this.rl.nr(8388611);
        } else if (iIk != 1) {
            this.rl.s7N(8388611);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void n(View view) {
        J2(1.0f);
        if (this.f13542O) {
            O(this.Uo);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void nr(View view, float f3) {
        if (this.nr) {
            J2(Math.min(1.0f, Math.max(0.0f, f3)));
        } else {
            J2(0.0f);
        }
    }
}
