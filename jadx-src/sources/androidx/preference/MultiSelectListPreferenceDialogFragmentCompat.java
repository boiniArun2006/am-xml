package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class MultiSelectListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    boolean E2;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    CharSequence[] f40538X;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    CharSequence[] f40539e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Set f40540g = new HashSet();

    public static MultiSelectListPreferenceDialogFragmentCompat T(String str) {
        MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = new MultiSelectListPreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        multiSelectListPreferenceDialogFragmentCompat.setArguments(bundle);
        return multiSelectListPreferenceDialogFragmentCompat;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void iF(boolean z2) {
        if (z2 && this.E2) {
            MultiSelectListPreference multiSelectListPreferenceX = X();
            if (multiSelectListPreferenceX.rl(this.f40540g)) {
                multiSelectListPreferenceX.kSg(this.f40540g);
            }
        }
        this.E2 = false;
    }

    private MultiSelectListPreference X() {
        return (MultiSelectListPreference) ViF();
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    protected void fD(AlertDialog.Builder builder) {
        super.fD(builder);
        int length = this.f40538X.length;
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zArr[i2] = this.f40540g.contains(this.f40538X[i2].toString());
        }
        builder.xMQ(this.f40539e, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: androidx.preference.MultiSelectListPreferenceDialogFragmentCompat.1
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public void onClick(DialogInterface dialogInterface, int i3, boolean z2) {
                if (z2) {
                    MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = MultiSelectListPreferenceDialogFragmentCompat.this;
                    multiSelectListPreferenceDialogFragmentCompat.E2 = multiSelectListPreferenceDialogFragmentCompat.f40540g.add(multiSelectListPreferenceDialogFragmentCompat.f40538X[i3].toString()) | multiSelectListPreferenceDialogFragmentCompat.E2;
                } else {
                    MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat2 = MultiSelectListPreferenceDialogFragmentCompat.this;
                    multiSelectListPreferenceDialogFragmentCompat2.E2 = multiSelectListPreferenceDialogFragmentCompat2.f40540g.remove(multiSelectListPreferenceDialogFragmentCompat2.f40538X[i3].toString()) | multiSelectListPreferenceDialogFragmentCompat2.E2;
                }
            }
        });
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            MultiSelectListPreference multiSelectListPreferenceX = X();
            if (multiSelectListPreferenceX.tUK() != null && multiSelectListPreferenceX.ER() != null) {
                this.f40540g.clear();
                this.f40540g.addAll(multiSelectListPreferenceX.lLA());
                this.E2 = false;
                this.f40539e = multiSelectListPreferenceX.tUK();
                this.f40538X = multiSelectListPreferenceX.ER();
                return;
            }
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.f40540g.clear();
        this.f40540g.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.E2 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.f40539e = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.f40538X = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.f40540g));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.E2);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f40539e);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f40538X);
    }
}
