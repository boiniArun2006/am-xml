package td9;

import HI0.gnv;
import QmE.iF;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.Signature;
import android.os.Build;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import ga6.j;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import z8.AbstractC2487Wre;

/* JADX INFO: renamed from: td9.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C2378z implements lej {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f73589n;
    private final iF rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f73588t = new j(null);
    public static final int nr = 8;

    /* JADX INFO: renamed from: td9.z$j */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public C2378z(Context context, iF eventLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f73589n = context;
        this.rl = eventLogger;
    }

    @Override // td9.lej
    public Object n(Continuation continuation) {
        return M3.j.rl(M3.n.rl(x0X.w6.n(new Function0() { // from class: td9.Xo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C2378z.nr(this.f73539n);
            }
        }), j.w6.J2, j.EnumC0949j.f67611O, null, null, 12, null), this.rl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence O(Signature signature) {
        byte[] byteArray = signature.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        byte[] bArrTy = gnv.ty(byteArray);
        Intrinsics.checkNotNullExpressionValue(bArrTy, "sha1(...)");
        return StringsKt.substring(gnv.o(bArrTy), new IntRange(0, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(C2378z c2378z) {
        String strJoinToString$default;
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseCrashlytics, "getInstance(...)");
        firebaseCrashlytics.setCustomKey("chipset", AbstractC2487Wre.mUb().n());
        firebaseCrashlytics.setCustomKey(AppLovinEventTypes.USER_VIEWED_PRODUCT, Build.PRODUCT);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        HI0.afx.nr(c2378z.f73589n).getMemoryInfo(memoryInfo);
        firebaseCrashlytics.setCustomKey("totalMem", memoryInfo.totalMem);
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        firebaseCrashlytics.setCustomKey("abis", ArraysKt.joinToString$default(SUPPORTED_ABIS, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        Signature[] signatureArr = c2378z.f73589n.getPackageManager().getPackageInfo(c2378z.f73589n.getPackageName(), 64).signatures;
        if (signatureArr != null) {
            strJoinToString$default = ArraysKt.joinToString$default(signatureArr, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: td9.eO
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C2378z.O((Signature) obj);
                }
            }, 30, (Object) null);
        } else {
            strJoinToString$default = null;
        }
        if (strJoinToString$default != null) {
            firebaseCrashlytics.setCustomKey("sigs", strJoinToString$default);
        }
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        if (Intrinsics.areEqual(jVar.getDeviceID(), "")) {
            jVar.setDeviceID(UUID.randomUUID().toString());
        }
        firebaseCrashlytics.setUserId(jVar.getDeviceID());
        return Unit.INSTANCE;
    }
}
