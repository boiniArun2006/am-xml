package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzfud {
    private static WindowManager zzb;
    private static final String[] zzc = {"x", "y", "width", "height"};
    static float zza = Resources.getSystem().getDisplayMetrics().density;

    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zzg(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArrayOptJSONArray2;
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = zzc;
            int i2 = 0;
            while (true) {
                if (i2 < 4) {
                    String str = strArr[i2];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i2++;
                } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice"))) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
                    JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray jSONArrayOptJSONArray4 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (jSONArrayOptJSONArray3 == null && jSONArrayOptJSONArray4 == null) {
                        jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
                        jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
                        if (jSONArrayOptJSONArray == null) {
                        }
                        if (zzh(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
                        }
                    } else if (zzh(jSONArrayOptJSONArray3, jSONArrayOptJSONArray4)) {
                        for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                            if (!jSONArrayOptJSONArray3.optString(i3, "").equals(jSONArrayOptJSONArray4.optString(i3, ""))) {
                                break;
                            }
                        }
                        jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
                        jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
                        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray2 != null) {
                            if (zzh(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
                                for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                                    if (zzg(jSONArrayOptJSONArray.optJSONObject(i5), jSONArrayOptJSONArray2.optJSONObject(i5))) {
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean zzh(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    public static void zza(Context context) {
        if (context != null) {
            zza = context.getResources().getDisplayMetrics().density;
            zzb = (WindowManager) context.getSystemService("window");
        }
    }

    public static JSONObject zzb(int i2, int i3, int i5, int i7) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i2 / zza);
            jSONObject.put("y", i3 / zza);
            jSONObject.put("width", i5 / zza);
            jSONObject.put("height", i7 / zza);
            return jSONObject;
        } catch (JSONException e2) {
            zzfue.zza("Error with creating viewStateObject", e2);
            return jSONObject;
        }
    }

    public static void zzd(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e2) {
            zzfue.zza("Error with setting ad session id", e2);
        }
    }

    public static void zze(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static void zzf(JSONObject jSONObject) {
        float f3;
        float f4;
        if (zzb != null) {
            Point point = new Point(0, 0);
            zzb.getDefaultDisplay().getRealSize(point);
            float f5 = point.x;
            float f6 = zza;
            f3 = f5 / f6;
            f4 = point.y / f6;
        } else {
            f3 = 0.0f;
            f4 = 0.0f;
        }
        try {
            jSONObject.put("width", f3);
            jSONObject.put("height", f4);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static void zzc(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e2) {
            StringBuilder sb = new StringBuilder(str.length() + 47);
            sb.append("JSONException during JSONObject.put for name [");
            sb.append(str);
            sb.append("]");
            zzfue.zza(sb.toString(), e2);
        }
    }
}
