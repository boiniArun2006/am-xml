package X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import r53.qz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class w6 implements qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f11722n;

    public w6(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f11722n = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String t(w6 w6Var, Uri uri) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = w6Var.f11722n.getContentResolver().openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor == null) {
            return "";
        }
        try {
            FileInputStream fileInputStreamCreateInputStream = assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
            try {
                Intrinsics.checkNotNull(fileInputStreamCreateInputStream);
                String text = TextStreamsKt.readText(new InputStreamReader(fileInputStreamCreateInputStream, Charsets.UTF_8));
                CloseableKt.closeFinally(fileInputStreamCreateInputStream, null);
                CloseableKt.closeFinally(assetFileDescriptorOpenAssetFileDescriptor, null);
                return text == null ? "" : text;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(assetFileDescriptorOpenAssetFileDescriptor, th);
                throw th2;
            }
        }
    }

    @Override // r53.qz
    public x0X.n n(final Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return x0X.w6.n(new Function0() { // from class: X.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w6.t(this.f11720n, uri);
            }
        });
    }
}
