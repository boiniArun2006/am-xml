package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class ExpandButton extends Preference {
    private long ofS;

    private void EWS() {
        C(R.layout.f40655n);
        xg(R.drawable.f40650n);
        Jk(R.string.rl);
        eWT(999);
    }

    private void hRu(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        CharSequence string = null;
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            CharSequence charSequenceFD = preference.fD();
            boolean z2 = preference instanceof PreferenceGroup;
            if (z2 && !TextUtils.isEmpty(charSequenceFD)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.Z())) {
                if (z2) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequenceFD)) {
                string = string == null ? charSequenceFD : mUb().getString(R.string.f40657O, string, charSequenceFD);
            }
        }
        ul(string);
    }

    @Override // androidx.preference.Preference
    long HI() {
        return this.ofS;
    }

    ExpandButton(Context context, List list, long j2) {
        super(context);
        EWS();
        hRu(list);
        this.ofS = j2 + 1000000;
    }

    @Override // androidx.preference.Preference
    public void U(PreferenceViewHolder preferenceViewHolder) {
        super.U(preferenceViewHolder);
        preferenceViewHolder.KN(false);
    }
}
