package Tv6;

import Tv6.j;
import com.google.android.gms.ads.AdError;
import dI8.Ml;
import dI8.w6;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class n {
    public static final j n(AdError adError) {
        Object next;
        Intrinsics.checkNotNullParameter(adError, "<this>");
        Iterator<E> it = j.EnumC0375j.t().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((j.EnumC0375j) next).rl() == adError.getCode()) {
                break;
            }
        }
        j.EnumC0375j enumC0375j = (j.EnumC0375j) next;
        if (enumC0375j == null) {
            enumC0375j = j.EnumC0375j.f10587Z;
        }
        String message = adError.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "getMessage(...)");
        int code = adError.getCode();
        String domain = adError.getDomain();
        Intrinsics.checkNotNullExpressionValue(domain, "getDomain(...)");
        return new j(enumC0375j, message, code, domain);
    }

    public static final dI8.w6 rl(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return new w6.C0838w6("AdMob: " + jVar.t().nr(), "\n" + jVar.getMessage() + "\nDomain: " + jVar.rl() + " (code: " + jVar.n() + ")");
    }

    public static final dI8.Ml t(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return new Ml.w6("AdMob: " + jVar.t().nr(), "\n" + jVar.getMessage() + "\nDomain: " + jVar.rl() + " (code: " + jVar.n() + ")");
    }
}
