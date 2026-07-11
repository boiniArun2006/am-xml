package androidx.preference;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.preference.DialogPreference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Deprecated
public abstract class PreferenceDialogFragment extends DialogFragment implements DialogInterface.OnClickListener {
    private CharSequence J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private CharSequence f40571O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f40572S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private BitmapDrawable f40573Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private DialogPreference f40574n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f40575o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f40576r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CharSequence f40577t;

    protected void J2(AlertDialog.Builder builder) {
    }

    public abstract void O(boolean z2);

    protected boolean rl() {
        return false;
    }

    @RequiresApi
    private static class Api30Impl {
        @DoNotInline
        static void n(@NonNull Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }

    public DialogPreference n() {
        if (this.f40574n == null) {
            this.f40574n = (DialogPreference) ((DialogPreference.TargetFragment) getTargetFragment()).KN(getArguments().getString("key"));
        }
        return this.f40574n;
    }

    protected View nr(Context context) {
        int i2 = this.f40575o;
        if (i2 == 0) {
            return null;
        }
        return LayoutInflater.from(context).inflate(i2, (ViewGroup) null);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        this.f40572S = i2;
    }

    private void Uo(Dialog dialog) {
        Window window = dialog.getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.n(window);
        } else {
            window.setSoftInputMode(5);
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentCallbacks2 targetFragment = getTargetFragment();
        if (targetFragment instanceof DialogPreference.TargetFragment) {
            DialogPreference.TargetFragment targetFragment2 = (DialogPreference.TargetFragment) targetFragment;
            String string = getArguments().getString("key");
            if (bundle == null) {
                DialogPreference dialogPreference = (DialogPreference) targetFragment2.KN(string);
                this.f40574n = dialogPreference;
                this.f40577t = dialogPreference.i();
                this.f40571O = this.f40574n.How();
                this.J2 = this.f40574n.K();
                this.f40576r = this.f40574n.UhV();
                this.f40575o = this.f40574n.hRu();
                Drawable drawableEWS = this.f40574n.EWS();
                if (drawableEWS != null && !(drawableEWS instanceof BitmapDrawable)) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableEWS.getIntrinsicWidth(), drawableEWS.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    drawableEWS.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawableEWS.draw(canvas);
                    this.f40573Z = new BitmapDrawable(getResources(), bitmapCreateBitmap);
                    return;
                }
                this.f40573Z = (BitmapDrawable) drawableEWS;
                return;
            }
            this.f40577t = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f40571O = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.J2 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f40576r = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f40575o = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f40573Z = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Activity activity = getActivity();
        this.f40572S = -2;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(activity).setTitle(this.f40577t).setIcon(this.f40573Z).setPositiveButton(this.f40571O, this).setNegativeButton(this.J2, this);
        View viewNr = nr(activity);
        if (viewNr != null) {
            t(viewNr);
            negativeButton.setView(viewNr);
        } else {
            negativeButton.setMessage(this.f40576r);
        }
        J2(negativeButton);
        AlertDialog alertDialogCreate = negativeButton.create();
        if (rl()) {
            Uo(alertDialogCreate);
        }
        return alertDialogCreate;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        boolean z2;
        super.onDismiss(dialogInterface);
        if (this.f40572S == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        O(z2);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f40577t);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f40571O);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.J2);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f40576r);
        bundle.putInt("PreferenceDialogFragment.layout", this.f40575o);
        BitmapDrawable bitmapDrawable = this.f40573Z;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    protected void t(View view) {
        int i2;
        View viewFindViewById = view.findViewById(android.R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f40576r;
            if (!TextUtils.isEmpty(charSequence)) {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i2 = 0;
            } else {
                i2 = 8;
            }
            if (viewFindViewById.getVisibility() != i2) {
                viewFindViewById.setVisibility(i2);
            }
        }
    }
}
