package com.fyber.inneractive.sdk.click;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.network.f0;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class m implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f53241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f53242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f53243c;

    public m(r rVar, String str, String str2) {
        this.f53243c = rVar;
        this.f53241a = str;
        this.f53242b = str2;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z2) {
        c cVar = (c) obj;
        if (this.f53243c.f53251f) {
            return;
        }
        if (exc != null) {
            r.a(this.f53243c, null, this.f53241a, this.f53242b, exc);
            return;
        }
        if (cVar != null) {
            String str = this.f53241a;
            if (cVar.f53219a.size() > 1) {
                ArrayList arrayList = cVar.f53219a;
                str = (String) arrayList.get(arrayList.size() - 1);
            }
            b bVarA = this.f53243c.a(str);
            if ((bVarA == null || bVarA.f53213a == q.FAILED) && !TextUtils.isEmpty(cVar.f53220b)) {
                r rVar = this.f53243c;
                rVar.getClass();
                for (String str2 : cVar.f53219a) {
                    if (!TextUtils.equals(str2, str)) {
                        rVar.f53252g.add(new j(str2, true, q.INTERNAL_REDIRECT, null));
                    }
                }
                r.a(this.f53243c, cVar.f53220b, str, this.f53242b, null);
                return;
            }
            r rVar2 = this.f53243c;
            rVar2.getClass();
            for (String str3 : cVar.f53219a) {
                if (!TextUtils.equals(str3, str)) {
                    rVar2.f53252g.add(new j(str3, false, q.INTERNAL_REDIRECT, null));
                }
            }
            if (this.f53243c.f53252g.size() == 0) {
                this.f53243c.f53252g.add(new j(str, false, q.INTERNAL_REDIRECT, null));
            }
            this.f53243c.a(r.a(str, "followRedirects", "Invalid response"));
        }
    }
}
