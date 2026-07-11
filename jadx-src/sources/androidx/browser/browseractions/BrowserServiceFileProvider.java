package androidx.browser.browseractions;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.content.FileProvider;
import androidx.core.util.AtomicFile;
import com.google.common.util.concurrent.Xo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RestrictTo
@Deprecated
public final class BrowserServiceFileProvider extends FileProvider {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    static Object f14518S = new Object();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    private static class FileCleanupTask extends AsyncTask<Void, Void, Void> {
        private static final long nr;
        private static final long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final long f14522t;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Context f14523n;

        static {
            TimeUnit timeUnit = TimeUnit.DAYS;
            rl = timeUnit.toMillis(7L);
            f14522t = timeUnit.toMillis(7L);
            nr = timeUnit.toMillis(1L);
        }

        private static boolean t(SharedPreferences sharedPreferences) {
            return System.currentTimeMillis() > sharedPreferences.getLong("last_cleanup_time", System.currentTimeMillis()) + f14522t;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            SharedPreferences sharedPreferences = this.f14523n.getSharedPreferences(this.f14523n.getPackageName() + ".image_provider", 0);
            if (!t(sharedPreferences)) {
                return null;
            }
            synchronized (BrowserServiceFileProvider.f14518S) {
                try {
                    File file = new File(this.f14523n.getFilesDir(), "image_provider");
                    if (!file.exists()) {
                        return null;
                    }
                    File[] fileArrListFiles = file.listFiles();
                    long jCurrentTimeMillis = System.currentTimeMillis() - rl;
                    boolean z2 = true;
                    for (File file2 : fileArrListFiles) {
                        if (rl(file2) && file2.lastModified() < jCurrentTimeMillis && !file2.delete()) {
                            Log.e("BrowserServiceFP", "Fail to delete image: " + file2.getAbsoluteFile());
                            z2 = false;
                        }
                    }
                    long jCurrentTimeMillis2 = z2 ? System.currentTimeMillis() : (System.currentTimeMillis() - f14522t) + nr;
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putLong("last_cleanup_time", jCurrentTimeMillis2);
                    editorEdit.apply();
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        FileCleanupTask(Context context) {
            this.f14523n = context.getApplicationContext();
        }

        private static boolean rl(File file) {
            return file.getName().endsWith("..png");
        }
    }

    private static class FileSaveTask extends AsyncTask<String, Void, Void> {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final ResolvableFuture f14524O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Context f14525n;
        private final Uri nr;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Bitmap f14526t;

        private void nr() {
            File file = new File(this.f14525n.getFilesDir(), "image_provider");
            synchronized (BrowserServiceFileProvider.f14518S) {
                try {
                    if (!file.exists() && !file.mkdir()) {
                        this.f14524O.Ik(new IOException("Could not create file directory."));
                        return;
                    }
                    File file2 = new File(file, this.rl + ".png");
                    if (file2.exists()) {
                        this.f14524O.ck(this.nr);
                    } else {
                        t(file2);
                    }
                    file2.setLastModified(System.currentTimeMillis());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private void t(File file) {
            FileOutputStream fileOutputStreamNr;
            AtomicFile atomicFile = new AtomicFile(file);
            try {
                fileOutputStreamNr = atomicFile.nr();
            } catch (IOException e2) {
                e = e2;
                fileOutputStreamNr = null;
            }
            try {
                this.f14526t.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStreamNr);
                fileOutputStreamNr.close();
                atomicFile.rl(fileOutputStreamNr);
                this.f14524O.ck(this.nr);
            } catch (IOException e3) {
                e = e3;
                atomicFile.n(fileOutputStreamNr);
                this.f14524O.Ik(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r3) {
            new FileCleanupTask(this.f14525n).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            nr();
            return null;
        }
    }

    public static Xo qie(final ContentResolver contentResolver, final Uri uri) {
        final ResolvableFuture resolvableFutureZ = ResolvableFuture.Z();
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: androidx.browser.browseractions.BrowserServiceFileProvider.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        resolvableFutureZ.Ik(new FileNotFoundException());
                        return;
                    }
                    Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    parcelFileDescriptorOpenFileDescriptor.close();
                    if (bitmapDecodeFileDescriptor == null) {
                        resolvableFutureZ.Ik(new IOException("File could not be decoded."));
                    } else {
                        resolvableFutureZ.ck(bitmapDecodeFileDescriptor);
                    }
                } catch (IOException e2) {
                    resolvableFutureZ.Ik(e2);
                }
            }
        });
        return resolvableFutureZ;
    }
}
