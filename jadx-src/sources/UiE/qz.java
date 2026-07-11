package UiE;

import android.os.AsyncTask;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class qz extends AsyncTask {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f10819n;
    private final File rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final j f10820t;

    public interface j {
        void n(File file);
    }

    public qz(String uriStr, File destFile, j onSuccess) {
        Intrinsics.checkNotNullParameter(uriStr, "uriStr");
        Intrinsics.checkNotNullParameter(destFile, "destFile");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        this.f10819n = uriStr;
        this.rl = destFile;
        this.f10820t = onSuccess;
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            return n((String[]) objArr);
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    public Boolean n(String... args) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(args, "args");
            try {
                URL url = new URL(this.f10819n);
                int contentLength = ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection())).getContentLength();
                DataInputStream dataInputStream = new DataInputStream(FirebasePerfUrlConnection.openStream(url));
                byte[] bArr = new byte[contentLength];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.rl));
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            rl(((Boolean) obj).booleanValue());
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    protected void rl(boolean z2) {
        if (!VmF.j.nr(this) && z2) {
            try {
                this.f10820t.n(this.rl);
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }
}
