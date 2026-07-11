package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzftv implements zzftt {
    private final zzftt zza;

    public zzftv(zzftt zzfttVar) {
        this.zza = zzfttVar;
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    public final JSONObject zza(View view) {
        JSONObject jSONObjectZzb = zzfud.zzb(0, 0, 0, 0);
        int iZzb = zzfug.zzb();
        int i2 = iZzb - 1;
        if (iZzb == 0) {
            throw null;
        }
        try {
            jSONObjectZzb.put("noOutputDevice", i2 == 0);
            return jSONObjectZzb;
        } catch (JSONException e2) {
            zzfue.zza("Error with setting output device status", e2);
            return jSONObjectZzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    public final void zzb(View view, JSONObject jSONObject, zzfts zzftsVar, boolean z2, boolean z3) {
        ArrayList arrayList = new ArrayList();
        zzfth zzfthVarZza = zzfth.zza();
        if (zzfthVarZza != null) {
            Collection collectionZzf = zzfthVarZza.zzf();
            int size = collectionZzf.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = collectionZzf.iterator();
            while (it.hasNext()) {
                View viewZzi = ((zzfsn) it.next()).zzi();
                if (viewZzi != null && viewZzi.isAttachedToWindow() && viewZzi.isShown()) {
                    View view2 = viewZzi;
                    while (true) {
                        if (view2 == null) {
                            View rootView = viewZzi.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z4 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i2 = size2 - 1;
                                    if (((View) arrayList.get(i2)).getZ() <= z4) {
                                        break;
                                    } else {
                                        size2 = i2;
                                    }
                                }
                                arrayList.add(size2, rootView);
                            }
                        } else if (view2.getAlpha() != 0.0f) {
                            Object parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            zzftsVar.zza((View) arrayList.get(i3), this.zza, jSONObject, z3);
        }
    }
}
