package com.fyber.inneractive.sdk.flow.storepromo.loader;

import com.fyber.inneractive.sdk.util.r;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f53849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f53850b;

    public e(f fVar, d dVar) {
        this.f53850b = fVar;
        this.f53849a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.flow.storepromo.model.c cVar;
        boolean z2;
        boolean z3 = true;
        f fVar = this.f53850b;
        if (fVar.f53856f == null || (cVar = fVar.f53852b) == null) {
            return;
        }
        d dVar = this.f53849a;
        StringBuilder sb = new StringBuilder("\n<script>\n");
        ArrayList<com.fyber.inneractive.sdk.flow.storepromo.model.a> arrayList = cVar.f53899a;
        StringBuilder sb2 = new StringBuilder();
        boolean z4 = false;
        int i2 = 0;
        int i3 = 0;
        for (com.fyber.inneractive.sdk.flow.storepromo.model.a aVar : arrayList) {
            int i5 = h.f53866a[aVar.f53896a.ordinal()];
            if (i5 != z3) {
                z2 = z3;
                if (i5 == 2) {
                    i3++;
                    String str = i.f53867a;
                    String str2 = String.format("app_video_url_%d", Integer.valueOf(i3));
                    sb2.append("var " + str2 + "_el = document.createElement('video');\n" + str2 + "_el.id = '" + str2 + "';\ndocument.getElementById('carousel').appendChild(" + str2 + "_el);\n");
                    sb2.append(String.format(i.f53869c, Integer.valueOf(i3), aVar.f53897b));
                    sb2.append(String.format(i.f53870d, Integer.valueOf(i3), Integer.valueOf(i3)));
                } else if (i5 == 3) {
                    sb2.append(String.format(i.f53871e, aVar.f53897b));
                    sb2.append(i.f53872f);
                } else if (i5 == 4) {
                    sb2.append(String.format(i.f53883q, aVar.f53897b));
                    sb2.append(i.f53884r);
                }
            } else {
                z2 = z3;
                i2++;
                String str3 = i.f53867a;
                String str4 = String.format("app_screen_%d", Integer.valueOf(i2));
                sb2.append("var " + str4 + "_el = document.createElement('img');\n" + str4 + "_el.id = '" + str4 + "';\ndocument.getElementById('carousel').appendChild(" + str4 + "_el);\n");
                sb2.append(String.format(i.f53867a, Integer.valueOf(i2), aVar.f53897b));
                sb2.append(String.format(i.f53868b, Integer.valueOf(i2), Integer.valueOf(i2)));
            }
            z3 = z2;
        }
        boolean z5 = z3;
        sb.append(sb2.toString());
        sb.append(String.format(i.f53873g, cVar.f53900b.replace("`", "\\`")) + i.f53874h + String.format(i.f53875i, cVar.f53904f.replace("`", "\\`")) + i.f53876j + String.format(i.f53877k, cVar.f53905g.f53909b.replace("`", "\\`")) + i.f53878l + String.format(i.f53881o, cVar.f53905g.f53908a.replace("`", "\\`")) + i.f53882p + String.format(i.f53879m, cVar.f53905g.f53910c.replace("`", "\\`")) + i.f53880n);
        StringBuilder sb3 = new StringBuilder();
        boolean z6 = Boolean.parseBoolean(cVar.f53902d);
        boolean z7 = Boolean.parseBoolean(cVar.f53903e);
        sb3.append(i.a(z6, "in_app_purchases"));
        sb3.append(i.a(z7, "app_contains_ads"));
        if (z7 && z6) {
            z4 = z5;
        }
        sb3.append(i.a(z4, "app_subtitle_separator"));
        sb.append(sb3.toString());
        sb.append("</script>");
        String str5 = cVar.f53901c + sb.toString();
        dVar.getClass();
        r.f57026b.post(new c(dVar, str5));
    }
}
