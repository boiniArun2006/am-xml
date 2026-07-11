package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzkz implements zzhm {
    static final zzhm zza = new zzkz();

    private zzkz() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzhm
    public final boolean zza(int i2) {
        if (i2 == 17 || i2 == 18) {
            return true;
        }
        switch (i2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return true;
            default:
                return false;
        }
    }
}
