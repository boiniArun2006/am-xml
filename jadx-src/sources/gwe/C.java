package gwe;

import aB.AbstractC1501Ml;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AbstractC1501Ml f67903n;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f67904t;
    public static final j nr = new j(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final ConcurrentHashMap f67902O = new ConcurrentHashMap();

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final void n(Date until) {
            Intrinsics.checkNotNullParameter(until, "until");
            synchronized (C.f67902O) {
                try {
                    ConcurrentHashMap concurrentHashMap = C.f67902O;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : concurrentHashMap.entrySet()) {
                        if (((qz) entry.getValue()).rl().compareTo(until) < 0) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        ((qz) entry2.getValue()).n().clear();
                        C.f67902O.remove(entry2.getKey());
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void rl(String cacheKey, aC frameLoader) {
            Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
            Intrinsics.checkNotNullParameter(frameLoader, "frameLoader");
            C.f67902O.put(cacheKey, new qz(frameLoader, new Date()));
        }
    }

    public C(AbstractC1501Ml platformBitmapFactory, int i2, int i3) {
        Intrinsics.checkNotNullParameter(platformBitmapFactory, "platformBitmapFactory");
        this.f67903n = platformBitmapFactory;
        this.rl = i2;
        this.f67904t = i3;
    }

    public final aC rl(String cacheKey, zdu.w6 bitmapFrameRenderer, y8.Ml animationInformation) {
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        Intrinsics.checkNotNullParameter(bitmapFrameRenderer, "bitmapFrameRenderer");
        Intrinsics.checkNotNullParameter(animationInformation, "animationInformation");
        ConcurrentHashMap concurrentHashMap = f67902O;
        synchronized (concurrentHashMap) {
            qz qzVar = (qz) concurrentHashMap.get(cacheKey);
            if (qzVar == null) {
                Unit unit = Unit.INSTANCE;
                return new CN3(this.f67903n, bitmapFrameRenderer, new f04.w6(this.rl), animationInformation, this.f67904t);
            }
            concurrentHashMap.remove(cacheKey);
            return qzVar.n();
        }
    }
}
