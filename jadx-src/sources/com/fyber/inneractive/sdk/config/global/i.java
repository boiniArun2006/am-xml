package com.fyber.inneractive.sdk.config.global;

import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class i implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f53368a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f53369b;

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        if (this.f53368a.isEmpty() || eVar.f53355b == null) {
            return false;
        }
        Iterator it = this.f53368a.iterator();
        while (it.hasNext()) {
            if (((Long) it.next()).equals(eVar.f53355b)) {
                return !this.f53369b;
            }
        }
        return this.f53369b;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", "pub_id", this.f53368a, Boolean.valueOf(this.f53369b));
    }

    public i(JSONArray jSONArray, boolean z2) {
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                long jOptLong = jSONArray.optLong(i2);
                if (jOptLong != 0) {
                    this.f53368a.add(Long.valueOf(jOptLong));
                }
            }
        }
        this.f53369b = z2;
    }
}
