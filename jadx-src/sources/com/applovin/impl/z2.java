package com.applovin.impl;

import com.applovin.impl.d2;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class z2 extends e2 {
    public void a(d2 d2Var, y2 y2Var) {
        a(d2Var, y2Var, new HashMap());
    }

    public z2(C1802k c1802k) {
        super(c1802k, d2.b.MEDIATED_AD);
    }

    public void a(d2 d2Var, y2 y2Var, Map map) {
        a(d2Var, y2Var.getFormat(), y2Var.getAdUnitId(), y2Var, null, map);
    }

    public void a(d2 d2Var, y2 y2Var, MaxError maxError) {
        a(d2Var, y2Var, maxError, new HashMap());
    }

    public void a(d2 d2Var, y2 y2Var, MaxError maxError, Map map) {
        a(d2Var, y2Var.getFormat(), y2Var.getAdUnitId(), y2Var, maxError, map);
    }

    public void a(d2 d2Var, MaxAdFormat maxAdFormat, String str, MaxError maxError) {
        a(d2Var, maxAdFormat, str, null, maxError, new HashMap());
    }

    private void a(d2 d2Var, MaxAdFormat maxAdFormat, String str, y2 y2Var, MaxError maxError, Map map) {
        if (y2Var != null) {
            map.putAll(f2.a(y2Var));
        } else {
            CollectionUtils.putStringIfValid(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, str, map);
            CollectionUtils.putStringIfValid("ad_format", maxAdFormat.getLabel(), map);
        }
        if (maxError != null) {
            map.putAll(f2.a(maxError));
        }
        d(d2Var, map);
    }
}
