package ddf;

import com.facebook.soloader.ci;
import com.facebook.soloader.qz;
import com.facebook.soloader.r;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class aC implements Wre {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ddf.Wre
    public boolean n(UnsatisfiedLinkError unsatisfiedLinkError, ci[] ciVarArr) {
        String strN = unsatisfiedLinkError instanceof r ? ((r) unsatisfiedLinkError).n() : null;
        StringBuilder sb = new StringBuilder();
        sb.append("Waiting on SoSources due to ");
        sb.append(unsatisfiedLinkError);
        sb.append(strN == null ? "" : ", retrying for specific library " + strN);
        qz.rl("SoLoader", sb.toString());
        for (com.facebook.soloader.w6 w6Var : ciVarArr) {
            if (w6Var instanceof com.facebook.soloader.n) {
                qz.rl("SoLoader", "Waiting on SoSource " + w6Var.t());
                w6Var.n();
            }
        }
        return true;
    }
}
