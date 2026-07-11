package oW;

import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzahj;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import java.security.MessageDigest;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class iF implements Continuation {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ String f71500n;
    private final /* synthetic */ IntegrityManager rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ s4 f71501t;

    iF(s4 s4Var, String str, IntegrityManager integrityManager) {
        this.f71500n = str;
        this.rl = integrityManager;
        this.f71501t = s4Var;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (!task.isSuccessful()) {
            Log.e(s4.rl, "Problem retrieving Play Integrity producer project:  " + task.getException().getMessage());
            return Tasks.forException(task.getException());
        }
        this.f71501t.f71517n = ((zzahj) task.getResult()).zza();
        return this.rl.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(((zzahj) task.getResult()).zza())).setNonce(new String(Base64.encode(MessageDigest.getInstance("SHA-256").digest(this.f71500n.getBytes(com.google.android.exoplayer2.C.UTF8_NAME)), 11))).build());
    }
}
