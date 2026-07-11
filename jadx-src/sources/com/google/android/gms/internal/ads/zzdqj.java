package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdqj implements zzdop, zzdgh {

    @Nullable
    private final zzbui zza;
    private final zzdbx zzb;
    private final zzddy zzc;
    private final zzdbd zzd;
    private final zzdjk zze;
    private final Context zzf;
    private final zzfir zzg;
    private final VersionInfoParcel zzh;
    private final zzfjk zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private boolean zzl = true;

    @Nullable
    private final zzbue zzm;

    @Nullable
    private final zzbuf zzn;

    public zzdqj(@Nullable zzbue zzbueVar, @Nullable zzbuf zzbufVar, @Nullable zzbui zzbuiVar, zzdbx zzdbxVar, zzddy zzddyVar, zzdbd zzdbdVar, zzdjk zzdjkVar, Context context, zzfir zzfirVar, VersionInfoParcel versionInfoParcel, zzfjk zzfjkVar) {
        this.zzm = zzbueVar;
        this.zzn = zzbufVar;
        this.zza = zzbuiVar;
        this.zzb = zzdbxVar;
        this.zzc = zzddyVar;
        this.zzd = zzdbdVar;
        this.zze = zzdjkVar;
        this.zzf = context;
        this.zzg = zzfirVar;
        this.zzh = versionInfoParcel;
        this.zzi = zzfjkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzd(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgh
    public final void zzdH() {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zze(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzg() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final boolean zzh() {
        return this.zzg.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzj(View view, MotionEvent motionEvent, @Nullable View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzk(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    @Nullable
    public final JSONObject zzl(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    @Nullable
    public final JSONObject zzm(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzn() {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzo(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzp(zzbmj zzbmjVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final int zzu() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final boolean zzv() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzx(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzy() {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final boolean zzz(Bundle bundle) {
        return false;
    }

    private static final HashMap zzB(Map map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        map2.put((String) entry.getKey(), view);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map2;
    }

    private final void zzi(View view) {
        try {
            zzbui zzbuiVar = this.zza;
            if (zzbuiVar != null && !zzbuiVar.zzu()) {
                zzbuiVar.zzw(ObjectWrapper.wrap(view));
                this.zzd.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmj)).booleanValue()) {
                    this.zze.zzdu();
                    return;
                }
                return;
            }
            zzbue zzbueVar = this.zzm;
            if (zzbueVar != null && !zzbueVar.zzq()) {
                zzbueVar.zzn(ObjectWrapper.wrap(view));
                this.zzd.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmj)).booleanValue()) {
                    this.zze.zzdu();
                    return;
                }
                return;
            }
            zzbuf zzbufVar = this.zzn;
            if (zzbufVar == null || zzbufVar.zzo()) {
                return;
            }
            zzbufVar.zzl(ObjectWrapper.wrap(view));
            this.zzd.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmj)).booleanValue()) {
                this.zze.zzdu();
            }
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call handleClick", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzA() {
        try {
            zzbui zzbuiVar = this.zza;
            if (zzbuiVar != null) {
                zzbuiVar.zzC();
            }
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call destroy", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzc(View view, @Nullable View view2, @Nullable Map map, @Nullable Map map2, boolean z2, @Nullable ImageView.ScaleType scaleType) {
        if (this.zzk && this.zzg.zzL) {
            return;
        }
        zzi(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdgh
    public final void zzdG() {
        try {
            zzbui zzbuiVar = this.zza;
            if (zzbuiVar == null || !zzbuiVar.zzt()) {
                return;
            }
            zzfir zzfirVar = this.zzg;
            if (zzfirVar.zze != 4 && !zzfirVar.zzaD) {
                return;
            }
            zzbuiVar.zzv();
            this.zzb.zza();
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to report impression from an adapter", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzf(View view, View view2, Map map, Map map2, boolean z2, @Nullable ImageView.ScaleType scaleType, int i2) {
        if (!this.zzk) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.zzg.zzL) {
            zzi(view2);
        } else {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzr(@Nullable com.google.android.gms.ads.internal.client.zzdj zzdjVar) {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzs(com.google.android.gms.ads.internal.client.zzdf zzdfVar) {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzt() {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzw(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        try {
            if (!this.zzj) {
                this.zzj = com.google.android.gms.ads.internal.zzt.zzo().zzg(this.zzf, this.zzh.afmaVersion, this.zzg.zzC.toString(), this.zzi.zzg);
            }
            if (this.zzl) {
                zzbui zzbuiVar = this.zza;
                if (zzbuiVar == null) {
                    zzbue zzbueVar = this.zzm;
                    if (zzbueVar != null && !zzbueVar.zzp()) {
                        zzbueVar.zzm();
                        this.zzb.zza();
                        return;
                    }
                    zzbuf zzbufVar = this.zzn;
                    if (zzbufVar == null || zzbufVar.zzn()) {
                        return;
                    }
                    zzbufVar.zzk();
                    this.zzb.zza();
                    return;
                }
                zzfir zzfirVar = this.zzg;
                if (zzfirVar.zzaD) {
                    if (zzbuiVar.zzt()) {
                        return;
                    }
                    zzbuiVar.zzv();
                    this.zzb.zza();
                    return;
                }
                if (zzbuiVar.zzt() && zzfirVar.zze == 4) {
                    this.zzc.zza();
                } else {
                    zzbuiVar.zzv();
                    this.zzb.zza();
                }
            }
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call recordImpression", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf A[Catch: RemoteException -> 0x002b, JSONException -> 0x0047, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0047, blocks: (B:49:0x00b4, B:50:0x00c9, B:52:0x00cf), top: B:71:0x00b4 }] */
    @Override // com.google.android.gms.internal.ads.zzdop
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(View view, @Nullable Map map, @Nullable Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Map map3;
        Map map4;
        Object obj;
        Iterator it;
        IObjectWrapper iObjectWrapperZzq;
        try {
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(view);
            JSONObject jSONObject = this.zzg.zzaj;
            boolean z2 = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcd)).booleanValue() && jSONObject.length() != 0) {
                if (map == null) {
                    map3 = new HashMap();
                } else {
                    map3 = map;
                }
                if (map2 == null) {
                    map4 = new HashMap();
                } else {
                    map4 = map2;
                }
                HashMap map5 = new HashMap();
                map5.putAll(map3);
                map5.putAll(map4);
                Iterator<String> itKeys = jSONObject.keys();
                loop0: while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        WeakReference weakReference = (WeakReference) map5.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzce)).booleanValue() && next.equals("3010")) {
                                zzbui zzbuiVar = this.zza;
                                Object objUnwrap = null;
                                if (zzbuiVar != null) {
                                    try {
                                        iObjectWrapperZzq = zzbuiVar.zzq();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzbue zzbueVar = this.zzm;
                                    if (zzbueVar != null) {
                                        iObjectWrapperZzq = zzbueVar.zzw();
                                    } else {
                                        zzbuf zzbufVar = this.zzn;
                                        if (zzbufVar != null) {
                                            iObjectWrapperZzq = zzbufVar.zzu();
                                        } else {
                                            iObjectWrapperZzq = null;
                                        }
                                    }
                                }
                                if (iObjectWrapperZzq != null) {
                                    objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzq);
                                }
                                if (objUnwrap != null) {
                                    cls = objUnwrap.getClass();
                                    ArrayList arrayList = new ArrayList();
                                    com.google.android.gms.ads.internal.util.zzbp.zza(jSONArrayOptJSONArray, arrayList);
                                    com.google.android.gms.ads.internal.zzt.zzc();
                                    ClassLoader classLoader = this.zzf.getClassLoader();
                                    it = arrayList.iterator();
                                    while (it.hasNext()) {
                                    }
                                }
                            } else {
                                try {
                                    ArrayList arrayList2 = new ArrayList();
                                    com.google.android.gms.ads.internal.util.zzbp.zza(jSONArrayOptJSONArray, arrayList2);
                                    com.google.android.gms.ads.internal.zzt.zzc();
                                    ClassLoader classLoader2 = this.zzf.getClassLoader();
                                    it = arrayList2.iterator();
                                    while (it.hasNext()) {
                                        if (Class.forName((String) it.next(), false, classLoader2).isAssignableFrom(cls)) {
                                            break;
                                        }
                                    }
                                } catch (JSONException unused2) {
                                    continue;
                                }
                            }
                        }
                        z2 = false;
                        break;
                    }
                }
            }
            this.zzl = z2;
            HashMap mapZzB = zzB(map);
            HashMap mapZzB2 = zzB(map2);
            zzbui zzbuiVar2 = this.zza;
            if (zzbuiVar2 != null) {
                zzbuiVar2.zzx(iObjectWrapperWrap, ObjectWrapper.wrap(mapZzB), ObjectWrapper.wrap(mapZzB2));
                return;
            }
            zzbue zzbueVar2 = this.zzm;
            if (zzbueVar2 != null) {
                zzbueVar2.zzy(iObjectWrapperWrap, ObjectWrapper.wrap(mapZzB), ObjectWrapper.wrap(mapZzB2));
                zzbueVar2.zzo(iObjectWrapperWrap);
                return;
            }
            zzbuf zzbufVar2 = this.zzn;
            if (zzbufVar2 != null) {
                zzbufVar2.zzw(iObjectWrapperWrap, ObjectWrapper.wrap(mapZzB), ObjectWrapper.wrap(mapZzB2));
                zzbufVar2.zzm(iObjectWrapperWrap);
            }
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call trackView", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzb(View view, @Nullable Map map) {
        try {
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(view);
            zzbui zzbuiVar = this.zza;
            if (zzbuiVar != null) {
                zzbuiVar.zzy(iObjectWrapperWrap);
                return;
            }
            zzbue zzbueVar = this.zzm;
            if (zzbueVar != null) {
                zzbueVar.zzs(iObjectWrapperWrap);
                return;
            }
            zzbuf zzbufVar = this.zzn;
            if (zzbufVar != null) {
                zzbufVar.zzq(iObjectWrapperWrap);
            }
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call untrackView", e2);
        }
    }
}
