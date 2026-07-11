package ddf;

import com.facebook.soloader.Q;
import com.facebook.soloader.ci;
import com.facebook.soloader.qz;
import com.facebook.soloader.r;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class fuX implements Wre {
    @Override // ddf.Wre
    public boolean n(UnsatisfiedLinkError unsatisfiedLinkError, ci[] ciVarArr) {
        r rVar;
        String message;
        if (!(unsatisfiedLinkError instanceof r) || (unsatisfiedLinkError instanceof Q) || (message = (rVar = (r) unsatisfiedLinkError).getMessage()) == null || (!message.contains("/app/") && !message.contains("/mnt/"))) {
            return false;
        }
        String strN = rVar.n();
        StringBuilder sb = new StringBuilder();
        sb.append("Reunpacking BackupSoSources due to ");
        sb.append(unsatisfiedLinkError);
        sb.append(strN == null ? "" : ", retrying for specific library " + strN);
        qz.rl("SoLoader", sb.toString());
        for (ci ciVar : ciVarArr) {
            if (ciVar instanceof com.facebook.soloader.w6) {
                com.facebook.soloader.w6 w6Var = (com.facebook.soloader.w6) ciVar;
                try {
                    qz.rl("SoLoader", "Runpacking BackupSoSource " + w6Var.t());
                    w6Var.ck();
                } catch (Exception e2) {
                    qz.t("SoLoader", "Encountered an exception while reunpacking BackupSoSource " + w6Var.t() + " for library " + strN + ": ", e2);
                    return false;
                }
            }
        }
        return true;
    }
}
