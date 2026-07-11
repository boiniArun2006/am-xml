package Tv6;

import com.google.android.gms.ads.LoadAdError;
import dI8.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Ml {
    public static final dI8.n n(LoadAdError loadAdError) {
        Intrinsics.checkNotNullParameter(loadAdError, "<this>");
        int code = loadAdError.getCode();
        return new n.w6("AdMob: " + (code != 0 ? code != 1 ? code != 2 ? code != 3 ? code != 8 ? code != 9 ? code != 15 ? w6.f10597g : w6.f10594S : w6.f10595Z : w6.f10598o : w6.f10599r : w6.J2 : w6.f10593O : w6.f10600t).rl(), loadAdError.getMessage() + "\nDomain: " + loadAdError.getDomain() + " (code: " + loadAdError.getCode() + ")");
    }
}
