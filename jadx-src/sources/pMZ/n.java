package pMZ;

import DMw.aC;
import QNA.Z;
import QNA.h;
import android.content.Context;
import androidx.browser.trusted.sharing.KcI.qUrazMnwDskFs;
import bF.CN3;
import bF.Dsr;
import com.google.android.exoplayer2.C;
import com.google.android.gms.tasks.Task;
import java.nio.charset.Charset;
import tq6.DAz;
import veW.s4;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final I28 f71896n;
    private final CN3 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final aC f71895t = new aC();
    private static final String nr = nr("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final String f71894O = nr("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    private static final CN3 J2 = new CN3() { // from class: pMZ.j
        @Override // bF.CN3
        public final Object apply(Object obj) {
            return n.f71895t.v((DAz) obj).getBytes(Charset.forName(C.UTF8_NAME));
        }
    };

    public Task t(Z z2, boolean z3) {
        return this.f71896n.xMQ(z2, z3).getTask();
    }

    n(I28 i28, CN3 cn3) {
        this.f71896n = i28;
        this.rl = cn3;
    }

    private static String nr(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str.length() + str2.length());
            for (int i2 = 0; i2 < str.length(); i2++) {
                sb.append(str.charAt(i2));
                if (str2.length() > i2) {
                    sb.append(str2.charAt(i2));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    public static n rl(Context context, F5.aC aCVar, h hVar) {
        s4.J2(context);
        Dsr dsrUo = s4.t().Uo(new com.google.android.datatransport.cct.j(nr, f71894O));
        bF.n nVarRl = bF.n.rl("json");
        CN3 cn3 = J2;
        return new n(new I28(dsrUo.n(qUrazMnwDskFs.IJKDEujldm, DAz.class, nVarRl, cn3), aCVar.rl(), hVar), cn3);
    }
}
