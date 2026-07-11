package com.facebook.imagepipeline.producers;

import bA.C1653C;
import java.io.FileInputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class M extends iwV {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f52500t = new j(null);

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(Executor executor, A72.fuX pooledByteBufferFactory) {
        super(executor, pooledByteBufferFactory);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
    }

    @Override // com.facebook.imagepipeline.producers.iwV
    protected String J2() {
        return "LocalFileFetchProducer";
    }

    @Override // com.facebook.imagepipeline.producers.iwV
    protected C1653C nr(com.facebook.imagepipeline.request.j imageRequest) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        return O(new FileInputStream(imageRequest.S().toString()), (int) imageRequest.S().length());
    }
}
