package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class ListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    private CharSequence[] E2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence[] f40530e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f40531g;

    public static ListPreferenceDialogFragmentCompat T(String str) {
        ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = new ListPreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        listPreferenceDialogFragmentCompat.setArguments(bundle);
        return listPreferenceDialogFragmentCompat;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void iF(boolean z2) {
        int i2;
        if (!z2 || (i2 = this.f40531g) < 0) {
            return;
        }
        String string = this.f40530e[i2].toString();
        ListPreference listPreferenceX = X();
        if (listPreferenceX.rl(string)) {
            listPreferenceX.a63(string);
        }
    }

    private ListPreference X() {
        return (ListPreference) ViF();
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    protected void fD(AlertDialog.Builder builder) {
        super.fD(builder);
        builder.r(this.E2, this.f40531g, new DialogInterface.OnClickListener() { // from class: androidx.preference.ListPreferenceDialogFragmentCompat.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = ListPreferenceDialogFragmentCompat.this;
                listPreferenceDialogFragmentCompat.f40531g = i2;
                listPreferenceDialogFragmentCompat.onClick(dialogInterface, -1);
                dialogInterface.dismiss();
            }
        });
        builder.ck(null, null);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ListPreference listPreferenceX = X();
            if (listPreferenceX.ER() != null && listPreferenceX.kSg() != null) {
                this.f40531g = listPreferenceX.tUK(listPreferenceX.W());
                this.E2 = listPreferenceX.ER();
                this.f40530e = listPreferenceX.kSg();
                return;
            }
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f40531g = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.E2 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.f40530e = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f40531g);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.E2);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f40530e);
    }
}
