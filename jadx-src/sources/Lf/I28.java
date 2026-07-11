package Lf;

import Be4.P;
import Lf.Dsr;
import Z.w6;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.applovin.sdk.AppLovinEventTypes;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okio.Okio;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class I28 implements Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Uri f6167n;
    private final FjR.C rl;

    public static final class j implements Dsr.j {
        private final boolean t(Uri uri) {
            return Intrinsics.areEqual(uri.getScheme(), AppLovinEventTypes.USER_VIEWED_CONTENT);
        }

        @Override // Lf.Dsr.j
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Dsr n(Uri uri, FjR.C c2, eQ.fuX fux) {
            if (!t(uri)) {
                return null;
            }
            return new I28(uri, c2);
        }
    }

    private final Bundle nr() {
        Z.w6 w6VarNr = this.rl.HI().nr();
        w6.j jVar = w6VarNr instanceof w6.j ? (w6.j) w6VarNr : null;
        if (jVar == null) {
            return null;
        }
        int i2 = jVar.f12273n;
        Z.w6 w6VarT = this.rl.HI().t();
        w6.j jVar2 = w6VarT instanceof w6.j ? (w6.j) w6VarT : null;
        if (jVar2 == null) {
            return null;
        }
        int i3 = jVar2.f12273n;
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("android.content.extra.SIZE", new Point(i2, i3));
        return bundle;
    }

    @Override // Lf.Dsr
    public Object n(Continuation continuation) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream;
        ContentResolver contentResolver = this.rl.Uo().getContentResolver();
        if (rl(this.f6167n)) {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.f6167n, "r");
            inputStreamOpenInputStream = assetFileDescriptorOpenAssetFileDescriptor != null ? assetFileDescriptorOpenAssetFileDescriptor.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + this.f6167n + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT < 29 || !t(this.f6167n)) {
            inputStreamOpenInputStream = contentResolver.openInputStream(this.f6167n);
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to open '" + this.f6167n + "'.").toString());
            }
        } else {
            AssetFileDescriptor assetFileDescriptorOpenTypedAssetFile = contentResolver.openTypedAssetFile(this.f6167n, "image/*", nr(), null);
            inputStreamOpenInputStream = assetFileDescriptorOpenTypedAssetFile != null ? assetFileDescriptorOpenTypedAssetFile.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + this.f6167n + "'.").toString());
            }
        }
        return new qz(P.J2(Okio.buffer(Okio.source(inputStreamOpenInputStream)), this.rl.Uo(), new Be4.Wre(this.f6167n)), contentResolver.getType(this.f6167n), Be4.CN3.f516O);
    }

    public I28(Uri uri, FjR.C c2) {
        this.f6167n = uri;
        this.rl = c2;
    }

    public final boolean rl(Uri uri) {
        if (Intrinsics.areEqual(uri.getAuthority(), "com.android.contacts") && Intrinsics.areEqual(uri.getLastPathSegment(), "display_photo")) {
            return true;
        }
        return false;
    }

    public final boolean t(Uri uri) {
        List<String> pathSegments;
        int size;
        if (!Intrinsics.areEqual(uri.getAuthority(), "media") || (size = (pathSegments = uri.getPathSegments()).size()) < 3 || !Intrinsics.areEqual(pathSegments.get(size - 3), "audio") || !Intrinsics.areEqual(pathSegments.get(size - 2), "albums")) {
            return false;
        }
        return true;
    }
}
