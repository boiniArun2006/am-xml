package fE;

import fE.j;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class CN3 {
    public static final x0X.n O(com.android.billingclient.api.Ml ml) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        return rl(ml) ? new n.w6(Unit.INSTANCE) : new n.C1266n(nr(ml));
    }

    public static final String n(com.android.billingclient.api.Ml ml) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        switch (ml.rl()) {
            case -3:
                return "SERVICE_TIMEOUT";
            case -2:
                return "FEATURE_NOT_SUPPORTED";
            case -1:
                return "SERVICE_DISCONNECTED";
            case 0:
                return "OK";
            case 1:
                return "USER_CANCELED";
            case 2:
                return "SERVICE_UNAVAILABLE";
            case 3:
                return "BILLING_UNAVAILABLE";
            case 4:
                return "ITEM_UNAVAILABLE";
            case 5:
                return "DEVELOPER_ERROR";
            case 6:
                return "ERROR";
            case 7:
                return "ITEM_ALREADY_OWNED";
            case 8:
                return "ITEM_NOT_OWNED";
            default:
                return "UNKNOWN";
        }
    }

    public static final j nr(com.android.billingclient.api.Ml ml) {
        j.EnumC0924j enumC0924j;
        Intrinsics.checkNotNullParameter(ml, "<this>");
        switch (ml.rl()) {
            case -3:
                enumC0924j = j.EnumC0924j.f66811n;
                break;
            case -2:
                enumC0924j = j.EnumC0924j.f66814t;
                break;
            case -1:
                enumC0924j = j.EnumC0924j.f66804O;
                break;
            case 0:
            default:
                enumC0924j = j.EnumC0924j.f66807X;
                break;
            case 1:
                enumC0924j = j.EnumC0924j.J2;
                break;
            case 2:
                enumC0924j = j.EnumC0924j.f66813r;
                break;
            case 3:
                enumC0924j = j.EnumC0924j.f66812o;
                break;
            case 4:
                enumC0924j = j.EnumC0924j.f66808Z;
                break;
            case 5:
                enumC0924j = j.EnumC0924j.f66805S;
                break;
            case 6:
                enumC0924j = j.EnumC0924j.f66810g;
                break;
            case 7:
                enumC0924j = j.EnumC0924j.E2;
                break;
            case 8:
                enumC0924j = j.EnumC0924j.f66809e;
                break;
        }
        String strN = ml.n();
        Intrinsics.checkNotNullExpressionValue(strN, "getDebugMessage(...)");
        return new j(enumC0924j, strN);
    }

    public static final boolean rl(com.android.billingclient.api.Ml ml) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        return ml.rl() == 0;
    }

    public static final boolean t(com.android.billingclient.api.Ml ml) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        return ml.rl() == 1;
    }
}
