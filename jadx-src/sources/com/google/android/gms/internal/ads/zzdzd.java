package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdzd {
    public final long zza;
    public final int[] zzb;

    private zzdzd(long j2, int[] iArr) {
        this.zza = j2;
        this.zzb = iArr;
    }

    public static zzguf zza(JsonReader jsonReader) throws IOException {
        int i2 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            zzguf zzgufVarZzi = zzguf.zzi();
            jsonReader.beginObject();
            zzdzd zzdzdVar = null;
            Long lValueOf = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (Objects.equals(strNextName, "id")) {
                    lValueOf = Long.valueOf(jsonReader.nextLong());
                } else if (Objects.equals(strNextName, "event_types")) {
                    zzguc zzgucVar2 = new zzguc();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzgucVar2.zzf(Integer.valueOf(jsonReader.nextInt()));
                    }
                    jsonReader.endArray();
                    zzgufVarZzi = zzgucVar2.zzi();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            if (lValueOf != null && !zzgufVarZzi.isEmpty()) {
                long jLongValue = lValueOf.longValue();
                int[] iArr = new int[zzgufVarZzi.size()];
                for (int i3 = 0; i3 < zzgufVarZzi.size(); i3++) {
                    iArr[i3] = ((Integer) zzgufVarZzi.get(i3)).intValue();
                }
                zzdzdVar = new zzdzd(jLongValue, iArr);
            }
            if (zzdzdVar != null) {
                zzgucVar.zzf(zzdzdVar);
            }
        }
        jsonReader.endArray();
        return zzgucVar.zzi();
    }
}
