package N03;

import android.content.Context;
import uOq.z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class fuX {

    public interface j {
        String n(Object obj);
    }

    public static uOq.w6 t(final String str, final j jVar) {
        return uOq.w6.az(Wre.class).rl(z.mUb(Context.class)).J2(new uOq.CN3() { // from class: N03.CN3
            @Override // uOq.CN3
            public final Object n(uOq.Ml ml) {
                return Wre.n(str, jVar.n((Context) ml.n(Context.class)));
            }
        }).nr();
    }

    public static uOq.w6 rl(String str, String str2) {
        return uOq.w6.qie(Wre.n(str, str2), Wre.class);
    }
}
