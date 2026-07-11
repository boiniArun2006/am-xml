package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzajr implements Comparator<zzajp> {
    zzajr() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzajp zzajpVar, zzajp zzajpVar2) {
        zzajp zzajpVar3 = zzajpVar;
        zzajp zzajpVar4 = zzajpVar2;
        zzajv zzajvVar = (zzajv) zzajpVar3.iterator();
        zzajv zzajvVar2 = (zzajv) zzajpVar4.iterator();
        while (zzajvVar.hasNext() && zzajvVar2.hasNext()) {
            int iCompare = Integer.compare(zzajp.zza(zzajvVar.zza()), zzajp.zza(zzajvVar2.zza()));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return Integer.compare(zzajpVar3.zzb(), zzajpVar4.zzb());
    }
}
