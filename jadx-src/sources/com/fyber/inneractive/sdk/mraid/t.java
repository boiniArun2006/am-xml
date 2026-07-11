package com.fyber.inneractive.sdk.mraid;

import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.i0;
import com.google.android.gms.ads.identifier.Ov.YmsTEL;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class t extends f {
    @Override // com.fyber.inneractive.sdk.mraid.f
    public final boolean b() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.mraid.f
    public final void a() {
        Map map = this.f54205b;
        this.f54206c.setOrientationProperties((map != null && map.containsKey("allowOrientationChange") && V8ValueBoolean.FALSE.equals(this.f54205b.get("allowOrientationChange"))) ? false : true, (String) this.f54205b.get(YmsTEL.rqokO));
    }

    public t(LinkedHashMap linkedHashMap, i0 i0Var, g1 g1Var) {
        super(linkedHashMap, i0Var, g1Var);
    }
}
