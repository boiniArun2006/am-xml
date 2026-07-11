package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzftw implements zzftt {
    private final int[] zza = new int[2];

    @Override // com.google.android.gms.internal.ads.zzftt
    public final JSONObject zza(View view) {
        if (view == null) {
            return zzfud.zzb(0, 0, 0, 0);
        }
        int[] iArr = this.zza;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        return zzfud.zzb(iArr[0], iArr[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    public final void zzb(View view, JSONObject jSONObject, zzfts zzftsVar, boolean z2, boolean z3) {
        int i2;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z2) {
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    zzftsVar.zza(viewGroup.getChildAt(i3), this, jSONObject, z3);
                }
                return;
            }
            HashMap map = new HashMap();
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                View childAt = viewGroup.getChildAt(i5);
                ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            ArrayList arrayList2 = new ArrayList(map.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                ArrayList arrayList3 = (ArrayList) map.get((Float) arrayList2.get(i7));
                int size2 = arrayList3.size();
                int i8 = 0;
                while (true) {
                    i2 = i7 + 1;
                    if (i8 < size2) {
                        zzftsVar.zza((View) arrayList3.get(i8), this, jSONObject, z3);
                        i8++;
                    }
                }
                i7 = i2;
            }
        }
    }
}
