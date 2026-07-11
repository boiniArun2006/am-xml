package androidx.webkit;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import androidx.webkit.internal.WebViewGlueCommunicator;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class DropDataContentProvider extends ContentProvider {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    DropDataContentProviderBoundaryInterface f42478n;

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    private DropDataContentProviderBoundaryInterface n() {
        if (this.f42478n == null) {
            DropDataContentProviderBoundaryInterface dropDataProvider = WebViewGlueCommunicator.nr().getDropDataProvider();
            this.f42478n = dropDataProvider;
            dropDataProvider.onCreate();
        }
        return this.f42478n;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("delete method is not supported.");
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Insert method is not supported.");
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("update method is not supported.");
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        return n().call(str, str2, bundle);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return n().getType(uri);
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return n().openFile(this, uri);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return n().query(uri, strArr, str, strArr2, str2);
    }
}
