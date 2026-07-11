package com.applovin.impl;

import Hr.CQ.USEaHtCMH;
import android.text.TextUtils;
import com.applovin.impl.d6;
import com.applovin.impl.q0;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class l6 extends AbstractRunnableC1782i5 implements q0.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.a f48898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final q0.e f48899h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d6.b f48900i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private x4 f48901j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private x4 f48902k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected q0.b f48903l;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    class a implements q0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1802k f48904a;

        @Override // com.applovin.impl.q0.e
        public void a(String str, Object obj, int i2) {
            l6.this.f48898g.a(0);
            l6.this.a(str, obj, i2);
        }

        a(C1802k c1802k) {
            this.f48904a = c1802k;
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, int i2, String str2, Object obj) {
            long millis;
            boolean z2 = false;
            boolean z3 = i2 < 200 || i2 >= 500;
            boolean z4 = i2 == 429;
            boolean z5 = i2 != -1009 || l6.this.f48898g.q();
            boolean z6 = (i2 == -900 || i2 == -1000) ? false : true;
            if (z5 && z6 && (z3 || z4 || l6.this.f48898g.p())) {
                String strA = l6.this.f48898g.a();
                if (l6.this.f48898g.j() <= 0) {
                    if (strA != null && strA.equals(l6.this.f48898g.f())) {
                        l6 l6Var = l6.this;
                        l6Var.a(l6Var.f48902k);
                    } else {
                        l6 l6Var2 = l6.this;
                        l6Var2.a(l6Var2.f48901j);
                    }
                    l6 l6Var3 = l6.this;
                    l6Var3.a(l6Var3.f48898g.f(), i2, str2, obj);
                    return;
                }
                C1804o c1804o = l6.this.f48735c;
                if (C1804o.a()) {
                    l6 l6Var4 = l6.this;
                    l6Var4.f48735c.k(l6Var4.f48734b, "Unable to send request due to server failure (code " + i2 + "). " + l6.this.f48898g.j() + " attempts left, retrying in " + TimeUnit.MILLISECONDS.toSeconds(l6.this.f48898g.k()) + USEaHtCMH.VjmbsVLXPCd);
                }
                int iJ = l6.this.f48898g.j() - 1;
                l6.this.f48898g.a(iJ);
                if (iJ == 0) {
                    l6 l6Var5 = l6.this;
                    l6Var5.a(l6Var5.f48901j);
                    if (StringUtils.isValidString(strA) && strA.length() >= 4) {
                        C1804o c1804o2 = l6.this.f48735c;
                        if (C1804o.a()) {
                            l6 l6Var6 = l6.this;
                            l6Var6.f48735c.d(l6Var6.f48734b, "Switching to backup endpoint " + strA);
                        }
                        l6.this.f48898g.a(strA);
                        z2 = true;
                    }
                }
                if (((Boolean) this.f48904a.a(x4.g3)).booleanValue() && z2) {
                    millis = 0;
                } else {
                    millis = l6.this.f48898g.n() ? TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, l6.this.f48898g.c())) : l6.this.f48898g.k();
                }
                d6 d6VarQ0 = this.f48904a.q0();
                l6 l6Var7 = l6.this;
                d6VarQ0.a(l6Var7, l6Var7.f48900i, millis);
                return;
            }
            l6 l6Var8 = l6.this;
            l6Var8.a(l6Var8.f48898g.f(), i2, str2, obj);
        }
    }

    public l6(com.applovin.impl.sdk.network.a aVar, C1802k c1802k) {
        this(aVar, c1802k, false);
    }

    public abstract void a(String str, int i2, String str2, Object obj);

    public abstract void a(String str, Object obj, int i2);

    public l6(com.applovin.impl.sdk.network.a aVar, C1802k c1802k, boolean z2) {
        super("TaskRepeatRequest", c1802k, z2);
        this.f48900i = d6.b.OTHER;
        if (aVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        a(aVar.f());
        this.f48898g = aVar;
        this.f48903l = new q0.b();
        this.f48899h = new a(c1802k);
    }

    public void b(x4 x4Var) {
        this.f48902k = x4Var;
    }

    public void c(x4 x4Var) {
        this.f48901j = x4Var;
    }

    public void a(d6.b bVar) {
        this.f48900i = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        q0 q0VarW = b().w();
        if (!b().E0() && !b().B0()) {
            C1804o.h("AppLovinSdk", "AppLovin SDK is disabled");
            a(this.f48898g.f(), -22, null, null);
            return;
        }
        if (StringUtils.isValidString(this.f48898g.f()) && this.f48898g.f().length() >= 4) {
            if (TextUtils.isEmpty(this.f48898g.h())) {
                if (this.f48898g.b() != null) {
                    str = "POST";
                } else {
                    str = "GET";
                }
                this.f48898g.b(str);
            }
            q0VarW.a(this.f48898g, this.f48903l, this.f48899h);
            return;
        }
        if (C1804o.a()) {
            this.f48735c.b(this.f48734b, "Task has an invalid or null request endpoint.");
        }
        a(this.f48898g.f(), AppLovinErrorCodes.INVALID_URL, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(x4 x4Var) {
        if (x4Var != null) {
            b().o0().a(x4Var, x4Var.a());
        }
    }
}
