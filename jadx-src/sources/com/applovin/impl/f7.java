package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class f7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f48551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f48552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f48553c;

    public void a(String str) {
        if (StringUtils.isValidString(str)) {
            a(Collections.singletonList(str));
        } else {
            a((List) null);
        }
    }

    private void e() {
        com.applovin.impl.sdk.j jVarT = this.f48551a.t();
        if (this.f48552b) {
            jVarT.b(this.f48553c);
        } else {
            jVarT.a(this.f48553c);
        }
    }

    public List b() {
        return this.f48553c;
    }

    public boolean c() {
        return this.f48552b;
    }

    public boolean d() {
        List list = this.f48553c;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public f7(C1802k c1802k) {
        boolean z2;
        this.f48551a = c1802k;
        z4 z4Var = z4.f50988I;
        if (!((Boolean) c1802k.a(z4Var, Boolean.FALSE)).booleanValue() && !C1814y.a(C1802k.o()).a("applovin.sdk.is_test_environment") && !AppLovinSdkUtils.isEmulator() && !c1802k.A().U()) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f48552b = z2;
        c1802k.c(z4Var);
    }

    public void a(List list) {
        if (list == null && this.f48553c == null) {
            return;
        }
        if (list == null || !list.equals(this.f48553c)) {
            this.f48553c = list;
            e();
        }
    }

    public void a() {
        this.f48551a.b(z4.f50988I, Boolean.TRUE);
    }

    public void a(JSONObject jSONObject) {
        if (this.f48552b) {
            return;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "test_mode_idfas", new JSONArray());
        com.applovin.impl.sdk.l lVarA = this.f48551a.A();
        boolean zU = lVarA.U();
        String strA = lVarA.f().a();
        l.b bVarH = lVarA.H();
        this.f48552b = zU || JsonUtils.containsCaseInsensitiveString(strA, jSONArray) || JsonUtils.containsCaseInsensitiveString(bVarH != null ? bVarH.f50286a : null, jSONArray);
    }
}
