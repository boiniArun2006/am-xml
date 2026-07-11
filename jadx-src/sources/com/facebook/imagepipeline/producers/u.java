package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import bA.C1653C;
import java.io.IOException;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class u extends iwV {
    public static final j nr = new j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AssetManager f52613t;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String rl(com.facebook.imagepipeline.request.j jVar) {
            String path = jVar.WPU().getPath();
            Intrinsics.checkNotNull(path);
            String strSubstring = path.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
    }

    private final int Uo(com.facebook.imagepipeline.request.j jVar) {
        AssetFileDescriptor assetFileDescriptorOpenFd = null;
        try {
            assetFileDescriptorOpenFd = this.f52613t.openFd(nr.rl(jVar));
            int length = (int) assetFileDescriptorOpenFd.getLength();
            try {
                assetFileDescriptorOpenFd.close();
                return length;
            } catch (IOException unused) {
                return length;
            }
        } catch (IOException unused2) {
            if (assetFileDescriptorOpenFd != null) {
                try {
                    assetFileDescriptorOpenFd.close();
                } catch (IOException unused3) {
                }
            }
            return -1;
        } catch (Throwable th) {
            if (assetFileDescriptorOpenFd != null) {
                try {
                    assetFileDescriptorOpenFd.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Executor executor, A72.fuX pooledByteBufferFactory, AssetManager assetManager) {
        super(executor, pooledByteBufferFactory);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        this.f52613t = assetManager;
    }

    @Override // com.facebook.imagepipeline.producers.iwV
    protected String J2() {
        return "LocalAssetFetchProducer";
    }

    @Override // com.facebook.imagepipeline.producers.iwV
    protected C1653C nr(com.facebook.imagepipeline.request.j imageRequest) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        return O(this.f52613t.open(nr.rl(imageRequest), 2), Uo(imageRequest));
    }
}
