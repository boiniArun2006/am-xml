package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfur implements zzfts {
    private static final zzfur zza = new zzfur();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzk = new zzfun();
    private static final Runnable zzl = new zzfuo();
    private int zze;
    private long zzj;
    private final List zzd = new ArrayList();
    private final List zzf = new ArrayList();
    private final zzfuk zzh = new zzfuk();
    private final zzftu zzg = new zzftu();
    private final zzful zzi = new zzful(new zzfuu());

    public static zzfur zzb() {
        return zza;
    }

    private final void zzk(View view, zzftt zzfttVar, JSONObject jSONObject, int i2, boolean z2) {
        zzfttVar.zzb(view, jSONObject, this, i2 == 1, z2);
    }

    final /* synthetic */ void zzf() {
        zzfur zzfurVar;
        this.zze = 0;
        this.zzf.clear();
        for (zzfsn zzfsnVar : zzfth.zza().zzf()) {
        }
        this.zzj = System.nanoTime();
        zzfuk zzfukVar = this.zzh;
        zzfukVar.zzd();
        zzftu zzftuVar = this.zzg;
        long jNanoTime = System.nanoTime();
        zzftt zzfttVarZza = zzftuVar.zza();
        if (zzfukVar.zzb().size() > 0) {
            for (String str : zzfukVar.zzb()) {
                JSONObject jSONObjectZza = zzfttVarZza.zza(null);
                View viewZzh = zzfukVar.zzh(str);
                zzftt zzfttVarZzb = zzftuVar.zzb();
                String strZzc = zzfukVar.zzc(str);
                if (strZzc != null) {
                    JSONObject jSONObjectZza2 = zzfttVarZzb.zza(viewZzh);
                    zzfud.zzd(jSONObjectZza2, str);
                    try {
                        jSONObjectZza2.put("notVisibleReason", strZzc);
                    } catch (JSONException e2) {
                        zzfue.zza("Error with setting not visible reason", e2);
                    }
                    zzfud.zze(jSONObjectZza, jSONObjectZza2);
                }
                zzfud.zzf(jSONObjectZza);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                this.zzi.zzb(jSONObjectZza, hashSet, jNanoTime);
            }
        }
        zzfuk zzfukVar2 = this.zzh;
        if (zzfukVar2.zza().size() > 0) {
            JSONObject jSONObjectZza3 = zzfttVarZza.zza(null);
            zzfurVar = this;
            zzfurVar.zzk(null, zzfttVarZza, jSONObjectZza3, 1, false);
            zzfud.zzf(jSONObjectZza3);
            zzfurVar.zzi.zza(jSONObjectZza3, zzfukVar2.zza(), jNanoTime);
        } else {
            zzfurVar = this;
            zzfurVar.zzi.zzc();
        }
        zzfukVar2.zze();
        long jNanoTime2 = System.nanoTime() - zzfurVar.zzj;
        List<zzfuq> list = zzfurVar.zzd;
        if (list.size() > 0) {
            for (zzfuq zzfuqVar : list) {
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                zzfuqVar.zzb();
                if (zzfuqVar instanceof zzfup) {
                    ((zzfup) zzfuqVar).zza();
                }
            }
        }
        zzftr.zza().zzc();
    }

    final /* synthetic */ zzful zzh() {
        return this.zzi;
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zzl);
            zzc = null;
        }
    }

    public final void zzc() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzk);
            zzc.postDelayed(zzl, 200L);
        }
    }

    zzfur() {
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final void zza(View view, zzftt zzfttVar, JSONObject jSONObject, boolean z2) {
        zzfuk zzfukVar;
        int iZzl;
        boolean z3;
        zzfur zzfurVar;
        View view2;
        zzftt zzfttVar2;
        boolean z4;
        if (zzfui.zza(view) == null && (iZzl = (zzfukVar = this.zzh).zzl(view)) != 3) {
            JSONObject jSONObjectZza = zzfttVar.zza(view);
            zzfud.zze(jSONObject, jSONObjectZza);
            String strZzg = zzfukVar.zzg(view);
            if (strZzg != null) {
                zzfud.zzd(jSONObjectZza, strZzg);
                try {
                    jSONObjectZza.put("hasWindowFocus", Boolean.valueOf(this.zzh.zzj(view)));
                } catch (JSONException e2) {
                    zzfue.zza("Error with setting has window focus", e2);
                }
                boolean zZzk = this.zzh.zzk(strZzg);
                Boolean boolValueOf = Boolean.valueOf(zZzk);
                if (zZzk) {
                    try {
                        jSONObjectZza.put("isPipActive", boolValueOf);
                    } catch (JSONException e3) {
                        zzfue.zza("Error with setting is picture-in-picture active", e3);
                    }
                }
                this.zzh.zzf();
                zzfurVar = this;
            } else {
                zzfuj zzfujVarZzi = zzfukVar.zzi(view);
                if (zzfujVarZzi != null) {
                    zzftk zzftkVarZzb = zzfujVarZzi.zzb();
                    JSONArray jSONArray = new JSONArray();
                    ArrayList arrayListZzc = zzfujVarZzi.zzc();
                    int size = arrayListZzc.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        jSONArray.put((String) arrayListZzc.get(i2));
                    }
                    try {
                        jSONObjectZza.put("isFriendlyObstructionFor", jSONArray);
                        jSONObjectZza.put("friendlyObstructionClass", zzftkVarZzb.zzb());
                        jSONObjectZza.put("friendlyObstructionPurpose", zzftkVarZzb.zzc());
                        jSONObjectZza.put("friendlyObstructionReason", zzftkVarZzb.zzd());
                    } catch (JSONException e4) {
                        zzfue.zza("Error with setting friendly obstruction", e4);
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2 || z3) {
                    zzfurVar = this;
                    view2 = view;
                    zzfttVar2 = zzfttVar;
                    z4 = true;
                } else {
                    view2 = view;
                    zzfttVar2 = zzfttVar;
                    z4 = false;
                    zzfurVar = this;
                }
                zzfurVar.zzk(view2, zzfttVar2, jSONObjectZza, iZzl, z4);
            }
            zzfurVar.zze++;
        }
    }

    public final void zzd() {
        zzl();
        this.zzd.clear();
        zzb.post(new zzfum(this));
    }

    public final void zze() {
        zzl();
    }
}
