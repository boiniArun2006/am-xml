package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import com.caoccao.javet.interop.engine.JavetEngineConfig;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f54130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f54131d;

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            String[] strArrSplit = str.split(":");
            if (strArrSplit.length == 3) {
                String str2 = strArrSplit[0];
                String str3 = strArrSplit[1];
                String[] strArrSplit2 = strArrSplit[2].split("\\.");
                String str4 = strArrSplit2[0];
                String str5 = strArrSplit2.length > 1 ? strArrSplit2[1] : "000";
                try {
                    arrayList.add(Integer.valueOf(Integer.parseInt(str2)));
                    arrayList.add(Integer.valueOf(Integer.parseInt(str3)));
                    arrayList.add(Integer.valueOf(Integer.parseInt(str4)));
                    arrayList.add(Integer.valueOf(Integer.parseInt(str5)));
                    return arrayList;
                } catch (NumberFormatException e2) {
                    IAlog.f("ProgressTrackingEvent: failed convertOffsetToTimeList with %s", e2.getMessage());
                    return new ArrayList();
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(String str, String str2) {
        int i2;
        String str3;
        int i3;
        this.f54128a = str;
        this.f54129b = str2;
        int iIntValue = -1;
        if (!TextUtils.isEmpty(str2) && !str2.startsWith("-")) {
            if (str2.endsWith("%") && str2.endsWith("%")) {
                try {
                    if (TextUtils.isEmpty(str2)) {
                        i3 = -1;
                    } else {
                        i3 = Integer.parseInt(str2.substring(0, str2.length() - 1));
                    }
                    if (i3 >= 0 && i3 <= 100) {
                        i2 = 1;
                    }
                } catch (NumberFormatException e2) {
                    IAlog.f("ProgressTrackingEvent: failed isPercentageOffsetValid with %s", e2.getMessage());
                }
            } else if (str2.contains(":")) {
                ArrayList arrayListA = a(str2);
                if (!arrayListA.isEmpty() && ((Integer) arrayListA.get(0)).intValue() >= 0 && ((Integer) arrayListA.get(1)).intValue() >= 0 && ((Integer) arrayListA.get(2)).intValue() >= 0 && ((Integer) arrayListA.get(3)).intValue() >= 0) {
                    i2 = 2;
                }
            }
        } else {
            i2 = 0;
        }
        this.f54131d = i2;
        if (i2 == 2 && (str3 = this.f54129b) != null) {
            ArrayList arrayListA2 = a(str3);
            iIntValue = ((Integer) arrayListA2.get(3)).intValue() + ((((Integer) arrayListA2.get(2)).intValue() + (((Integer) arrayListA2.get(1)).intValue() * 60) + (((Integer) arrayListA2.get(0)).intValue() * JavetEngineConfig.DEFAULT_RESET_ENGINE_TIMEOUT_SECONDS)) * 1000);
        }
        this.f54130c = iIntValue;
    }
}
