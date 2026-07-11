package com.applovin.impl;

import android.content.Context;
import android.util.Log;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.iab.omid.library.applovin.Omid;
import com.iab.omid.library.applovin.ScriptInjector;
import com.iab.omid.library.applovin.adsession.Partner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f48775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f48776b = C1802k.o();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f48777c;

    public String a() {
        return this.f48777c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        if (this.f48777c != null) {
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f48776b.getResources().openRawResource(R.raw.omsdk_v1_5_3)));
            try {
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            this.f48777c = sb.toString();
                            bufferedReader.close();
                            return;
                        }
                        sb.append(line);
                    }
                } catch (IOException e2) {
                    Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e2);
                }
            } catch (Throwable th) {
                try {
                    Log.e("OpenMeasurementService", "Failed to load JavaScript Open Measurement SDK", th);
                    bufferedReader.close();
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e3) {
                        Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e3);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            this.f48775a.O();
            if (C1804o.a()) {
                this.f48775a.O().a("OpenMeasurementService", "Failed to retrieve resource omsdk_v1_5_3.js", th3);
            }
        }
    }

    private void h() {
        this.f48775a.q0().a((AbstractRunnableC1782i5) new C1797r6(this.f48775a, "OpenMeasurementService", new Runnable() { // from class: com.applovin.impl.g9
            @Override // java.lang.Runnable
            public final void run() {
                this.f48619n.f();
            }
        }), d6.b.OTHER);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String a(String str, Map map) {
        String strInjectScriptContentIntoHtml;
        try {
            if (e()) {
                String strA = k4.a(this.f48775a, map);
                strInjectScriptContentIntoHtml = StringUtils.isValidString(strA) ? ScriptInjector.injectScriptContentIntoHtml(strA, str) : str;
            }
            return ScriptInjector.injectScriptContentIntoHtml(this.f48777c, strInjectScriptContentIntoHtml);
        } catch (Throwable th) {
            this.f48775a.O();
            if (C1804o.a()) {
                this.f48775a.O().a("OpenMeasurementService", "Failed to inject JavaScript SDK into HTML", th);
            }
            return str;
        }
    }

    public Partner b() {
        return Partner.createPartner((String) this.f48775a.a(x4.b0), AppLovinSdk.VERSION);
    }

    public boolean e() {
        String str = this.f48775a.n0().getExtraParameters().get("enable_omsdk_testing");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return false;
    }

    public void i() {
        if (((Boolean) this.f48775a.a(x4.a0)).booleanValue()) {
            this.f48775a.O();
            if (C1804o.a()) {
                this.f48775a.O().a("OpenMeasurementService", "Initializing Open Measurement SDK v" + c() + "...");
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.cA
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48210n.g();
                }
            });
        }
    }

    public j4(C1802k c1802k) {
        this.f48775a = c1802k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Omid.activate(this.f48776b);
        this.f48775a.O();
        if (C1804o.a()) {
            C1804o c1804oO = this.f48775a.O();
            StringBuilder sb = new StringBuilder();
            sb.append("Init ");
            if (d()) {
                str = "succeeded";
            } else {
                str = "failed";
            }
            sb.append(str);
            sb.append(" and took ");
            sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sb.append("ms");
            c1804oO.a("OpenMeasurementService", sb.toString());
        }
        h();
    }

    public String c() {
        return Omid.getVersion();
    }

    public boolean d() {
        return Omid.isActive();
    }
}
