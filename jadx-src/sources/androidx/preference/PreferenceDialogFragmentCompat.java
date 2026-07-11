package androidx.preference;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import androidx.preference.DialogPreference;
import androidx.view.result.ActivityResultCaller;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class PreferenceDialogFragmentCompat extends DialogFragment implements DialogInterface.OnClickListener {
    private CharSequence J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private CharSequence f40578O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f40579S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private BitmapDrawable f40580Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private DialogPreference f40581n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f40582o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f40583r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CharSequence f40584t;

    protected void e() {
    }

    protected void fD(AlertDialog.Builder builder) {
    }

    public abstract void iF(boolean z2);

    protected boolean nY() {
        return false;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        this.f40579S = -2;
        AlertDialog.Builder builderMUb = new AlertDialog.Builder(requireContext()).setTitle(this.f40584t).O(this.f40580Z).ck(this.f40578O, this).mUb(this.J2, this);
        View viewTe = te(requireContext());
        if (viewTe != null) {
            g(viewTe);
            builderMUb.setView(viewTe);
        } else {
            builderMUb.KN(this.f40583r);
        }
        fD(builderMUb);
        AlertDialog alertDialogCreate = builderMUb.create();
        if (nY()) {
            E2(alertDialogCreate);
        }
        return alertDialogCreate;
    }

    @RequiresApi
    private static class Api30Impl {
        @DoNotInline
        static void n(@NonNull Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }

    public DialogPreference ViF() {
        if (this.f40581n == null) {
            this.f40581n = (DialogPreference) ((DialogPreference.TargetFragment) getTargetFragment()).KN(requireArguments().getString("key"));
        }
        return this.f40581n;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        this.f40579S = i2;
    }

    protected View te(Context context) {
        int i2 = this.f40582o;
        if (i2 == 0) {
            return null;
        }
        return getLayoutInflater().inflate(i2, (ViewGroup) null);
    }

    private void E2(Dialog dialog) {
        Window window = dialog.getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.n(window);
        } else {
            e();
        }
    }

    protected void g(View view) {
        int i2;
        View viewFindViewById = view.findViewById(android.R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f40583r;
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

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityResultCaller targetFragment = getTargetFragment();
        if (targetFragment instanceof DialogPreference.TargetFragment) {
            DialogPreference.TargetFragment targetFragment2 = (DialogPreference.TargetFragment) targetFragment;
            String string = requireArguments().getString("key");
            if (bundle == null) {
                DialogPreference dialogPreference = (DialogPreference) targetFragment2.KN(string);
                this.f40581n = dialogPreference;
                this.f40584t = dialogPreference.i();
                this.f40578O = this.f40581n.How();
                this.J2 = this.f40581n.K();
                this.f40583r = this.f40581n.UhV();
                this.f40582o = this.f40581n.hRu();
                Drawable drawableEWS = this.f40581n.EWS();
                if (drawableEWS != null && !(drawableEWS instanceof BitmapDrawable)) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableEWS.getIntrinsicWidth(), drawableEWS.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    drawableEWS.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawableEWS.draw(canvas);
                    this.f40580Z = new BitmapDrawable(getResources(), bitmapCreateBitmap);
                    return;
                }
                this.f40580Z = (BitmapDrawable) drawableEWS;
                return;
            }
            this.f40584t = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f40578O = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.J2 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f40583r = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f40582o = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f40580Z = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        boolean z2;
        super.onDismiss(dialogInterface);
        if (this.f40579S == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        iF(z2);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f40584t);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f40578O);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.J2);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f40583r);
        bundle.putInt("PreferenceDialogFragment.layout", this.f40582o);
        BitmapDrawable bitmapDrawable = this.f40580Z;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }
}
