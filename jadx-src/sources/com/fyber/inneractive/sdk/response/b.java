package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f56828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f56829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f56830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f56831d = true;

    public abstract e a();

    public final e a(String str) throws Exception {
        this.f56831d = str != null;
        e eVar = this.f56828a;
        eVar.getClass();
        eVar.f56851c = System.currentTimeMillis();
        this.f56830c.a(this);
        String strA = this.f56830c.a();
        this.f56828a.f56856h = strA;
        r0 r0VarA = com.fyber.inneractive.sdk.config.a.a(this.f56829b);
        IAlog.a("%sGot unit config for unitId: %s from config manager", IAlog.a(this), this.f56829b);
        IAlog.a("%s%s", IAlog.a(this), r0VarA);
        if (this.f56831d) {
            a(str, r0VarA);
        } else if (this instanceof l) {
            a(strA, r0VarA);
        } else {
            h hVar = new h(strA);
            if (hVar.f56882a) {
                String str2 = hVar.f56883b;
                if (str2 == null || TextUtils.isEmpty(str2.trim())) {
                    throw new Exception("empty ad content detected. failing fast.");
                }
                a(str2, r0VarA);
            }
        }
        return this.f56828a;
    }

    public abstract void a(String str, r0 r0Var);

    public boolean b() {
        return this instanceof c;
    }
}
