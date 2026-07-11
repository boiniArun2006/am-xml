package sP;

import GJW.OU;
import GJW.vd;
import android.content.Context;
import androidx.webkit.WebViewAssetLoader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import sP.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class w6 {
    public static final j rl = new j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f73253t = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f73254n;

    static final class Ml extends SuspendLambda implements Function2 {
        final /* synthetic */ ZipInputStream J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f73255O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f73256n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(String str, ZipInputStream zipInputStream, Continuation continuation) {
            super(2, continuation);
            this.f73255O = str;
            this.J2 = zipInputStream;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String O(String str) {
            return "Unzipped and cached asset: " + str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return w6.this.new Ml(this.f73255O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f73256n == 0) {
                ResultKt.throwOnFailure(obj);
                File fileJ2 = w6.this.J2(this.f73255O);
                fileJ2.mkdirs();
                ZipInputStream zipInputStream = this.J2;
                while (true) {
                    try {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry == null) {
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(zipInputStream, null);
                            w6.this.KN(this.f73255O).createNewFile();
                            KW9.j jVar = KW9.j.f5464n;
                            final String str = this.f73255O;
                            jVar.n("InjetAssetManager", new Function0() { // from class: sP.Ml
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return w6.Ml.O(str);
                                }
                            });
                            return Unit.INSTANCE;
                        }
                        String name = nextEntry.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                        if (!StringsKt.startsWith$default(name, "__MACOSX", false, 2, (Object) null)) {
                            File file = new File(fileJ2, nextEntry.getName());
                            if (nextEntry.isDirectory()) {
                                Boxing.boxBoolean(file.mkdirs());
                            } else {
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    Boxing.boxLong(ByteStreamsKt.copyTo$default(zipInputStream, fileOutputStream, 0, 2, null));
                                    CloseableKt.closeFinally(fileOutputStream, null);
                                } finally {
                                }
                            }
                            zipInputStream.closeEntry();
                        }
                    } finally {
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f73258n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return w6.this.new n(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f73258n == 0) {
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(FilesKt.deleteRecursively(w6.this.Uo()));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: sP.w6$w6, reason: collision with other inner class name */
    static final class C1170w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f73260O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f73261n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((C1170w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1170w6(String str, Continuation continuation) {
            super(2, continuation);
            this.f73260O = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return w6.this.new C1170w6(this.f73260O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f73261n == 0) {
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(w6.this.KN(this.f73260O).exists());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public w6(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f73254n = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File J2(String str) {
        return new File(Uo(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File Uo() {
        return new File(this.f73254n.getFilesDir(), "injet");
    }

    public final WebViewAssetLoader O() {
        WebViewAssetLoader webViewAssetLoaderRl = new WebViewAssetLoader.Builder().n("/injet/", new WebViewAssetLoader.InternalStoragePathHandler(this.f73254n, Uo())).rl();
        Intrinsics.checkNotNullExpressionValue(webViewAssetLoaderRl, "build(...)");
        return webViewAssetLoaderRl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File KN(String str) {
        return new File(J2(str), "__success__");
    }

    public final Object mUb(String str, ZipInputStream zipInputStream, Continuation continuation) {
        Object objUo = GJW.Dsr.Uo(OU.rl(), new Ml(str, zipInputStream, null), continuation);
        if (objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objUo;
        }
        return Unit.INSTANCE;
    }

    public final Object nr(Continuation continuation) {
        return GJW.Dsr.Uo(OU.rl(), new n(null), continuation);
    }

    public final Object xMQ(String str, Continuation continuation) {
        return GJW.Dsr.Uo(OU.rl(), new C1170w6(str, null), continuation);
    }
}
