package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class ActionProvider {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f36714n;
    private SubUiVisibilityListener rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private VisibilityListener f36715t;

    @RestrictTo
    public interface SubUiVisibilityListener {
        void n(boolean z2);
    }

    public interface VisibilityListener {
        void onActionProviderVisibilityChanged(boolean z2);
    }

    public void J2(SubMenu subMenu) {
    }

    public void KN() {
        this.f36715t = null;
        this.rl = null;
    }

    public boolean O() {
        return false;
    }

    public boolean Uo() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public boolean rl() {
        return true;
    }

    public abstract View t();

    public void gh(boolean z2) {
        SubUiVisibilityListener subUiVisibilityListener = this.rl;
        if (subUiVisibilityListener != null) {
            subUiVisibilityListener.n(z2);
        }
    }

    public void mUb(VisibilityListener visibilityListener) {
        if (this.f36715t != null && visibilityListener != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f36715t = visibilityListener;
    }

    public void xMQ(SubUiVisibilityListener subUiVisibilityListener) {
        this.rl = subUiVisibilityListener;
    }

    public ActionProvider(Context context) {
        this.f36714n = context;
    }

    public View nr(MenuItem menuItem) {
        return t();
    }
}
