package com.fyber.inneractive.sdk.click;

import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.f0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class e implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f53222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f53223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f53224c;

    public e(g gVar, List list, Uri uri) {
        this.f53224c = gVar;
        this.f53222a = list;
        this.f53223b = uri;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z2) {
        c cVar = (c) obj;
        if (this.f53224c.f53230f) {
            return;
        }
        if (exc != null || cVar == null) {
            String string = this.f53223b.toString();
            IAConfigManager iAConfigManager = IAConfigManager.f53260M;
            com.fyber.inneractive.sdk.util.r.f57026b.post(new com.fyber.inneractive.sdk.config.f0(string, null));
            Uri uri = this.f53223b;
            this.f53224c.getClass();
            b bVarA = r.a(uri.toString(), "IgniteGooglePlay", "failed getting redirects");
            List list = this.f53222a;
            if (list != null) {
                list.add(new j(this.f53223b.toString(), false, q.INTERNAL_REDIRECT, "failed getting redirects. ignite click handler"));
                List list2 = this.f53222a;
                bVarA.f53218f.clear();
                bVarA.f53218f.addAll(list2);
            }
            g gVar = this.f53224c;
            f fVar = gVar.f53227c;
            if (fVar != null) {
                fVar.a(bVarA, gVar.f53228d, gVar.f53229e);
                return;
            }
            return;
        }
        if (cVar.f53219a.size() > 0) {
            ArrayList arrayList = cVar.f53219a;
            String str = (String) arrayList.get(arrayList.size() - 1);
            if (this.f53222a != null) {
                for (String str2 : cVar.f53219a) {
                    if (!TextUtils.equals(str2, str)) {
                        this.f53222a.add(new j(str2, true, q.INTERNAL_REDIRECT, null));
                    }
                }
                List list3 = this.f53222a;
                q qVar = q.OPEN_INTERNAL_STORE;
                list3.add(new j(str, true, qVar, null));
                this.f53224c.getClass();
                b bVar = new b(str, qVar, "IgniteGooglePlay", null);
                List list4 = this.f53222a;
                bVar.f53218f.clear();
                bVar.f53218f.addAll(list4);
                g gVar2 = this.f53224c;
                f fVar2 = gVar2.f53227c;
                if (fVar2 != null) {
                    fVar2.a(bVar, gVar2.f53228d, gVar2.f53229e);
                }
            }
            if (str.startsWith("market")) {
                String strReplace = str.replace("market://details?id=", "https://play.google.com/store/apps/details?id=");
                IAConfigManager iAConfigManager2 = IAConfigManager.f53260M;
                com.fyber.inneractive.sdk.util.r.f57026b.post(new com.fyber.inneractive.sdk.config.f0(strReplace, null));
            } else {
                String str3 = cVar.f53220b;
                IAConfigManager iAConfigManager3 = IAConfigManager.f53260M;
                com.fyber.inneractive.sdk.util.r.f57026b.post(new com.fyber.inneractive.sdk.config.f0(str, str3));
            }
        }
    }
}
