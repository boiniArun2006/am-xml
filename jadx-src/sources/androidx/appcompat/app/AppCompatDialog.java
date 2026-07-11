package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R;
import androidx.appcompat.view.ActionMode;
import androidx.core.view.KeyEventDispatcher;
import androidx.view.ComponentDialog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class AppCompatDialog extends ComponentDialog implements AppCompatCallback {
    private AppCompatDelegate J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final KeyEventDispatcher.Component f13665r;

    @Override // androidx.appcompat.app.AppCompatCallback
    public void onSupportActionModeFinished(ActionMode actionMode) {
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public void onSupportActionModeStarted(ActionMode actionMode) {
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public ActionMode onWindowStartingSupportActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // androidx.view.ComponentDialog, android.app.Dialog
    public void setContentView(int i2) {
        t();
        O().T(i2);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        O().rV9(charSequence);
    }

    private static int J2(Context context, int i2) {
        if (i2 != 0) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.M7, typedValue, true);
        return typedValue.resourceId;
    }

    public AppCompatDelegate O() {
        if (this.J2 == null) {
            this.J2 = AppCompatDelegate.xMQ(this, this);
        }
        return this.J2;
    }

    public AppCompatDialog(Context context, int i2) {
        super(context, J2(context, i2));
        this.f13665r = new KeyEventDispatcher.Component() { // from class: androidx.appcompat.app.C
            @Override // androidx.core.view.KeyEventDispatcher.Component
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f13672n.Uo(keyEvent);
            }
        };
        AppCompatDelegate appCompatDelegateO = O();
        appCompatDelegateO.v(J2(context, i2));
        appCompatDelegateO.aYN(null);
    }

    public boolean KN(int i2) {
        return O().X(i2);
    }

    boolean Uo(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.view.ComponentDialog, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        t();
        O().O(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        O().ViF();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return KeyEventDispatcher.O(this.f13665r, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public View findViewById(int i2) {
        return O().mUb(i2);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        O().XQ();
    }

    @Override // androidx.view.ComponentDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        O().Z();
        super.onCreate(bundle);
        O().aYN(bundle);
    }

    @Override // androidx.view.ComponentDialog, android.app.Dialog
    protected void onStop() {
        super.onStop();
        O().fD();
    }

    @Override // androidx.view.ComponentDialog, android.app.Dialog
    public void setContentView(View view) {
        t();
        O().N(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i2) {
        super.setTitle(i2);
        O().rV9(getContext().getString(i2));
    }

    @Override // androidx.view.ComponentDialog, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        t();
        O().nHg(view, layoutParams);
    }
}
