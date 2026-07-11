package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.WorkerThread;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzql;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Arrays;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhc {
    final /* synthetic */ zzhg zza;
    private final String zzb;
    private final Bundle zzc;
    private Bundle zzd;

    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011c A[Catch: NumberFormatException | JSONException -> 0x0124, NumberFormatException | JSONException -> 0x0124, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x0124, blocks: (B:10:0x0027, B:44:0x0093, B:44:0x0093, B:45:0x00a4, B:45:0x00a4, B:47:0x00b5, B:47:0x00b5, B:49:0x00c7, B:49:0x00c7, B:50:0x00d0, B:50:0x00d0, B:51:0x00d4, B:51:0x00d4, B:53:0x00e5, B:53:0x00e5, B:55:0x00f7, B:55:0x00f7, B:56:0x0100, B:56:0x0100, B:57:0x0104, B:57:0x0104, B:58:0x0110, B:58:0x0110, B:59:0x011c, B:59:0x011c), top: B:71:0x0027, outer: #1 }] */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle zza() {
        byte b2;
        if (this.zzd == null) {
            zzhg zzhgVar = this.zza;
            String string = zzhgVar.zzd().getString(this.zzb, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i2);
                            String string2 = jSONObject.getString(c.f62177j);
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode == 100) {
                                if (string3.equals("d")) {
                                    b2 = 1;
                                }
                                if (b2 == 0) {
                                }
                            } else if (iHashCode == 108) {
                                if (string3.equals(CmcdData.STREAM_TYPE_LIVE)) {
                                    b2 = 2;
                                }
                                if (b2 == 0) {
                                }
                            } else if (iHashCode == 115) {
                                if (string3.equals(CmcdData.STREAMING_FORMAT_SS)) {
                                    b2 = 0;
                                }
                                if (b2 == 0) {
                                }
                            } else if (iHashCode != 3352) {
                                b2 = (iHashCode == 3445 && string3.equals("la")) ? (byte) 4 : (byte) -1;
                                if (b2 == 0) {
                                    bundle.putString(string2, jSONObject.getString("v"));
                                } else if (b2 == 1) {
                                    bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                                } else if (b2 == 2) {
                                    bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                } else if (b2 == 3) {
                                    zzql.zza();
                                    if (zzhgVar.zzu.zzc().zzp(null, zzfx.zzaQ)) {
                                        JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                        int length = jSONArray2.length();
                                        int[] iArr = new int[length];
                                        for (int i3 = 0; i3 < length; i3++) {
                                            iArr[i3] = jSONArray2.optInt(i3);
                                        }
                                        bundle.putIntArray(string2, iArr);
                                    }
                                } else if (b2 != 4) {
                                    zzhgVar.zzu.zzaV().zzb().zzb("Unrecognized persisted bundle type. Type", string3);
                                } else {
                                    zzql.zza();
                                    if (zzhgVar.zzu.zzc().zzp(null, zzfx.zzaQ)) {
                                        JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                        int length2 = jSONArray3.length();
                                        long[] jArr = new long[length2];
                                        for (int i5 = 0; i5 < length2; i5++) {
                                            jArr[i5] = jSONArray3.optLong(i5);
                                        }
                                        bundle.putLongArray(string2, jArr);
                                    }
                                }
                            } else {
                                if (string3.equals("ia")) {
                                    b2 = 3;
                                }
                                if (b2 == 0) {
                                }
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.zza.zzu.zzaV().zzb().zza("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.zzd = bundle;
                } catch (JSONException unused2) {
                    this.zza.zzu.zzaV().zzb().zza("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.zzd == null) {
                this.zzd = this.zzc;
            }
        }
        return new Bundle((Bundle) Preconditions.checkNotNull(this.zzd));
    }

    @WorkerThread
    public final void zzb(Bundle bundle) {
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        zzhg zzhgVar = this.zza;
        SharedPreferences.Editor editorEdit = zzhgVar.zzd().edit();
        if (bundle2.size() == 0) {
            editorEdit.remove(this.zzb);
        } else {
            String str = this.zzb;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(c.f62177j, str2);
                        zzql.zza();
                        zzib zzibVar = zzhgVar.zzu;
                        if (zzibVar.zzc().zzp(null, zzfx.zzaQ)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", CmcdData.STREAMING_FORMAT_SS);
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", CmcdData.STREAM_TYPE_LIVE);
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                zzibVar.zzaV().zzb().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", CmcdData.STREAMING_FORMAT_SS);
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", CmcdData.STREAM_TYPE_LIVE);
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                zzibVar.zzaV().zzb().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e2) {
                        this.zza.zzu.zzaV().zzb().zzb("Cannot serialize bundle value to SharedPreferences", e2);
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.zzd = bundle2;
    }

    public zzhc(zzhg zzhgVar, String str, Bundle bundle) {
        Objects.requireNonNull(zzhgVar);
        this.zza = zzhgVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = new Bundle();
    }
}
