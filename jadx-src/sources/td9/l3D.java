package td9;

import QmE.iF;
import android.content.Context;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Pl;
import com.google.firebase.functions.n;
import com.google.firebase.qz;
import com.safedk.android.analytics.brandsafety.b;
import com.vungle.ads.internal.protos.Sdk;
import ga6.j;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class l3D implements lej {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f73554n;
    private final iF rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final com.google.firebase.qz f73555t;
    public static final j nr = new j(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f73553O = 8;
    private static final int[] J2 = {97, 111, 111, 110, 100, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 63, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 106, 126, 127, 85, 77, 81, 79};
    private static final int[] Uo = {49, 57, 50, 56, 56, 60, 37, 37, 43, 41, 38, 16, 22, 19, 16, 76, 94, 87, 68, 86, 85, 91, b.f61769v, 35, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, b.f61769v, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 101, 101, 100, 107, 62, 88, 1, 94, 93, 8, 10, 65};
    private static final int[] KN = {65, 74, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 104, 95, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 86, 97, 95, 42, 95, 116, 22, 21, 111, 95, 94, 98, 114, 15, 12, 126, 56, 7, 9, 40, 47, 58, 58, 46, 9, 52, 26, 90, 57, 42, 41, 30, 66};
    private static final int[] xMQ = {97, 111, 111, 110, 100, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 63, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 106, 126, 127, 85, 77, 81, 79, 0, 67, 71, 87, 94, 85, 81, 37};
    private static final int[] mUb = {49, 57, 55, 57, 52, 58, 37, 39, 43, 34, 41, 24, 18, 30, 31, 23, 81, 93, 82, 75, 83, 86, 38, 127, 46, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 104, 96, 102, 105, 108, 3, 91, 4, 81, 88, 11, 23, 70};
    private static final int[] gh = {65, 74, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 104, 95, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 86, 93, 42, 41, 38, 88, 96, 70, 26, 104, 115, 82, 98, 13, 99, 76, 22, 0, 47, 12, 54, 98, 22, 59, 108, 30, 9, 53, 75, 68, 2, 89, 21};

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public l3D(Context context, iF eventLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f73554n = context;
        this.rl = eventLogger;
        com.google.firebase.qz qzVarN = new qz.n().nr(t(xMQ)).t(t(mUb)).rl(t(gh)).n();
        Intrinsics.checkNotNull(qzVarN);
        this.f73555t = qzVarN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(l3D l3d) {
        com.google.firebase.Wre wreXQ = com.google.firebase.Wre.XQ(l3d.f73554n, l3d.f73555t, "alt");
        Intrinsics.checkNotNullExpressionValue(wreXQ, "initializeApp(...)");
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        if (jVar.getUseFirebaseEmulator()) {
            String firebaseEmulatorAddress = jVar.getFirebaseEmulatorAddress();
            if (!StringsKt.isBlank(firebaseEmulatorAddress) && !StringsKt.contains$default((CharSequence) firebaseEmulatorAddress, (CharSequence) ":", false, 2, (Object) null)) {
                com.google.firebase.firestore.Pl plJ2 = new Pl.n().KN(false).J2();
                Intrinsics.checkNotNullExpressionValue(plJ2, "build(...)");
                FirebaseFirestore firebaseFirestoreJ2 = FirebaseFirestore.J2();
                firebaseFirestoreJ2.az(firebaseEmulatorAddress, 8080);
                firebaseFirestoreJ2.qie(plJ2);
                n.j jVar2 = com.google.firebase.functions.n.mUb;
                jVar2.t().r(firebaseEmulatorAddress, 5001);
                com.google.firebase.storage.I28.J2().Ik(firebaseEmulatorAddress, 9199);
                FirebaseAuth.getInstance().te(firebaseEmulatorAddress, 9099);
                FirebaseFirestore firebaseFirestoreUo = FirebaseFirestore.Uo(wreXQ);
                firebaseFirestoreUo.az(firebaseEmulatorAddress, 8080);
                firebaseFirestoreUo.qie(plJ2);
                jVar2.nr(wreXQ).r(firebaseEmulatorAddress, 5001);
                com.google.firebase.storage.I28.Uo(wreXQ).Ik(firebaseEmulatorAddress, 9199);
                FirebaseAuth.getInstance(wreXQ).te(firebaseEmulatorAddress, 9099);
                IvA.n.rl().Uo(true);
            }
        }
        return Unit.INSTANCE;
    }

    private final String t(int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(Character.valueOf((char) ((i3 * 3) ^ iArr[i2])));
            i2++;
            i3++;
        }
        return new String(CollectionsKt.toCharArray(arrayList));
    }

    @Override // td9.lej
    public Object n(Continuation continuation) {
        x0X.n nVarN = x0X.w6.n(new Function0() { // from class: td9.QJ
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l3D.nr(this.f73535n);
            }
        });
        if (nVarN instanceof n.C1266n) {
            nVarN = new n.C1266n(M3.n.nr((Throwable) ((n.C1266n) nVarN).n(), j.w6.J2, j.EnumC0949j.f67611O, null, null, 12, null));
        } else if (!(nVarN instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        return M3.j.rl(nVarN, this.rl);
    }
}
