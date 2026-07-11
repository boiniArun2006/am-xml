package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f53366a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f53367b;

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        if (this.f53366a.isEmpty() || eVar.f53356c == null) {
            return false;
        }
        Iterator it = this.f53366a.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(eVar.f53356c.value())) {
                return !this.f53367b;
            }
        }
        return this.f53367b;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", "placement_type", this.f53366a, Boolean.valueOf(this.f53367b));
    }

    public h(JSONArray jSONArray, boolean z2) {
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String strOptString = jSONArray.optString(i2);
                if (!TextUtils.isEmpty(strOptString)) {
                    this.f53366a.add(strOptString);
                }
            }
        }
        this.f53367b = z2;
    }
}
