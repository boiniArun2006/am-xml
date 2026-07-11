package androidx.loader.content;

import android.database.Cursor;
import android.net.Uri;
import androidx.core.content.ContentResolverCompat;
import androidx.core.os.CancellationSignal;
import androidx.core.os.OperationCanceledException;
import androidx.loader.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class CursorLoader extends AsyncTaskLoader<Cursor> {
    private String J2;
    private CancellationSignal KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private String[] f39099O;
    private Cursor Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Loader.ForceLoadContentObserver f39100n;
    private String nr;
    private Uri rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String[] f39101t;

    @Override // androidx.loader.content.AsyncTaskLoader
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Cursor loadInBackground() {
        synchronized (this) {
            if (isLoadInBackgroundCanceled()) {
                throw new OperationCanceledException();
            }
            this.KN = new CancellationSignal();
        }
        try {
            Cursor cursorRl = ContentResolverCompat.rl(getContext().getContentResolver(), this.rl, this.f39101t, this.nr, this.f39099O, this.J2, this.KN);
            if (cursorRl != null) {
                try {
                    cursorRl.getCount();
                    cursorRl.registerContentObserver(this.f39100n);
                } catch (RuntimeException e2) {
                    cursorRl.close();
                    throw e2;
                }
            }
            synchronized (this) {
                this.KN = null;
            }
            return cursorRl;
        } catch (Throwable th) {
            synchronized (this) {
                this.KN = null;
                throw th;
            }
        }
    }

    @Override // androidx.loader.content.Loader
    protected void onStartLoading() {
        Cursor cursor = this.Uo;
        if (cursor != null) {
            deliverResult(cursor);
        }
        if (takeContentChanged() || this.Uo == null) {
            forceLoad();
        }
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void onCanceled(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public void cancelLoadInBackground() {
        super.cancelLoadInBackground();
        synchronized (this) {
            try {
                CancellationSignal cancellationSignal = this.KN;
                if (cancellationSignal != null) {
                    cancellationSignal.n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.loader.content.AsyncTaskLoader, androidx.loader.content.Loader
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.rl);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f39101t));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.nr);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f39099O));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.J2);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.Uo);
    }

    @Override // androidx.loader.content.Loader
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void deliverResult(Cursor cursor) {
        if (isReset()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.Uo;
        this.Uo = cursor;
        if (isStarted()) {
            super.deliverResult(cursor);
        }
        if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
            cursor2.close();
        }
    }

    @Override // androidx.loader.content.Loader
    protected void onReset() {
        super.onReset();
        onStopLoading();
        Cursor cursor = this.Uo;
        if (cursor != null && !cursor.isClosed()) {
            this.Uo.close();
        }
        this.Uo = null;
    }

    @Override // androidx.loader.content.Loader
    protected void onStopLoading() {
        cancelLoad();
    }
}
