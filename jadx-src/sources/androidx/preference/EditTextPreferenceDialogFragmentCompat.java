package androidx.preference;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class EditTextPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    private CharSequence E2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private EditText f40523g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f40522e = new Runnable() { // from class: androidx.preference.EditTextPreferenceDialogFragmentCompat.1
        @Override // java.lang.Runnable
        public void run() {
            EditTextPreferenceDialogFragmentCompat.this.nHg();
        }
    };

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private long f40521X = -1;

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    protected void e() {
        s7N(true);
        nHg();
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    protected boolean nY() {
        return true;
    }

    public static EditTextPreferenceDialogFragmentCompat N(String str) {
        EditTextPreferenceDialogFragmentCompat editTextPreferenceDialogFragmentCompat = new EditTextPreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        editTextPreferenceDialogFragmentCompat.setArguments(bundle);
        return editTextPreferenceDialogFragmentCompat;
    }

    private boolean T() {
        long j2 = this.f40521X;
        return j2 != -1 && j2 + 1000 > SystemClock.currentThreadTimeMillis();
    }

    private void s7N(boolean z2) {
        this.f40521X = z2 ? SystemClock.currentThreadTimeMillis() : -1L;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void iF(boolean z2) {
        if (z2) {
            String string = this.f40523g.getText().toString();
            EditTextPreference editTextPreferenceX = X();
            if (editTextPreferenceX.rl(string)) {
                editTextPreferenceX.lLA(string);
            }
        }
    }

    private EditTextPreference X() {
        return (EditTextPreference) ViF();
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    protected void g(View view) {
        super.g(view);
        EditText editText = (EditText) view.findViewById(android.R.id.edit);
        this.f40523g = editText;
        if (editText != null) {
            editText.requestFocus();
            this.f40523g.setText(this.E2);
            EditText editText2 = this.f40523g;
            editText2.setSelection(editText2.getText().length());
            if (X().tUK() != null) {
                X().tUK().n(this.f40523g);
                return;
            }
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    void nHg() {
        if (T()) {
            EditText editText = this.f40523g;
            if (editText != null && editText.isFocused()) {
                if (((InputMethodManager) this.f40523g.getContext().getSystemService("input_method")).showSoftInput(this.f40523g, 0)) {
                    s7N(false);
                    return;
                } else {
                    this.f40523g.removeCallbacks(this.f40522e);
                    this.f40523g.postDelayed(this.f40522e, 50L);
                    return;
                }
            }
            s7N(false);
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.E2 = X().ER();
        } else {
            this.E2 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.E2);
    }
}
