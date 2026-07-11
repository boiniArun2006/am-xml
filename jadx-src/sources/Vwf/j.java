package Vwf;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import androidx.media3.common.MimeTypes;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.afx;
import com.facebook.internal.vd;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f11364n = new j();

    public static final GraphRequest n(AccessToken accessToken, Uri imageUri, GraphRequest.n nVar) {
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        String path = imageUri.getPath();
        if (vd.D(imageUri) && path != null) {
            return rl(accessToken, new File(path), nVar);
        }
        if (!vd.FX(imageUri)) {
            throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
        }
        GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(imageUri, MimeTypes.IMAGE_PNG);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable(FileUploadManager.f61570h, parcelableResourceWithMimeType);
        return new GraphRequest(accessToken, "me/staging_resources", bundle, afx.POST, nVar, null, 32, null);
    }

    public static final GraphRequest rl(AccessToken accessToken, File file, GraphRequest.n nVar) {
        GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file, 268435456), MimeTypes.IMAGE_PNG);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable(FileUploadManager.f61570h, parcelableResourceWithMimeType);
        return new GraphRequest(accessToken, "me/staging_resources", bundle, afx.POST, nVar, null, 32, null);
    }

    private j() {
    }
}
