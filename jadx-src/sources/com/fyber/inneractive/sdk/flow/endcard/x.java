package com.fyber.inneractive.sdk.flow.endcard;

import com.fyber.inneractive.sdk.flow.x0;
import org.json.JSONArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class x extends c {
    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final void a(JSONArray jSONArray) {
        this.f53587b = jSONArray;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final n c() {
        return new u(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final boolean k() {
        JSONArray jSONArray = this.f53587b;
        return jSONArray != null && jSONArray.length() > 0;
    }

    public x(x0 x0Var, com.fyber.inneractive.sdk.model.vast.c cVar, int i2) {
        super(x0Var, cVar, i2);
    }
}
