package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgpo {
    public static final /* synthetic */ int zzb = 0;
    private static final zzgqg zzc = new zzgqg("OverlayDisplayService");
    private static final Intent zzd = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    @VisibleForTesting
    final zzgqf zza;
    private final String zze;

    final void zza(final zzgpq zzgpqVar, final zzgpt zzgptVar) {
        zzgqf zzgqfVar = this.zza;
        if (zzgqfVar == null) {
            zzc.zzc("error: %s", "Play Store not found.");
        } else if (zzj(zzgptVar, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, zzgpqVar.zzb()))) {
            zzgqfVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgpl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zze(zzgpqVar, zzgptVar);
                }
            });
        }
    }

    final void zzb(final zzgov zzgovVar, final zzgpt zzgptVar) {
        zzgqf zzgqfVar = this.zza;
        if (zzgqfVar == null) {
            zzc.zzc("error: %s", "Play Store not found.");
        } else if (zzj(zzgptVar, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(zzgovVar.zza(), zzgovVar.zzb()))) {
            zzgqfVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgpa
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzf(zzgovVar, zzgptVar);
                }
            });
        }
    }

    final void zzc(final zzgpv zzgpvVar, final zzgpt zzgptVar, final int i2) {
        zzgqf zzgqfVar = this.zza;
        if (zzgqfVar == null) {
            zzc.zzc("error: %s", "Play Store not found.");
        } else if (zzj(zzgptVar, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(zzgpvVar.zza(), zzgpvVar.zzb()))) {
            zzgqfVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgpc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzg(zzgpvVar, i2, zzgptVar);
                }
            });
        }
    }

    final void zzd() {
        zzgqf zzgqfVar = this.zza;
        if (zzgqfVar == null) {
            return;
        }
        zzc.zza("unbind LMD display overlay service", new Object[0]);
        zzgqfVar.zzb();
    }

    final /* synthetic */ void zze(zzgpq zzgpqVar, zzgpt zzgptVar) {
        try {
            zzgqf zzgqfVar = this.zza;
            if (zzgqfVar == null) {
                throw null;
            }
            zzgoj zzgojVar = (zzgoj) zzgqfVar.zzc();
            if (zzgojVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putBinder("windowToken", zzgpqVar.zza());
            zzi(zzgpqVar.zzj(), new zzgpn() { // from class: com.google.android.gms.internal.ads.zzgpd
                @Override // com.google.android.gms.internal.ads.zzgpn
                public final /* synthetic */ void zza(String str2) {
                    int i2 = zzgpo.zzb;
                    bundle.putString("adFieldEnifd", str2);
                }
            });
            bundle.putInt("layoutGravity", zzgpqVar.zzc());
            bundle.putFloat("layoutVerticalMargin", zzgpqVar.zzd());
            bundle.putInt("displayMode", 0);
            bundle.putInt("triggerMode", 0);
            bundle.putInt("windowWidthPx", zzgpqVar.zzh());
            zzi(null, new zzgpn() { // from class: com.google.android.gms.internal.ads.zzgpe
                @Override // com.google.android.gms.internal.ads.zzgpn
                public final /* synthetic */ void zza(String str2) {
                    int i2 = zzgpo.zzb;
                    bundle.putString("deeplinkUrl", str2);
                }
            });
            zzi(null, new zzgpn() { // from class: com.google.android.gms.internal.ads.zzgpf
                @Override // com.google.android.gms.internal.ads.zzgpn
                public final /* synthetic */ void zza(String str2) {
                    int i2 = zzgpo.zzb;
                    bundle.putString("sessionToken", str2);
                }
            });
            zzi(zzgpqVar.zzb(), new zzgpn() { // from class: com.google.android.gms.internal.ads.zzgpg
                @Override // com.google.android.gms.internal.ads.zzgpn
                public final /* synthetic */ void zza(String str2) {
                    int i2 = zzgpo.zzb;
                    bundle.putString("appId", str2);
                }
            });
            zzi(null, new zzgpn() { // from class: com.google.android.gms.internal.ads.zzgph
                @Override // com.google.android.gms.internal.ads.zzgpn
                public final /* synthetic */ void zza(String str2) {
                    int i2 = zzgpo.zzb;
                    bundle.putString("thirdPartyAuthCallerId", str2);
                }
            });
            bundle.putBoolean("stableSessionToken", true);
            zzgojVar.zze(str, bundle, new zzgpm(this, zzgptVar));
        } catch (RemoteException e2) {
            zzc.zzd(e2, "show overlay display from: %s", this.zze);
        }
    }

    final /* synthetic */ void zzf(zzgov zzgovVar, zzgpt zzgptVar) {
        try {
            zzgqf zzgqfVar = this.zza;
            if (zzgqfVar == null) {
                throw null;
            }
            zzgoj zzgojVar = (zzgoj) zzgqfVar.zzc();
            if (zzgojVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            zzi(zzgovVar.zza(), new zzgpn() { // from class: com.google.android.gms.internal.ads.zzgpi
                @Override // com.google.android.gms.internal.ads.zzgpn
                public final /* synthetic */ void zza(String str2) {
                    int i2 = zzgpo.zzb;
                    bundle.putString("sessionToken", str2);
                }
            });
            zzi(zzgovVar.zzb(), new zzgpn() { // from class: com.google.android.gms.internal.ads.zzgpj
                @Override // com.google.android.gms.internal.ads.zzgpn
                public final /* synthetic */ void zza(String str2) {
                    int i2 = zzgpo.zzb;
                    bundle.putString("appId", str2);
                }
            });
            zzgojVar.zzf(bundle, new zzgpm(this, zzgptVar));
        } catch (RemoteException e2) {
            zzc.zzd(e2, "dismiss overlay display from: %s", this.zze);
        }
    }

    final /* synthetic */ void zzg(zzgpv zzgpvVar, int i2, zzgpt zzgptVar) {
        try {
            zzgqf zzgqfVar = this.zza;
            if (zzgqfVar == null) {
                throw null;
            }
            zzgoj zzgojVar = (zzgoj) zzgqfVar.zzc();
            if (zzgojVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putInt("displayMode", i2);
            zzi(zzgpvVar.zza(), new zzgpn() { // from class: com.google.android.gms.internal.ads.zzgpk
                @Override // com.google.android.gms.internal.ads.zzgpn
                public final /* synthetic */ void zza(String str2) {
                    int i3 = zzgpo.zzb;
                    bundle.putString("sessionToken", str2);
                }
            });
            zzi(zzgpvVar.zzb(), new zzgpn() { // from class: com.google.android.gms.internal.ads.zzgpb
                @Override // com.google.android.gms.internal.ads.zzgpn
                public final /* synthetic */ void zza(String str2) {
                    int i3 = zzgpo.zzb;
                    bundle.putString("appId", str2);
                }
            });
            zzgojVar.zzg(bundle, new zzgpm(this, zzgptVar));
        } catch (RemoteException e2) {
            zzc.zzd(e2, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i2), this.zze);
        }
    }

    zzgpo(Context context) {
        if (zzgqi.zza(context)) {
            this.zza = new zzgqf(context.getApplicationContext(), zzc, "OverlayDisplayService", zzd, zzgoz.zza);
        } else {
            this.zza = null;
        }
        this.zze = context.getPackageName();
    }

    private static boolean zzh(String str) {
        return zzgrt.zza(str).trim().isEmpty();
    }

    private static void zzi(String str, zzgpn zzgpnVar) {
        if (!zzh(str)) {
            str.getClass();
            zzgpnVar.zza(str.trim());
        }
    }

    private static boolean zzj(zzgpt zzgptVar, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!zzh((String) it.next())) {
                return true;
            }
        }
        zzc.zzc(str, new Object[0]);
        zzgpr zzgprVarZzd = zzgps.zzd();
        zzgprVarZzd.zzc(0);
        zzgprVarZzd.zza(8160);
        zzgptVar.zza(zzgprVarZzd.zzd());
        return false;
    }
}
