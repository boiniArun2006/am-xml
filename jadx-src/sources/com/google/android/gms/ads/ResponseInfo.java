package com.google.android.gms.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzv;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class ResponseInfo {

    @Nullable
    private final zzea zza;
    private final List zzb = new ArrayList();

    @Nullable
    private AdapterResponseInfo zzc;

    @NonNull
    public List<AdapterResponseInfo> getAdapterResponses() {
        return this.zzb;
    }

    @Nullable
    public AdapterResponseInfo getLoadedAdapterResponseInfo() {
        return this.zzc;
    }

    @Nullable
    public final zzea zzd() {
        return this.zza;
    }

    @Nullable
    public static ResponseInfo zzb(@Nullable zzea zzeaVar) {
        if (zzeaVar != null) {
            return new ResponseInfo(zzeaVar);
        }
        return null;
    }

    @NonNull
    public static ResponseInfo zzc(@Nullable zzea zzeaVar) {
        return new ResponseInfo(zzeaVar);
    }

    @Nullable
    public String getMediationAdapterClassName() {
        try {
            zzea zzeaVar = this.zza;
            if (zzeaVar != null) {
                return zzeaVar.zze();
            }
            return null;
        } catch (RemoteException e2) {
            zzo.zzg("Could not forward getMediationAdapterClassName to ResponseInfo.", e2);
            return null;
        }
    }

    @NonNull
    public Bundle getResponseExtras() {
        try {
            zzea zzeaVar = this.zza;
            if (zzeaVar != null) {
                return zzeaVar.zzi();
            }
        } catch (RemoteException e2) {
            zzo.zzg("Could not forward getResponseExtras to ResponseInfo.", e2);
        }
        return new Bundle();
    }

    @Nullable
    public String getResponseId() {
        try {
            zzea zzeaVar = this.zza;
            if (zzeaVar != null) {
                return zzeaVar.zzf();
            }
            return null;
        } catch (RemoteException e2) {
            zzo.zzg("Could not forward getResponseId to ResponseInfo.", e2);
            return null;
        }
    }

    @NonNull
    public final JSONObject zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String responseId = getResponseId();
        if (responseId == null) {
            jSONObject.put("Response ID", V8ValueNull.NULL);
        } else {
            jSONObject.put("Response ID", responseId);
        }
        String mediationAdapterClassName = getMediationAdapterClassName();
        if (mediationAdapterClassName == null) {
            jSONObject.put("Mediation Adapter Class Name", V8ValueNull.NULL);
        } else {
            jSONObject.put("Mediation Adapter Class Name", mediationAdapterClassName);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            jSONArray.put(((AdapterResponseInfo) it.next()).zzb());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        AdapterResponseInfo adapterResponseInfo = this.zzc;
        if (adapterResponseInfo != null) {
            jSONObject.put("Loaded Adapter Response", adapterResponseInfo.zzb());
        }
        Bundle responseExtras = getResponseExtras();
        if (responseExtras != null) {
            jSONObject.put("Response Extras", zzbb.zza().zzm(responseExtras));
        }
        return jSONObject;
    }

    private ResponseInfo(@Nullable zzea zzeaVar) {
        this.zza = zzeaVar;
        if (zzeaVar != null) {
            try {
                List listZzg = zzeaVar.zzg();
                if (listZzg != null) {
                    Iterator it = listZzg.iterator();
                    while (it.hasNext()) {
                        AdapterResponseInfo adapterResponseInfoZza = AdapterResponseInfo.zza((zzv) it.next());
                        if (adapterResponseInfoZza != null) {
                            this.zzb.add(adapterResponseInfoZza);
                        }
                    }
                }
            } catch (RemoteException e2) {
                zzo.zzg("Could not forward getAdapterResponseInfo to ResponseInfo.", e2);
            }
        }
        zzea zzeaVar2 = this.zza;
        if (zzeaVar2 != null) {
            try {
                zzv zzvVarZzh = zzeaVar2.zzh();
                if (zzvVarZzh != null) {
                    this.zzc = AdapterResponseInfo.zza(zzvVarZzh);
                }
            } catch (RemoteException e3) {
                zzo.zzg("Could not forward getLoadedAdapterResponse to ResponseInfo.", e3);
            }
        }
    }

    @NonNull
    public String toString() {
        try {
            return zza().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
