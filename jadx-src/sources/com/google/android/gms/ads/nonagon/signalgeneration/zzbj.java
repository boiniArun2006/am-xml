package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzdxh;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzbj {
    public final String zza;
    public String zzb;

    @Nullable
    public zzbzu zzd;

    @Nullable
    public Bundle zze;
    private long zzg;
    private long zzh;

    @Nullable
    public String zzc = null;
    public Bundle zzf = new Bundle();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbj(JsonReader jsonReader, @Nullable zzbzu zzbzuVar) throws IOException {
        Bundle bundle;
        byte b2;
        this.zzg = -1L;
        this.zzh = -1L;
        this.zzd = zzbzuVar;
        HashMap map = new HashMap();
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName = strNextName == null ? "" : strNextName;
            switch (strNextName.hashCode()) {
                case -1573145462:
                    if (strNextName.equals("start_time")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -995427962:
                    if (strNextName.equals("params")) {
                        b2 = 0;
                        break;
                    }
                    break;
                case -271442291:
                    if (strNextName.equals("signal_dictionary")) {
                        b2 = 1;
                        break;
                    }
                    break;
                case 1725551537:
                    if (strNextName.equals("end_time")) {
                        b2 = 3;
                        break;
                    }
                    break;
            }
            if (b2 != 0) {
                if (b2 != 1) {
                    if (b2 != 2) {
                        if (b2 != 3) {
                            jsonReader.skipValue();
                        } else {
                            this.zzh = jsonReader.nextLong();
                        }
                    } else {
                        this.zzg = jsonReader.nextLong();
                    }
                } else {
                    map = new HashMap();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        map.put(jsonReader.nextName(), jsonReader.nextString());
                    }
                    jsonReader.endObject();
                }
            } else {
                strNextString = jsonReader.nextString();
            }
        }
        this.zza = strNextString;
        jsonReader.endObject();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.zzf.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && zzbzuVar != null && (bundle = zzbzuVar.zzm) != null) {
            bundle.putLong(zzdxh.GET_SIGNALS_SDKCORE_START.zza(), this.zzg);
            zzbzuVar.zzm.putLong(zzdxh.GET_SIGNALS_SDKCORE_END.zza(), this.zzh);
        }
    }
}
