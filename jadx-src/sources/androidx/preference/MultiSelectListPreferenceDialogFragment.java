package androidx.preference;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import qcD.nehv.Apsps;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Deprecated
public class MultiSelectListPreferenceDialogFragment extends PreferenceDialogFragment {
    boolean E2;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    CharSequence[] f40534X;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    CharSequence[] f40535e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Set f40536g = new HashSet();

    public static MultiSelectListPreferenceDialogFragment xMQ(String str) {
        MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment = new MultiSelectListPreferenceDialogFragment();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        multiSelectListPreferenceDialogFragment.setArguments(bundle);
        return multiSelectListPreferenceDialogFragment;
    }

    private MultiSelectListPreference KN() {
        return (MultiSelectListPreference) n();
    }

    @Override // androidx.preference.PreferenceDialogFragment
    protected void J2(AlertDialog.Builder builder) {
        super.J2(builder);
        int length = this.f40534X.length;
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zArr[i2] = this.f40536g.contains(this.f40534X[i2].toString());
        }
        builder.setMultiChoiceItems(this.f40535e, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: androidx.preference.MultiSelectListPreferenceDialogFragment.1
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public void onClick(DialogInterface dialogInterface, int i3, boolean z2) {
                if (z2) {
                    MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment = MultiSelectListPreferenceDialogFragment.this;
                    multiSelectListPreferenceDialogFragment.E2 = multiSelectListPreferenceDialogFragment.f40536g.add(multiSelectListPreferenceDialogFragment.f40534X[i3].toString()) | multiSelectListPreferenceDialogFragment.E2;
                } else {
                    MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment2 = MultiSelectListPreferenceDialogFragment.this;
                    multiSelectListPreferenceDialogFragment2.E2 = multiSelectListPreferenceDialogFragment2.f40536g.remove(multiSelectListPreferenceDialogFragment2.f40534X[i3].toString()) | multiSelectListPreferenceDialogFragment2.E2;
                }
            }
        });
    }

    @Override // androidx.preference.PreferenceDialogFragment
    public void O(boolean z2) {
        MultiSelectListPreference multiSelectListPreferenceKN = KN();
        if (z2 && this.E2) {
            Set set = this.f40536g;
            if (multiSelectListPreferenceKN.rl(set)) {
                multiSelectListPreferenceKN.kSg(set);
            }
        }
        this.E2 = false;
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            MultiSelectListPreference multiSelectListPreferenceKN = KN();
            if (multiSelectListPreferenceKN.tUK() != null && multiSelectListPreferenceKN.ER() != null) {
                this.f40536g.clear();
                this.f40536g.addAll(multiSelectListPreferenceKN.lLA());
                this.E2 = false;
                this.f40535e = multiSelectListPreferenceKN.tUK();
                this.f40534X = multiSelectListPreferenceKN.ER();
                return;
            }
            throw new IllegalStateException(Apsps.bsLmt);
        }
        this.f40536g.clear();
        this.f40536g.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragment.values"));
        this.E2 = bundle.getBoolean("MultiSelectListPreferenceDialogFragment.changed", false);
        this.f40535e = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries");
        this.f40534X = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues");
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragment.values", new ArrayList<>(this.f40536g));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragment.changed", this.E2);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries", this.f40535e);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues", this.f40534X);
    }
}
