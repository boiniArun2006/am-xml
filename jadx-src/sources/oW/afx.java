package oW;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzahq;
import com.google.android.gms.internal.p002firebaseauthapi.zzair;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class afx {
    public static MultiFactorInfo n(zzahq zzahqVar) {
        if (zzahqVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzahqVar.zze())) {
            return new PhoneMultiFactorInfo(zzahqVar.zzd(), zzahqVar.zzc(), zzahqVar.zza(), Preconditions.checkNotEmpty(zzahqVar.zze()));
        }
        if (zzahqVar.zzb() != null) {
            return new TotpMultiFactorInfo(zzahqVar.zzd(), zzahqVar.zzc(), zzahqVar.zza(), (zzair) Preconditions.checkNotNull(zzahqVar.zzb(), "totpInfo cannot be null."));
        }
        return null;
    }

    public static List rl(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MultiFactorInfo multiFactorInfoN = n((zzahq) it.next());
            if (multiFactorInfoN != null) {
                arrayList.add(multiFactorInfoN);
            }
        }
        return arrayList;
    }
}
