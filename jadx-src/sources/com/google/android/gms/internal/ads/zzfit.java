package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfit {
    private String zza;

    public final String zza() {
        return this.zza;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    zzfit(JsonReader jsonReader) throws IOException {
        byte b2;
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != -1724546052) {
                if (iHashCode == 3059181 && strNextName.equals("code")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
            } else if (strNextName.equals("description")) {
                b2 = 1;
            }
            if (b2 != 0) {
                if (b2 != 1) {
                    jsonReader.skipValue();
                } else {
                    strNextString = jsonReader.nextString();
                }
            } else {
                jsonReader.nextInt();
            }
        }
        jsonReader.endObject();
        this.zza = strNextString;
    }
}
