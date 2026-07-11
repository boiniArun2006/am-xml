package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import bA.C1653C;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class qf extends iwV {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ContentResolver f52606t;
    public static final j nr = new j(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final String[] f52605O = {"_id", "_data"};

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(Executor executor, A72.fuX pooledByteBufferFactory, ContentResolver contentResolver) {
        super(executor, pooledByteBufferFactory);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.f52606t = contentResolver;
    }

    private final C1653C Uo(Uri uri) throws IOException {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.f52606t.openFileDescriptor(uri, "r");
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            C1653C c1653cO = O(new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()), (int) parcelFileDescriptorOpenFileDescriptor.getStatSize());
            Intrinsics.checkNotNullExpressionValue(c1653cO, "getEncodedImage(...)");
            parcelFileDescriptorOpenFileDescriptor.close();
            return c1653cO;
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    @Override // com.facebook.imagepipeline.producers.iwV
    protected String J2() {
        return "LocalContentUriFetchProducer";
    }

    @Override // com.facebook.imagepipeline.producers.iwV
    protected C1653C nr(com.facebook.imagepipeline.request.j imageRequest) throws IOException {
        C1653C c1653cUo;
        InputStream inputStreamCreateInputStream;
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        Uri uriWPU = imageRequest.WPU();
        Intrinsics.checkNotNullExpressionValue(uriWPU, "getSourceUri(...)");
        if (!vn.I28.gh(uriWPU)) {
            if (vn.I28.mUb(uriWPU) && (c1653cUo = Uo(uriWPU)) != null) {
                return c1653cUo;
            }
            InputStream inputStreamOpenInputStream = this.f52606t.openInputStream(uriWPU);
            if (inputStreamOpenInputStream != null) {
                return O(inputStreamOpenInputStream, -1);
            }
            throw new IllegalStateException("Required value was null.");
        }
        String string = uriWPU.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (StringsKt.endsWith$default(string, "/photo", false, 2, (Object) null)) {
            inputStreamCreateInputStream = this.f52606t.openInputStream(uriWPU);
        } else {
            String string2 = uriWPU.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            if (StringsKt.endsWith$default(string2, "/display_photo", false, 2, (Object) null)) {
                try {
                    AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f52606t.openAssetFileDescriptor(uriWPU, "r");
                    if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    inputStreamCreateInputStream = assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
                } catch (IOException unused) {
                    throw new IOException("Contact photo does not exist: " + uriWPU);
                }
            } else {
                InputStream inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.f52606t, uriWPU);
                if (inputStreamOpenContactPhotoInputStream == null) {
                    throw new IOException("Contact photo does not exist: " + uriWPU);
                }
                inputStreamCreateInputStream = inputStreamOpenContactPhotoInputStream;
            }
        }
        if (inputStreamCreateInputStream != null) {
            return O(inputStreamCreateInputStream, -1);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
