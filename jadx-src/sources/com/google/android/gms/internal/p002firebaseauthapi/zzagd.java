package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.firebase.Wre;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzagd {
    private static final Map<String, zzagc> zza = new ArrayMap();
    private static final Map<String, List<WeakReference<zzagf>>> zzb = new ArrayMap();

    private static String zza(String str, int i2, boolean z2) {
        if (z2) {
            return "http://[" + str + "]:" + i2 + "/";
        }
        return d.f62221v + str + ":" + i2 + "/";
    }

    @NonNull
    public static String zzb(String str) {
        zzagc zzagcVar;
        String str2;
        Map<String, zzagc> map = zza;
        synchronized (map) {
            zzagcVar = map.get(str);
        }
        if (zzagcVar != null) {
            str2 = "" + zza(zzagcVar.zzb(), zzagcVar.zza(), zzagcVar.zzb().contains(":"));
        } else {
            str2 = "" + d.f62220u;
        }
        return str2 + "www.googleapis.com/identitytoolkit/v3/relyingparty";
    }

    @NonNull
    public static String zzc(String str) {
        zzagc zzagcVar;
        String str2;
        Map<String, zzagc> map = zza;
        synchronized (map) {
            zzagcVar = map.get(str);
        }
        if (zzagcVar != null) {
            str2 = "" + zza(zzagcVar.zzb(), zzagcVar.zza(), zzagcVar.zzb().contains(":"));
        } else {
            str2 = "" + d.f62220u;
        }
        return str2 + "identitytoolkit.googleapis.com/v2";
    }

    @NonNull
    public static String zzd(String str) {
        zzagc zzagcVar;
        String str2;
        Map<String, zzagc> map = zza;
        synchronized (map) {
            zzagcVar = map.get(str);
        }
        if (zzagcVar != null) {
            str2 = "" + zza(zzagcVar.zzb(), zzagcVar.zza(), zzagcVar.zzb().contains(":"));
        } else {
            str2 = "" + d.f62220u;
        }
        return str2 + "securetoken.googleapis.com/v1";
    }

    @NonNull
    public static String zza(String str) {
        zzagc zzagcVar;
        Map<String, zzagc> map = zza;
        synchronized (map) {
            zzagcVar = map.get(str);
        }
        if (zzagcVar != null) {
            return zza(zzagcVar.zzb(), zzagcVar.zza(), zzagcVar.zzb().contains(":")) + "emulator/auth/handler";
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    public static void zza(String str, zzagf zzagfVar) {
        Map<String, List<WeakReference<zzagf>>> map = zzb;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    map.get(str).add(new WeakReference<>(zzagfVar));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new WeakReference<>(zzagfVar));
                    map.put(str, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void zza(@NonNull Wre wre, @NonNull String str, int i2) {
        String strRl = wre.ck().rl();
        Map<String, zzagc> map = zza;
        synchronized (map) {
            map.put(strRl, new zzagc(str, i2));
        }
        Map<String, List<WeakReference<zzagf>>> map2 = zzb;
        synchronized (map2) {
            try {
                if (map2.containsKey(strRl)) {
                    Iterator<WeakReference<zzagf>> it = map2.get(strRl).iterator();
                    boolean z2 = false;
                    while (it.hasNext()) {
                        zzagf zzagfVar = it.next().get();
                        if (zzagfVar != null) {
                            zzagfVar.zza();
                            z2 = true;
                        }
                    }
                    if (!z2) {
                        zza.remove(strRl);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean zza(@NonNull Wre wre) {
        return zza.containsKey(wre.ck().rl());
    }
}
