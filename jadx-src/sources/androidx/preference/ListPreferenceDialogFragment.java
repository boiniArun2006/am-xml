package androidx.preference;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Deprecated
public class ListPreferenceDialogFragment extends PreferenceDialogFragment {
    private CharSequence[] E2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence[] f40527e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f40528g;

    public static ListPreferenceDialogFragment xMQ(String str) {
        ListPreferenceDialogFragment listPreferenceDialogFragment = new ListPreferenceDialogFragment();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        listPreferenceDialogFragment.setArguments(bundle);
        return listPreferenceDialogFragment;
    }

    private ListPreference KN() {
        return (ListPreference) n();
    }

    @Override // androidx.preference.PreferenceDialogFragment
    protected void J2(AlertDialog.Builder builder) {
        super.J2(builder);
        builder.setSingleChoiceItems(this.E2, this.f40528g, new DialogInterface.OnClickListener() { // from class: androidx.preference.ListPreferenceDialogFragment.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                ListPreferenceDialogFragment listPreferenceDialogFragment = ListPreferenceDialogFragment.this;
                listPreferenceDialogFragment.f40528g = i2;
                listPreferenceDialogFragment.onClick(dialogInterface, -1);
                dialogInterface.dismiss();
            }
        });
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    @Override // androidx.preference.PreferenceDialogFragment
    public void O(boolean z2) {
        int i2;
        ListPreference listPreferenceKN = KN();
        if (z2 && (i2 = this.f40528g) >= 0) {
            String string = this.f40527e[i2].toString();
            if (listPreferenceKN.rl(string)) {
                listPreferenceKN.a63(string);
            }
        }
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ListPreference listPreferenceKN = KN();
            if (listPreferenceKN.ER() != null && listPreferenceKN.kSg() != null) {
                this.f40528g = listPreferenceKN.tUK(listPreferenceKN.W());
                this.E2 = listPreferenceKN.ER();
                this.f40527e = listPreferenceKN.kSg();
                return;
            }
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f40528g = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.E2 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.f40527e = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f40528g);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.E2);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f40527e);
    }
}
