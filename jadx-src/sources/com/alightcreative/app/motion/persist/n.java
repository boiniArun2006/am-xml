package com.alightcreative.app.motion.persist;

import HI0.gnv;
import android.os.Build;
import com.alightcreative.app.motion.persist.j;
import com.alightcreative.app.motion.scene.SolidColor;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Collection;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class n {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[j.n.values().length];
            try {
                iArr[j.n.f45862n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.n.f45865t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.n.f45859O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j.n.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[j.n.f45864r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[j.n.f45863o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final w6 J2(w6 w6Var, String other) {
        Intrinsics.checkNotNullParameter(w6Var, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return w6.rl(w6Var, 0, CollectionsKt.take(CollectionsKt.plus((Collection) CollectionsKt.listOf(other), (Iterable) CollectionsKt.minus(w6Var.t(), other)), w6Var.nr()), 1, null);
    }

    public static final SolidColor O(j.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        switch (j.$EnumSwitchMapping$0[nVar.ordinal()]) {
            case 1:
                return SolidColor.INSTANCE.getBLACK();
            case 2:
                return SolidColor.INSTANCE.getWHITE();
            case 3:
                return SolidColor.INSTANCE.getLIGHT_GRAY();
            case 4:
                return SolidColor.INSTANCE.getCHROMA_KEY_GREEN();
            case 5:
                return SolidColor.INSTANCE.getCHROMA_KEY_BLUE();
            case 6:
                return SolidColor.INSTANCE.getTRANSPARENT();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int nr(j.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        switch (j.$EnumSwitchMapping$0[nVar.ordinal()]) {
            case 1:
                return 2132017311;
            case 2:
                return 2132017316;
            case 3:
                return 2132017314;
            case 4:
                return 2132017313;
            case 5:
                return 2132017312;
            case 6:
                return 2132017315;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    static /* synthetic */ String t(String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        return rl(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String rl(String str) {
        String strUo = FirebaseInstanceId.xMQ().Uo();
        Intrinsics.checkNotNullExpressionValue(strUo, "getId(...)");
        String str2 = Build.PRODUCT + "/" + Build.BOARD + "/" + Build.MODEL;
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        if (Intrinsics.areEqual(jVar.getVsalt(), "")) {
            jVar.setVsalt(UUID.randomUUID().toString());
        }
        byte[] bArrAz = gnv.az(strUo + "@" + str2 + "@" + jVar.getVsalt() + "@" + str + "@AT21Q#RC283cr#*R");
        Intrinsics.checkNotNullExpressionValue(bArrAz, "sha1(...)");
        return gnv.o(bArrAz);
    }
}
