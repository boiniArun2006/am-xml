package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzauj implements Comparator {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        return java.lang.Integer.compare(r2, r6.zza.length);
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzauk zzaukVar = (zzauk) obj;
        zzauk zzaukVar2 = (zzauk) obj2;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int length = zzaukVar.zza.length;
            if (i2 >= length || i3 >= zzaukVar2.zza.length) {
                break;
            }
            int iCompare = Integer.compare(zzauk.zzg(zzaukVar.zzb(i2)), zzauk.zzg(zzaukVar2.zzb(i3)));
            if (iCompare != 0) {
                return iCompare;
            }
            i2++;
            i3++;
        }
    }
}
