package androidx.preference;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Deprecated
public class EditTextPreferenceDialogFragment extends PreferenceDialogFragment {
    private CharSequence E2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private EditText f40520g;

    @Override // androidx.preference.PreferenceDialogFragment
    protected boolean rl() {
        return true;
    }

    public static EditTextPreferenceDialogFragment xMQ(String str) {
        EditTextPreferenceDialogFragment editTextPreferenceDialogFragment = new EditTextPreferenceDialogFragment();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        editTextPreferenceDialogFragment.setArguments(bundle);
        return editTextPreferenceDialogFragment;
    }

    @Override // androidx.preference.PreferenceDialogFragment
    public void O(boolean z2) {
        if (z2) {
            String string = this.f40520g.getText().toString();
            if (KN().rl(string)) {
                KN().lLA(string);
            }
        }
    }

    private EditTextPreference KN() {
        return (EditTextPreference) n();
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.E2 = KN().ER();
        } else {
            this.E2 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.E2);
    }

    @Override // androidx.preference.PreferenceDialogFragment
    protected void t(View view) {
        super.t(view);
        EditText editText = (EditText) view.findViewById(android.R.id.edit);
        this.f40520g = editText;
        editText.requestFocus();
        EditText editText2 = this.f40520g;
        if (editText2 != null) {
            editText2.setText(this.E2);
            EditText editText3 = this.f40520g;
            editText3.setSelection(editText3.getText().length());
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }
}
