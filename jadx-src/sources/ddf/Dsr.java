package ddf;

import com.facebook.soloader.Q;
import com.facebook.soloader.afx;
import com.facebook.soloader.ci;
import com.facebook.soloader.qz;
import com.facebook.soloader.r;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class Dsr implements Wre {
    @Override // ddf.Wre
    public boolean n(UnsatisfiedLinkError unsatisfiedLinkError, ci[] ciVarArr) {
        if (!(unsatisfiedLinkError instanceof r) || (unsatisfiedLinkError instanceof Q)) {
            return false;
        }
        String strN = ((r) unsatisfiedLinkError).n();
        StringBuilder sb = new StringBuilder();
        sb.append("Reunpacking NonApk UnpackingSoSources due to ");
        sb.append(unsatisfiedLinkError);
        sb.append(strN == null ? "" : ", retrying for specific library " + strN);
        qz.rl("SoLoader", sb.toString());
        for (ci ciVar : ciVarArr) {
            if (ciVar instanceof afx) {
                afx afxVar = (afx) ciVar;
                if (afxVar instanceof com.facebook.soloader.w6) {
                    continue;
                } else {
                    try {
                        qz.rl("SoLoader", "Runpacking " + afxVar.t());
                        afxVar.ck();
                    } catch (Exception e2) {
                        qz.t("SoLoader", "Encountered an exception while reunpacking " + afxVar.t() + " for library " + strN + ": ", e2);
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
