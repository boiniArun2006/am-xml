package androidx.browser.trusted;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class TrustedWebActivityServiceConnectionPool {

    static class BindToServiceAsyncTask extends AsyncTask<Void, Void, Exception> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Context f14628n;
        private final Intent rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final ConnectionHolder f14629t;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Exception doInBackground(Void... voidArr) {
            try {
                if (this.f14628n.bindService(this.rl, this.f14629t, 4097)) {
                    return null;
                }
                this.f14628n.unbindService(this.f14629t);
                return new IllegalStateException("Could not bind to the service");
            } catch (SecurityException e2) {
                Log.w("TWAConnectionPool", "SecurityException while binding.", e2);
                return e2;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Exception exc) {
            if (exc != null) {
                this.f14629t.nr(exc);
            }
        }
    }
}
