package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import bA.C1653C;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class LEl extends iwV {
    public static final j nr = new j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ContentResolver f52491t;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LEl(Executor executor, A72.fuX pooledByteBufferFactory, ContentResolver contentResolver) {
        super(executor, pooledByteBufferFactory);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.f52491t = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.iwV
    protected String J2() {
        return "QualifiedResourceFetchProducer";
    }

    @Override // com.facebook.imagepipeline.producers.iwV
    protected C1653C nr(com.facebook.imagepipeline.request.j imageRequest) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        InputStream inputStreamOpenInputStream = this.f52491t.openInputStream(imageRequest.WPU());
        if (inputStreamOpenInputStream == null) {
            throw new IllegalStateException("ContentResolver returned null InputStream");
        }
        C1653C c1653cO = O(inputStreamOpenInputStream, -1);
        Intrinsics.checkNotNullExpressionValue(c1653cO, "getEncodedImage(...)");
        return c1653cO;
    }
}
