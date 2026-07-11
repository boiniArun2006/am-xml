package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzavc implements Comparator {
    private final boolean zza;

    public zzavc(boolean z2) {
        this.zza = z2;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparator comparatorZza;
        Object objZzn;
        Object objZzn2;
        int[] iArr = {446703183, 1862618146, 1081639777, -1087935358, -803036955, 1104011716, 5522510, 2017461929, 496612959};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i5 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        int i11 = iArr[7];
        int i12 = i10 + ((((i3 & (~i2)) | i5) + ((i2 & i7) | i8)) - i9);
        int i13 = i11 % 496612959;
        zzavg zzavgVar = (zzavg) obj;
        zzavg zzavgVar2 = (zzavg) obj2;
        int i14 = zzavgVar.zza;
        if (i14 != zzavgVar2.zza) {
            throw new IllegalArgumentException();
        }
        int i15 = i13 ^ i12;
        try {
            if (i14 == 0) {
                throw null;
            }
            switch (i14 + i15) {
                case 0:
                    return 0;
                case 1:
                    if (this.zza) {
                        return zzavgVar.zzl() != zzavgVar2.zzl() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 2:
                    return Long.compare(zzavgVar.zzm(), zzavgVar2.zzm());
                case 3:
                    comparatorZza = zzauk.zzc;
                    objZzn = zzavgVar.zzn();
                    objZzn2 = zzavgVar2.zzn();
                    break;
                case 4:
                    objZzn = zzavgVar.zzo();
                    objZzn2 = zzavgVar2.zzo();
                    comparatorZza = zzgtp.zza(this);
                    break;
                case 5:
                    if (this.zza) {
                        return zzavgVar.zzp() != zzavgVar2.zzp() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 6:
                    return Double.compare(zzavgVar.zzq(), zzavgVar2.zzq());
                default:
                    return 0;
            }
            return comparatorZza.compare(objZzn, objZzn2);
        } catch (zzavd e2) {
            throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e2);
        }
    }
}
