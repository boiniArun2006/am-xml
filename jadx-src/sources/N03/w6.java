package N03;

import java.util.Iterator;
import java.util.Set;
import uOq.z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class w6 implements Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f6935n;
    private final Ml rl;

    public static /* synthetic */ Dsr n(uOq.Ml ml) {
        return new w6(ml.nr(Wre.class), Ml.n());
    }

    public static uOq.w6 rl() {
        return uOq.w6.t(Dsr.class).rl(z.ty(Wre.class)).J2(new uOq.CN3() { // from class: N03.n
            @Override // uOq.CN3
            public final Object n(uOq.Ml ml) {
                return w6.n(ml);
            }
        }).nr();
    }

    private static String t(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Wre wre = (Wre) it.next();
            sb.append(wre.rl());
            sb.append('/');
            sb.append(wre.t());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // N03.Dsr
    public String getUserAgent() {
        if (this.rl.rl().isEmpty()) {
            return this.f6935n;
        }
        return this.f6935n + ' ' + t(this.rl.rl());
    }

    w6(Set set, Ml ml) {
        this.f6935n = t(set);
        this.rl = ml;
    }
}
