package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.R;
import androidx.appcompat.app.AlertController;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class AlertDialog extends AppCompatDialog implements DialogInterface {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final AlertController f13598o;

    public static class Builder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final AlertController.AlertParams f13599n;
        private final int rl;

        public Builder(Context context) {
            this(context, AlertDialog.gh(context, 0));
        }

        public Builder(@NonNull Context context, @StyleRes int i2) {
            this.f13599n = new AlertController.AlertParams(new ContextThemeWrapper(context, AlertDialog.gh(context, i2)));
            this.rl = i2;
        }

        public Builder HI(DialogInterface.OnKeyListener onKeyListener) {
            this.f13599n.XQ = onKeyListener;
            return this;
        }

        public Builder Ik(ListAdapter listAdapter, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f13599n;
            alertParams.WPU = listAdapter;
            alertParams.aYN = onClickListener;
            alertParams.f13571N = i2;
            alertParams.f13574T = true;
            return this;
        }

        public Builder J2(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f13599n;
            alertParams.f13573S = charSequenceArr;
            alertParams.aYN = onClickListener;
            return this;
        }

        public Builder KN(CharSequence charSequence) {
            this.f13599n.KN = charSequence;
            return this;
        }

        public Builder O(Drawable drawable) {
            this.f13599n.nr = drawable;
            return this;
        }

        public Builder Uo(int i2) {
            AlertController.AlertParams alertParams = this.f13599n;
            alertParams.KN = alertParams.f13579n.getText(i2);
            return this;
        }

        public Builder Z(int i2) {
            AlertController.AlertParams alertParams = this.f13599n;
            alertParams.nY = null;
            alertParams.ViF = i2;
            alertParams.E2 = false;
            return this;
        }

        public Builder az(DialogInterface.OnCancelListener onCancelListener) {
            this.f13599n.f13580o = onCancelListener;
            return this;
        }

        public Builder ck(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f13599n;
            alertParams.xMQ = charSequence;
            alertParams.gh = onClickListener;
            return this;
        }

        @NonNull
        public AlertDialog create() {
            AlertDialog alertDialog = new AlertDialog(this.f13599n.f13579n, this.rl);
            this.f13599n.n(alertDialog.f13598o);
            alertDialog.setCancelable(this.f13599n.f13581r);
            if (this.f13599n.f13581r) {
                alertDialog.setCanceledOnTouchOutside(true);
            }
            alertDialog.setOnCancelListener(this.f13599n.f13580o);
            alertDialog.setOnDismissListener(this.f13599n.f13576Z);
            DialogInterface.OnKeyListener onKeyListener = this.f13599n.XQ;
            if (onKeyListener != null) {
                alertDialog.setOnKeyListener(onKeyListener);
            }
            return alertDialog;
        }

        @NonNull
        public Context getContext() {
            return this.f13599n.f13579n;
        }

        public Builder gh(int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f13599n;
            alertParams.HI = alertParams.f13579n.getText(i2);
            this.f13599n.Ik = onClickListener;
            return this;
        }

        public Builder mUb(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f13599n;
            alertParams.qie = charSequence;
            alertParams.ty = onClickListener;
            return this;
        }

        public Builder n(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f13599n;
            alertParams.WPU = listAdapter;
            alertParams.aYN = onClickListener;
            return this;
        }

        public Builder nr(int i2) {
            this.f13599n.f13582t = i2;
            return this;
        }

        public Builder o(int i2) {
            AlertController.AlertParams alertParams = this.f13599n;
            alertParams.J2 = alertParams.f13579n.getText(i2);
            return this;
        }

        public Builder qie(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f13599n;
            alertParams.HI = charSequence;
            alertParams.Ik = onClickListener;
            return this;
        }

        public Builder r(CharSequence[] charSequenceArr, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f13599n;
            alertParams.f13573S = charSequenceArr;
            alertParams.aYN = onClickListener;
            alertParams.f13571N = i2;
            alertParams.f13574T = true;
            return this;
        }

        public Builder rl(boolean z2) {
            this.f13599n.f13581r = z2;
            return this;
        }

        public Builder setNegativeButton(@StringRes int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f13599n;
            alertParams.qie = alertParams.f13579n.getText(i2);
            this.f13599n.ty = onClickListener;
            return this;
        }

        public Builder setPositiveButton(@StringRes int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f13599n;
            alertParams.xMQ = alertParams.f13579n.getText(i2);
            this.f13599n.gh = onClickListener;
            return this;
        }

        public Builder setTitle(@Nullable CharSequence charSequence) {
            this.f13599n.J2 = charSequence;
            return this;
        }

        public Builder setView(View view) {
            AlertController.AlertParams alertParams = this.f13599n;
            alertParams.nY = view;
            alertParams.ViF = 0;
            alertParams.E2 = false;
            return this;
        }

        public Builder t(View view) {
            this.f13599n.Uo = view;
            return this;
        }

        public Builder ty(DialogInterface.OnDismissListener onDismissListener) {
            this.f13599n.f13576Z = onDismissListener;
            return this;
        }

        public Builder xMQ(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.AlertParams alertParams = this.f13599n;
            alertParams.f13573S = charSequenceArr;
            alertParams.nHg = onMultiChoiceClickListener;
            alertParams.f13577e = zArr;
            alertParams.f13575X = true;
            return this;
        }

        public AlertDialog XQ() {
            AlertDialog alertDialogCreate = create();
            alertDialogCreate.show();
            return alertDialogCreate;
        }
    }

    static int gh(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.ck, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView mUb() {
        return this.f13598o.O();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (this.f13598o.KN(i2, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (this.f13598o.xMQ(i2, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    public Button xMQ(int i2) {
        return this.f13598o.t(i2);
    }

    protected AlertDialog(Context context, int i2) {
        super(context, gh(context, i2));
        this.f13598o = new AlertController(getContext(), this, getWindow());
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.view.ComponentDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13598o.J2();
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f13598o.r(charSequence);
    }
}
