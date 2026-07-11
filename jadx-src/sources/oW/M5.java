package oW;

import com.google.android.gms.internal.p002firebaseauthapi.zzahx;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class M5 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f71471n;
    private final com.google.firebase.auth.n nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f71472t;

    public M5(zzahx zzahxVar) {
        int i2 = 5;
        this.rl = zzahxVar.zzg() ? zzahxVar.zzc() : zzahxVar.zzb();
        this.f71472t = zzahxVar.zzb();
        com.google.firebase.auth.n o7qVar = null;
        if (!zzahxVar.zzh()) {
            this.f71471n = 3;
            this.nr = null;
            return;
        }
        String strZzd = zzahxVar.zzd();
        strZzd.getClass();
        switch (strZzd) {
            case "REVERT_SECOND_FACTOR_ADDITION":
                i2 = 6;
                break;
            case "PASSWORD_RESET":
                i2 = 0;
                break;
            case "VERIFY_EMAIL":
                i2 = 1;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                break;
            case "EMAIL_SIGNIN":
                i2 = 4;
                break;
            case "RECOVER_EMAIL":
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        this.f71471n = i2;
        if (i2 == 4 || i2 == 3) {
            this.nr = null;
            return;
        }
        if (zzahxVar.zzf()) {
            o7qVar = new YzO(zzahxVar.zzb(), afx.n(zzahxVar.zza()));
        } else if (zzahxVar.zzg()) {
            o7qVar = new xZD(zzahxVar.zzc(), zzahxVar.zzb());
        } else if (zzahxVar.zze()) {
            o7qVar = new o7q(zzahxVar.zzb());
        }
        this.nr = o7qVar;
    }

    public final int n() {
        return this.f71471n;
    }
}
