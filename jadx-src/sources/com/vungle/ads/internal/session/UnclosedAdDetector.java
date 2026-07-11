package com.vungle.ads.internal.session;

import DGv.Ml;
import XA.r;
import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.executor.FutureResult;
import com.vungle.ads.internal.model.UnclosedAd;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.json.I28;
import kotlinx.serialization.json.Q;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 $2\u00020\u0001:\u0001$B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0017J\u001e\u0010\u001b\u001a\u0002H\u001c\"\u0006\b\u0000\u0010\u001c\u0018\u00012\u0006\u0010\u001d\u001a\u00020\u0005H\u0082\b¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010 H\u0002J\u000e\u0010!\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0017J\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170 J\u0016\u0010#\u001a\u00020\u00192\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170 H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/vungle/ads/internal/session/UnclosedAdDetector;", "", "context", "Landroid/content/Context;", "sessionId", "", "executors", "Lcom/vungle/ads/internal/executor/Executors;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/internal/executor/Executors;Lcom/vungle/ads/internal/util/PathProvider;)V", "getContext", "()Landroid/content/Context;", "getExecutors", "()Lcom/vungle/ads/internal/executor/Executors;", FileUploadManager.f61570h, "Ljava/io/File;", "getPathProvider", "()Lcom/vungle/ads/internal/util/PathProvider;", "ready", "", "unclosedAdList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/vungle/ads/internal/model/UnclosedAd;", "addUnclosedAd", "", "ad", "decodeJson", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "jsonString", "(Ljava/lang/String;)Ljava/lang/Object;", "readUnclosedAdFromFile", "", "removeUnclosedAd", "retrieveUnclosedAd", "writeUnclosedAdToFile", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class UnclosedAdDetector {
    private static final String FILENAME = "unclosed_ad";
    private final Context context;
    private final Executors executors;
    private File file;
    private final PathProvider pathProvider;
    private boolean ready;
    private final String sessionId;
    private final CopyOnWriteArrayList<UnclosedAd> unclosedAdList;
    private static final kotlinx.serialization.json.n json = Q.rl(null, new Function1<I28, Unit>() { // from class: com.vungle.ads.internal.session.UnclosedAdDetector$Companion$json$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(I28 i28) {
            invoke2(i28);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(I28 Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.J2(true);
            Json.nr(true);
            Json.O(false);
            Json.t(true);
        }
    }, 1, null);

    public UnclosedAdDetector(Context context, String sessionId, Executors executors, PathProvider pathProvider) {
        Object objM313constructorimpl;
        boolean zM320isSuccessimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(executors, "executors");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.context = context;
        this.sessionId = sessionId;
        this.executors = executors;
        this.pathProvider = pathProvider;
        this.file = pathProvider.getUnclosedAdFile(FILENAME);
        this.unclosedAdList = new CopyOnWriteArrayList<>();
        if (this.file.exists()) {
            zM320isSuccessimpl = true;
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM313constructorimpl = Result.m313constructorimpl(Boolean.valueOf(this.file.createNewFile()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objM313constructorimpl);
            if (thM316exceptionOrNullimpl != null) {
                Logger.INSTANCE.e("UnclosedAdDetector", "Fail to create unclosed ad file: " + thM316exceptionOrNullimpl.getMessage());
            }
            zM320isSuccessimpl = Result.m320isSuccessimpl(objM313constructorimpl);
        }
        this.ready = zM320isSuccessimpl;
    }

    private final /* synthetic */ <T> T decodeJson(String jsonString) {
        kotlinx.serialization.json.n nVar = json;
        Ml mlN = nVar.n();
        Intrinsics.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        XA.Ml mlRl = r.rl(mlN, null);
        Intrinsics.checkNotNull(mlRl, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return (T) nVar.t(mlRl, jsonString);
    }

    private final List<UnclosedAd> readUnclosedAdFromFile() {
        return !this.ready ? CollectionsKt.emptyList() : (List) new FutureResult(this.executors.getIO_EXECUTOR().submit(new Callable() { // from class: com.vungle.ads.internal.session.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return UnclosedAdDetector.m264readUnclosedAdFromFile$lambda4(this.f63304n);
            }
        })).get(1000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readUnclosedAdFromFile$lambda-4, reason: not valid java name */
    public static final List m264readUnclosedAdFromFile$lambda4(UnclosedAdDetector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            String string = FileUtility.INSTANCE.readString(this$0.file);
            if (string != null && string.length() != 0) {
                kotlinx.serialization.json.n nVar = json;
                XA.Ml mlRl = r.rl(nVar.n(), Reflection.typeOf(List.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(UnclosedAd.class))));
                Intrinsics.checkNotNull(mlRl, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                return (List) nVar.t(mlRl, string);
            }
            return new ArrayList();
        } catch (Exception e2) {
            Logger.INSTANCE.e("UnclosedAdDetector", "Fail to read unclosed ad file " + e2.getMessage());
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: retrieveUnclosedAd$lambda-3, reason: not valid java name */
    public static final void m265retrieveUnclosedAd$lambda3(UnclosedAdDetector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            FileUtility.deleteAndLogIfFailed(this$0.file);
        } catch (Exception e2) {
            Logger.INSTANCE.e("UnclosedAdDetector", "Fail to delete file " + e2.getMessage());
        }
    }

    private final void writeUnclosedAdToFile(List<UnclosedAd> unclosedAdList) {
        if (this.ready) {
            try {
                kotlinx.serialization.json.n nVar = json;
                XA.Ml mlRl = r.rl(nVar.n(), Reflection.typeOf(List.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(UnclosedAd.class))));
                Intrinsics.checkNotNull(mlRl, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                final String strRl = nVar.rl(mlRl, unclosedAdList);
                this.executors.getIO_EXECUTOR().execute(new Runnable() { // from class: com.vungle.ads.internal.session.w6
                    @Override // java.lang.Runnable
                    public final void run() {
                        UnclosedAdDetector.m266writeUnclosedAdToFile$lambda5(this.f63306n, strRl);
                    }
                });
            } catch (Throwable th) {
                Logger.INSTANCE.e("UnclosedAdDetector", "Fail to write unclosed ad file " + th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: writeUnclosedAdToFile$lambda-5, reason: not valid java name */
    public static final void m266writeUnclosedAdToFile$lambda5(UnclosedAdDetector this$0, String jsonContent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(jsonContent, "$jsonContent");
        FileUtility.INSTANCE.writeString(this$0.file, jsonContent);
    }

    public final void addUnclosedAd(UnclosedAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        if (this.ready) {
            ad.setSessionId(this.sessionId);
            this.unclosedAdList.add(ad);
            writeUnclosedAdToFile(this.unclosedAdList);
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final Executors getExecutors() {
        return this.executors;
    }

    public final PathProvider getPathProvider() {
        return this.pathProvider;
    }

    public final void removeUnclosedAd(UnclosedAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        if (this.ready && this.unclosedAdList.contains(ad)) {
            this.unclosedAdList.remove(ad);
            writeUnclosedAdToFile(this.unclosedAdList);
        }
    }

    public final List<UnclosedAd> retrieveUnclosedAd() {
        ArrayList arrayList = new ArrayList();
        if (!this.ready) {
            return arrayList;
        }
        List<UnclosedAd> unclosedAdFromFile = readUnclosedAdFromFile();
        if (unclosedAdFromFile != null) {
            arrayList.addAll(unclosedAdFromFile);
        }
        this.executors.getIO_EXECUTOR().execute(new Runnable() { // from class: com.vungle.ads.internal.session.n
            @Override // java.lang.Runnable
            public final void run() {
                UnclosedAdDetector.m265retrieveUnclosedAd$lambda3(this.f63305n);
            }
        });
        return arrayList;
    }
}
