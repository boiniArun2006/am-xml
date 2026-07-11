package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.caoccao.javet.exceptions.JavetError;
import com.safedk.android.analytics.events.RedirectEvent;
import com.safedk.android.analytics.events.a;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzchq implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzchr zze;

    zzchq(zzchr zzchrVar, String str, String str2, String str3, String str4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        Objects.requireNonNull(zzchrVar);
        this.zze = zzchrVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        byte b2;
        HashMap map = new HashMap();
        map.put(a.f62811a, "precacheCanceled");
        map.put("src", this.zza);
        String str = this.zzb;
        if (!TextUtils.isEmpty(str)) {
            map.put("cachedSrc", str);
        }
        String str2 = this.zzc;
        switch (str2.hashCode()) {
            case -1947652542:
                b2 = !str2.equals("interrupted") ? (byte) -1 : (byte) 3;
                break;
            case -1396664534:
                if (str2.equals("badUrl")) {
                    b2 = 8;
                    break;
                }
                break;
            case -1347010958:
                if (str2.equals("inProgress")) {
                    b2 = 2;
                    break;
                }
                break;
            case -918817863:
                if (str2.equals("downloadTimeout")) {
                    b2 = 9;
                    break;
                }
                break;
            case -659376217:
                if (str2.equals("contentLengthMissing")) {
                    b2 = 0;
                    break;
                }
                break;
            case -642208130:
                if (str2.equals("playerFailed")) {
                    b2 = 5;
                    break;
                }
                break;
            case -354048396:
                if (str2.equals("sizeExceeded")) {
                    b2 = 11;
                    break;
                }
                break;
            case -32082395:
                if (str2.equals("externalAbort")) {
                    b2 = 10;
                    break;
                }
                break;
            case 3387234:
                if (str2.equals("noop")) {
                    b2 = 4;
                    break;
                }
                break;
            case 96784904:
                if (str2.equals(MRAIDPresenter.ERROR)) {
                    b2 = 1;
                    break;
                }
                break;
            case 580119100:
                if (str2.equals("expireFailed")) {
                    b2 = 6;
                    break;
                }
                break;
            case 725497484:
                if (str2.equals("noCacheDir")) {
                    b2 = 7;
                    break;
                }
                break;
        }
        String str3 = RedirectEvent.f62801i;
        switch (b2) {
            case 6:
            case 7:
                str3 = "io";
                break;
            case 8:
            case 9:
                str3 = a.f62814d;
                break;
            case 10:
            case 11:
                str3 = "policy";
                break;
        }
        map.put("type", str3);
        map.put(JavetError.PARAMETER_REASON, str2);
        String str4 = this.zzd;
        if (!TextUtils.isEmpty(str4)) {
            map.put("message", str4);
        }
        this.zze.zzw("onPrecacheEvent", map);
    }
}
