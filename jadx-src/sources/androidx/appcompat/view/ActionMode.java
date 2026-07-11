package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class ActionMode {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Object f13759n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f13760t;

    public interface Callback {
        void n(ActionMode actionMode);

        boolean nr(ActionMode actionMode, Menu menu);

        boolean rl(ActionMode actionMode, Menu menu);

        boolean t(ActionMode actionMode, MenuItem menuItem);
    }

    public abstract void HI(CharSequence charSequence);

    public abstract void Ik(int i2);

    public abstract MenuInflater J2();

    public abstract Menu O();

    public abstract CharSequence Uo();

    public abstract void az(View view);

    public abstract void gh();

    public abstract View nr();

    public boolean qie() {
        return false;
    }

    public abstract void r(CharSequence charSequence);

    public abstract void t();

    public abstract void ty(int i2);

    public abstract CharSequence xMQ();

    public Object KN() {
        return this.f13759n;
    }

    public void ck(Object obj) {
        this.f13759n = obj;
    }

    public boolean mUb() {
        return this.f13760t;
    }

    public void o(boolean z2) {
        this.f13760t = z2;
    }
}
