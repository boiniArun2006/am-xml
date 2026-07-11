package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import bA.C1653C;
import java.io.IOException;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class rv6 extends iwV {
    public static final j nr = new j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Resources f52607t;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int rl(com.facebook.imagepipeline.request.j jVar) {
            String path = jVar.WPU().getPath();
            if (path != null) {
                String strSubstring = path.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return Integer.parseInt(strSubstring);
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    private final int Uo(com.facebook.imagepipeline.request.j jVar) {
        AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = null;
        try {
            assetFileDescriptorOpenRawResourceFd = this.f52607t.openRawResourceFd(nr.rl(jVar));
            int length = (int) assetFileDescriptorOpenRawResourceFd.getLength();
            try {
                assetFileDescriptorOpenRawResourceFd.close();
                return length;
            } catch (IOException unused) {
                return length;
            }
        } catch (Resources.NotFoundException unused2) {
            if (assetFileDescriptorOpenRawResourceFd != null) {
                try {
                    assetFileDescriptorOpenRawResourceFd.close();
                } catch (IOException unused3) {
                }
            }
            return -1;
        } catch (Throwable th) {
            if (assetFileDescriptorOpenRawResourceFd != null) {
                try {
                    assetFileDescriptorOpenRawResourceFd.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv6(Executor executor, A72.fuX pooledByteBufferFactory, Resources resources) {
        super(executor, pooledByteBufferFactory);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f52607t = resources;
    }

    @Override // com.facebook.imagepipeline.producers.iwV
    protected String J2() {
        return "LocalResourceFetchProducer";
    }

    @Override // com.facebook.imagepipeline.producers.iwV
    protected C1653C nr(com.facebook.imagepipeline.request.j imageRequest) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        return O(this.f52607t.openRawResource(nr.rl(imageRequest)), Uo(imageRequest));
    }
}
